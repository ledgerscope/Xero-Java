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
import com.xero.models.accounting.Payment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * BatchPayment
 */

public class BatchPayment {
  @JsonProperty("Account")
  private Object account = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("Particulars")
  private String particulars = null;

  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Details")
  private String details = null;

  @JsonProperty("Narrative")
  private String narrative = null;

  @JsonProperty("BatchPaymentID")
  private UUID batchPaymentID = null;

  @JsonProperty("DateString")
  private LocalDate dateString = null;

  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("Amount")
  private BigDecimal amount = null;

  @JsonProperty("Payments")
  private List<Payment> payments = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("TotalAmount")
  private String totalAmount = null;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC = null;

  @JsonProperty("IsReconciled")
  private String isReconciled = null;

  public BatchPayment account(Object account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Object getAccount() {
    return account;
  }

  public void setAccount(Object account) {
    this.account = account;
  }

  public BatchPayment reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.
   * @return reference
  **/
  @ApiModelProperty(value = "(NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BatchPayment particulars(String particulars) {
    this.particulars = particulars;
    return this;
  }

   /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.
   * @return particulars
  **/
  @ApiModelProperty(value = "(NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.")
  public String getParticulars() {
    return particulars;
  }

  public void setParticulars(String particulars) {
    this.particulars = particulars;
  }

  public BatchPayment code(String code) {
    this.code = code;
    return this;
  }

   /**
   * (NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.
   * @return code
  **/
  @ApiModelProperty(value = "(NZ Only) Optional references for the batch payment transaction. It will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement you import into Xero.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BatchPayment details(String details) {
    this.details = details;
    return this;
  }

   /**
   * (Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment transaction. They will also show with the batch payment transaction in the bank reconciliation Find &amp; Match screen. Depending on your individual bank, the detail may also show on the bank statement imported into Xero. Maximum field length &#x3D; 18
   * @return details
  **/
  @ApiModelProperty(value = "(Non-NZ Only) These details are sent to the org’s bank as a reference for the batch payment transaction. They will also show with the batch payment transaction in the bank reconciliation Find & Match screen. Depending on your individual bank, the detail may also show on the bank statement imported into Xero. Maximum field length = 18")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public BatchPayment narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

   /**
   * (UK Only) Only shows on the statement line in Xero. Max length &#x3D;18
   * @return narrative
  **/
  @ApiModelProperty(value = "(UK Only) Only shows on the statement line in Xero. Max length =18")
  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

   /**
   * The Xero generated unique identifier for the bank transaction (read-only)
   * @return batchPaymentID
  **/
  @ApiModelProperty(value = "The Xero generated unique identifier for the bank transaction (read-only)")
  public UUID getBatchPaymentID() {
    return batchPaymentID;
  }

  public BatchPayment dateString(LocalDate dateString) {
    this.dateString = dateString;
    return this;
  }

   /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   * @return dateString
  **/
  @ApiModelProperty(value = "Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06")
  public LocalDate getDateString() {
    return dateString;
  }

  public void setDateString(LocalDate dateString) {
    this.dateString = dateString;
  }

  public BatchPayment date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06
   * @return date
  **/
  @ApiModelProperty(value = "Date the payment is being made (YYYY-MM-DD) e.g. 2009-09-06")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BatchPayment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the payment. Must be less than or equal to the outstanding amount owing on the invoice e.g. 200.00
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the payment. Must be less than or equal to the outstanding amount owing on the invoice e.g. 200.00")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BatchPayment payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public BatchPayment addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

   /**
   * PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only)
   * @return type
  **/
  @ApiModelProperty(value = "PAYBATCH for bill payments or RECBATCH for sales invoice payments (read-only)")
  public String getType() {
    return type;
  }

   /**
   * AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED. It is not possible to delete batch payments via the API.
   * @return status
  **/
  @ApiModelProperty(value = "AUTHORISED or DELETED (read-only). New batch payments will have a status of AUTHORISED. It is not possible to delete batch payments via the API.")
  public String getStatus() {
    return status;
  }

   /**
   * The total of the payments that make up the batch (read-only)
   * @return totalAmount
  **/
  @ApiModelProperty(value = "The total of the payments that make up the batch (read-only)")
  public String getTotalAmount() {
    return totalAmount;
  }

   /**
   * UTC timestamp of last update to the payment
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the payment")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

   /**
   * Booelan that tells you if the batch payment has been reconciled (read-only)
   * @return isReconciled
  **/
  @ApiModelProperty(value = "Booelan that tells you if the batch payment has been reconciled (read-only)")
  public String getIsReconciled() {
    return isReconciled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPayment batchPayment = (BatchPayment) o;
    return Objects.equals(this.account, batchPayment.account) &&
        Objects.equals(this.reference, batchPayment.reference) &&
        Objects.equals(this.particulars, batchPayment.particulars) &&
        Objects.equals(this.code, batchPayment.code) &&
        Objects.equals(this.details, batchPayment.details) &&
        Objects.equals(this.narrative, batchPayment.narrative) &&
        Objects.equals(this.batchPaymentID, batchPayment.batchPaymentID) &&
        Objects.equals(this.dateString, batchPayment.dateString) &&
        Objects.equals(this.date, batchPayment.date) &&
        Objects.equals(this.amount, batchPayment.amount) &&
        Objects.equals(this.payments, batchPayment.payments) &&
        Objects.equals(this.type, batchPayment.type) &&
        Objects.equals(this.status, batchPayment.status) &&
        Objects.equals(this.totalAmount, batchPayment.totalAmount) &&
        Objects.equals(this.updatedDateUTC, batchPayment.updatedDateUTC) &&
        Objects.equals(this.isReconciled, batchPayment.isReconciled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, reference, particulars, code, details, narrative, batchPaymentID, dateString, date, amount, payments, type, status, totalAmount, updatedDateUTC, isReconciled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPayment {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    particulars: ").append(toIndentedString(particulars)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
    sb.append("    batchPaymentID: ").append(toIndentedString(batchPaymentID)).append("\n");
    sb.append("    dateString: ").append(toIndentedString(dateString)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
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

