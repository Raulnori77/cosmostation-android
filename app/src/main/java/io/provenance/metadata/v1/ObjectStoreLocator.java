// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/objectstore.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * Defines an Locator object stored on chain, which represents a owner( blockchain address) associated with a endpoint
 * uri for it's associated object store.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.ObjectStoreLocator}
 */
public final class ObjectStoreLocator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.ObjectStoreLocator)
    ObjectStoreLocatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectStoreLocator.newBuilder() to construct.
  private ObjectStoreLocator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectStoreLocator() {
    owner_ = "";
    locatorUri_ = "";
    encryptionKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectStoreLocator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ObjectStoreLocator(
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

            owner_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            locatorUri_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            encryptionKey_ = s;
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
    return io.provenance.metadata.v1.Objectstore.internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Objectstore.internal_static_provenance_metadata_v1_ObjectStoreLocator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.ObjectStoreLocator.class, io.provenance.metadata.v1.ObjectStoreLocator.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  private volatile java.lang.Object owner_;
  /**
   * <pre>
   * account address the endpoint is owned by
   * </pre>
   *
   * <code>string owner = 1;</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * account address the endpoint is owned by
   * </pre>
   *
   * <code>string owner = 1;</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATOR_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object locatorUri_;
  /**
   * <pre>
   * locator endpoint uri
   * </pre>
   *
   * <code>string locator_uri = 2;</code>
   * @return The locatorUri.
   */
  @java.lang.Override
  public java.lang.String getLocatorUri() {
    java.lang.Object ref = locatorUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locatorUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * locator endpoint uri
   * </pre>
   *
   * <code>string locator_uri = 2;</code>
   * @return The bytes for locatorUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocatorUriBytes() {
    java.lang.Object ref = locatorUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locatorUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCRYPTION_KEY_FIELD_NUMBER = 3;
  private volatile java.lang.Object encryptionKey_;
  /**
   * <pre>
   * owners encryption key address
   * </pre>
   *
   * <code>string encryption_key = 3;</code>
   * @return The encryptionKey.
   */
  @java.lang.Override
  public java.lang.String getEncryptionKey() {
    java.lang.Object ref = encryptionKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encryptionKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * owners encryption key address
   * </pre>
   *
   * <code>string encryption_key = 3;</code>
   * @return The bytes for encryptionKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncryptionKeyBytes() {
    java.lang.Object ref = encryptionKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encryptionKey_ = b;
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
    if (!getOwnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
    }
    if (!getLocatorUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, locatorUri_);
    }
    if (!getEncryptionKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, encryptionKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOwnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
    }
    if (!getLocatorUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, locatorUri_);
    }
    if (!getEncryptionKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, encryptionKey_);
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
    if (!(obj instanceof io.provenance.metadata.v1.ObjectStoreLocator)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.ObjectStoreLocator other = (io.provenance.metadata.v1.ObjectStoreLocator) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (!getLocatorUri()
        .equals(other.getLocatorUri())) return false;
    if (!getEncryptionKey()
        .equals(other.getEncryptionKey())) return false;
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
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + LOCATOR_URI_FIELD_NUMBER;
    hash = (53 * hash) + getLocatorUri().hashCode();
    hash = (37 * hash) + ENCRYPTION_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptionKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ObjectStoreLocator parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.ObjectStoreLocator prototype) {
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
   * Defines an Locator object stored on chain, which represents a owner( blockchain address) associated with a endpoint
   * uri for it's associated object store.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.ObjectStoreLocator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.ObjectStoreLocator)
      io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Objectstore.internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Objectstore.internal_static_provenance_metadata_v1_ObjectStoreLocator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.ObjectStoreLocator.class, io.provenance.metadata.v1.ObjectStoreLocator.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.ObjectStoreLocator.newBuilder()
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
      owner_ = "";

      locatorUri_ = "";

      encryptionKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Objectstore.internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ObjectStoreLocator getDefaultInstanceForType() {
      return io.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ObjectStoreLocator build() {
      io.provenance.metadata.v1.ObjectStoreLocator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ObjectStoreLocator buildPartial() {
      io.provenance.metadata.v1.ObjectStoreLocator result = new io.provenance.metadata.v1.ObjectStoreLocator(this);
      result.owner_ = owner_;
      result.locatorUri_ = locatorUri_;
      result.encryptionKey_ = encryptionKey_;
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
      if (other instanceof io.provenance.metadata.v1.ObjectStoreLocator) {
        return mergeFrom((io.provenance.metadata.v1.ObjectStoreLocator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.ObjectStoreLocator other) {
      if (other == io.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        onChanged();
      }
      if (!other.getLocatorUri().isEmpty()) {
        locatorUri_ = other.locatorUri_;
        onChanged();
      }
      if (!other.getEncryptionKey().isEmpty()) {
        encryptionKey_ = other.encryptionKey_;
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
      io.provenance.metadata.v1.ObjectStoreLocator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.ObjectStoreLocator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <pre>
     * account address the endpoint is owned by
     * </pre>
     *
     * <code>string owner = 1;</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * account address the endpoint is owned by
     * </pre>
     *
     * <code>string owner = 1;</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * account address the endpoint is owned by
     * </pre>
     *
     * <code>string owner = 1;</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      owner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account address the endpoint is owned by
     * </pre>
     *
     * <code>string owner = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      
      owner_ = getDefaultInstance().getOwner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account address the endpoint is owned by
     * </pre>
     *
     * <code>string owner = 1;</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      owner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object locatorUri_ = "";
    /**
     * <pre>
     * locator endpoint uri
     * </pre>
     *
     * <code>string locator_uri = 2;</code>
     * @return The locatorUri.
     */
    public java.lang.String getLocatorUri() {
      java.lang.Object ref = locatorUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locatorUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * locator endpoint uri
     * </pre>
     *
     * <code>string locator_uri = 2;</code>
     * @return The bytes for locatorUri.
     */
    public com.google.protobuf.ByteString
        getLocatorUriBytes() {
      java.lang.Object ref = locatorUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locatorUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * locator endpoint uri
     * </pre>
     *
     * <code>string locator_uri = 2;</code>
     * @param value The locatorUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocatorUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      locatorUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locator endpoint uri
     * </pre>
     *
     * <code>string locator_uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocatorUri() {
      
      locatorUri_ = getDefaultInstance().getLocatorUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locator endpoint uri
     * </pre>
     *
     * <code>string locator_uri = 2;</code>
     * @param value The bytes for locatorUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocatorUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      locatorUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object encryptionKey_ = "";
    /**
     * <pre>
     * owners encryption key address
     * </pre>
     *
     * <code>string encryption_key = 3;</code>
     * @return The encryptionKey.
     */
    public java.lang.String getEncryptionKey() {
      java.lang.Object ref = encryptionKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encryptionKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * owners encryption key address
     * </pre>
     *
     * <code>string encryption_key = 3;</code>
     * @return The bytes for encryptionKey.
     */
    public com.google.protobuf.ByteString
        getEncryptionKeyBytes() {
      java.lang.Object ref = encryptionKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encryptionKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * owners encryption key address
     * </pre>
     *
     * <code>string encryption_key = 3;</code>
     * @param value The encryptionKey to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encryptionKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * owners encryption key address
     * </pre>
     *
     * <code>string encryption_key = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptionKey() {
      
      encryptionKey_ = getDefaultInstance().getEncryptionKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * owners encryption key address
     * </pre>
     *
     * <code>string encryption_key = 3;</code>
     * @param value The bytes for encryptionKey to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encryptionKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.ObjectStoreLocator)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.ObjectStoreLocator)
  private static final io.provenance.metadata.v1.ObjectStoreLocator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.ObjectStoreLocator();
  }

  public static io.provenance.metadata.v1.ObjectStoreLocator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectStoreLocator>
      PARSER = new com.google.protobuf.AbstractParser<ObjectStoreLocator>() {
    @java.lang.Override
    public ObjectStoreLocator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ObjectStoreLocator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ObjectStoreLocator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectStoreLocator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.ObjectStoreLocator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

