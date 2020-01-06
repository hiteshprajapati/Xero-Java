/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PaymentTermType
 */
public enum PaymentTermType {
  
  DAYSAFTERBILLDATE("DAYSAFTERBILLDATE"),
  
  DAYSAFTERBILLMONTH("DAYSAFTERBILLMONTH"),
  
  OFCURRENTMONTH("OFCURRENTMONTH"),
  
  OFFOLLOWINGMONTH("OFFOLLOWINGMONTH");

  private String value;

  PaymentTermType(String value) {
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
  public static PaymentTermType fromValue(String value) {
    for (PaymentTermType b : PaymentTermType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

