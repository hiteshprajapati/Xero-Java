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
import com.xero.models.accounting.ExpenseClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ExpenseClaims
 */

public class ExpenseClaims {

  
  @JsonProperty("ExpenseClaims")
  private List<ExpenseClaim> expenseClaims = new ArrayList<ExpenseClaim>();
  public ExpenseClaims expenseClaims(List<ExpenseClaim> expenseClaims) {
    this.expenseClaims = expenseClaims;
    return this;
  }

  public ExpenseClaims addExpenseClaimsItem(ExpenseClaim expenseClaimsItem) {
    if (this.expenseClaims == null) {
      this.expenseClaims = new ArrayList<ExpenseClaim>();
    }
    this.expenseClaims.add(expenseClaimsItem);
    return this;
  }

   /**
   * Get expenseClaims
   * @return expenseClaims
  **/
  @ApiModelProperty(value = "")
  public List<ExpenseClaim> getExpenseClaims() {
    return expenseClaims;
  }

  public void setExpenseClaims(List<ExpenseClaim> expenseClaims) {
    this.expenseClaims = expenseClaims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseClaims expenseClaims = (ExpenseClaims) o;
    return Objects.equals(this.expenseClaims, expenseClaims.expenseClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseClaims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseClaims {\n");
    sb.append("    expenseClaims: ").append(toIndentedString(expenseClaims)).append("\n");
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

