// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * QueryHoldingResponse is the response type for the Query/MarkerHolders method.
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.QueryHoldingResponse}
 */
public final class QueryHoldingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.QueryHoldingResponse)
    QueryHoldingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryHoldingResponse.newBuilder() to construct.
  private QueryHoldingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryHoldingResponse() {
    balances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryHoldingResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryHoldingResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              balances_ = new java.util.ArrayList<io.provenance.marker.v1.Balance>();
              mutable_bitField0_ |= 0x00000001;
            }
            balances_.add(
                input.readMessage(io.provenance.marker.v1.Balance.parser(), extensionRegistry));
            break;
          }
          case 18: {
            cosmos.base.query.v1beta1.Pagination.PageResponse.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(cosmos.base.query.v1beta1.Pagination.PageResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
            }

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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        balances_ = java.util.Collections.unmodifiableList(balances_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryHoldingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.QueryHoldingResponse.class, io.provenance.marker.v1.QueryHoldingResponse.Builder.class);
  }

  public static final int BALANCES_FIELD_NUMBER = 1;
  private java.util.List<io.provenance.marker.v1.Balance> balances_;
  /**
   * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<io.provenance.marker.v1.Balance> getBalancesList() {
    return balances_;
  }
  /**
   * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.provenance.marker.v1.BalanceOrBuilder> 
      getBalancesOrBuilderList() {
    return balances_;
  }
  /**
   * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getBalancesCount() {
    return balances_.size();
  }
  /**
   * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.Balance getBalances(int index) {
    return balances_.get(index);
  }
  /**
   * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.BalanceOrBuilder getBalancesOrBuilder(
      int index) {
    return balances_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private cosmos.base.query.v1beta1.Pagination.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageResponse getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder getPaginationOrBuilder() {
    return getPagination();
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
    for (int i = 0; i < balances_.size(); i++) {
      output.writeMessage(1, balances_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < balances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, balances_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof io.provenance.marker.v1.QueryHoldingResponse)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.QueryHoldingResponse other = (io.provenance.marker.v1.QueryHoldingResponse) obj;

    if (!getBalancesList()
        .equals(other.getBalancesList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
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
    if (getBalancesCount() > 0) {
      hash = (37 * hash) + BALANCES_FIELD_NUMBER;
      hash = (53 * hash) + getBalancesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryHoldingResponse parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.QueryHoldingResponse prototype) {
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
   * QueryHoldingResponse is the response type for the Query/MarkerHolders method.
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.QueryHoldingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.QueryHoldingResponse)
      io.provenance.marker.v1.QueryHoldingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryHoldingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.QueryHoldingResponse.class, io.provenance.marker.v1.QueryHoldingResponse.Builder.class);
    }

    // Construct using io.provenance.marker.v1.QueryHoldingResponse.newBuilder()
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
        getBalancesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (balancesBuilder_ == null) {
        balances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        balancesBuilder_.clear();
      }
      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryHoldingResponse getDefaultInstanceForType() {
      return io.provenance.marker.v1.QueryHoldingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryHoldingResponse build() {
      io.provenance.marker.v1.QueryHoldingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryHoldingResponse buildPartial() {
      io.provenance.marker.v1.QueryHoldingResponse result = new io.provenance.marker.v1.QueryHoldingResponse(this);
      int from_bitField0_ = bitField0_;
      if (balancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          balances_ = java.util.Collections.unmodifiableList(balances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.balances_ = balances_;
      } else {
        result.balances_ = balancesBuilder_.build();
      }
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
      }
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
      if (other instanceof io.provenance.marker.v1.QueryHoldingResponse) {
        return mergeFrom((io.provenance.marker.v1.QueryHoldingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.QueryHoldingResponse other) {
      if (other == io.provenance.marker.v1.QueryHoldingResponse.getDefaultInstance()) return this;
      if (balancesBuilder_ == null) {
        if (!other.balances_.isEmpty()) {
          if (balances_.isEmpty()) {
            balances_ = other.balances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBalancesIsMutable();
            balances_.addAll(other.balances_);
          }
          onChanged();
        }
      } else {
        if (!other.balances_.isEmpty()) {
          if (balancesBuilder_.isEmpty()) {
            balancesBuilder_.dispose();
            balancesBuilder_ = null;
            balances_ = other.balances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            balancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBalancesFieldBuilder() : null;
          } else {
            balancesBuilder_.addAllMessages(other.balances_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
      io.provenance.marker.v1.QueryHoldingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.QueryHoldingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.provenance.marker.v1.Balance> balances_ =
      java.util.Collections.emptyList();
    private void ensureBalancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        balances_ = new java.util.ArrayList<io.provenance.marker.v1.Balance>(balances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.Balance, io.provenance.marker.v1.Balance.Builder, io.provenance.marker.v1.BalanceOrBuilder> balancesBuilder_;

    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.Balance> getBalancesList() {
      if (balancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(balances_);
      } else {
        return balancesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public int getBalancesCount() {
      if (balancesBuilder_ == null) {
        return balances_.size();
      } else {
        return balancesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.Balance getBalances(int index) {
      if (balancesBuilder_ == null) {
        return balances_.get(index);
      } else {
        return balancesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setBalances(
        int index, io.provenance.marker.v1.Balance value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.set(index, value);
        onChanged();
      } else {
        balancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setBalances(
        int index, io.provenance.marker.v1.Balance.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.set(index, builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addBalances(io.provenance.marker.v1.Balance value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.add(value);
        onChanged();
      } else {
        balancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addBalances(
        int index, io.provenance.marker.v1.Balance value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.add(index, value);
        onChanged();
      } else {
        balancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addBalances(
        io.provenance.marker.v1.Balance.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.add(builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addBalances(
        int index, io.provenance.marker.v1.Balance.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.add(index, builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllBalances(
        java.lang.Iterable<? extends io.provenance.marker.v1.Balance> values) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, balances_);
        onChanged();
      } else {
        balancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearBalances() {
      if (balancesBuilder_ == null) {
        balances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        balancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeBalances(int index) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.remove(index);
        onChanged();
      } else {
        balancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.Balance.Builder getBalancesBuilder(
        int index) {
      return getBalancesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.BalanceOrBuilder getBalancesOrBuilder(
        int index) {
      if (balancesBuilder_ == null) {
        return balances_.get(index);  } else {
        return balancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends io.provenance.marker.v1.BalanceOrBuilder> 
         getBalancesOrBuilderList() {
      if (balancesBuilder_ != null) {
        return balancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(balances_);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.Balance.Builder addBalancesBuilder() {
      return getBalancesFieldBuilder().addBuilder(
          io.provenance.marker.v1.Balance.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.Balance.Builder addBalancesBuilder(
        int index) {
      return getBalancesFieldBuilder().addBuilder(
          index, io.provenance.marker.v1.Balance.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.Balance balances = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.Balance.Builder> 
         getBalancesBuilderList() {
      return getBalancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.Balance, io.provenance.marker.v1.Balance.Builder, io.provenance.marker.v1.BalanceOrBuilder> 
        getBalancesFieldBuilder() {
      if (balancesBuilder_ == null) {
        balancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.provenance.marker.v1.Balance, io.provenance.marker.v1.Balance.Builder, io.provenance.marker.v1.BalanceOrBuilder>(
                balances_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        balances_ = null;
      }
      return balancesBuilder_;
    }

    private cosmos.base.query.v1beta1.Pagination.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return The pagination.
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(cosmos.base.query.v1beta1.Pagination.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
        onChanged();
      } else {
        paginationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(
        cosmos.base.query.v1beta1.Pagination.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder mergePagination(cosmos.base.query.v1beta1.Pagination.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            cosmos.base.query.v1beta1.Pagination.PageResponse.newBuilder(pagination_).mergeFrom(value).buildPartial();
        } else {
          pagination_ = value;
        }
        onChanged();
      } else {
        paginationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder clearPagination() {
      if (paginationBuilder_ == null) {
        pagination_ = null;
        onChanged();
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponse.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.QueryHoldingResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.QueryHoldingResponse)
  private static final io.provenance.marker.v1.QueryHoldingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.QueryHoldingResponse();
  }

  public static io.provenance.marker.v1.QueryHoldingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryHoldingResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryHoldingResponse>() {
    @java.lang.Override
    public QueryHoldingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryHoldingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryHoldingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryHoldingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.QueryHoldingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

