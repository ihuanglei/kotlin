// WITH_RUNTIME

@file:JvmName("TestKt")
package test

import kotlinx.parcelize.*
import android.os.Parcel
import android.os.Parcelable

@Parcelize
enum class Color : Parcelable { BLACK, WHITE }

@Parcelize
object Obj : Parcelable

fun box() = parcelTest { parcel ->
    val black = Color.BLACK
    val obj = Obj

    black.writeToParcel(parcel, 0)
    obj.writeToParcel(parcel, 0)

    println(black)
    println(obj)

    val bytes = parcel.marshall()
    parcel.unmarshall(bytes, 0, bytes.size)
    parcel.setDataPosition(0)

    val black2 = parcelableCreator<Color>().createFromParcel(parcel)
    val obj2 = parcelableCreator<Obj>().createFromParcel(parcel)

    println(black2)
    println(obj2)

    assert(black2 == black)
    assert(obj2 != null)
}