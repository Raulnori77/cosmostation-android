// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/query.proto

package io.provenance.msgfees.v1;

/**
 * <pre>
 * CalculateTxFeesRequest is the request type for the Query RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.msgfees.v1.CalculateTxFeesRequest}
 */
public final class CalculateTxFeesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.msgfees.v1.CalculateTxFeesRequest)
    CalculateTxFeesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateTxFeesRequest.newBuilder() to construct.
  private CalculateTxFeesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculateTxFeesRequest() {
    txBytes_ = com.google.protobuf.ByteString.EMPTY;
    defaultBaseDenom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculateTxFeesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculateTxFeesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            txBytes_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            defaultBaseDenom_ = s;
            break;
          }
          case 29: {

            gasAdjustment_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.msgfees.v1.QueryOuterClass.internal_static_provenance_msgfees_v1_CalculateTxFeesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.msgfees.v1.QueryOuterClass.internal_static_provenance_msgfees_v1_CalculateTxFeesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.msgfees.v1.CalculateTxFeesRequest.class, io.provenance.msgfees.v1.CalculateTxFeesRequest.Builder.class);
  }

  public static final int TX_BYTES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString txBytes_;
  /**
   * <pre>
   * tx_bytes is the transaction to simulate.
   * </pre>
   *
   * <code>bytes tx_bytes = 1;</code>
   * @return The txBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTxBytes() {
    return txBytes_;
  }

  public static final int DEFAULT_BASE_DENOM_FIELD_NUMBER = 2;
  private volatile java.lang.Object defaultBaseDenom_;
  /**
   * <pre>
   * default_base_denom is used to set the denom used for gas fees
   * if not set it will default to nhash.
   * </pre>
   *
   * <code>string default_base_denom = 2;</code>
   * @return The defaultBaseDenom.
   */
  @java.lang.Override
  public java.lang.String getDefaultBaseDenom() {
    java.lang.Object ref = defaultBaseDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultBaseDenom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * default_base_denom is used to set the denom used for gas fees
   * if not set it will default to nhash.
   * </pre>
   *
   * <code>string default_base_denom = 2;</code>
   * @return The bytes for defaultBaseDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultBaseDenomBytes() {
    java.lang.Object ref = defaultBaseDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultBaseDenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAS_ADJUSTMENT_FIELD_NUMBER = 3;
  private float gasAdjustment_;
  /**
   * <pre>
   * gas_adjustment is the adjustment factor to be multiplied against the estimate returned by the tx simulation
   * </pre>
   *
   * <code>float gas_adjustment = 3;</code>
   * @return The gasAdjustment.
   */
  @java.lang.Override
  public float getGasAdjustment() {
    return gasAdjustment_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!txBytes_.isEmpty()) {
      output.writeBytes(1, txBytes_);
    }
    if (!getDefaultBaseDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultBaseDenom_);
    }
    if (gasAdjustment_ != 0F) {
      output.writeFloat(3, gasAdjustment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!txBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, txBytes_);
    }
    if (!getDefaultBaseDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultBaseDenom_);
    }
    if (gasAdjustment_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, gasAdjustment_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.provenance.msgfees.v1.CalculateTxFeesRequest)) {
      return super.equals(obj);
    }
    io.provenance.msgfees.v1.CalculateTxFeesRequest other = (io.provenance.msgfees.v1.CalculateTxFeesRequest) obj;

    if (!getTxBytes()
        .equals(other.getTxBytes())) return false;
    if (!getDefaultBaseDenom()
        .equals(other.getDefaultBaseDenom())) return false;
    if (java.lang.Float.floatToIntBits(getGasAdjustment())
        != java.lang.Float.floatToIntBits(
            other.getGasAdjustment())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TX_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getTxBytes().hashCode();
    hash = (37 * hash) + DEFAULT_BASE_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultBaseDenom().hashCode();
    hash = (37 * hash) + GAS_ADJUSTMENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGasAdjustment());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.CalculateTxFeesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.provenance.msgfees.v1.CalculateTxFeesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * CalculateTxFeesRequest is the request type for the Query RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.msgfees.v1.CalculateTxFeesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.msgfees.v1.CalculateTxFeesRequest)
      io.provenance.msgfees.v1.CalculateTxFeesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.msgfees.v1.QueryOuterClass.internal_static_provenance_msgfees_v1_CalculateTxFeesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.msgfees.v1.QueryOuterClass.internal_static_provenance_msgfees_v1_CalculateTxFeesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.msgfees.v1.CalculateTxFeesRequest.class, io.provenance.msgfees.v1.CalculateTxFeesRequest.Builder.class);
    }

    // Construct using io.provenance.msgfees.v1.CalculateTxFeesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      txBytes_ = com.google.protobuf.ByteString.EMPTY;

      defaultBaseDenom_ = "";

      gasAdjustment_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.msgfees.v1.QueryOuterClass.internal_static_provenance_msgfees_v1_CalculateTxFeesRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.CalculateTxFeesRequest getDefaultInstanceForType() {
      return io.provenance.msgfees.v1.CalculateTxFeesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.CalculateTxFeesRequest build() {
      io.provenance.msgfees.v1.CalculateTxFeesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.CalculateTxFeesRequest buildPartial() {
      io.provenance.msgfees.v1.CalculateTxFeesRequest result = new io.provenance.msgfees.v1.CalculateTxFeesRequest(this);
      result.txBytes_ = txBytes_;
      result.defaultBaseDenom_ = defaultBaseDenom_;
      result.gasAdjustment_ = gasAdjustment_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.provenance.msgfees.v1.CalculateTxFeesRequest) {
        return mergeFrom((io.provenance.msgfees.v1.CalculateTxFeesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.msgfees.v1.CalculateTxFeesRequest other) {
      if (other == io.provenance.msgfees.v1.CalculateTxFeesRequest.getDefaultInstance()) return this;
      if (other.getTxBytes() != com.google.protobuf.ByteString.EMPTY) {
        setTxBytes(other.getTxBytes());
      }
      if (!other.getDefaultBaseDenom().isEmpty()) {
        defaultBaseDenom_ = other.defaultBaseDenom_;
        onChanged();
      }
      if (other.getGasAdjustment() != 0F) {
        setGasAdjustment(other.getGasAdjustment());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.provenance.msgfees.v1.CalculateTxFeesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.msgfees.v1.CalculateTxFeesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString txBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * tx_bytes is the transaction to simulate.
     * </pre>
     *
     * <code>bytes tx_bytes = 1;</code>
     * @return The txBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxBytes() {
      return txBytes_;
    }
    /**
     * <pre>
     * tx_bytes is the transaction to simulate.
     * </pre>
     *
     * <code>bytes tx_bytes = 1;</code>
     * @param value The txBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTxBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      txBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_bytes is the transaction to simulate.
     * </pre>
     *
     * <code>bytes tx_bytes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTxBytes() {
      
      txBytes_ = getDefaultInstance().getTxBytes();
      onChanged();
      return this;
    }

    private java.lang.Object defaultBaseDenom_ = "";
    /**
     * <pre>
     * default_base_denom is used to set the denom used for gas fees
     * if not set it will default to nhash.
     * </pre>
     *
     * <code>string default_base_denom = 2;</code>
     * @return The defaultBaseDenom.
     */
    public java.lang.String getDefaultBaseDenom() {
      java.lang.Object ref = defaultBaseDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultBaseDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * default_base_denom is used to set the denom used for gas fees
     * if not set it will default to nhash.
     * </pre>
     *
     * <code>string default_base_denom = 2;</code>
     * @return The bytes for defaultBaseDenom.
     */
    public com.google.protobuf.ByteString
        getDefaultBaseDenomBytes() {
      java.lang.Object ref = defaultBaseDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultBaseDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * default_base_denom is used to set the denom used for gas fees
     * if not set it will default to nhash.
     * </pre>
     *
     * <code>string default_base_denom = 2;</code>
     * @param value The defaultBaseDenom to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultBaseDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      defaultBaseDenom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * default_base_denom is used to set the denom used for gas fees
     * if not set it will default to nhash.
     * </pre>
     *
     * <code>string default_base_denom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultBaseDenom() {
      
      defaultBaseDenom_ = getDefaultInstance().getDefaultBaseDenom();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * default_base_denom is used to set the denom used for gas fees
     * if not set it will default to nhash.
     * </pre>
     *
     * <code>string default_base_denom = 2;</code>
     * @param value The bytes for defaultBaseDenom to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultBaseDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      defaultBaseDenom_ = value;
      onChanged();
      return this;
    }

    private float gasAdjustment_ ;
    /**
     * <pre>
     * gas_adjustment is the adjustment factor to be multiplied against the estimate returned by the tx simulation
     * </pre>
     *
     * <code>float gas_adjustment = 3;</code>
     * @return The gasAdjustment.
     */
    @java.lang.Override
    public float getGasAdjustment() {
      return gasAdjustment_;
    }
    /**
     * <pre>
     * gas_adjustment is the adjustment factor to be multiplied against the estimate returned by the tx simulation
     * </pre>
     *
     * <code>float gas_adjustment = 3;</code>
     * @param value The gasAdjustment to set.
     * @return This builder for chaining.
     */
    public Builder setGasAdjustment(float value) {
      
      gasAdjustment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gas_adjustment is the adjustment factor to be multiplied against the estimate returned by the tx simulation
     * </pre>
     *
     * <code>float gas_adjustment = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGasAdjustment() {
      
      gasAdjustment_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:provenance.msgfees.v1.CalculateTxFeesRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.msgfees.v1.CalculateTxFeesRequest)
  private static final io.provenance.msgfees.v1.CalculateTxFeesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.msgfees.v1.CalculateTxFeesRequest();
  }

  public static io.provenance.msgfees.v1.CalculateTxFeesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateTxFeesRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalculateTxFeesRequest>() {
    @java.lang.Override
    public CalculateTxFeesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculateTxFeesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculateTxFeesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateTxFeesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.msgfees.v1.CalculateTxFeesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

