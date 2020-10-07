/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.3.3
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** EmployeePayTemplate */
public class EmployeePayTemplate {
  StringUtil util = new StringUtil();

  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("earningTemplates")
  private List<EarningsTemplate> earningTemplates = new ArrayList<EarningsTemplate>();

  public EmployeePayTemplate employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * Unique identifier for the employee
   *
   * @return employeeID
   */
  @ApiModelProperty(value = "Unique identifier for the employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public EmployeePayTemplate earningTemplates(List<EarningsTemplate> earningTemplates) {
    this.earningTemplates = earningTemplates;
    return this;
  }

  public EmployeePayTemplate addEarningTemplatesItem(EarningsTemplate earningTemplatesItem) {
    if (this.earningTemplates == null) {
      this.earningTemplates = new ArrayList<EarningsTemplate>();
    }
    this.earningTemplates.add(earningTemplatesItem);
    return this;
  }

  /**
   * Get earningTemplates
   *
   * @return earningTemplates
   */
  @ApiModelProperty(value = "")
  public List<EarningsTemplate> getEarningTemplates() {
    return earningTemplates;
  }

  public void setEarningTemplates(List<EarningsTemplate> earningTemplates) {
    this.earningTemplates = earningTemplates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePayTemplate employeePayTemplate = (EmployeePayTemplate) o;
    return Objects.equals(this.employeeID, employeePayTemplate.employeeID)
        && Objects.equals(this.earningTemplates, employeePayTemplate.earningTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeID, earningTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayTemplate {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    earningTemplates: ").append(toIndentedString(earningTemplates)).append("\n");
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
