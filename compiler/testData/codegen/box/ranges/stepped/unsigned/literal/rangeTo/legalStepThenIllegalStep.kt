// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 1u..7u step 2 step 0) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1uL..7uL step 2L step 0L) {
        }
    }

    return "OK"
}