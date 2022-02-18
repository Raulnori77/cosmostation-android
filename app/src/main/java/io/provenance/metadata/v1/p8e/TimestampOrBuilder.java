// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package io.provenance.metadata.v1.p8e;

public interface TimestampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.p8e.Timestamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   * </pre>
   *
   * <code>int64 seconds = 1;</code>
   * @return The seconds.
   */
  long getSeconds();

  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution.
   * </pre>
   *
   * <code>int32 nanos = 2;</code>
   * @return The nanos.
   */
  int getNanos();
}
