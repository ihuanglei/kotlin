// WITH_RUNTIME

@file:JvmName("TestKt")
package test

import kotlinx.parcelize.*
import android.os.Parcel
import android.os.Parcelable

@Parcelize
data class BoxedTypes(
        val boo: java.lang.Boolean,
        val c: java.lang.Character,
        val byt: java.lang.Byte,
        val s: java.lang.Short,
        val i: java.lang.Integer,
        val f: java.lang.Float,
        val l: java.lang.Long,
        val d: java.lang.Double
) : Parcelable

fun box() = parcelTest { parcel ->
    val first = BoxedTypes(
            true as java.lang.Boolean,
            '#' as java.lang.Character,
            3.toByte() as java.lang.Byte,
            10.toShort() as java.lang.Short,
            -300 as java.lang.Integer,
            -5.0f as java.lang.Float,
            Long.MAX_VALUE as java.lang.Long,
            3.14 as java.lang.Double)

    first.writeToParcel(parcel, 0)

    val bytes = parcel.marshall()
    parcel.unmarshall(bytes, 0, bytes.size)
    parcel.setDataPosition(0)

    val first2 = parcelableCreator<BoxedTypes>().createFromParcel(parcel)

    assert(first == first2)
}