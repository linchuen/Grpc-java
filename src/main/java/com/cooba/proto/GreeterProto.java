// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Greeter.proto

package com.cooba.proto;

public final class GreeterProto {
  private GreeterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rGreeter.proto\022\005proto\"\034\n\014HelloRequest\022\014" +
      "\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001 " +
      "\001(\t2z\n\007Greeter\0224\n\010SayHello\022\023.proto.Hello" +
      "Request\032\021.proto.HelloReply\"\000\0229\n\rSayHello" +
      "Again\022\023.proto.HelloRequest\032\021.proto.Hello" +
      "Reply\"\000B!\n\017com.cooba.protoB\014GreeterProto" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_HelloRequest_descriptor,
        new String[] { "Name", });
    internal_static_proto_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_HelloReply_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}