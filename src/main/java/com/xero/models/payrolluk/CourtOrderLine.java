/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** CourtOrderLine */
public class CourtOrderLine {
  StringUtil util = new StringUtil();

  @JsonProperty("courtOrderTypeID")
  private UUID courtOrderTypeID;

  @JsonProperty("amount")
  private Double amount;
  /**
   * Xero identifier for payroll court order type
   *
   * @param courtOrderTypeID UUID
   * @return CourtOrderLine
   */
  public CourtOrderLine courtOrderTypeID(UUID courtOrderTypeID) {
    this.courtOrderTypeID = courtOrderTypeID;
    return this;
  }

  /**
   * Xero identifier for payroll court order type
   *
   * @return courtOrderTypeID
   */
  @ApiModelProperty(value = "Xero identifier for payroll court order type")
  /**
   * Xero identifier for payroll court order type
   *
   * @return courtOrderTypeID UUID
   */
  public UUID getCourtOrderTypeID() {
    return courtOrderTypeID;
  }

  /**
   * Xero identifier for payroll court order type
   *
   * @param courtOrderTypeID UUID
   */
  public void setCourtOrderTypeID(UUID courtOrderTypeID) {
    this.courtOrderTypeID = courtOrderTypeID;
  }

  /**
   * Amount
   *
   * @param amount Double
   * @return CourtOrderLine
   */
  public CourtOrderLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "Amount")
  /**
   * Amount
   *
   * @return amount Double
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * Amount
   *
   * @param amount Double
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourtOrderLine courtOrderLine = (CourtOrderLine) o;
    return Objects.equals(this.courtOrderTypeID, courtOrderLine.courtOrderTypeID)
        && Objects.equals(this.amount, courtOrderLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courtOrderTypeID, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtOrderLine {\n");
    sb.append("    courtOrderTypeID: ").append(toIndentedString(courtOrderTypeID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
