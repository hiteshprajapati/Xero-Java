/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.8
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
import com.xero.models.accounting.TaxRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TaxRates
 */

public class TaxRates {
  StringUtil util = new StringUtil();

  
  @JsonProperty("TaxRates")
  private List<TaxRate> taxRates = new ArrayList<TaxRate>();
  public TaxRates taxRates(List<TaxRate> taxRates) {
    this.taxRates = taxRates;
    return this;
  }

  public TaxRates addTaxRatesItem(TaxRate taxRatesItem) {
    if (this.taxRates == null) {
      this.taxRates = new ArrayList<TaxRate>();
    }
    this.taxRates.add(taxRatesItem);
    return this;
  }

   /**
   * Get taxRates
   * @return taxRates
  **/
  @ApiModelProperty(value = "")
  public List<TaxRate> getTaxRates() {
    return taxRates;
  }

  public void setTaxRates(List<TaxRate> taxRates) {
    this.taxRates = taxRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRates taxRates = (TaxRates) o;
    return Objects.equals(this.taxRates, taxRates.taxRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRates {\n");
    sb.append("    taxRates: ").append(toIndentedString(taxRates)).append("\n");
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

