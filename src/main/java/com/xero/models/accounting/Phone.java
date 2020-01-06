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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Phone
 */

public class Phone {
  /**
   * Gets or Sets phoneType
   */
  public enum PhoneTypeEnum {
    DEFAULT("DEFAULT"),
    
    DDI("DDI"),
    
    MOBILE("MOBILE"),
    
    FAX("FAX"),
    
    OFFICE("OFFICE");

    private String value;

    PhoneTypeEnum(String value) {
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
    public static PhoneTypeEnum fromValue(String value) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("PhoneType")
  private PhoneTypeEnum phoneType;

  
  @JsonProperty("PhoneNumber")
  private String phoneNumber;

  
  @JsonProperty("PhoneAreaCode")
  private String phoneAreaCode;

  
  @JsonProperty("PhoneCountryCode")
  private String phoneCountryCode;
  public Phone phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(value = "")
  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }

  public Phone phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * max length &#x3D; 50
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "max length = 50")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Phone phoneAreaCode(String phoneAreaCode) {
    this.phoneAreaCode = phoneAreaCode;
    return this;
  }

   /**
   * max length &#x3D; 10
   * @return phoneAreaCode
  **/
  @ApiModelProperty(value = "max length = 10")
  public String getPhoneAreaCode() {
    return phoneAreaCode;
  }

  public void setPhoneAreaCode(String phoneAreaCode) {
    this.phoneAreaCode = phoneAreaCode;
  }

  public Phone phoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
    return this;
  }

   /**
   * max length &#x3D; 20
   * @return phoneCountryCode
  **/
  @ApiModelProperty(value = "max length = 20")
  public String getPhoneCountryCode() {
    return phoneCountryCode;
  }

  public void setPhoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.phoneType, phone.phoneType) &&
        Objects.equals(this.phoneNumber, phone.phoneNumber) &&
        Objects.equals(this.phoneAreaCode, phone.phoneAreaCode) &&
        Objects.equals(this.phoneCountryCode, phone.phoneCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneType, phoneNumber, phoneAreaCode, phoneCountryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneAreaCode: ").append(toIndentedString(phoneAreaCode)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
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

