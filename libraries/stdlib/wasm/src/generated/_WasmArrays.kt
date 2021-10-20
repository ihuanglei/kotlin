/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlin.wasm.internal

//
// NOTE: THIS FILE IS AUTO-GENERATED by the generators/wasm/WasmIntrinsicGenerator.kt
//

@WasmArrayOf(Any::class, isNullable = true)
internal class WasmAnyArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET)
    fun get(index: Int): Any? =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Any?): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmAnyArray.fill(size: Int, init: (Int) -> Any?) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Byte::class, isNullable = false)
internal class WasmByteArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET_S)
    fun get(index: Int): Byte =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Byte): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmByteArray.fill(size: Int, init: (Int) -> Byte) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Char::class, isNullable = false)
internal class WasmCharArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET_U)
    fun get(index: Int): Char =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Char): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmCharArray.fill(size: Int, init: (Int) -> Char) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Short::class, isNullable = false)
internal class WasmShortArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET_S)
    fun get(index: Int): Short =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Short): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmShortArray.fill(size: Int, init: (Int) -> Short) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Int::class, isNullable = false)
internal class WasmIntArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET)
    fun get(index: Int): Int =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Int): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmIntArray.fill(size: Int, init: (Int) -> Int) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Long::class, isNullable = false)
internal class WasmLongArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET)
    fun get(index: Int): Long =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Long): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmLongArray.fill(size: Int, init: (Int) -> Long) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Float::class, isNullable = false)
internal class WasmFloatArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET)
    fun get(index: Int): Float =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Float): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmFloatArray.fill(size: Int, init: (Int) -> Float) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

@WasmArrayOf(Double::class, isNullable = false)
internal class WasmDoubleArray(size: Int) {
    @WasmOp(WasmOp.ARRAY_GET)
    fun get(index: Int): Double =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_SET)
    fun set(index: Int, value: Double): Unit =
        implementedAsIntrinsic

    @WasmOp(WasmOp.ARRAY_LEN)
    fun len(): Int =
        implementedAsIntrinsic
}

internal inline fun WasmDoubleArray.fill(size: Int, init: (Int) -> Double) {
    var i = 0
    while (i < size) {
        set(i, init(i))
        i++
    }
}

