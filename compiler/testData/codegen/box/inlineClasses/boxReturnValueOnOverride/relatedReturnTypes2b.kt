// WITH_RUNTIME

interface IBase

interface IQ : IBase {
    fun ok(): String
}

@Suppress("OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE")
@kotlin.jvm.JvmInline
value class X(val t: IQ): IQ {
    override fun ok(): String = t.ok()
}

interface IFoo1<T : IBase> {
    fun foo(): T
}

interface IFoo2 {
    fun foo(): Any
}

object OK : IQ {
    override fun ok(): String = "OK"
}

class Test : IFoo1<IQ>, IFoo2 {
    override fun foo(): X = X(OK)
}

fun box(): String {
    val t1: IFoo1<IQ> = Test()
    val foo1 = t1.foo()
    if (foo1 !is X) {
        throw AssertionError("foo1 !is X: $foo1")
    }
    val ok1 = foo1.ok()
    if (ok1 != "OK") {
        throw AssertionError("ok1: $ok1")
    }

    val t2: IFoo2 = Test()
    val foo2 = t2.foo()
    if (foo2 !is IQ) {
        throw AssertionError("foo2 !is IQ: $foo2")
    }
    val ok2 = foo2.ok()
    if (ok2 != "OK") {
        throw AssertionError("ok2: $ok2")
    }
    if (foo2 !is X) {
        throw AssertionError("foo2 !is X: $foo2")
    }

    return "OK"
}