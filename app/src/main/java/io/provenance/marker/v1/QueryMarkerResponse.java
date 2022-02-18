// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * QueryMarkerResponse is the response type for the Query/Marker method.
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.QueryMarkerResponse}
 */
public final class QueryMarkerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.QueryMarkerResponse)
    QueryMarkerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMarkerResponse.newBuilder() to construct.
  private QueryMarkerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMarkerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMarkerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryMarkerResponse(
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
            com.google.protobuf2.Any.Builder subBuilder = null;
            if (marker_ != null) {
              subBuilder = marker_.toBuilder();
            }
            marker_ = input.readMessage(com.google.protobuf2.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(marker_);
              marker_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryMarkerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.QueryMarkerResponse.class, io.provenance.marker.v1.QueryMarkerResponse.Builder.class);
  }

  public static final int MARKER_FIELD_NUMBER = 1;
  private com.google.protobuf2.Any marker_;
  /**
   * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
   * @return Whether the marker field is set.
   */
  @java.lang.Override
  public boolean hasMarker() {
    return marker_ != null;
  }
  /**
   * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
   * @return The marker.
   */
  @java.lang.Override
  public com.google.protobuf2.Any getMarker() {
    return marker_ == null ? com.google.protobuf2.Any.getDefaultInstance() : marker_;
  }
  /**
   * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
   */
  @java.lang.Override
  public com.google.protobuf2.AnyOrBuilder getMarkerOrBuilder() {
    return getMarker();
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
    if (marker_ != null) {
      output.writeMessage(1, getMarker());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (marker_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMarker());
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
    if (!(obj instanceof io.provenance.marker.v1.QueryMarkerResponse)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.QueryMarkerResponse other = (io.provenance.marker.v1.QueryMarkerResponse) obj;

    if (hasMarker() != other.hasMarker()) return false;
    if (hasMarker()) {
      if (!getMarker()
          .equals(other.getMarker())) return false;
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
    if (hasMarker()) {
      hash = (37 * hash) + MARKER_FIELD_NUMBER;
      hash = (53 * hash) + getMarker().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.QueryMarkerResponse parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.QueryMarkerResponse prototype) {
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
   * QueryMarkerResponse is the response type for the Query/Marker method.
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.QueryMarkerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.QueryMarkerResponse)
      io.provenance.marker.v1.QueryMarkerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryMarkerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.QueryMarkerResponse.class, io.provenance.marker.v1.QueryMarkerResponse.Builder.class);
    }

    // Construct using io.provenance.marker.v1.QueryMarkerResponse.newBuilder()
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
      if (markerBuilder_ == null) {
        marker_ = null;
      } else {
        marker_ = null;
        markerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.QueryOuterClass.internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryMarkerResponse getDefaultInstanceForType() {
      return io.provenance.marker.v1.QueryMarkerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryMarkerResponse build() {
      io.provenance.marker.v1.QueryMarkerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.QueryMarkerResponse buildPartial() {
      io.provenance.marker.v1.QueryMarkerResponse result = new io.provenance.marker.v1.QueryMarkerResponse(this);
      if (markerBuilder_ == null) {
        result.marker_ = marker_;
      } else {
        result.marker_ = markerBuilder_.build();
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
      if (other instanceof io.provenance.marker.v1.QueryMarkerResponse) {
        return mergeFrom((io.provenance.marker.v1.QueryMarkerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.QueryMarkerResponse other) {
      if (other == io.provenance.marker.v1.QueryMarkerResponse.getDefaultInstance()) return this;
      if (other.hasMarker()) {
        mergeMarker(other.getMarker());
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
      io.provenance.marker.v1.QueryMarkerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.QueryMarkerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf2.Any marker_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder> markerBuilder_;
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     * @return Whether the marker field is set.
     */
    public boolean hasMarker() {
      return markerBuilder_ != null || marker_ != null;
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     * @return The marker.
     */
    public com.google.protobuf2.Any getMarker() {
      if (markerBuilder_ == null) {
        return marker_ == null ? com.google.protobuf2.Any.getDefaultInstance() : marker_;
      } else {
        return markerBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public Builder setMarker(com.google.protobuf2.Any value) {
      if (markerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        marker_ = value;
        onChanged();
      } else {
        markerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public Builder setMarker(
        com.google.protobuf2.Any.Builder builderForValue) {
      if (markerBuilder_ == null) {
        marker_ = builderForValue.build();
        onChanged();
      } else {
        markerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public Builder mergeMarker(com.google.protobuf2.Any value) {
      if (markerBuilder_ == null) {
        if (marker_ != null) {
          marker_ =
            com.google.protobuf2.Any.newBuilder(marker_).mergeFrom(value).buildPartial();
        } else {
          marker_ = value;
        }
        onChanged();
      } else {
        markerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public Builder clearMarker() {
      if (markerBuilder_ == null) {
        marker_ = null;
        onChanged();
      } else {
        marker_ = null;
        markerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public com.google.protobuf2.Any.Builder getMarkerBuilder() {
      
      onChanged();
      return getMarkerFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    public com.google.protobuf2.AnyOrBuilder getMarkerOrBuilder() {
      if (markerBuilder_ != null) {
        return markerBuilder_.getMessageOrBuilder();
      } else {
        return marker_ == null ?
            com.google.protobuf2.Any.getDefaultInstance() : marker_;
      }
    }
    /**
     * <code>.google.protobuf2.Any marker = 1 [(.cosmos_proto.accepts_interface) = "MarkerAccountI"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder> 
        getMarkerFieldBuilder() {
      if (markerBuilder_ == null) {
        markerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder>(
                getMarker(),
                getParentForChildren(),
                isClean());
        marker_ = null;
      }
      return markerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.QueryMarkerResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.QueryMarkerResponse)
  private static final io.provenance.marker.v1.QueryMarkerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.QueryMarkerResponse();
  }

  public static io.provenance.marker.v1.QueryMarkerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMarkerResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryMarkerResponse>() {
    @java.lang.Override
    public QueryMarkerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryMarkerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryMarkerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMarkerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.QueryMarkerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

