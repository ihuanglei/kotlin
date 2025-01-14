// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun two() = 2

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u..8u step two()) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL..8uL step two().toLong()) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL), ulongList)

    return "OK"
}