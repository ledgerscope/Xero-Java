/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** InvalidField */
public class InvalidField {
  StringUtil util = new StringUtil();

  @JsonProperty("name")
  private String name;

  @JsonProperty("reason")
  private String reason;

  public InvalidField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field that caused the error
   *
   * @return name
   */
  @ApiModelProperty(example = "DateOfBirth", value = "The name of the field that caused the error")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InvalidField reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason the error occurred
   *
   * @return reason
   */
  @ApiModelProperty(
      example = "The Date of Birth is required.",
      value = "The reason the error occurred")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidField invalidField = (InvalidField) o;
    return Objects.equals(this.name, invalidField.name)
        && Objects.equals(this.reason, invalidField.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
