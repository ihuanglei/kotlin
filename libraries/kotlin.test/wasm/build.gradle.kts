/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("multiplatform")
}

val commonMainSources by task<Sync> {
    from(
        "$rootDir/libraries/kotlin.test/common/src",
        "$rootDir/libraries/kotlin.test/annotations-common/src"
    )
    into("$buildDir/commonMainSources")
}

kotlin {
    js(IR) {
        nodejs()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":kotlin-stdlib-wasm"))
            }
            kotlin.srcDir(commonMainSources.get().destinationDir)
        }
        val jsMain by getting {
            dependencies {
                api(project(":kotlin-stdlib-wasm"))
            }
            kotlin.srcDir("$rootDir/libraries/kotlin.test/wasm/src")
        }
    }
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf(
        "-Xallow-kotlin-package",
        "-opt-in=kotlin.ExperimentalMultiplatform",
        "-opt-in=kotlin.contracts.ExperimentalContracts"
    )
}

tasks.named("compileKotlinJs") {
    (this as KotlinCompile<*>).kotlinOptions.freeCompilerArgs += "-Xir-module-name=kotlin-test"
    dependsOn(commonMainSources)
}
