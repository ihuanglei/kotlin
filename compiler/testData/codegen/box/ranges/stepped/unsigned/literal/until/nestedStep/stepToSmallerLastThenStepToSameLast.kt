// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u until 9u step 2 step 3) {
        uintList += i
    }
    assertEquals(listOf(1u, 4u, 7u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL until 9uL step 2L step 3L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 4uL, 7uL), ulongList)

    return "OK"
}