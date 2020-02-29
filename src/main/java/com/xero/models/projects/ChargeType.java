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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Can be &#x60;TIME&#x60;, &#x60;FIXED&#x60; or &#x60;NON_CHARGEABLE&#x60;, defines how the task will be charged. Use &#x60;TIME&#x60; when you want to charge per hour and &#x60;FIXED&#x60; to charge as a fixed amount. If the task will not be charged use &#x60;NON_CHARGEABLE&#x60;.
 */
public enum ChargeType {
  
  TIME("TIME"),
  
  FIXED("FIXED"),
  
  NON_CHARGEABLE("NON_CHARGEABLE");

  private String value;

  ChargeType(String value) {
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
  public static ChargeType fromValue(String value) {
    for (ChargeType b : ChargeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

