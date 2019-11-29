/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/breadcrumbs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BreadcrumbsTestGenerated extends AbstractBreadcrumbsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInBreadcrumbs() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/breadcrumbs"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnonymousObjects.kt")
    public void testAnonymousObjects() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/AnonymousObjects.kt");
    }

    @TestMetadata("Declarations.kt")
    public void testDeclarations() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/Declarations.kt");
    }

    @TestMetadata("For.kt")
    public void testFor() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/For.kt");
    }

    @TestMetadata("FunctionalType.kt")
    public void testFunctionalType() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/FunctionalType.kt");
    }

    @TestMetadata("If.kt")
    public void testIf() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/If.kt");
    }

    @TestMetadata("LabeledStatements.kt")
    public void testLabeledStatements() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/LabeledStatements.kt");
    }

    @TestMetadata("Lambdas.kt")
    public void testLambdas() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/Lambdas.kt");
    }

    @TestMetadata("OnIfCondition.kt")
    public void testOnIfCondition() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/OnIfCondition.kt");
    }

    @TestMetadata("OnWhenEntryCondition.kt")
    public void testOnWhenEntryCondition() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/OnWhenEntryCondition.kt");
    }

    @TestMetadata("PropertyAccessor.kt")
    public void testPropertyAccessor() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/PropertyAccessor.kt");
    }

    @TestMetadata("StarProjection.kt")
    public void testStarProjection() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/StarProjection.kt");
    }

    @TestMetadata("Try.kt")
    public void testTry() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/Try.kt");
    }

    @TestMetadata("When.kt")
    public void testWhen() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/When.kt");
    }

    @TestMetadata("While.kt")
    public void testWhile() throws Exception {
        runTest("idea/testData/codeInsight/breadcrumbs/While.kt");
    }
}
