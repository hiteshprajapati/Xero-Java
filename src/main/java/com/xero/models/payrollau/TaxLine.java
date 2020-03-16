/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.0.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.ManualTaxType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TaxLine
 */

public class TaxLine {
  StringUtil util = new StringUtil();

  
  @JsonProperty("PayslipTaxLineID")
  private UUID payslipTaxLineID;

  
  @JsonProperty("Amount")
  private Float amount;

  
  @JsonProperty("TaxTypeName")
  private String taxTypeName;

  
  @JsonProperty("Description")
  private String description;

  
  @JsonProperty("ManualTaxType")
  private ManualTaxType manualTaxType;

  
  @JsonProperty("LiabilityAccount")
  private String liabilityAccount;
  public TaxLine payslipTaxLineID(UUID payslipTaxLineID) {
    this.payslipTaxLineID = payslipTaxLineID;
    return this;
  }

   /**
   * Xero identifier for payslip tax line ID.
   * @return payslipTaxLineID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier for payslip tax line ID.")
  public UUID getPayslipTaxLineID() {
    return payslipTaxLineID;
  }

  public void setPayslipTaxLineID(UUID payslipTaxLineID) {
    this.payslipTaxLineID = payslipTaxLineID;
  }

  public TaxLine amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The tax line amount
   * @return amount
  **/
  @ApiModelProperty(example = "50.0", value = "The tax line amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public TaxLine taxTypeName(String taxTypeName) {
    this.taxTypeName = taxTypeName;
    return this;
  }

   /**
   * Name of the tax type.
   * @return taxTypeName
  **/
  @ApiModelProperty(example = "Manual Adjustment", value = "Name of the tax type.")
  public String getTaxTypeName() {
    return taxTypeName;
  }

  public void setTaxTypeName(String taxTypeName) {
    this.taxTypeName = taxTypeName;
  }

  public TaxLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the tax line.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the tax line.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaxLine manualTaxType(ManualTaxType manualTaxType) {
    this.manualTaxType = manualTaxType;
    return this;
  }

   /**
   * Get manualTaxType
   * @return manualTaxType
  **/
  @ApiModelProperty(value = "")
  public ManualTaxType getManualTaxType() {
    return manualTaxType;
  }

  public void setManualTaxType(ManualTaxType manualTaxType) {
    this.manualTaxType = manualTaxType;
  }

  public TaxLine liabilityAccount(String liabilityAccount) {
    this.liabilityAccount = liabilityAccount;
    return this;
  }

   /**
   * The tax line liability account code. For posted pay run you should be able to see liability account code
   * @return liabilityAccount
  **/
  @ApiModelProperty(example = "620", value = "The tax line liability account code. For posted pay run you should be able to see liability account code")
  public String getLiabilityAccount() {
    return liabilityAccount;
  }

  public void setLiabilityAccount(String liabilityAccount) {
    this.liabilityAccount = liabilityAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxLine taxLine = (TaxLine) o;
    return Objects.equals(this.payslipTaxLineID, taxLine.payslipTaxLineID) &&
        Objects.equals(this.amount, taxLine.amount) &&
        Objects.equals(this.taxTypeName, taxLine.taxTypeName) &&
        Objects.equals(this.description, taxLine.description) &&
        Objects.equals(this.manualTaxType, taxLine.manualTaxType) &&
        Objects.equals(this.liabilityAccount, taxLine.liabilityAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payslipTaxLineID, amount, taxTypeName, description, manualTaxType, liabilityAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLine {\n");
    sb.append("    payslipTaxLineID: ").append(toIndentedString(payslipTaxLineID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxTypeName: ").append(toIndentedString(taxTypeName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    manualTaxType: ").append(toIndentedString(manualTaxType)).append("\n");
    sb.append("    liabilityAccount: ").append(toIndentedString(liabilityAccount)).append("\n");
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

