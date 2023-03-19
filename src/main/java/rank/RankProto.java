// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rank.proto

package rank.rank;

public final class RankProto {
  private RankProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_CreateRankRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_CreateRankRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_CreateRankResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_CreateRankResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_AddScoreRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_AddScoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_AddScoreResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_AddScoreResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_GetRankByUuidRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_GetRankByUuidRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_GetRankByUuidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_GetRankByUuidResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_GetAllRanksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_GetAllRanksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_Rank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_Rank_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_GetAllRanksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_GetAllRanksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_ClearRankRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_ClearRankRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_rank_ClearRankResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_rank_ClearRankResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nrank.proto\022\020com.example.rank\"/\n\021Create" +
      "RankRequest\022\014\n\004name\030\001 \001(\t\022\014\n\004uuid\030\002 \001(\t\"" +
      "\024\n\022CreateRankResponse\"@\n\017AddScoreRequest" +
      "\022\020\n\010rankName\030\001 \001(\t\022\014\n\004uuid\030\002 \001(\t\022\r\n\005scor" +
      "e\030\003 \001(\005\"\022\n\020AddScoreResponse\"6\n\024GetRankBy" +
      "UuidRequest\022\014\n\004uuid\030\001 \001(\t\022\020\n\010rankName\030\002 " +
      "\001(\t\"%\n\025GetRankByUuidResponse\022\014\n\004rank\030\001 \001" +
      "(\005\"&\n\022GetAllRanksRequest\022\020\n\010rankName\030\001 \001" +
      "(\t\"#\n\004Rank\022\014\n\004uuid\030\001 \001(\t\022\r\n\005score\030\002 \001(\005\"" +
      "<\n\023GetAllRanksResponse\022%\n\005ranks\030\001 \003(\0132\026." +
      "com.example.rank.Rank\" \n\020ClearRankReques" +
      "t\022\014\n\004name\030\001 \001(\t\"\023\n\021ClearRankResponse2\327\003\n" +
      "\013RankService\022Y\n\nCreateRank\022#.com.example" +
      ".rank.CreateRankRequest\032$.com.example.ra" +
      "nk.CreateRankResponse\"\000\022S\n\010AddScore\022!.co" +
      "m.example.rank.AddScoreRequest\032\".com.exa" +
      "mple.rank.AddScoreResponse\"\000\022b\n\rGetRankB" +
      "yUuid\022&.com.example.rank.GetRankByUuidRe" +
      "quest\032\'.com.example.rank.GetRankByUuidRe" +
      "sponse\"\000\022\\\n\013GetAllRanks\022$.com.example.ra" +
      "nk.GetAllRanksRequest\032%.com.example.rank" +
      ".GetAllRanksResponse\"\000\022V\n\tClearRank\022\".co" +
      "m.example.rank.ClearRankRequest\032#.com.ex" +
      "ample.rank.ClearRankResponse\"\000B\037\n\020com.ex" +
      "ample.rankB\tRankProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_rank_CreateRankRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_rank_CreateRankRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_CreateRankRequest_descriptor,
        new String[] { "Name", "Uuid", });
    internal_static_com_example_rank_CreateRankResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_rank_CreateRankResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_CreateRankResponse_descriptor,
        new String[] { });
    internal_static_com_example_rank_AddScoreRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_rank_AddScoreRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_AddScoreRequest_descriptor,
        new String[] { "RankName", "Uuid", "Score", });
    internal_static_com_example_rank_AddScoreResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_rank_AddScoreResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_AddScoreResponse_descriptor,
        new String[] { });
    internal_static_com_example_rank_GetRankByUuidRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_rank_GetRankByUuidRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_GetRankByUuidRequest_descriptor,
        new String[] { "Uuid", "RankName", });
    internal_static_com_example_rank_GetRankByUuidResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_rank_GetRankByUuidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_GetRankByUuidResponse_descriptor,
        new String[] { "Rank", });
    internal_static_com_example_rank_GetAllRanksRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_rank_GetAllRanksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_GetAllRanksRequest_descriptor,
        new String[] { "RankName", });
    internal_static_com_example_rank_Rank_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_example_rank_Rank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_Rank_descriptor,
        new String[] { "Uuid", "Score", });
    internal_static_com_example_rank_GetAllRanksResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_example_rank_GetAllRanksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_GetAllRanksResponse_descriptor,
        new String[] { "Ranks", });
    internal_static_com_example_rank_ClearRankRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_example_rank_ClearRankRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_ClearRankRequest_descriptor,
        new String[] { "Name", });
    internal_static_com_example_rank_ClearRankResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_example_rank_ClearRankResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_rank_ClearRankResponse_descriptor,
        new String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
