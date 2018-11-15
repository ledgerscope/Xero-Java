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
import com.xero.models.accounting.LinkedTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkedTransactions
 */

public class LinkedTransactions {
  @JsonProperty("LinkedTransactions")
  private List<LinkedTransaction> linkedTransactions = null;

  public LinkedTransactions linkedTransactions(List<LinkedTransaction> linkedTransactions) {
    this.linkedTransactions = linkedTransactions;
    return this;
  }

  public LinkedTransactions addLinkedTransactionsItem(LinkedTransaction linkedTransactionsItem) {
    if (this.linkedTransactions == null) {
      this.linkedTransactions = new ArrayList<LinkedTransaction>();
    }
    this.linkedTransactions.add(linkedTransactionsItem);
    return this;
  }

   /**
   * Get linkedTransactions
   * @return linkedTransactions
  **/
  @ApiModelProperty(value = "")
  public List<LinkedTransaction> getLinkedTransactions() {
    return linkedTransactions;
  }

  public void setLinkedTransactions(List<LinkedTransaction> linkedTransactions) {
    this.linkedTransactions = linkedTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedTransactions linkedTransactions = (LinkedTransactions) o;
    return Objects.equals(this.linkedTransactions, linkedTransactions.linkedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedTransactions {\n");
    
    sb.append("    linkedTransactions: ").append(toIndentedString(linkedTransactions)).append("\n");
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

