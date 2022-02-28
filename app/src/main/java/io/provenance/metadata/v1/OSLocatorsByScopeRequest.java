// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * OSLocatorsByScopeRequest is the request type for the Query/OSLocatorsByScope RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.OSLocatorsByScopeRequest}
 */
public final class OSLocatorsByScopeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.OSLocatorsByScopeRequest)
    OSLocatorsByScopeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OSLocatorsByScopeRequest.newBuilder() to construct.
  private OSLocatorsByScopeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OSLocatorsByScopeRequest() {
    scopeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OSLocatorsByScopeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OSLocatorsByScopeRequest(
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

            scopeId_ = s;
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
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_OSLocatorsByScopeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_OSLocatorsByScopeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.OSLocatorsByScopeRequest.class, io.provenance.metadata.v1.OSLocatorsByScopeRequest.Builder.class);
  }

  public static final int SCOPE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object scopeId_;
  /**
   * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The scopeId.
   */
  @java.lang.Override
  public java.lang.String getScopeId() {
    java.lang.Object ref = scopeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scopeId_ = s;
      return s;
    }
  }
  /**
   * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The bytes for scopeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeIdBytes() {
    java.lang.Object ref = scopeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scopeId_ = b;
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
    if (!getScopeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scopeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScopeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scopeId_);
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
    if (!(obj instanceof io.provenance.metadata.v1.OSLocatorsByScopeRequest)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.OSLocatorsByScopeRequest other = (io.provenance.metadata.v1.OSLocatorsByScopeRequest) obj;

    if (!getScopeId()
        .equals(other.getScopeId())) return false;
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
    hash = (37 * hash) + SCOPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScopeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.OSLocatorsByScopeRequest prototype) {
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
   * OSLocatorsByScopeRequest is the request type for the Query/OSLocatorsByScope RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.OSLocatorsByScopeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.OSLocatorsByScopeRequest)
      io.provenance.metadata.v1.OSLocatorsByScopeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_OSLocatorsByScopeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_OSLocatorsByScopeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.OSLocatorsByScopeRequest.class, io.provenance.metadata.v1.OSLocatorsByScopeRequest.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.OSLocatorsByScopeRequest.newBuilder()
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
      scopeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_OSLocatorsByScopeRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.OSLocatorsByScopeRequest getDefaultInstanceForType() {
      return io.provenance.metadata.v1.OSLocatorsByScopeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.OSLocatorsByScopeRequest build() {
      io.provenance.metadata.v1.OSLocatorsByScopeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.OSLocatorsByScopeRequest buildPartial() {
      io.provenance.metadata.v1.OSLocatorsByScopeRequest result = new io.provenance.metadata.v1.OSLocatorsByScopeRequest(this);
      result.scopeId_ = scopeId_;
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
      if (other instanceof io.provenance.metadata.v1.OSLocatorsByScopeRequest) {
        return mergeFrom((io.provenance.metadata.v1.OSLocatorsByScopeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.OSLocatorsByScopeRequest other) {
      if (other == io.provenance.metadata.v1.OSLocatorsByScopeRequest.getDefaultInstance()) return this;
      if (!other.getScopeId().isEmpty()) {
        scopeId_ = other.scopeId_;
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
      io.provenance.metadata.v1.OSLocatorsByScopeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.OSLocatorsByScopeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object scopeId_ = "";
    /**
     * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
     * @return The scopeId.
     */
    public java.lang.String getScopeId() {
      java.lang.Object ref = scopeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scopeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
     * @return The bytes for scopeId.
     */
    public com.google.protobuf.ByteString
        getScopeIdBytes() {
      java.lang.Object ref = scopeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scopeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
     * @param value The scopeId to set.
     * @return This builder for chaining.
     */
    public Builder setScopeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeId() {
      
      scopeId_ = getDefaultInstance().getScopeId();
      onChanged();
      return this;
    }
    /**
     * <code>string scope_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
     * @param value The bytes for scopeId to set.
     * @return This builder for chaining.
     */
    public Builder setScopeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scopeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.OSLocatorsByScopeRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.OSLocatorsByScopeRequest)
  private static final io.provenance.metadata.v1.OSLocatorsByScopeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.OSLocatorsByScopeRequest();
  }

  public static io.provenance.metadata.v1.OSLocatorsByScopeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OSLocatorsByScopeRequest>
      PARSER = new com.google.protobuf.AbstractParser<OSLocatorsByScopeRequest>() {
    @java.lang.Override
    public OSLocatorsByScopeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OSLocatorsByScopeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OSLocatorsByScopeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OSLocatorsByScopeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.OSLocatorsByScopeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
