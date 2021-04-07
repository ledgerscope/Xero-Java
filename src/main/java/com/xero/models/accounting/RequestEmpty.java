/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RequestEmpty */
public class RequestEmpty {
  StringUtil util = new StringUtil();

  @JsonProperty("Status")
  private String status;
  /**
   * Need at least one field to create an empty JSON payload
   *
   * @param status String
   * @return RequestEmpty
   */
  public RequestEmpty status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Need at least one field to create an empty JSON payload
   *
   * @return status
   */
  @ApiModelProperty(value = "Need at least one field to create an empty JSON payload")
  /**
   * Need at least one field to create an empty JSON payload
   *
   * @return status String
   */
  public String getStatus() {
    return status;
  }

  /**
   * Need at least one field to create an empty JSON payload
   *
   * @param status String
   */
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestEmpty requestEmpty = (RequestEmpty) o;
    return Objects.equals(this.status, requestEmpty.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestEmpty {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
