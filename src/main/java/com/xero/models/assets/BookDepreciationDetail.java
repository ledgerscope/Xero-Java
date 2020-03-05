/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.0.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.assets;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BookDepreciationDetail
 */

public class BookDepreciationDetail {
  @JsonProperty("currentCapitalGain")
  private Float currentCapitalGain;

  @JsonProperty("currentGainLoss")
  private Float currentGainLoss;

  @JsonProperty("depreciationStartDate")
  private LocalDate depreciationStartDate;

  @JsonProperty("costLimit")
  private Float costLimit;

  @JsonProperty("residualValue")
  private Float residualValue;

  @JsonProperty("priorAccumDepreciationAmount")
  private Float priorAccumDepreciationAmount;

  @JsonProperty("currentAccumDepreciationAmount")
  private Float currentAccumDepreciationAmount;

  public BookDepreciationDetail currentCapitalGain(Float currentCapitalGain) {
    this.currentCapitalGain = currentCapitalGain;
    return this;
  }

   /**
   * When an asset is disposed, this will be the sell price minus the purchase price if a profit was made.
   * @return currentCapitalGain
  **/
  @ApiModelProperty(example = "5.25", value = "When an asset is disposed, this will be the sell price minus the purchase price if a profit was made.")
  public Float getCurrentCapitalGain() {
    return currentCapitalGain;
  }

  public void setCurrentCapitalGain(Float currentCapitalGain) {
    this.currentCapitalGain = currentCapitalGain;
  }

  public BookDepreciationDetail currentGainLoss(Float currentGainLoss) {
    this.currentGainLoss = currentGainLoss;
    return this;
  }

   /**
   * When an asset is disposed, this will be the lowest one of sell price or purchase price, minus the current book value.
   * @return currentGainLoss
  **/
  @ApiModelProperty(example = "10.5", value = "When an asset is disposed, this will be the lowest one of sell price or purchase price, minus the current book value.")
  public Float getCurrentGainLoss() {
    return currentGainLoss;
  }

  public void setCurrentGainLoss(Float currentGainLoss) {
    this.currentGainLoss = currentGainLoss;
  }

  public BookDepreciationDetail depreciationStartDate(LocalDate depreciationStartDate) {
    this.depreciationStartDate = depreciationStartDate;
    return this;
  }

   /**
   * YYYY-MM-DD
   * @return depreciationStartDate
  **/
  @ApiModelProperty(value = "YYYY-MM-DD")
  public LocalDate getDepreciationStartDate() {
    return depreciationStartDate;
  }

  public void setDepreciationStartDate(LocalDate depreciationStartDate) {
    this.depreciationStartDate = depreciationStartDate;
  }

  public BookDepreciationDetail costLimit(Float costLimit) {
    this.costLimit = costLimit;
    return this;
  }

   /**
   * The value of the asset you want to depreciate, if this is less than the cost of the asset.
   * @return costLimit
  **/
  @ApiModelProperty(example = "9000.0", value = "The value of the asset you want to depreciate, if this is less than the cost of the asset.")
  public Float getCostLimit() {
    return costLimit;
  }

  public void setCostLimit(Float costLimit) {
    this.costLimit = costLimit;
  }

  public BookDepreciationDetail residualValue(Float residualValue) {
    this.residualValue = residualValue;
    return this;
  }

   /**
   * The value of the asset remaining when you&#39;ve fully depreciated it.
   * @return residualValue
  **/
  @ApiModelProperty(example = "10000.0", value = "The value of the asset remaining when you've fully depreciated it.")
  public Float getResidualValue() {
    return residualValue;
  }

  public void setResidualValue(Float residualValue) {
    this.residualValue = residualValue;
  }

  public BookDepreciationDetail priorAccumDepreciationAmount(Float priorAccumDepreciationAmount) {
    this.priorAccumDepreciationAmount = priorAccumDepreciationAmount;
    return this;
  }

   /**
   * All depreciation prior to the current financial year.
   * @return priorAccumDepreciationAmount
  **/
  @ApiModelProperty(example = "0.45", value = "All depreciation prior to the current financial year.")
  public Float getPriorAccumDepreciationAmount() {
    return priorAccumDepreciationAmount;
  }

  public void setPriorAccumDepreciationAmount(Float priorAccumDepreciationAmount) {
    this.priorAccumDepreciationAmount = priorAccumDepreciationAmount;
  }

  public BookDepreciationDetail currentAccumDepreciationAmount(Float currentAccumDepreciationAmount) {
    this.currentAccumDepreciationAmount = currentAccumDepreciationAmount;
    return this;
  }

   /**
   * All depreciation occurring in the current financial year.
   * @return currentAccumDepreciationAmount
  **/
  @ApiModelProperty(example = "5.0", value = "All depreciation occurring in the current financial year.")
  public Float getCurrentAccumDepreciationAmount() {
    return currentAccumDepreciationAmount;
  }

  public void setCurrentAccumDepreciationAmount(Float currentAccumDepreciationAmount) {
    this.currentAccumDepreciationAmount = currentAccumDepreciationAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookDepreciationDetail bookDepreciationDetail = (BookDepreciationDetail) o;
    return Objects.equals(this.currentCapitalGain, bookDepreciationDetail.currentCapitalGain) &&
        Objects.equals(this.currentGainLoss, bookDepreciationDetail.currentGainLoss) &&
        Objects.equals(this.depreciationStartDate, bookDepreciationDetail.depreciationStartDate) &&
        Objects.equals(this.costLimit, bookDepreciationDetail.costLimit) &&
        Objects.equals(this.residualValue, bookDepreciationDetail.residualValue) &&
        Objects.equals(this.priorAccumDepreciationAmount, bookDepreciationDetail.priorAccumDepreciationAmount) &&
        Objects.equals(this.currentAccumDepreciationAmount, bookDepreciationDetail.currentAccumDepreciationAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCapitalGain, currentGainLoss, depreciationStartDate, costLimit, residualValue, priorAccumDepreciationAmount, currentAccumDepreciationAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDepreciationDetail {\n");
    sb.append("    currentCapitalGain: ").append(toIndentedString(currentCapitalGain)).append("\n");
    sb.append("    currentGainLoss: ").append(toIndentedString(currentGainLoss)).append("\n");
    sb.append("    depreciationStartDate: ").append(toIndentedString(depreciationStartDate)).append("\n");
    sb.append("    costLimit: ").append(toIndentedString(costLimit)).append("\n");
    sb.append("    residualValue: ").append(toIndentedString(residualValue)).append("\n");
    sb.append("    priorAccumDepreciationAmount: ").append(toIndentedString(priorAccumDepreciationAmount)).append("\n");
    sb.append("    currentAccumDepreciationAmount: ").append(toIndentedString(currentAccumDepreciationAmount)).append("\n");
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

