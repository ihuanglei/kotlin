/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirRenderer
import org.jetbrains.kotlin.fir.declarations.FirImport
import org.jetbrains.kotlin.fir.render
import org.jetbrains.kotlin.analysis.low.level.api.fir.api.getOrBuildFir
import org.jetbrains.kotlin.analysis.low.level.api.fir.test.base.AbstractLowLevelApiSingleFileTest
import org.jetbrains.kotlin.analysis.low.level.api.fir.test.base.expressionMarkerProvider
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.builders.TestConfigurationBuilder
import org.jetbrains.kotlin.test.directives.model.SimpleDirectivesContainer
import org.jetbrains.kotlin.test.services.TestModuleStructure
import org.jetbrains.kotlin.test.services.TestServices
import org.jetbrains.kotlin.test.services.assertions

abstract class AbstractGetOrBuildFirTest : AbstractLowLevelApiSingleFileTest() {
    override fun configureTest(builder: TestConfigurationBuilder) {
        super.configureTest(builder)
        with(builder) {
            useDirectives(Directives)
        }
    }

    override fun doTestByFileStructure(ktFile: KtFile, moduleStructure: TestModuleStructure, testServices: TestServices) {
        val selectedElement = getElementOfType(ktFile, moduleStructure, testServices) as KtElement

        val actual = resolveWithClearCaches(ktFile) { state ->
            val fir = selectedElement.getOrBuildFir(state)
            """|KT element: ${selectedElement::class.simpleName}
               |FIR element: ${fir?.let { it::class.simpleName }}
               |
               |FIR element rendered:
               |${render(fir)}""".trimMargin()
        }
        testServices.assertions.assertEqualsToFile(testDataFileSibling(".txt"), actual)
    }

    private fun getElementOfType(ktFile: KtFile, moduleStructure: TestModuleStructure, testServices: TestServices): PsiElement {
        val selectedElement = testServices.expressionMarkerProvider.getSelectedElement(ktFile)
        val expectedType = moduleStructure.allDirectives[Directives.LOOK_UP_FOR_ELEMENT_OF_TYPE].firstOrNull() ?: return selectedElement
        @Suppress("UNCHECKED_CAST") val expectedClass = Class.forName(expectedType) as Class<PsiElement>
        if (expectedClass.isInstance(selectedElement)) return selectedElement

        return listOfNotNull(
            PsiTreeUtil.getChildOfType(selectedElement, expectedClass),
        ).single { it.textRange == selectedElement.textRange }
    }

    private fun render(firElement: FirElement?): String = when (firElement) {
        null -> "null"
        is FirImport -> "import ${firElement.importedFqName}"
        else -> firElement.render(renderingMode)
    }

    private val renderingMode = FirRenderer.RenderMode.Normal.copy(
        renderPackageDirective = true,
    )

    private object Directives : SimpleDirectivesContainer() {
        val LOOK_UP_FOR_ELEMENT_OF_TYPE by stringDirective("LOOK_UP_FOR_ELEMENT_OF_TYPE")
    }
}