/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Invoice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Allocation
 */

public class Allocation {
  @JsonProperty("Invoice")
  private Invoice invoice = null;

  @JsonProperty("Amount")
  private BigDecimal amount = null;

  @JsonProperty("Date")
  private String date = null;

  public Allocation invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public Allocation amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * the amount being applied to the invoice
   * @return amount
  **/
  @ApiModelProperty(value = "the amount being applied to the invoice")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Allocation date(String date) {
    this.date = date;
    return this;
  }

   /**
   * the date the prepayment is applied YYYY-MM-DD (read-only). This will be the latter of the invoice date and the prepayment date.
   * @return date
  **/
  @ApiModelProperty(value = "the date the prepayment is applied YYYY-MM-DD (read-only). This will be the latter of the invoice date and the prepayment date.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocation allocation = (Allocation) o;
    return Objects.equals(this.invoice, allocation.invoice) &&
        Objects.equals(this.amount, allocation.amount) &&
        Objects.equals(this.date, allocation.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, amount, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

