/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** LeaveEarningsLine */
public class LeaveEarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("EarningsRateID")
  private UUID earningsRateID;

  @JsonProperty("RatePerUnit")
  private Double ratePerUnit;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  public LeaveEarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return earningsRateID
   */
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public LeaveEarningsLine ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * Rate per unit of the EarningsLine.
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(example = "38.0", value = "Rate per unit of the EarningsLine.")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public LeaveEarningsLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Earnings rate number of units.
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(example = "2.5", value = "Earnings rate number of units.")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveEarningsLine leaveEarningsLine = (LeaveEarningsLine) o;
    return Objects.equals(this.earningsRateID, leaveEarningsLine.earningsRateID)
        && Objects.equals(this.ratePerUnit, leaveEarningsLine.ratePerUnit)
        && Objects.equals(this.numberOfUnits, leaveEarningsLine.numberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, ratePerUnit, numberOfUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveEarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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
