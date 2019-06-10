/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.trackers

import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleUtil
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.roots.ProjectRootModificationTracker
import com.intellij.openapi.util.ModificationTracker
import com.intellij.psi.util.CachedValueProvider
import com.intellij.util.CommonProcessors
import org.jetbrains.annotations.TestOnly
import org.jetbrains.kotlin.idea.caches.project.cached
import org.jetbrains.kotlin.psi.KtFile

class KotlinModuleOutOfCodeBlockModificationTracker private constructor(private val module: Module, private val updater: Updater) :
    ModificationTracker {

    constructor(module: Module) :
            this(module, KotlinCodeBlockModificationListener.getInstance(module.project).perModuleOutOfCodeBlockTrackerUpdater)

    private val kotlinOutOfCodeBlockTracker = KotlinCodeBlockModificationListener.getInstance(module.project).kotlinOutOfCodeBlockTracker

    private val dependencies by lazy {
        // Avoid implicit capturing for this to make CachedValueStabilityChecker happy
        val module = module

        module.cached(CachedValueProvider {
            CachedValueProvider.Result.create(
                HashSet<Module>().also { resultModuleSet ->
                    ModuleRootManager.getInstance(module).orderEntries().recursively().forEachModule(
                        CommonProcessors.CollectProcessor(resultModuleSet)
                    )
                },
                ProjectRootModificationTracker.getInstance(module.project)
            )
        })
    }

    override fun getModificationCount(): Long {
        val temp = getModificationCountImpl()
        return temp
    }

    private fun getModificationCountImpl(): Long {
        val currentGlobalCount = kotlinOutOfCodeBlockTracker.modificationCount

        if (updater.hasPerModuleModificationCounts()) {
            val selfCount = updater.getModificationCount(module)
            if (selfCount == currentGlobalCount) return selfCount

            var maxCount = selfCount
            for (dependency in dependencies) {
                val depCount = updater.getModificationCount(dependency)
                if (depCount == currentGlobalCount) return currentGlobalCount
                if (depCount > maxCount) maxCount = depCount
            }
            return maxCount
        }

        return currentGlobalCount
    }

    companion object {
        @TestOnly
        fun getModificationCount(module: Module): Long {
            val updater = KotlinCodeBlockModificationListener.getInstance(module.project).perModuleOutOfCodeBlockTrackerUpdater
            return updater.getModificationCount(module)
        }

        @TestOnly
        fun initialize(project: Project) {
            val updater = KotlinCodeBlockModificationListener.getInstance(project).perModuleOutOfCodeBlockTrackerUpdater
            updater.initialize()
        }
    }

    internal class Updater(project: Project) {
        private val kotlinOfOfCodeBlockTracker by lazy {
            KotlinCodeBlockModificationListener.getInstance(project).kotlinOutOfCodeBlockTracker
        }

        private val perModuleModCount = mutableMapOf<Module, Long>()

        private var lastAffectedModule: Module? = null

        private var lastAffectedModuleModCount = -1L

        // All modifications since that count are known to be single-module modifications reflected in
        // perModuleModCount map
        private var perModuleChangesHighWatermark: Long? = null

        internal fun getModificationCount(module: Module): Long {
            return perModuleModCount[module] ?: perModuleChangesHighWatermark ?: kotlinOfOfCodeBlockTracker.modificationCount
        }

        @TestOnly
        internal fun initialize() {
            clean()
            lastAffectedModuleModCount = kotlinOfOfCodeBlockTracker.modificationCount
            perModuleChangesHighWatermark = lastAffectedModuleModCount
        }

        internal fun hasPerModuleModificationCounts() = perModuleChangesHighWatermark != null

        internal fun onKotlinPhysicalFileOutOfBlockChange(ktFile: KtFile) {
            lastAffectedModule = ModuleUtil.findModuleForPsiElement(ktFile)
            lastAffectedModuleModCount = kotlinOfOfCodeBlockTracker.modificationCount

            onPsiModificationTrackerUpdate()
        }

        internal fun onPsiModificationTrackerUpdate() {
            val newModCount = kotlinOfOfCodeBlockTracker.modificationCount
            val affectedModule = lastAffectedModule
            if (affectedModule != null && newModCount == lastAffectedModuleModCount) {
                if (perModuleChangesHighWatermark == null) {
                    perModuleChangesHighWatermark = lastAffectedModuleModCount
                }
                perModuleModCount[affectedModule] = newModCount
            } else {
                // Some updates were not processed in our code so they probably came from other languages. Invalidate all.
                clean()
            }
        }

        private fun clean() {
            perModuleChangesHighWatermark = null
            lastAffectedModule = null
            perModuleModCount.clear()
        }
    }
}