// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression}
 */
public final class NullableIrExpression extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression)
    NullableIrExpressionOrBuilder {
  // Use NullableIrExpression.newBuilder() to construct.
  private NullableIrExpression(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private NullableIrExpression(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final NullableIrExpression defaultInstance;
  public static NullableIrExpression getDefaultInstance() {
    return defaultInstance;
  }

  public NullableIrExpression getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private NullableIrExpression(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = expression_.toBuilder();
            }
            expression_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expression_);
              expression_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<NullableIrExpression> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<NullableIrExpression>() {
    public NullableIrExpression parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new NullableIrExpression(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<NullableIrExpression> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int EXPRESSION_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression_;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
   */
  public boolean hasExpression() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getExpression() {
    return expression_;
  }

  private void initFields() {
    expression_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasExpression()) {
      if (!getExpression().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, expression_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, expression_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression)
      org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpressionOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      expression_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression result = new org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.expression_ = expression_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression.getDefaultInstance()) return this;
      if (other.hasExpression()) {
        mergeExpression(other.getExpression());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (hasExpression()) {
        if (!getExpression().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public boolean hasExpression() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getExpression() {
      return expression_;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public Builder setExpression(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      expression_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public Builder setExpression(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder builderForValue) {
      expression_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public Builder mergeExpression(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          expression_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) {
        expression_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder(expression_).mergeFrom(value).buildPartial();
      } else {
        expression_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 1;</code>
     */
    public Builder clearExpression() {
      expression_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression)
  }

  static {
    defaultInstance = new NullableIrExpression(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.NullableIrExpression)
}