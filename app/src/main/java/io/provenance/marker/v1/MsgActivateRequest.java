// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * MsgActivateRequest defines the Msg/Activate request type
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.MsgActivateRequest}
 */
public final class MsgActivateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.MsgActivateRequest)
    MsgActivateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgActivateRequest.newBuilder() to construct.
  private MsgActivateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgActivateRequest() {
    denom_ = "";
    administrator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgActivateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgActivateRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            denom_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            administrator_ = s;
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
    return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgActivateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgActivateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.MsgActivateRequest.class, io.provenance.marker.v1.MsgActivateRequest.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object denom_;
  /**
   * <code>string denom = 1;</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 1;</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADMINISTRATOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object administrator_;
  /**
   * <code>string administrator = 2;</code>
   * @return The administrator.
   */
  @java.lang.Override
  public java.lang.String getAdministrator() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      administrator_ = s;
      return s;
    }
  }
  /**
   * <code>string administrator = 2;</code>
   * @return The bytes for administrator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdministratorBytes() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      administrator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, administrator_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, administrator_);
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
    if (!(obj instanceof io.provenance.marker.v1.MsgActivateRequest)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.MsgActivateRequest other = (io.provenance.marker.v1.MsgActivateRequest) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getAdministrator()
        .equals(other.getAdministrator())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ADMINISTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getAdministrator().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgActivateRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.MsgActivateRequest prototype) {
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
   * MsgActivateRequest defines the Msg/Activate request type
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.MsgActivateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.MsgActivateRequest)
      io.provenance.marker.v1.MsgActivateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgActivateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgActivateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.MsgActivateRequest.class, io.provenance.marker.v1.MsgActivateRequest.Builder.class);
    }

    // Construct using io.provenance.marker.v1.MsgActivateRequest.newBuilder()
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
      denom_ = "";

      administrator_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgActivateRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgActivateRequest getDefaultInstanceForType() {
      return io.provenance.marker.v1.MsgActivateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgActivateRequest build() {
      io.provenance.marker.v1.MsgActivateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgActivateRequest buildPartial() {
      io.provenance.marker.v1.MsgActivateRequest result = new io.provenance.marker.v1.MsgActivateRequest(this);
      result.denom_ = denom_;
      result.administrator_ = administrator_;
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
      if (other instanceof io.provenance.marker.v1.MsgActivateRequest) {
        return mergeFrom((io.provenance.marker.v1.MsgActivateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.MsgActivateRequest other) {
      if (other == io.provenance.marker.v1.MsgActivateRequest.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        onChanged();
      }
      if (!other.getAdministrator().isEmpty()) {
        administrator_ = other.administrator_;
        onChanged();
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
      io.provenance.marker.v1.MsgActivateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.MsgActivateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1;</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 1;</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 1;</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      denom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      
      denom_ = getDefaultInstance().getDenom();
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1;</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      denom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object administrator_ = "";
    /**
     * <code>string administrator = 2;</code>
     * @return The administrator.
     */
    public java.lang.String getAdministrator() {
      java.lang.Object ref = administrator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        administrator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string administrator = 2;</code>
     * @return The bytes for administrator.
     */
    public com.google.protobuf.ByteString
        getAdministratorBytes() {
      java.lang.Object ref = administrator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        administrator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string administrator = 2;</code>
     * @param value The administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministrator(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      administrator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdministrator() {
      
      administrator_ = getDefaultInstance().getAdministrator();
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 2;</code>
     * @param value The bytes for administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministratorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      administrator_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.MsgActivateRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.MsgActivateRequest)
  private static final io.provenance.marker.v1.MsgActivateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.MsgActivateRequest();
  }

  public static io.provenance.marker.v1.MsgActivateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgActivateRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgActivateRequest>() {
    @java.lang.Override
    public MsgActivateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgActivateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgActivateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgActivateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.MsgActivateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
