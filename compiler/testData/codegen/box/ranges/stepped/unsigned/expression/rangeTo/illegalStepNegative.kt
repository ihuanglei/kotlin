// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val uintProgression = 1u..7u
        for (i in uintProgression step -1) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val ulongProgression = 1uL..7uL
        for (i in ulongProgression step -1L) {
        }
    }

    return "OK"
}