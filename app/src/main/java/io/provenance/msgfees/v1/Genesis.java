// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/genesis.proto

package io.provenance.msgfees.v1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_msgfees_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_msgfees_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#provenance/msgfees/v1/genesis.proto\022\025p" +
      "rovenance.msgfees.v1\032\024gogoproto/gogo.pro" +
      "to\032#provenance/msgfees/v1/msgfees.proto\"" +
      "z\n\014GenesisState\0223\n\006params\030\001 \001(\0132\035.proven" +
      "ance.msgfees.v1.ParamsB\004\310\336\037\000\0225\n\010msg_fees" +
      "\030\002 \003(\0132\035.provenance.msgfees.v1.MsgFeeB\004\310" +
      "\336\037\000BQ\n\030io.provenance.msgfees.v1P\001Z3githu" +
      "b.com/provenance-io/provenance/x/msgfees" +
      "/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          io.provenance.msgfees.v1.Msgfees.getDescriptor(),
        });
    internal_static_provenance_msgfees_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_msgfees_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_msgfees_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "MsgFees", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    io.provenance.msgfees.v1.Msgfees.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
