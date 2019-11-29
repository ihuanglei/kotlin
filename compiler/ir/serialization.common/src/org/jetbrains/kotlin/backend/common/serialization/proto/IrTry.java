// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTry}
 */
public final class IrTry extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTry)
    IrTryOrBuilder {
  // Use IrTry.newBuilder() to construct.
  private IrTry(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrTry(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrTry defaultInstance;
  public static IrTry getDefaultInstance() {
    return defaultInstance;
  }

  public IrTry getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrTry(
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
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              catch_ = new java.util.ArrayList<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement>();
              mutable_bitField0_ |= 0x00000002;
            }
            catch_.add(input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement.PARSER, extensionRegistry));
            break;
          }
          case 26: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = finally_.toBuilder();
            }
            finally_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(finally_);
              finally_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        catch_ = java.util.Collections.unmodifiableList(catch_);
      }
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
  public static org.jetbrains.kotlin.protobuf.Parser<IrTry> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrTry>() {
    public IrTry parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrTry(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrTry> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
   */
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getResult() {
    return result_;
  }

  public static final int CATCH_FIELD_NUMBER = 2;
  private java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement> catch_;
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
   */
  public java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement> getCatchList() {
    return catch_;
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
   */
  public java.util.List<? extends org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrBuilder> 
      getCatchOrBuilderList() {
    return catch_;
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
   */
  public int getCatchCount() {
    return catch_.size();
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement getCatch(int index) {
    return catch_.get(index);
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrBuilder getCatchOrBuilder(
      int index) {
    return catch_.get(index);
  }

  public static final int FINALLY_FIELD_NUMBER = 3;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally_;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
   */
  public boolean hasFinally() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getFinally() {
    return finally_;
  }

  private void initFields() {
    result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    catch_ = java.util.Collections.emptyList();
    finally_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasResult()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getResult().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getCatchCount(); i++) {
      if (!getCatch(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    if (hasFinally()) {
      if (!getFinally().isInitialized()) {
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
      output.writeMessage(1, result_);
    }
    for (int i = 0; i < catch_.size(); i++) {
      output.writeMessage(2, catch_.get(i));
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(3, finally_);
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
        .computeMessageSize(1, result_);
    }
    for (int i = 0; i < catch_.size(); i++) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, catch_.get(i));
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(3, finally_);
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

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrTry prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTry}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTry, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTry)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTryOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrTry.newBuilder()
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
      result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      catch_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      finally_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTry getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrTry.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTry build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTry buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTry result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrTry(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.result_ = result_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        catch_ = java.util.Collections.unmodifiableList(catch_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.catch_ = catch_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000002;
      }
      result.finally_ = finally_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrTry other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrTry.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (!other.catch_.isEmpty()) {
        if (catch_.isEmpty()) {
          catch_ = other.catch_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCatchIsMutable();
          catch_.addAll(other.catch_);
        }
        
      }
      if (other.hasFinally()) {
        mergeFinally(other.getFinally());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasResult()) {
        
        return false;
      }
      if (!getResult().isInitialized()) {
        
        return false;
      }
      for (int i = 0; i < getCatchCount(); i++) {
        if (!getCatch(i).isInitialized()) {
          
          return false;
        }
      }
      if (hasFinally()) {
        if (!getFinally().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrTry) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getResult() {
      return result_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public Builder setResult(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public Builder setResult(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder builderForValue) {
      result_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public Builder mergeResult(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          result_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) {
        result_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder(result_).mergeFrom(value).buildPartial();
      } else {
        result_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression result = 1;</code>
     */
    public Builder clearResult() {
      result_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement> catch_ =
      java.util.Collections.emptyList();
    private void ensureCatchIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        catch_ = new java.util.ArrayList<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement>(catch_);
        bitField0_ |= 0x00000002;
       }
    }

    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement> getCatchList() {
      return java.util.Collections.unmodifiableList(catch_);
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public int getCatchCount() {
      return catch_.size();
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement getCatch(int index) {
      return catch_.get(index);
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder setCatch(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCatchIsMutable();
      catch_.set(index, value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder setCatch(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement.Builder builderForValue) {
      ensureCatchIsMutable();
      catch_.set(index, builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder addCatch(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCatchIsMutable();
      catch_.add(value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder addCatch(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCatchIsMutable();
      catch_.add(index, value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder addCatch(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement.Builder builderForValue) {
      ensureCatchIsMutable();
      catch_.add(builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder addCatch(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement.Builder builderForValue) {
      ensureCatchIsMutable();
      catch_.add(index, builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder addAllCatch(
        java.lang.Iterable<? extends org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement> values) {
      ensureCatchIsMutable();
      org.jetbrains.kotlin.protobuf.AbstractMessageLite.Builder.addAll(
          values, catch_);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder clearCatch() {
      catch_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement catch = 2;</code>
     */
    public Builder removeCatch(int index) {
      ensureCatchIsMutable();
      catch_.remove(index);

      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public boolean hasFinally() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getFinally() {
      return finally_;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public Builder setFinally(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      finally_ = value;

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public Builder setFinally(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.Builder builderForValue) {
      finally_ = builderForValue.build();

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public Builder mergeFinally(org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression value) {
      if (((bitField0_ & 0x00000004) == 0x00000004) &&
          finally_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance()) {
        finally_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.newBuilder(finally_).mergeFrom(value).buildPartial();
      } else {
        finally_ = value;
      }

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression finally = 3;</code>
     */
    public Builder clearFinally() {
      finally_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTry)
  }

  static {
    defaultInstance = new IrTry(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTry)
}
