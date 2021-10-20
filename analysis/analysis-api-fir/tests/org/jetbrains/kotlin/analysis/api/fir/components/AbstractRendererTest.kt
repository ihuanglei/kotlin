/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.components

import org.jetbrains.kotlin.analysis.api.fir.test.framework.AbstractHLApiSingleFileTest
import org.jetbrains.kotlin.analysis.api.components.KtDeclarationRendererOptions
import org.jetbrains.kotlin.analysis.api.components.KtTypeRendererOptions
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.model.TestModule
import org.jetbrains.kotlin.test.services.TestServices
import org.jetbrains.kotlin.test.services.assertions

abstract class AbstractRendererTest : AbstractHLApiSingleFileTest() {
    override fun doTestByFileStructure(ktFile: KtFile, module: TestModule, testServices: TestServices) {
        val options = KtDeclarationRendererOptions.DEFAULT.copy(
            approximateTypes = true,
            renderContainingDeclarations = true,
            typeRendererOptions = KtTypeRendererOptions.SHORT_NAMES
        )

        val actual = executeOnPooledThreadInReadAction {
            buildString {
                ktFile.declarations.forEach {
                    analyseForTest(it) {
                        append(it.getSymbol().render(options))
                        appendLine()
                    }
                }
            }
        }

        testServices.assertions.assertEqualsToFile(testDataFileSibling(".rendered"), actual)
    }
}
