// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

public interface RecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.RecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_addr is a bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
   * </pre>
   *
   * <code>string record_addr = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
   * @return The recordAddr.
   */
  java.lang.String getRecordAddr();
  /**
   * <pre>
   * record_addr is a bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
   * </pre>
   *
   * <code>string record_addr = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
   * @return The bytes for recordAddr.
   */
  com.google.protobuf.ByteString
      getRecordAddrBytes();

  /**
   * <pre>
   * scope_id can either be a uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a bech32 scope address, e.g.
   * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel.
   * </pre>
   *
   * <code>string scope_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The scopeId.
   */
  java.lang.String getScopeId();
  /**
   * <pre>
   * scope_id can either be a uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a bech32 scope address, e.g.
   * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel.
   * </pre>
   *
   * <code>string scope_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The bytes for scopeId.
   */
  com.google.protobuf.ByteString
      getScopeIdBytes();

  /**
   * <pre>
   * session_id can either be a uuid, e.g. 5803f8bc-6067-4eb5-951f-2121671c2ec0 or a bech32 session address, e.g.
   * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. This can only be a uuid if a scope_id is also
   * provided.
   * </pre>
   *
   * <code>string session_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"session_id&#92;""];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * session_id can either be a uuid, e.g. 5803f8bc-6067-4eb5-951f-2121671c2ec0 or a bech32 session address, e.g.
   * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. This can only be a uuid if a scope_id is also
   * provided.
   * </pre>
   *
   * <code>string session_id = 3 [(.gogoproto.moretags) = "yaml:&#92;"session_id&#92;""];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * name is the name of the record to look for
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is the name of the record to look for
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * include_scope is a flag for whether or not the scope containing these records should be included.
   * </pre>
   *
   * <code>bool include_scope = 10 [(.gogoproto.moretags) = "yaml:&#92;"include_scope&#92;""];</code>
   * @return The includeScope.
   */
  boolean getIncludeScope();

  /**
   * <pre>
   * include_sessions is a flag for whether or not the sessions containing these records should be included.
   * </pre>
   *
   * <code>bool include_sessions = 11 [(.gogoproto.moretags) = "yaml:&#92;"include_sessions&#92;""];</code>
   * @return The includeSessions.
   */
  boolean getIncludeSessions();
}
