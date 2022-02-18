// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/genesis.proto

package io.provenance.marker.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  io.provenance.marker.v1.Params getParams();
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   */
  io.provenance.marker.v1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<io.provenance.marker.v1.MarkerAccount> 
      getMarkersList();
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  io.provenance.marker.v1.MarkerAccount getMarkers(int index);
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  int getMarkersCount();
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends io.provenance.marker.v1.MarkerAccountOrBuilder> 
      getMarkersOrBuilderList();
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  io.provenance.marker.v1.MarkerAccountOrBuilder getMarkersOrBuilder(
      int index);
}
