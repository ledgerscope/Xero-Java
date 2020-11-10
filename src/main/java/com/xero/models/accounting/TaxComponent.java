/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.2
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

/** TaxComponent */
public class TaxComponent {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Rate")
  private Double rate;

  @JsonProperty("IsCompound")
  private Boolean isCompound;

  @JsonProperty("IsNonRecoverable")
  private Boolean isNonRecoverable;

  public TaxComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Tax Component
   *
   * @return name
   */
  @ApiModelProperty(value = "Name of Tax Component")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxComponent rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Tax Rate (up to 4dp)
   *
   * @return rate
   */
  @ApiModelProperty(value = "Tax Rate (up to 4dp)")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public TaxComponent isCompound(Boolean isCompound) {
    this.isCompound = isCompound;
    return this;
  }

  /**
   * Boolean to describe if Tax rate is compounded.
   *
   * @return isCompound
   */
  @ApiModelProperty(value = "Boolean to describe if Tax rate is compounded.")
  public Boolean getIsCompound() {
    return isCompound;
  }

  public void setIsCompound(Boolean isCompound) {
    this.isCompound = isCompound;
  }

  public TaxComponent isNonRecoverable(Boolean isNonRecoverable) {
    this.isNonRecoverable = isNonRecoverable;
    return this;
  }

  /**
   * Boolean to describe if tax rate is non-recoverable. Non-recoverable rates are only applicable
   * to Canadian organisations
   *
   * @return isNonRecoverable
   */
  @ApiModelProperty(
      value =
          "Boolean to describe if tax rate is non-recoverable. Non-recoverable rates are only"
              + " applicable to Canadian organisations")
  public Boolean getIsNonRecoverable() {
    return isNonRecoverable;
  }

  public void setIsNonRecoverable(Boolean isNonRecoverable) {
    this.isNonRecoverable = isNonRecoverable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxComponent taxComponent = (TaxComponent) o;
    return Objects.equals(this.name, taxComponent.name)
        && Objects.equals(this.rate, taxComponent.rate)
        && Objects.equals(this.isCompound, taxComponent.isCompound)
        && Objects.equals(this.isNonRecoverable, taxComponent.isNonRecoverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rate, isCompound, isNonRecoverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxComponent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isCompound: ").append(toIndentedString(isCompound)).append("\n");
    sb.append("    isNonRecoverable: ").append(toIndentedString(isNonRecoverable)).append("\n");
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
