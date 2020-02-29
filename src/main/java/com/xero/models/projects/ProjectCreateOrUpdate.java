/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.projects;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ProjectCreateOrUpdate
 */

public class ProjectCreateOrUpdate {
  @JsonProperty("contactId")
  private UUID contactId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("estimateAmount")
  private Double estimateAmount;

  @JsonProperty("deadlineUtc")
  private OffsetDateTime deadlineUtc;

  public ProjectCreateOrUpdate contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Identifier of the contact this project was created for.
   * @return contactId
  **/
  @ApiModelProperty(example = "01234567-89ab-cdef-0123-456789abcdef", value = "Identifier of the contact this project was created for.")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public ProjectCreateOrUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the project.
   * @return name
  **/
  @ApiModelProperty(example = "New Kitchen", required = true, value = "Name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectCreateOrUpdate estimateAmount(Double estimateAmount) {
    this.estimateAmount = estimateAmount;
    return this;
  }

   /**
   * Get estimateAmount
   * @return estimateAmount
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public Double getEstimateAmount() {
    return estimateAmount;
  }

  public void setEstimateAmount(Double estimateAmount) {
    this.estimateAmount = estimateAmount;
  }

  public ProjectCreateOrUpdate deadlineUtc(OffsetDateTime deadlineUtc) {
    this.deadlineUtc = deadlineUtc;
    return this;
  }

   /**
   * Deadline for the project. UTC Date Time in ISO-8601 format.
   * @return deadlineUtc
  **/
  @ApiModelProperty(value = "Deadline for the project. UTC Date Time in ISO-8601 format.")
  public OffsetDateTime getDeadlineUtc() {
    return deadlineUtc;
  }

  public void setDeadlineUtc(OffsetDateTime deadlineUtc) {
    this.deadlineUtc = deadlineUtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateOrUpdate projectCreateOrUpdate = (ProjectCreateOrUpdate) o;
    return Objects.equals(this.contactId, projectCreateOrUpdate.contactId) &&
        Objects.equals(this.name, projectCreateOrUpdate.name) &&
        Objects.equals(this.estimateAmount, projectCreateOrUpdate.estimateAmount) &&
        Objects.equals(this.deadlineUtc, projectCreateOrUpdate.deadlineUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, name, estimateAmount, deadlineUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateOrUpdate {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    estimateAmount: ").append(toIndentedString(estimateAmount)).append("\n");
    sb.append("    deadlineUtc: ").append(toIndentedString(deadlineUtc)).append("\n");
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

