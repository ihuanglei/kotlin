// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


val MaxI = Int.MAX_VALUE
val MaxL = Long.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 0 downTo MaxI step 3) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 0 downTo MaxI step 3: $list1"
    }

    val list2 = ArrayList<Long>()
    for (i in 0 downTo MaxL step 3) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Long>()) {
        return "Wrong elements for 0 downTo MaxL step 3: $list2"
    }

    return "OK"
}
