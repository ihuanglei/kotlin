// !JVM_DEFAULT_MODE: all
// JVM_TARGET: 1.8
// WITH_RUNTIME
@Target(AnnotationTarget.PROPERTY)
annotation class Foo

interface Deprecated {

    @Foo
    val prop: String
}
