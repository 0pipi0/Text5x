package com.example.martian.bean;// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: entity.proto at 2:1
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class UserInfoEntity extends Message<UserInfoEntity, UserInfoEntity.Builder> {
  public static final ProtoAdapter<UserInfoEntity> ADAPTER = new ProtoAdapter_UserInfoEntity();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_NICKNAME = "";

  public static final String DEFAULT_PHONENUMBER = "";

  public static final String DEFAULT_HEADIMG = "";

  public static final Integer DEFAULT_SEX = 0;

  /**
   * 用户id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long id;

  /**
   * 昵称
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String nickName;

  /**
   * 手机号
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phoneNumber;

  /**
   * 头像
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String headImg;

  /**
   * 性别
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer sex;

  public UserInfoEntity(Long id, String nickName, String phoneNumber, String headImg, Integer sex) {
    this(id, nickName, phoneNumber, headImg, sex, ByteString.EMPTY);
  }

  public UserInfoEntity(Long id, String nickName, String phoneNumber, String headImg, Integer sex, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.nickName = nickName;
    this.phoneNumber = phoneNumber;
    this.headImg = headImg;
    this.sex = sex;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.nickName = nickName;
    builder.phoneNumber = phoneNumber;
    builder.headImg = headImg;
    builder.sex = sex;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UserInfoEntity)) return false;
    UserInfoEntity o = (UserInfoEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(nickName, o.nickName)
        && Internal.equals(phoneNumber, o.phoneNumber)
        && Internal.equals(headImg, o.headImg)
        && Internal.equals(sex, o.sex);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (nickName != null ? nickName.hashCode() : 0);
      result = result * 37 + (phoneNumber != null ? phoneNumber.hashCode() : 0);
      result = result * 37 + (headImg != null ? headImg.hashCode() : 0);
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (nickName != null) builder.append(", nickName=").append(nickName);
    if (phoneNumber != null) builder.append(", phoneNumber=").append(phoneNumber);
    if (headImg != null) builder.append(", headImg=").append(headImg);
    if (sex != null) builder.append(", sex=").append(sex);
    return builder.replace(0, 2, "UserInfoEntity{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UserInfoEntity, Builder> {
    public Long id;

    public String nickName;

    public String phoneNumber;

    public String headImg;

    public Integer sex;

    public Builder() {
    }

    /**
     * 用户id
     */
    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 昵称
     */
    public Builder nickName(String nickName) {
      this.nickName = nickName;
      return this;
    }

    /**
     * 手机号
     */
    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * 头像
     */
    public Builder headImg(String headImg) {
      this.headImg = headImg;
      return this;
    }

    /**
     * 性别
     */
    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    @Override
    public UserInfoEntity build() {
      return new UserInfoEntity(id, nickName, phoneNumber, headImg, sex, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UserInfoEntity extends ProtoAdapter<UserInfoEntity> {
    ProtoAdapter_UserInfoEntity() {
      super(FieldEncoding.LENGTH_DELIMITED, UserInfoEntity.class);
    }

    @Override
    public int encodedSize(UserInfoEntity value) {
      return (value.id != null ? ProtoAdapter.INT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.nickName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.nickName) : 0)
          + (value.phoneNumber != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.phoneNumber) : 0)
          + (value.headImg != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.headImg) : 0)
          + (value.sex != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, value.sex) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UserInfoEntity value) throws IOException {
      if (value.id != null) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.id);
      if (value.nickName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.nickName);
      if (value.phoneNumber != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.phoneNumber);
      if (value.headImg != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.headImg);
      if (value.sex != null) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.sex);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UserInfoEntity decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.INT64.decode(reader)); break;
          case 2: builder.nickName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.phoneNumber(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.headImg(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.sex(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public UserInfoEntity redact(UserInfoEntity value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
