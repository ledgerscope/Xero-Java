/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** Payslip */
public class Payslip {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("PayslipID")
  private UUID payslipID;

  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("Wages")
  private Double wages;

  @JsonProperty("Deductions")
  private Double deductions;

  @JsonProperty("Tax")
  private Double tax;

  @JsonProperty("Super")
  private Double _super;

  @JsonProperty("Reimbursements")
  private Double reimbursements;

  @JsonProperty("NetPay")
  private Double netPay;

  @JsonProperty("EarningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("LeaveEarningsLines")
  private List<LeaveEarningsLine> leaveEarningsLines = new ArrayList<LeaveEarningsLine>();

  @JsonProperty("TimesheetEarningsLines")
  private List<EarningsLine> timesheetEarningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("DeductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  @JsonProperty("LeaveAccrualLines")
  private List<LeaveAccrualLine> leaveAccrualLines = new ArrayList<LeaveAccrualLine>();

  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  @JsonProperty("SuperannuationLines")
  private List<SuperannuationLine> superannuationLines = new ArrayList<SuperannuationLine>();

  @JsonProperty("TaxLines")
  private List<TaxLine> taxLines = new ArrayList<TaxLine>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;
  /**
   * The Xero identifier for an employee
   *
   * @param employeeID UUID
   * @return Payslip
   */
  public Payslip employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for an employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "4729f087-8eec-49c1-8294-4d11a5a0a37c",
      value = "The Xero identifier for an employee")
  /**
   * The Xero identifier for an employee
   *
   * @return employeeID UUID
   */
  public UUID getEmployeeID() {
    return employeeID;
  }

  /**
   * The Xero identifier for an employee
   *
   * @param employeeID UUID
   */
  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  /**
   * Xero identifier for the payslip
   *
   * @param payslipID UUID
   * @return Payslip
   */
  public Payslip payslipID(UUID payslipID) {
    this.payslipID = payslipID;
    return this;
  }

  /**
   * Xero identifier for the payslip
   *
   * @return payslipID
   */
  @ApiModelProperty(
      example = "f3c0874d-7cdd-459a-a95c-d90d51decc42",
      value = "Xero identifier for the payslip")
  /**
   * Xero identifier for the payslip
   *
   * @return payslipID UUID
   */
  public UUID getPayslipID() {
    return payslipID;
  }

  /**
   * Xero identifier for the payslip
   *
   * @param payslipID UUID
   */
  public void setPayslipID(UUID payslipID) {
    this.payslipID = payslipID;
  }

  /**
   * First name of employee
   *
   * @param firstName String
   * @return Payslip
   */
  public Payslip firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of employee
   *
   * @return firstName
   */
  @ApiModelProperty(example = "Karen", value = "First name of employee")
  /**
   * First name of employee
   *
   * @return firstName String
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * First name of employee
   *
   * @param firstName String
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Last name of employee
   *
   * @param lastName String
   * @return Payslip
   */
  public Payslip lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of employee
   *
   * @return lastName
   */
  @ApiModelProperty(example = "Jones", value = "Last name of employee")
  /**
   * Last name of employee
   *
   * @return lastName String
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Last name of employee
   *
   * @param lastName String
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The Wages for the Payslip
   *
   * @param wages Double
   * @return Payslip
   */
  public Payslip wages(Double wages) {
    this.wages = wages;
    return this;
  }

  /**
   * The Wages for the Payslip
   *
   * @return wages
   */
  @ApiModelProperty(example = "1060.5", value = "The Wages for the Payslip")
  /**
   * The Wages for the Payslip
   *
   * @return wages Double
   */
  public Double getWages() {
    return wages;
  }

  /**
   * The Wages for the Payslip
   *
   * @param wages Double
   */
  public void setWages(Double wages) {
    this.wages = wages;
  }

  /**
   * The Deductions for the Payslip
   *
   * @param deductions Double
   * @return Payslip
   */
  public Payslip deductions(Double deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * The Deductions for the Payslip
   *
   * @return deductions
   */
  @ApiModelProperty(example = "0.0", value = "The Deductions for the Payslip")
  /**
   * The Deductions for the Payslip
   *
   * @return deductions Double
   */
  public Double getDeductions() {
    return deductions;
  }

  /**
   * The Deductions for the Payslip
   *
   * @param deductions Double
   */
  public void setDeductions(Double deductions) {
    this.deductions = deductions;
  }

  /**
   * The Tax for the Payslip
   *
   * @param tax Double
   * @return Payslip
   */
  public Payslip tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The Tax for the Payslip
   *
   * @return tax
   */
  @ApiModelProperty(example = "198.0", value = "The Tax for the Payslip")
  /**
   * The Tax for the Payslip
   *
   * @return tax Double
   */
  public Double getTax() {
    return tax;
  }

  /**
   * The Tax for the Payslip
   *
   * @param tax Double
   */
  public void setTax(Double tax) {
    this.tax = tax;
  }

  /**
   * The Super for the Payslip
   *
   * @param _super Double
   * @return Payslip
   */
  public Payslip _super(Double _super) {
    this._super = _super;
    return this;
  }

  /**
   * The Super for the Payslip
   *
   * @return _super
   */
  @ApiModelProperty(example = "75.6", value = "The Super for the Payslip")
  /**
   * The Super for the Payslip
   *
   * @return _super Double
   */
  public Double getSuper() {
    return _super;
  }

  /**
   * The Super for the Payslip
   *
   * @param _super Double
   */
  public void setSuper(Double _super) {
    this._super = _super;
  }

  /**
   * The Reimbursements for the Payslip
   *
   * @param reimbursements Double
   * @return Payslip
   */
  public Payslip reimbursements(Double reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

  /**
   * The Reimbursements for the Payslip
   *
   * @return reimbursements
   */
  @ApiModelProperty(example = "0.0", value = "The Reimbursements for the Payslip")
  /**
   * The Reimbursements for the Payslip
   *
   * @return reimbursements Double
   */
  public Double getReimbursements() {
    return reimbursements;
  }

  /**
   * The Reimbursements for the Payslip
   *
   * @param reimbursements Double
   */
  public void setReimbursements(Double reimbursements) {
    this.reimbursements = reimbursements;
  }

  /**
   * The NetPay for the Payslip
   *
   * @param netPay Double
   * @return Payslip
   */
  public Payslip netPay(Double netPay) {
    this.netPay = netPay;
    return this;
  }

  /**
   * The NetPay for the Payslip
   *
   * @return netPay
   */
  @ApiModelProperty(example = "862.5", value = "The NetPay for the Payslip")
  /**
   * The NetPay for the Payslip
   *
   * @return netPay Double
   */
  public Double getNetPay() {
    return netPay;
  }

  /**
   * The NetPay for the Payslip
   *
   * @param netPay Double
   */
  public void setNetPay(Double netPay) {
    this.netPay = netPay;
  }

  /**
   * earningsLines
   *
   * @param earningsLines List&lt;EarningsLine&gt;
   * @return Payslip
   */
  public Payslip earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  /**
   * earningsLines
   *
   * @param earningsLinesItem EarningsLine
   * @return Payslip
   */
  public Payslip addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

  /**
   * Get earningsLines
   *
   * @return earningsLines
   */
  @ApiModelProperty(value = "")
  /**
   * earningsLines
   *
   * @return earningsLines List<EarningsLine>
   */
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  /**
   * earningsLines
   *
   * @param earningsLines List&lt;EarningsLine&gt;
   */
  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  /**
   * leaveEarningsLines
   *
   * @param leaveEarningsLines List&lt;LeaveEarningsLine&gt;
   * @return Payslip
   */
  public Payslip leaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
    return this;
  }

  /**
   * leaveEarningsLines
   *
   * @param leaveEarningsLinesItem LeaveEarningsLine
   * @return Payslip
   */
  public Payslip addLeaveEarningsLinesItem(LeaveEarningsLine leaveEarningsLinesItem) {
    if (this.leaveEarningsLines == null) {
      this.leaveEarningsLines = new ArrayList<LeaveEarningsLine>();
    }
    this.leaveEarningsLines.add(leaveEarningsLinesItem);
    return this;
  }

  /**
   * Get leaveEarningsLines
   *
   * @return leaveEarningsLines
   */
  @ApiModelProperty(value = "")
  /**
   * leaveEarningsLines
   *
   * @return leaveEarningsLines List<LeaveEarningsLine>
   */
  public List<LeaveEarningsLine> getLeaveEarningsLines() {
    return leaveEarningsLines;
  }

  /**
   * leaveEarningsLines
   *
   * @param leaveEarningsLines List&lt;LeaveEarningsLine&gt;
   */
  public void setLeaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
  }

  /**
   * timesheetEarningsLines
   *
   * @param timesheetEarningsLines List&lt;EarningsLine&gt;
   * @return Payslip
   */
  public Payslip timesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
    return this;
  }

  /**
   * timesheetEarningsLines
   *
   * @param timesheetEarningsLinesItem EarningsLine
   * @return Payslip
   */
  public Payslip addTimesheetEarningsLinesItem(EarningsLine timesheetEarningsLinesItem) {
    if (this.timesheetEarningsLines == null) {
      this.timesheetEarningsLines = new ArrayList<EarningsLine>();
    }
    this.timesheetEarningsLines.add(timesheetEarningsLinesItem);
    return this;
  }

  /**
   * Get timesheetEarningsLines
   *
   * @return timesheetEarningsLines
   */
  @ApiModelProperty(value = "")
  /**
   * timesheetEarningsLines
   *
   * @return timesheetEarningsLines List<EarningsLine>
   */
  public List<EarningsLine> getTimesheetEarningsLines() {
    return timesheetEarningsLines;
  }

  /**
   * timesheetEarningsLines
   *
   * @param timesheetEarningsLines List&lt;EarningsLine&gt;
   */
  public void setTimesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
  }

  /**
   * deductionLines
   *
   * @param deductionLines List&lt;DeductionLine&gt;
   * @return Payslip
   */
  public Payslip deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  /**
   * deductionLines
   *
   * @param deductionLinesItem DeductionLine
   * @return Payslip
   */
  public Payslip addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

  /**
   * Get deductionLines
   *
   * @return deductionLines
   */
  @ApiModelProperty(value = "")
  /**
   * deductionLines
   *
   * @return deductionLines List<DeductionLine>
   */
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  /**
   * deductionLines
   *
   * @param deductionLines List&lt;DeductionLine&gt;
   */
  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  /**
   * leaveAccrualLines
   *
   * @param leaveAccrualLines List&lt;LeaveAccrualLine&gt;
   * @return Payslip
   */
  public Payslip leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
    return this;
  }

  /**
   * leaveAccrualLines
   *
   * @param leaveAccrualLinesItem LeaveAccrualLine
   * @return Payslip
   */
  public Payslip addLeaveAccrualLinesItem(LeaveAccrualLine leaveAccrualLinesItem) {
    if (this.leaveAccrualLines == null) {
      this.leaveAccrualLines = new ArrayList<LeaveAccrualLine>();
    }
    this.leaveAccrualLines.add(leaveAccrualLinesItem);
    return this;
  }

  /**
   * Get leaveAccrualLines
   *
   * @return leaveAccrualLines
   */
  @ApiModelProperty(value = "")
  /**
   * leaveAccrualLines
   *
   * @return leaveAccrualLines List<LeaveAccrualLine>
   */
  public List<LeaveAccrualLine> getLeaveAccrualLines() {
    return leaveAccrualLines;
  }

  /**
   * leaveAccrualLines
   *
   * @param leaveAccrualLines List&lt;LeaveAccrualLine&gt;
   */
  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLines List&lt;ReimbursementLine&gt;
   * @return Payslip
   */
  public Payslip reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLinesItem ReimbursementLine
   * @return Payslip
   */
  public Payslip addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

  /**
   * Get reimbursementLines
   *
   * @return reimbursementLines
   */
  @ApiModelProperty(value = "")
  /**
   * reimbursementLines
   *
   * @return reimbursementLines List<ReimbursementLine>
   */
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLines List&lt;ReimbursementLine&gt;
   */
  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  /**
   * superannuationLines
   *
   * @param superannuationLines List&lt;SuperannuationLine&gt;
   * @return Payslip
   */
  public Payslip superannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
    return this;
  }

  /**
   * superannuationLines
   *
   * @param superannuationLinesItem SuperannuationLine
   * @return Payslip
   */
  public Payslip addSuperannuationLinesItem(SuperannuationLine superannuationLinesItem) {
    if (this.superannuationLines == null) {
      this.superannuationLines = new ArrayList<SuperannuationLine>();
    }
    this.superannuationLines.add(superannuationLinesItem);
    return this;
  }

  /**
   * Get superannuationLines
   *
   * @return superannuationLines
   */
  @ApiModelProperty(value = "")
  /**
   * superannuationLines
   *
   * @return superannuationLines List<SuperannuationLine>
   */
  public List<SuperannuationLine> getSuperannuationLines() {
    return superannuationLines;
  }

  /**
   * superannuationLines
   *
   * @param superannuationLines List&lt;SuperannuationLine&gt;
   */
  public void setSuperannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
  }

  /**
   * taxLines
   *
   * @param taxLines List&lt;TaxLine&gt;
   * @return Payslip
   */
  public Payslip taxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
    return this;
  }

  /**
   * taxLines
   *
   * @param taxLinesItem TaxLine
   * @return Payslip
   */
  public Payslip addTaxLinesItem(TaxLine taxLinesItem) {
    if (this.taxLines == null) {
      this.taxLines = new ArrayList<TaxLine>();
    }
    this.taxLines.add(taxLinesItem);
    return this;
  }

  /**
   * Get taxLines
   *
   * @return taxLines
   */
  @ApiModelProperty(value = "")
  /**
   * taxLines
   *
   * @return taxLines List<TaxLine>
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  /**
   * taxLines
   *
   * @param taxLines List&lt;TaxLine&gt;
   */
  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * Last modified timestamp
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payslip payslip = (Payslip) o;
    return Objects.equals(this.employeeID, payslip.employeeID)
        && Objects.equals(this.payslipID, payslip.payslipID)
        && Objects.equals(this.firstName, payslip.firstName)
        && Objects.equals(this.lastName, payslip.lastName)
        && Objects.equals(this.wages, payslip.wages)
        && Objects.equals(this.deductions, payslip.deductions)
        && Objects.equals(this.tax, payslip.tax)
        && Objects.equals(this._super, payslip._super)
        && Objects.equals(this.reimbursements, payslip.reimbursements)
        && Objects.equals(this.netPay, payslip.netPay)
        && Objects.equals(this.earningsLines, payslip.earningsLines)
        && Objects.equals(this.leaveEarningsLines, payslip.leaveEarningsLines)
        && Objects.equals(this.timesheetEarningsLines, payslip.timesheetEarningsLines)
        && Objects.equals(this.deductionLines, payslip.deductionLines)
        && Objects.equals(this.leaveAccrualLines, payslip.leaveAccrualLines)
        && Objects.equals(this.reimbursementLines, payslip.reimbursementLines)
        && Objects.equals(this.superannuationLines, payslip.superannuationLines)
        && Objects.equals(this.taxLines, payslip.taxLines)
        && Objects.equals(this.updatedDateUTC, payslip.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        payslipID,
        firstName,
        lastName,
        wages,
        deductions,
        tax,
        _super,
        reimbursements,
        netPay,
        earningsLines,
        leaveEarningsLines,
        timesheetEarningsLines,
        deductionLines,
        leaveAccrualLines,
        reimbursementLines,
        superannuationLines,
        taxLines,
        updatedDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payslip {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    payslipID: ").append(toIndentedString(payslipID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    leaveEarningsLines: ").append(toIndentedString(leaveEarningsLines)).append("\n");
    sb.append("    timesheetEarningsLines: ")
        .append(toIndentedString(timesheetEarningsLines))
        .append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    superannuationLines: ")
        .append(toIndentedString(superannuationLines))
        .append("\n");
    sb.append("    taxLines: ").append(toIndentedString(taxLines)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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
