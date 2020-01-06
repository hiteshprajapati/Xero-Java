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
 * AccountsPayable
 */

public class AccountsPayable {

  
  @JsonProperty("Outstanding")
  private Double outstanding;

  
  @JsonProperty("Overdue")
  private Double overdue;
  public AccountsPayable outstanding(Double outstanding) {
    this.outstanding = outstanding;
    return this;
  }

   /**
   * Get outstanding
   * @return outstanding
  **/
  @ApiModelProperty(value = "")
  public Double getOutstanding() {
    return outstanding;
  }

  public void setOutstanding(Double outstanding) {
    this.outstanding = outstanding;
  }

  public AccountsPayable overdue(Double overdue) {
    this.overdue = overdue;
    return this;
  }

   /**
   * Get overdue
   * @return overdue
  **/
  @ApiModelProperty(value = "")
  public Double getOverdue() {
    return overdue;
  }

  public void setOverdue(Double overdue) {
    this.overdue = overdue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsPayable accountsPayable = (AccountsPayable) o;
    return Objects.equals(this.outstanding, accountsPayable.outstanding) &&
        Objects.equals(this.overdue, accountsPayable.overdue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outstanding, overdue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsPayable {\n");
    sb.append("    outstanding: ").append(toIndentedString(outstanding)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
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

