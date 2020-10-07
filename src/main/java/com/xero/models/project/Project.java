/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.3.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** Project */
public class Project {
  StringUtil util = new StringUtil();

  @JsonProperty("projectId")
  private UUID projectId;

  @JsonProperty("contactId")
  private UUID contactId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("currencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("minutesLogged")
  private Integer minutesLogged;

  @JsonProperty("totalTaskAmount")
  private Amount totalTaskAmount;

  @JsonProperty("totalExpenseAmount")
  private Amount totalExpenseAmount;

  @JsonProperty("estimateAmount")
  private Amount estimateAmount;

  @JsonProperty("minutesToBeInvoiced")
  private Integer minutesToBeInvoiced;

  @JsonProperty("taskAmountToBeInvoiced")
  private Amount taskAmountToBeInvoiced;

  @JsonProperty("taskAmountInvoiced")
  private Amount taskAmountInvoiced;

  @JsonProperty("expenseAmountToBeInvoiced")
  private Amount expenseAmountToBeInvoiced;

  @JsonProperty("expenseAmountInvoiced")
  private Amount expenseAmountInvoiced;

  @JsonProperty("projectAmountInvoiced")
  private Amount projectAmountInvoiced;

  @JsonProperty("deposit")
  private Amount deposit;

  @JsonProperty("depositApplied")
  private Amount depositApplied;

  @JsonProperty("creditNoteAmount")
  private Amount creditNoteAmount;

  @JsonProperty("deadlineUtc")
  private OffsetDateTime deadlineUtc;

  @JsonProperty("totalInvoiced")
  private Amount totalInvoiced;

  @JsonProperty("totalToBeInvoiced")
  private Amount totalToBeInvoiced;

  @JsonProperty("estimate")
  private Amount estimate;

  @JsonProperty("status")
  private ProjectStatus status;

  public Project projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Identifier of the project.
   *
   * @return projectId
   */
  @ApiModelProperty(
      example = "254553fa-2be8-4991-bd5e-70a97ea12ef8",
      value = "Identifier of the project.")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public Project contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Identifier of the contact this project was created for.
   *
   * @return contactId
   */
  @ApiModelProperty(
      example = "01234567-89ab-cdef-0123-456789abcdef",
      value = "Identifier of the contact this project was created for.")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project.
   *
   * @return name
   */
  @ApiModelProperty(example = "New Kitchen", required = true, value = "Name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Project minutesLogged(Integer minutesLogged) {
    this.minutesLogged = minutesLogged;
    return this;
  }

  /**
   * A total of minutes logged against all tasks on the Project.
   *
   * @return minutesLogged
   */
  @ApiModelProperty(
      example = "0",
      value = "A total of minutes logged against all tasks on the Project.")
  public Integer getMinutesLogged() {
    return minutesLogged;
  }

  public void setMinutesLogged(Integer minutesLogged) {
    this.minutesLogged = minutesLogged;
  }

  public Project totalTaskAmount(Amount totalTaskAmount) {
    this.totalTaskAmount = totalTaskAmount;
    return this;
  }

  /**
   * Get totalTaskAmount
   *
   * @return totalTaskAmount
   */
  @ApiModelProperty(value = "")
  public Amount getTotalTaskAmount() {
    return totalTaskAmount;
  }

  public void setTotalTaskAmount(Amount totalTaskAmount) {
    this.totalTaskAmount = totalTaskAmount;
  }

  public Project totalExpenseAmount(Amount totalExpenseAmount) {
    this.totalExpenseAmount = totalExpenseAmount;
    return this;
  }

  /**
   * Get totalExpenseAmount
   *
   * @return totalExpenseAmount
   */
  @ApiModelProperty(value = "")
  public Amount getTotalExpenseAmount() {
    return totalExpenseAmount;
  }

  public void setTotalExpenseAmount(Amount totalExpenseAmount) {
    this.totalExpenseAmount = totalExpenseAmount;
  }

  public Project estimateAmount(Amount estimateAmount) {
    this.estimateAmount = estimateAmount;
    return this;
  }

  /**
   * Get estimateAmount
   *
   * @return estimateAmount
   */
  @ApiModelProperty(value = "")
  public Amount getEstimateAmount() {
    return estimateAmount;
  }

  public void setEstimateAmount(Amount estimateAmount) {
    this.estimateAmount = estimateAmount;
  }

  public Project minutesToBeInvoiced(Integer minutesToBeInvoiced) {
    this.minutesToBeInvoiced = minutesToBeInvoiced;
    return this;
  }

  /**
   * Minutes which have not been invoiced across all chargeable tasks in the project.
   *
   * @return minutesToBeInvoiced
   */
  @ApiModelProperty(
      example = "0",
      value = "Minutes which have not been invoiced across all chargeable tasks in the project.")
  public Integer getMinutesToBeInvoiced() {
    return minutesToBeInvoiced;
  }

  public void setMinutesToBeInvoiced(Integer minutesToBeInvoiced) {
    this.minutesToBeInvoiced = minutesToBeInvoiced;
  }

  public Project taskAmountToBeInvoiced(Amount taskAmountToBeInvoiced) {
    this.taskAmountToBeInvoiced = taskAmountToBeInvoiced;
    return this;
  }

  /**
   * Get taskAmountToBeInvoiced
   *
   * @return taskAmountToBeInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getTaskAmountToBeInvoiced() {
    return taskAmountToBeInvoiced;
  }

  public void setTaskAmountToBeInvoiced(Amount taskAmountToBeInvoiced) {
    this.taskAmountToBeInvoiced = taskAmountToBeInvoiced;
  }

  public Project taskAmountInvoiced(Amount taskAmountInvoiced) {
    this.taskAmountInvoiced = taskAmountInvoiced;
    return this;
  }

  /**
   * Get taskAmountInvoiced
   *
   * @return taskAmountInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getTaskAmountInvoiced() {
    return taskAmountInvoiced;
  }

  public void setTaskAmountInvoiced(Amount taskAmountInvoiced) {
    this.taskAmountInvoiced = taskAmountInvoiced;
  }

  public Project expenseAmountToBeInvoiced(Amount expenseAmountToBeInvoiced) {
    this.expenseAmountToBeInvoiced = expenseAmountToBeInvoiced;
    return this;
  }

  /**
   * Get expenseAmountToBeInvoiced
   *
   * @return expenseAmountToBeInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getExpenseAmountToBeInvoiced() {
    return expenseAmountToBeInvoiced;
  }

  public void setExpenseAmountToBeInvoiced(Amount expenseAmountToBeInvoiced) {
    this.expenseAmountToBeInvoiced = expenseAmountToBeInvoiced;
  }

  public Project expenseAmountInvoiced(Amount expenseAmountInvoiced) {
    this.expenseAmountInvoiced = expenseAmountInvoiced;
    return this;
  }

  /**
   * Get expenseAmountInvoiced
   *
   * @return expenseAmountInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getExpenseAmountInvoiced() {
    return expenseAmountInvoiced;
  }

  public void setExpenseAmountInvoiced(Amount expenseAmountInvoiced) {
    this.expenseAmountInvoiced = expenseAmountInvoiced;
  }

  public Project projectAmountInvoiced(Amount projectAmountInvoiced) {
    this.projectAmountInvoiced = projectAmountInvoiced;
    return this;
  }

  /**
   * Get projectAmountInvoiced
   *
   * @return projectAmountInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getProjectAmountInvoiced() {
    return projectAmountInvoiced;
  }

  public void setProjectAmountInvoiced(Amount projectAmountInvoiced) {
    this.projectAmountInvoiced = projectAmountInvoiced;
  }

  public Project deposit(Amount deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   *
   * @return deposit
   */
  @ApiModelProperty(value = "")
  public Amount getDeposit() {
    return deposit;
  }

  public void setDeposit(Amount deposit) {
    this.deposit = deposit;
  }

  public Project depositApplied(Amount depositApplied) {
    this.depositApplied = depositApplied;
    return this;
  }

  /**
   * Get depositApplied
   *
   * @return depositApplied
   */
  @ApiModelProperty(value = "")
  public Amount getDepositApplied() {
    return depositApplied;
  }

  public void setDepositApplied(Amount depositApplied) {
    this.depositApplied = depositApplied;
  }

  public Project creditNoteAmount(Amount creditNoteAmount) {
    this.creditNoteAmount = creditNoteAmount;
    return this;
  }

  /**
   * Get creditNoteAmount
   *
   * @return creditNoteAmount
   */
  @ApiModelProperty(value = "")
  public Amount getCreditNoteAmount() {
    return creditNoteAmount;
  }

  public void setCreditNoteAmount(Amount creditNoteAmount) {
    this.creditNoteAmount = creditNoteAmount;
  }

  public Project deadlineUtc(OffsetDateTime deadlineUtc) {
    this.deadlineUtc = deadlineUtc;
    return this;
  }

  /**
   * Deadline for the project. UTC Date Time in ISO-8601 format.
   *
   * @return deadlineUtc
   */
  @ApiModelProperty(
      example = "2019-12-10T12:59:59Z",
      value = "Deadline for the project. UTC Date Time in ISO-8601 format.")
  public OffsetDateTime getDeadlineUtc() {
    return deadlineUtc;
  }

  public void setDeadlineUtc(OffsetDateTime deadlineUtc) {
    this.deadlineUtc = deadlineUtc;
  }

  public Project totalInvoiced(Amount totalInvoiced) {
    this.totalInvoiced = totalInvoiced;
    return this;
  }

  /**
   * Get totalInvoiced
   *
   * @return totalInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getTotalInvoiced() {
    return totalInvoiced;
  }

  public void setTotalInvoiced(Amount totalInvoiced) {
    this.totalInvoiced = totalInvoiced;
  }

  public Project totalToBeInvoiced(Amount totalToBeInvoiced) {
    this.totalToBeInvoiced = totalToBeInvoiced;
    return this;
  }

  /**
   * Get totalToBeInvoiced
   *
   * @return totalToBeInvoiced
   */
  @ApiModelProperty(value = "")
  public Amount getTotalToBeInvoiced() {
    return totalToBeInvoiced;
  }

  public void setTotalToBeInvoiced(Amount totalToBeInvoiced) {
    this.totalToBeInvoiced = totalToBeInvoiced;
  }

  public Project estimate(Amount estimate) {
    this.estimate = estimate;
    return this;
  }

  /**
   * Get estimate
   *
   * @return estimate
   */
  @ApiModelProperty(value = "")
  public Amount getEstimate() {
    return estimate;
  }

  public void setEstimate(Amount estimate) {
    this.estimate = estimate;
  }

  public Project status(ProjectStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public ProjectStatus getStatus() {
    return status;
  }

  public void setStatus(ProjectStatus status) {
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
    Project project = (Project) o;
    return Objects.equals(this.projectId, project.projectId)
        && Objects.equals(this.contactId, project.contactId)
        && Objects.equals(this.name, project.name)
        && Objects.equals(this.currencyCode, project.currencyCode)
        && Objects.equals(this.minutesLogged, project.minutesLogged)
        && Objects.equals(this.totalTaskAmount, project.totalTaskAmount)
        && Objects.equals(this.totalExpenseAmount, project.totalExpenseAmount)
        && Objects.equals(this.estimateAmount, project.estimateAmount)
        && Objects.equals(this.minutesToBeInvoiced, project.minutesToBeInvoiced)
        && Objects.equals(this.taskAmountToBeInvoiced, project.taskAmountToBeInvoiced)
        && Objects.equals(this.taskAmountInvoiced, project.taskAmountInvoiced)
        && Objects.equals(this.expenseAmountToBeInvoiced, project.expenseAmountToBeInvoiced)
        && Objects.equals(this.expenseAmountInvoiced, project.expenseAmountInvoiced)
        && Objects.equals(this.projectAmountInvoiced, project.projectAmountInvoiced)
        && Objects.equals(this.deposit, project.deposit)
        && Objects.equals(this.depositApplied, project.depositApplied)
        && Objects.equals(this.creditNoteAmount, project.creditNoteAmount)
        && Objects.equals(this.deadlineUtc, project.deadlineUtc)
        && Objects.equals(this.totalInvoiced, project.totalInvoiced)
        && Objects.equals(this.totalToBeInvoiced, project.totalToBeInvoiced)
        && Objects.equals(this.estimate, project.estimate)
        && Objects.equals(this.status, project.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        projectId,
        contactId,
        name,
        currencyCode,
        minutesLogged,
        totalTaskAmount,
        totalExpenseAmount,
        estimateAmount,
        minutesToBeInvoiced,
        taskAmountToBeInvoiced,
        taskAmountInvoiced,
        expenseAmountToBeInvoiced,
        expenseAmountInvoiced,
        projectAmountInvoiced,
        deposit,
        depositApplied,
        creditNoteAmount,
        deadlineUtc,
        totalInvoiced,
        totalToBeInvoiced,
        estimate,
        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    minutesLogged: ").append(toIndentedString(minutesLogged)).append("\n");
    sb.append("    totalTaskAmount: ").append(toIndentedString(totalTaskAmount)).append("\n");
    sb.append("    totalExpenseAmount: ").append(toIndentedString(totalExpenseAmount)).append("\n");
    sb.append("    estimateAmount: ").append(toIndentedString(estimateAmount)).append("\n");
    sb.append("    minutesToBeInvoiced: ")
        .append(toIndentedString(minutesToBeInvoiced))
        .append("\n");
    sb.append("    taskAmountToBeInvoiced: ")
        .append(toIndentedString(taskAmountToBeInvoiced))
        .append("\n");
    sb.append("    taskAmountInvoiced: ").append(toIndentedString(taskAmountInvoiced)).append("\n");
    sb.append("    expenseAmountToBeInvoiced: ")
        .append(toIndentedString(expenseAmountToBeInvoiced))
        .append("\n");
    sb.append("    expenseAmountInvoiced: ")
        .append(toIndentedString(expenseAmountInvoiced))
        .append("\n");
    sb.append("    projectAmountInvoiced: ")
        .append(toIndentedString(projectAmountInvoiced))
        .append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    depositApplied: ").append(toIndentedString(depositApplied)).append("\n");
    sb.append("    creditNoteAmount: ").append(toIndentedString(creditNoteAmount)).append("\n");
    sb.append("    deadlineUtc: ").append(toIndentedString(deadlineUtc)).append("\n");
    sb.append("    totalInvoiced: ").append(toIndentedString(totalInvoiced)).append("\n");
    sb.append("    totalToBeInvoiced: ").append(toIndentedString(totalToBeInvoiced)).append("\n");
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
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
