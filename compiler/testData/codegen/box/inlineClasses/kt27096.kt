// WITH_RUNTIME

@Suppress("OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE")
@kotlin.jvm.JvmInline
value class Ucn(private val i: UInt)

class PPInput(private val s: ByteArray) {
    fun peek(n: UInt = 0u): Ucn? =
        if (n >= s.size.toUInt())
            null
        else
            Ucn(s[n.toInt()].toUInt())
}

fun box(): String {
    val ppInput = PPInput(byteArrayOf(0.toByte(), 0.toByte(), 0.toByte()))

    if (ppInput.peek(0u) == null) throw AssertionError()
    if (ppInput.peek(100u) != null) throw AssertionError()
    if (ppInput.peek(0u)!!.toString() != "Ucn(i=0)") throw AssertionError(ppInput.peek(0u)!!.toString())

    return "OK"
}