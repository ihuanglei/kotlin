/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-100
 * PLACE: expressions, constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 19
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the import.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

// FILE: 2_19_1.kt

package org.jetbrains.`true`.`false`

val x1 = false

// FILE: 2_19_2.kt

val `true` = false

// FILE: 2_19_3.kt

package `false`;

val x3 = true

// FILE: 2_19_4.kt

package `true`

val x4 = false

// FILE: 2_19_5.kt

package org.jetbrains.kotlin

val x5 = true

// FILE: 2_19_6.kt

val `false` = false

// FILE: 2_19_7.kt

package part_1

import org.jetbrains.`true`.`false`.*
import `true`
import `false`.*;
import `true`.*import `false`

fun box(): String? {
    if (x1 || `true` || !x3 || x4 || `false`) return null

    return "OK"
}
