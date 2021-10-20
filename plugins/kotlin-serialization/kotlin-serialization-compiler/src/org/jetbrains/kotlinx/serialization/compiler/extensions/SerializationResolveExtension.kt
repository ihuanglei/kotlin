/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlinx.serialization.compiler.extensions

import org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.name.SpecialNames
import org.jetbrains.kotlin.platform.jvm.isJvm
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.platform
import org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension
import org.jetbrains.kotlin.resolve.isInlineClass
import org.jetbrains.kotlin.resolve.lazy.LazyClassContext
import org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializerCodegen
import org.jetbrains.kotlinx.serialization.compiler.resolve.*
import java.util.*

open class SerializationResolveExtension @JvmOverloads constructor(val metadataPlugin: SerializationDescriptorSerializerPlugin? = null) : SyntheticResolveExtension {
    override fun getSyntheticNestedClassNames(thisDescriptor: ClassDescriptor): List<Name> = when {
        thisDescriptor.isSerialInfoAnnotation && thisDescriptor.platform?.isJvm() == true -> listOf(SerialEntityNames.IMPL_NAME)
        (thisDescriptor.shouldHaveGeneratedSerializer) && !thisDescriptor.hasCompanionObjectAsSerializer ->
            listOf(SerialEntityNames.SERIALIZER_CLASS_NAME)
        else -> listOf()
    }

    override fun getPossibleSyntheticNestedClassNames(thisDescriptor: ClassDescriptor): List<Name>? {
        return listOf(SerialEntityNames.IMPL_NAME, SerialEntityNames.SERIALIZER_CLASS_NAME)
    }

    override fun getSyntheticFunctionNames(thisDescriptor: ClassDescriptor): List<Name> = when {
        thisDescriptor.isSerializableObject || thisDescriptor.isCompanionObject && getSerializableClassDescriptorByCompanion(thisDescriptor) != null ->
            listOf(SerialEntityNames.SERIALIZER_PROVIDER_NAME)
        thisDescriptor.isInternalSerializable && !thisDescriptor.isInlineClass() && thisDescriptor.platform?.isJvm() == true && !hasCustomizedSerializeMethod(thisDescriptor) -> {
            // add write$Self, but only if .serialize was not customized in companion.
            // It works not only on JVM, but I see no reason to enable it on other platforms —
            // private fields there have no access control, and additional function
            // only increases compiled code size.
            listOf(SerialEntityNames.WRITE_SELF_NAME)
        }
        else -> emptyList()
    }

    private fun hasCustomizedSerializeMethod(serializableClass: ClassDescriptor): Boolean {
        // We cannot check whether companion has @Serializer(MyClass::class) annotation due to recursive resolve problems
        // (apparently, resolve MyClass type asks for all function names, which leads us to this function again)
        // so we rely on less strict check that companion just has non-empty @Serializer annotation.
        // Anyway, I doubt that serializable class companion would ever be serializer for _another_ class.
        val companion = serializableClass.companionObjectDescriptor ?: return false
        return companion.annotations.hasAnnotation(SerializationAnnotations.serializerAnnotationFqName)
    }

    override fun generateSyntheticClasses(
        thisDescriptor: ClassDescriptor,
        name: Name,
        ctx: LazyClassContext,
        declarationProvider: ClassMemberDeclarationProvider,
        result: MutableSet<ClassDescriptor>
    ) {
        if (thisDescriptor.isSerialInfoAnnotation && name == SerialEntityNames.IMPL_NAME)
            result.add(KSerializerDescriptorResolver.addSerialInfoImplClass(thisDescriptor, declarationProvider, ctx))
        else if (thisDescriptor.shouldHaveGeneratedSerializer && name == SerialEntityNames.SERIALIZER_CLASS_NAME &&
            result.none { it.name == SerialEntityNames.SERIALIZER_CLASS_NAME }
        )
            result.add(KSerializerDescriptorResolver.addSerializerImplClass(thisDescriptor, declarationProvider, ctx))
        return
    }

    override fun getSyntheticCompanionObjectNameIfNeeded(thisDescriptor: ClassDescriptor): Name? =
        if (thisDescriptor.shouldHaveGeneratedMethodsInCompanion && !thisDescriptor.isSerializableObject)
            SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT
        else null

    override fun addSyntheticSupertypes(thisDescriptor: ClassDescriptor, supertypes: MutableList<KotlinType>) {
        KSerializerDescriptorResolver.addSerialInfoSuperType(thisDescriptor, supertypes)
        KSerializerDescriptorResolver.addSerializerSupertypes(thisDescriptor, supertypes)
        KSerializerDescriptorResolver.addSerializerFactorySuperType(thisDescriptor, supertypes)
    }

    override fun generateSyntheticSecondaryConstructors(
        thisDescriptor: ClassDescriptor,
        bindingContext: BindingContext,
        result: MutableCollection<ClassConstructorDescriptor>
    ) {
        if (thisDescriptor.isInternalSerializable) {
            // do not add synthetic deserialization constructor if .deserialize method is customized
            if (thisDescriptor.hasCompanionObjectAsSerializer && SerializerCodegen.getSyntheticLoadMember(thisDescriptor.companionObjectDescriptor!!) == null) return
            if (thisDescriptor.isInlineClass()) return
            result.add(KSerializerDescriptorResolver.createLoadConstructorDescriptor(thisDescriptor, bindingContext, metadataPlugin))
        }
    }

    override fun generateSyntheticMethods(
        thisDescriptor: ClassDescriptor,
        name: Name,
        bindingContext: BindingContext,
        fromSupertypes: List<SimpleFunctionDescriptor>,
        result: MutableCollection<SimpleFunctionDescriptor>
    ) {
        KSerializerDescriptorResolver.generateSerializerMethods(thisDescriptor, fromSupertypes, name, result)
        KSerializerDescriptorResolver.generateCompanionObjectMethods(thisDescriptor, name, result)
        KSerializerDescriptorResolver.generateSerializableClassMethods(thisDescriptor, name, result)
    }

    override fun generateSyntheticProperties(
        thisDescriptor: ClassDescriptor,
        name: Name,
        bindingContext: BindingContext,
        fromSupertypes: ArrayList<PropertyDescriptor>,
        result: MutableSet<PropertyDescriptor>
    ) {
        KSerializerDescriptorResolver.generateDescriptorsForAnnotationImpl(thisDescriptor, fromSupertypes, result)
        KSerializerDescriptorResolver.generateSerializerProperties(thisDescriptor, fromSupertypes, name, result)
    }
}