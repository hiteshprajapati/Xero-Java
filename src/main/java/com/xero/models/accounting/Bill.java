/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@xero.com
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Bill
 */

public class Bill {
  
  @JsonProperty("Day")
  private Integer day = null;

  /**
   * One of the following values OFFOLLOWINGMONTH/DAYSAFTERBILLDATE/OFCURRENTMONTH
   */
  public enum TypeEnum {
    OFFOLLOWINGMONTH("OFFOLLOWINGMONTH"),
    
    DAYSAFTERBILLDATE("DAYSAFTERBILLDATE"),
    
    OFCURRENTMONTH("OFCURRENTMONTH");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Type")
  private TypeEnum type = null;

  public Bill day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Day of Month (0-31)
   * @return day
  **/
  @ApiModelProperty(value = "Day of Month (0-31)")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public Bill type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * One of the following values OFFOLLOWINGMONTH/DAYSAFTERBILLDATE/OFCURRENTMONTH
   * @return type
  **/
  @ApiModelProperty(value = "One of the following values OFFOLLOWINGMONTH/DAYSAFTERBILLDATE/OFCURRENTMONTH")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bill bill = (Bill) o;
    return Objects.equals(this.day, bill.day) &&
        Objects.equals(this.type, bill.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bill {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

