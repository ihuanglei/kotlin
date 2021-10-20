// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


val MinUI = UInt.MIN_VALUE
val MinUB = UByte.MIN_VALUE
val MinUS = UShort.MIN_VALUE
val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    val range1 = 1u.toUByte()..MinUB step 3
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>()) {
        return "Wrong elements for 1u.toUByte()..MinUB step 3: $list1"
    }

    val list2 = ArrayList<UInt>()
    val range2 = 1u.toUShort()..MinUS step 3
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<UInt>()) {
        return "Wrong elements for 1u.toUShort()..MinUS step 3: $list2"
    }

    val list3 = ArrayList<UInt>()
    val range3 = 1u..MinUI step 3
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>()) {
        return "Wrong elements for 1u..MinUI step 3: $list3"
    }

    val list4 = ArrayList<ULong>()
    val range4 = 1uL..MinUL step 3
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>()) {
        return "Wrong elements for 1uL..MinUL step 3: $list4"
    }

    val list5 = ArrayList<UInt>()
    val range5 = 1u.toUByte() until MinUB step 3
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<UInt>()) {
        return "Wrong elements for 1u.toUByte() until MinUB step 3: $list5"
    }

    val list6 = ArrayList<UInt>()
    val range6 = 1u.toUShort() until MinUS step 3
    for (i in range6) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>()) {
        return "Wrong elements for 1u.toUShort() until MinUS step 3: $list6"
    }

    val list7 = ArrayList<UInt>()
    val range7 = 1u until MinUI step 3
    for (i in range7) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>()) {
        return "Wrong elements for 1u until MinUI step 3: $list7"
    }

    val list8 = ArrayList<ULong>()
    val range8 = 1uL until MinUL step 3
    for (i in range8) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<ULong>()) {
        return "Wrong elements for 1uL until MinUL step 3: $list8"
    }

    return "OK"
}
