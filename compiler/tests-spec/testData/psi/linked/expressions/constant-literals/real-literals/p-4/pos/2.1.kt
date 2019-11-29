/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-100
 * PLACE: expressions, constant-literals, real-literals -> paragraph 4 -> sentence 2
 * NUMBER: 1
 * DESCRIPTION: Real literals with underscores before an exponent mark.
 */

val value = 0_E0
val value = 1.1_E2

val value = .0__0_e-0___0

val value = 0__0.0_____e0f

val value = 9_______9______9_____9____9___9__9_9.0___E-1

val value = 0_0_0_0_0_0_0_0_0_0.12345678___e+90F
val value = 1_2_3_4_5_6_7_8_9.2_3_4_5_6_7_8_9_e-0
val value = 456.5__e0_6
val value = 5.6_0_E+05F
val value = 6_54.76_5e-4
val value = 9_____________87654321.0__e-9_8765432_____________1F

val value = 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000___0.000000000000000000000000_e000000000000000000000000000000000000000000000000000000000000000_0F
val value = 0_000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0____E-0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value = 9999999999999999999999999999999999999999999_______________999999999999999999999999999999999999999999999.33333333333333333333333333333333333333333333333_333333333333333333333333333333333333333_e3_3f
