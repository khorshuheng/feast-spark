// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: source.proto

package com.example.protos;

public final class Source {
  private Source() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_TestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_TestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_VehicleType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_VehicleType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_InnerMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_InnerMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_AllTypesMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_AllTypesMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_AllTypesMessage_MapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_AllTypesMessage_MapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014source.proto\022\013com.example\032\037google/prot" +
      "obuf/timestamp.proto\"\236\001\n\013TestMessage\022\r\n\005" +
      "s2_id\030\001 \001(\003\0223\n\014vehicle_type\030\002 \001(\0162\035.com." +
      "example.VehicleType.Enum\022\026\n\016unique_drive" +
      "rs\030\003 \001(\003\0223\n\017event_timestamp\030\004 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\"5\n\013VehicleType\"&\n\004" +
      "Enum\022\013\n\007UNKNOWN\020\000\022\007\n\003CAR\020\001\022\010\n\004BIKE\020\002\"\225\001\n" +
      "\014InnerMessage\022\016\n\006double\030\001 \003(\001\022\r\n\005float\030\002" +
      " \003(\002\022\017\n\007integer\030\003 \003(\005\022\014\n\004long\030\004 \003(\003\022,\n\004e" +
      "num\030\005 \001(\0162\036.com.example.InnerMessage.Enu" +
      "m\"\031\n\004Enum\022\010\n\004zero\020\000\022\007\n\003one\020\001\"\301\003\n\017AllType" +
      "sMessage\022\016\n\006double\030\001 \001(\001\022\r\n\005float\030\002 \001(\002\022" +
      "\017\n\007integer\030\003 \001(\005\022\014\n\004long\030\004 \001(\003\022\020\n\010uinteg" +
      "er\030\005 \001(\r\022\r\n\005ulong\030\006 \001(\004\022\020\n\010sinteger\030\007 \001(" +
      "\021\022\r\n\005slong\030\010 \001(\022\022\020\n\010finteger\030\t \001(\007\022\r\n\005fl" +
      "ong\030\n \001(\006\022\021\n\tsfinteger\030\013 \001(\017\022\016\n\006sflong\030\r" +
      " \001(\020\022\014\n\004bool\030\016 \001(\010\022\016\n\006string\030\017 \001(\t\022\r\n\005by" +
      "tes\030\020 \001(\014\0222\n\003map\030\021 \003(\0132%.com.example.All" +
      "TypesMessage.MapEntry\022(\n\005inner\030\022 \001(\0132\031.c" +
      "om.example.InnerMessage\0223\n\017event_timesta" +
      "mp\030\023 \001(\0132\032.google.protobuf.Timestamp\032*\n\010" +
      "MapEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "B\026\n\022com.example.protosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_example_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_TestMessage_descriptor,
        new java.lang.String[] { "S2Id", "VehicleType", "UniqueDrivers", "EventTimestamp", });
    internal_static_com_example_VehicleType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_VehicleType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_VehicleType_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_InnerMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_InnerMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_InnerMessage_descriptor,
        new java.lang.String[] { "Double", "Float", "Integer", "Long", "Enum", });
    internal_static_com_example_AllTypesMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_AllTypesMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_AllTypesMessage_descriptor,
        new java.lang.String[] { "Double", "Float", "Integer", "Long", "Uinteger", "Ulong", "Sinteger", "Slong", "Finteger", "Flong", "Sfinteger", "Sflong", "Bool", "String", "Bytes", "Map", "Inner", "EventTimestamp", });
    internal_static_com_example_AllTypesMessage_MapEntry_descriptor =
      internal_static_com_example_AllTypesMessage_descriptor.getNestedTypes().get(0);
    internal_static_com_example_AllTypesMessage_MapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_AllTypesMessage_MapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
