// WITH_RUNTIME
// IGNORE_BACKEND: WASM

fun test(uis: UIntArray): String {
    var s = ""
    for ((i, _) in uis.withIndex()) {
        s += "$i:${uis[i]};"
    }
    return s
}


fun box(): String {
    val test = test(uintArrayOf(1U, 2U, 3U))
    if (test != "0:1;1:2;2:3;") return "Failed: $test"
    return "OK"
}