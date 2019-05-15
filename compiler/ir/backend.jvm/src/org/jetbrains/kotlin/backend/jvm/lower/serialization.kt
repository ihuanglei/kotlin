/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.jvm.lower

import org.jetbrains.kotlin.backend.common.serialization.DeclarationTable
import org.jetbrains.kotlin.backend.common.serialization.DescriptorTable
import org.jetbrains.kotlin.backend.jvm.JvmBackendContext
import org.jetbrains.kotlin.ir.backend.jvm.lower.serialization.ir.JvmDeclarationTable
import org.jetbrains.kotlin.ir.backend.jvm.lower.serialization.ir.JvmIrModuleSerializer
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import java.io.File

fun serializeModule(context: JvmBackendContext, irModuleFragment: IrModuleFragment, fileName: String): DeclarationTable {
    val declarationTable = JvmDeclarationTable(irModuleFragment.irBuiltins, DescriptorTable())
    val serializedIr = JvmIrModuleSerializer(context, declarationTable, bodiesOnlyForInlines = false).serializedIrModule(irModuleFragment)
    val moduleFile = File(fileName)
    moduleFile.writeBytes(serializedIr.module)
    return declarationTable
}

fun deserializeModule(fileName: String) {

}