/*
 * Xero Files API
 * These endpoints are specific to Xero Files API
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;

/** UploadObject */
public class UploadObject {
  StringUtil util = new StringUtil();

  @JsonProperty("body")
  private byte[] body;

  @JsonProperty("name")
  private String name;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("mimeType")
  private String mimeType;
  /**
   * body
   *
   * @param body byte[]
   * @return UploadObject
   */
  public UploadObject body(byte[] body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * body
   *
   * @return body byte[]
   */
  public byte[] getBody() {
    return body;
  }

  /**
   * body
   *
   * @param body byte[]
   */
  public void setBody(byte[] body) {
    this.body = body;
  }

  /**
   * exact name of the file you are uploading
   *
   * @param name String
   * @return UploadObject
   */
  public UploadObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * exact name of the file you are uploading
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "exact name of the file you are uploading")
  /**
   * exact name of the file you are uploading
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * exact name of the file you are uploading
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * filename
   *
   * @param filename String
   * @return UploadObject
   */
  public UploadObject filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   *
   * @return filename
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * filename
   *
   * @return filename String
   */
  public String getFilename() {
    return filename;
  }

  /**
   * filename
   *
   * @param filename String
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * mimeType
   *
   * @param mimeType String
   * @return UploadObject
   */
  public UploadObject mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   *
   * @return mimeType
   */
  @ApiModelProperty(value = "")
  /**
   * mimeType
   *
   * @return mimeType String
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * mimeType
   *
   * @param mimeType String
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadObject uploadObject = (UploadObject) o;
    return Arrays.equals(this.body, uploadObject.body)
        && Objects.equals(this.name, uploadObject.name)
        && Objects.equals(this.filename, uploadObject.filename)
        && Objects.equals(this.mimeType, uploadObject.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(body), name, filename, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadObject {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
