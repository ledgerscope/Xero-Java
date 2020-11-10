/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.4.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EmployeeStatutoryLeaveBalance */
public class EmployeeStatutoryLeaveBalance {
  StringUtil util = new StringUtil();
  /** The type of statutory leave */
  public enum LeaveTypeEnum {
    SICK("Sick"),

    ADOPTION("Adoption"),

    MATERNITY("Maternity"),

    PATERNITY("Paternity"),

    SHAREDPARENTAL("Sharedparental");

    private String value;

    LeaveTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LeaveTypeEnum fromValue(String value) {
      for (LeaveTypeEnum b : LeaveTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("leaveType")
  private LeaveTypeEnum leaveType;

  @JsonProperty("balanceRemaining")
  private Double balanceRemaining;
  /** The units will be \&quot;Hours\&quot; */
  public enum UnitsEnum {
    HOURS("Hours");

    private String value;

    UnitsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitsEnum fromValue(String value) {
      for (UnitsEnum b : UnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("units")
  private UnitsEnum units;

  public EmployeeStatutoryLeaveBalance leaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * The type of statutory leave
   *
   * @return leaveType
   */
  @ApiModelProperty(value = "The type of statutory leave")
  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }

  public EmployeeStatutoryLeaveBalance balanceRemaining(Double balanceRemaining) {
    this.balanceRemaining = balanceRemaining;
    return this;
  }

  /**
   * The balance remaining for the corresponding leave type as of specified date.
   *
   * @return balanceRemaining
   */
  @ApiModelProperty(
      value = "The balance remaining for the corresponding leave type as of specified date.")
  public Double getBalanceRemaining() {
    return balanceRemaining;
  }

  public void setBalanceRemaining(Double balanceRemaining) {
    this.balanceRemaining = balanceRemaining;
  }

  public EmployeeStatutoryLeaveBalance units(UnitsEnum units) {
    this.units = units;
    return this;
  }

  /**
   * The units will be \&quot;Hours\&quot;
   *
   * @return units
   */
  @ApiModelProperty(value = "The units will be \"Hours\"")
  public UnitsEnum getUnits() {
    return units;
  }

  public void setUnits(UnitsEnum units) {
    this.units = units;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeStatutoryLeaveBalance employeeStatutoryLeaveBalance = (EmployeeStatutoryLeaveBalance) o;
    return Objects.equals(this.leaveType, employeeStatutoryLeaveBalance.leaveType)
        && Objects.equals(this.balanceRemaining, employeeStatutoryLeaveBalance.balanceRemaining)
        && Objects.equals(this.units, employeeStatutoryLeaveBalance.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveType, balanceRemaining, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeStatutoryLeaveBalance {\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    balanceRemaining: ").append(toIndentedString(balanceRemaining)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
