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
 * Address
 */

public class Address {
  /**
   * define the type of address
   */
  public enum AddressTypeEnum {
    POBOX("POBOX"),
    
    STREET("STREET"),
    
    DELIVERY("DELIVERY");

    private String value;

    AddressTypeEnum(String value) {
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
    public static AddressTypeEnum fromValue(String value) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("AddressType")
  private AddressTypeEnum addressType;

  
  @JsonProperty("AddressLine1")
  private String addressLine1;

  
  @JsonProperty("AddressLine2")
  private String addressLine2;

  
  @JsonProperty("AddressLine3")
  private String addressLine3;

  
  @JsonProperty("AddressLine4")
  private String addressLine4;

  
  @JsonProperty("City")
  private String city;

  
  @JsonProperty("Region")
  private String region;

  
  @JsonProperty("PostalCode")
  private String postalCode;

  
  @JsonProperty("Country")
  private String country;

  
  @JsonProperty("AttentionTo")
  private String attentionTo;
  public Address addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * define the type of address
   * @return addressType
  **/
  @ApiModelProperty(value = "define the type of address")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine1
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine2
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine3
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public Address addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

   /**
   * max length &#x3D; 500
   * @return addressLine4
  **/
  @ApiModelProperty(value = "max length = 500")
  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * max length &#x3D; 255
   * @return city
  **/
  @ApiModelProperty(value = "max length = 255")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address region(String region) {
    this.region = region;
    return this;
  }

   /**
   * max length &#x3D; 255
   * @return region
  **/
  @ApiModelProperty(value = "max length = 255")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * max length &#x3D; 50
   * @return postalCode
  **/
  @ApiModelProperty(value = "max length = 50")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * max length &#x3D; 50, [A-Z], [a-z] only
   * @return country
  **/
  @ApiModelProperty(value = "max length = 50, [A-Z], [a-z] only")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address attentionTo(String attentionTo) {
    this.attentionTo = attentionTo;
    return this;
  }

   /**
   * max length &#x3D; 255
   * @return attentionTo
  **/
  @ApiModelProperty(value = "max length = 255")
  public String getAttentionTo() {
    return attentionTo;
  }

  public void setAttentionTo(String attentionTo) {
    this.attentionTo = attentionTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressLine3, address.addressLine3) &&
        Objects.equals(this.addressLine4, address.addressLine4) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.attentionTo, address.attentionTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine1, addressLine2, addressLine3, addressLine4, city, region, postalCode, country, attentionTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    attentionTo: ").append(toIndentedString(attentionTo)).append("\n");
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

