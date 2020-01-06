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
 * CISOrgSetting
 */

public class CISOrgSetting {

  
  @JsonProperty("CISContractorEnabled")
  private Boolean ciSContractorEnabled;

  
  @JsonProperty("CISSubContractorEnabled")
  private Boolean ciSSubContractorEnabled;

  
  @JsonProperty("Rate")
  private Integer rate;
  public CISOrgSetting ciSContractorEnabled(Boolean ciSContractorEnabled) {
    this.ciSContractorEnabled = ciSContractorEnabled;
    return this;
  }

   /**
   * true or false - Boolean that describes if the organisation is a CIS Contractor
   * @return ciSContractorEnabled
  **/
  @ApiModelProperty(value = "true or false - Boolean that describes if the organisation is a CIS Contractor")
  public Boolean getCiSContractorEnabled() {
    return ciSContractorEnabled;
  }

  public void setCiSContractorEnabled(Boolean ciSContractorEnabled) {
    this.ciSContractorEnabled = ciSContractorEnabled;
  }

  public CISOrgSetting ciSSubContractorEnabled(Boolean ciSSubContractorEnabled) {
    this.ciSSubContractorEnabled = ciSSubContractorEnabled;
    return this;
  }

   /**
   * true or false - Boolean that describes if the organisation is a CIS SubContractor
   * @return ciSSubContractorEnabled
  **/
  @ApiModelProperty(value = "true or false - Boolean that describes if the organisation is a CIS SubContractor")
  public Boolean getCiSSubContractorEnabled() {
    return ciSSubContractorEnabled;
  }

  public void setCiSSubContractorEnabled(Boolean ciSSubContractorEnabled) {
    this.ciSSubContractorEnabled = ciSSubContractorEnabled;
  }

  public CISOrgSetting rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * CIS Deduction rate for the organisation
   * @return rate
  **/
  @ApiModelProperty(value = "CIS Deduction rate for the organisation")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CISOrgSetting ciSOrgSetting = (CISOrgSetting) o;
    return Objects.equals(this.ciSContractorEnabled, ciSOrgSetting.ciSContractorEnabled) &&
        Objects.equals(this.ciSSubContractorEnabled, ciSOrgSetting.ciSSubContractorEnabled) &&
        Objects.equals(this.rate, ciSOrgSetting.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciSContractorEnabled, ciSSubContractorEnabled, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CISOrgSetting {\n");
    sb.append("    ciSContractorEnabled: ").append(toIndentedString(ciSContractorEnabled)).append("\n");
    sb.append("    ciSSubContractorEnabled: ").append(toIndentedString(ciSSubContractorEnabled)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

