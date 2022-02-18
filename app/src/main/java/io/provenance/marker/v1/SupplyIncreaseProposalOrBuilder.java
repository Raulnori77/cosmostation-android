// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/proposals.proto

package io.provenance.marker.v1;

public interface SupplyIncreaseProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.SupplyIncreaseProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amount.
   */
  cosmos.base.v1beta1.CoinOuterClass.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * an optional target address for the minted coin from this request
   * </pre>
   *
   * <code>string target_address = 4;</code>
   * @return The targetAddress.
   */
  java.lang.String getTargetAddress();
  /**
   * <pre>
   * an optional target address for the minted coin from this request
   * </pre>
   *
   * <code>string target_address = 4;</code>
   * @return The bytes for targetAddress.
   */
  com.google.protobuf.ByteString
      getTargetAddressBytes();
}
