/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The object returned for a bad request
 */
@ApiModel(description = "The object returned for a bad request")

public class ModelAPIException {
  StringUtil util = new StringUtil();

  @JsonProperty("ErrorNumber")
  private BigDecimal errorNumber;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Message")
  private String message;
  public ModelAPIException errorNumber(BigDecimal errorNumber) {
    this.errorNumber = errorNumber;
    return this;
  }

   /**
   * The error number
   * @return errorNumber
  **/
  @ApiModelProperty(example = "16", value = "The error number")
  public BigDecimal getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(BigDecimal errorNumber) {
    this.errorNumber = errorNumber;
  }

  public ModelAPIException type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of error
   * @return type
  **/
  @ApiModelProperty(example = "QueryParseException", value = "The type of error")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelAPIException message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the error
   * @return message
  **/
  @ApiModelProperty(example = "No property or field 'hi' exists in type 'Employee' (at index 0)", value = "The message describing the error")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAPIException _apIException = (ModelAPIException) o;
    return Objects.equals(this.errorNumber, _apIException.errorNumber) &&
        Objects.equals(this.type, _apIException.type) &&
        Objects.equals(this.message, _apIException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorNumber, type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAPIException {\n");
    sb.append("    errorNumber: ").append(toIndentedString(errorNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

