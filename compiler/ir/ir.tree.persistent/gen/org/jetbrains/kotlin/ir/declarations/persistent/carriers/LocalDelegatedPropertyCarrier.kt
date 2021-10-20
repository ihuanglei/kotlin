/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations.persistent.carriers

import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction
import org.jetbrains.kotlin.ir.declarations.IrVariable
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol
import org.jetbrains.kotlin.ir.symbols.IrSymbol
import org.jetbrains.kotlin.ir.types.IrType

// Auto-generated by compiler/ir/ir.tree.persistent/generator/src/org/jetbrains/kotlin/ir/persistentIrGenerator/Main.kt. DO NOT EDIT!

internal interface LocalDelegatedPropertyCarrier : DeclarationCarrier{
    val typeField: IrType
    val delegateField: IrVariable?
    val getterField: IrSimpleFunction?
    val getterSymbolField: IrSimpleFunctionSymbol?
    val setterField: IrSimpleFunction?
    val setterSymbolField: IrSimpleFunctionSymbol?

    override fun clone(): LocalDelegatedPropertyCarrier {
        return LocalDelegatedPropertyCarrierImpl(
            lastModified,
            parentSymbolField,
            originField,
            annotationsField,
            typeField,
            delegateField,
            getterSymbolField,
            setterSymbolField
        )
    }
}

internal class LocalDelegatedPropertyCarrierImpl(
    override val lastModified: Int,
    override val parentSymbolField: IrSymbol?,
    override val originField: IrDeclarationOrigin,
    override val annotationsField: List<IrConstructorCall>,
    override val typeField: IrType,
    override val delegateField: IrVariable?,
    override val getterSymbolField: IrSimpleFunctionSymbol?,
    override val setterSymbolField: IrSimpleFunctionSymbol?
) : LocalDelegatedPropertyCarrier {

    override val getterField: IrSimpleFunction?
        get() = getterSymbolField?.owner

    override val setterField: IrSimpleFunction?
        get() = setterSymbolField?.owner
}
