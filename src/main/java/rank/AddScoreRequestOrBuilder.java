// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rank.proto

package rank.rank;

public interface AddScoreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.rank.AddScoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rankName = 1;</code>
   */
  String getRankName();
  /**
   * <code>string rankName = 1;</code>
   */
  com.google.protobuf.ByteString
      getRankNameBytes();

  /**
   * <code>string uuid = 2;</code>
   */
  String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>int32 score = 3;</code>
   */
  int getScore();
}