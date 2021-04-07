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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Allocations */
public class Allocations {
  StringUtil util = new StringUtil();

  @JsonProperty("Allocations")
  private List<Allocation> allocations = new ArrayList<Allocation>();
  /**
   * allocations
   *
   * @param allocations List&lt;Allocation&gt;
   * @return Allocations
   */
  public Allocations allocations(List<Allocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  /**
   * allocations
   *
   * @param allocationsItem Allocation
   * @return Allocations
   */
  public Allocations addAllocationsItem(Allocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<Allocation>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

  /**
   * Get allocations
   *
   * @return allocations
   */
  @ApiModelProperty(value = "")
  /**
   * allocations
   *
   * @return allocations List<Allocation>
   */
  public List<Allocation> getAllocations() {
    return allocations;
  }

  /**
   * allocations
   *
   * @param allocations List&lt;Allocation&gt;
   */
  public void setAllocations(List<Allocation> allocations) {
    this.allocations = allocations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocations allocations = (Allocations) o;
    return Objects.equals(this.allocations, allocations.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocations {\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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
