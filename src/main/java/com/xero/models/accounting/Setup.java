/*
 * Accounting API
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

/** Setup */
public class Setup {
  StringUtil util = new StringUtil();

  @JsonProperty("ConversionDate")
  private ConversionDate conversionDate;

  @JsonProperty("ConversionBalances")
  private List<ConversionBalances> conversionBalances = new ArrayList<ConversionBalances>();

  @JsonProperty("Accounts")
  private List<Account> accounts = new ArrayList<Account>();

  public Setup conversionDate(ConversionDate conversionDate) {
    this.conversionDate = conversionDate;
    return this;
  }

  /**
   * Get conversionDate
   *
   * @return conversionDate
   */
  @ApiModelProperty(value = "")
  public ConversionDate getConversionDate() {
    return conversionDate;
  }

  public void setConversionDate(ConversionDate conversionDate) {
    this.conversionDate = conversionDate;
  }

  public Setup conversionBalances(List<ConversionBalances> conversionBalances) {
    this.conversionBalances = conversionBalances;
    return this;
  }

  public Setup addConversionBalancesItem(ConversionBalances conversionBalancesItem) {
    if (this.conversionBalances == null) {
      this.conversionBalances = new ArrayList<ConversionBalances>();
    }
    this.conversionBalances.add(conversionBalancesItem);
    return this;
  }

  /**
   * Balance supplied for each account that has a value as at the conversion date.
   *
   * @return conversionBalances
   */
  @ApiModelProperty(
      value = "Balance supplied for each account that has a value as at the conversion date.")
  public List<ConversionBalances> getConversionBalances() {
    return conversionBalances;
  }

  public void setConversionBalances(List<ConversionBalances> conversionBalances) {
    this.conversionBalances = conversionBalances;
  }

  public Setup accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Setup addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   *
   * @return accounts
   */
  @ApiModelProperty(value = "")
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setup setup = (Setup) o;
    return Objects.equals(this.conversionDate, setup.conversionDate)
        && Objects.equals(this.conversionBalances, setup.conversionBalances)
        && Objects.equals(this.accounts, setup.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionDate, conversionBalances, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setup {\n");
    sb.append("    conversionDate: ").append(toIndentedString(conversionDate)).append("\n");
    sb.append("    conversionBalances: ").append(toIndentedString(conversionBalances)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
