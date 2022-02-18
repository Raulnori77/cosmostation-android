// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/metadata.proto

package io.provenance.metadata.v1;

public interface ScopeIdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.ScopeIdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * scope_id is the raw bytes of the scope address.
   * </pre>
   *
   * <code>bytes scope_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The scopeId.
   */
  com.google.protobuf.ByteString getScopeId();

  /**
   * <pre>
   * scope_id_prefix is the prefix portion of the scope_id.
   * </pre>
   *
   * <code>bytes scope_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_prefix&#92;""];</code>
   * @return The scopeIdPrefix.
   */
  com.google.protobuf.ByteString getScopeIdPrefix();

  /**
   * <pre>
   * scope_id_scope_uuid is the scope_uuid portion of the scope_id.
   * </pre>
   *
   * <code>bytes scope_id_scope_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_scope_uuid&#92;""];</code>
   * @return The scopeIdScopeUuid.
   */
  com.google.protobuf.ByteString getScopeIdScopeUuid();

  /**
   * <pre>
   * scope_addr is the bech32 string version of the scope_id.
   * </pre>
   *
   * <code>string scope_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_addr&#92;""];</code>
   * @return The scopeAddr.
   */
  java.lang.String getScopeAddr();
  /**
   * <pre>
   * scope_addr is the bech32 string version of the scope_id.
   * </pre>
   *
   * <code>string scope_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_addr&#92;""];</code>
   * @return The bytes for scopeAddr.
   */
  com.google.protobuf.ByteString
      getScopeAddrBytes();

  /**
   * <pre>
   * scope_uuid is the uuid hex string of the scope_id_scope_uuid.
   * </pre>
   *
   * <code>string scope_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_uuid&#92;""];</code>
   * @return The scopeUuid.
   */
  java.lang.String getScopeUuid();
  /**
   * <pre>
   * scope_uuid is the uuid hex string of the scope_id_scope_uuid.
   * </pre>
   *
   * <code>string scope_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_uuid&#92;""];</code>
   * @return The bytes for scopeUuid.
   */
  com.google.protobuf.ByteString
      getScopeUuidBytes();
}
