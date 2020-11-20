/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** SuperannuationLine */
public class SuperannuationLine {
  StringUtil util = new StringUtil();

  @JsonProperty("superannuationTypeID")
  private UUID superannuationTypeID;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  @JsonProperty("percentage")
  private Double percentage;

  @JsonProperty("manualAdjustment")
  private Boolean manualAdjustment;

  public SuperannuationLine superannuationTypeID(UUID superannuationTypeID) {
    this.superannuationTypeID = superannuationTypeID;
    return this;
  }

  /**
   * Xero identifier for payroll superannucation type
   *
   * @return superannuationTypeID
   */
  @ApiModelProperty(value = "Xero identifier for payroll superannucation type")
  public UUID getSuperannuationTypeID() {
    return superannuationTypeID;
  }

  public void setSuperannuationTypeID(UUID superannuationTypeID) {
    this.superannuationTypeID = superannuationTypeID;
  }

  public SuperannuationLine displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Benefit display name
   *
   * @return displayName
   */
  @ApiModelProperty(value = "Benefit display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SuperannuationLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the superannuation line
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the superannuation line")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SuperannuationLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Superannuation fixed amount
   *
   * @return fixedAmount
   */
  @ApiModelProperty(value = "Superannuation fixed amount")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public SuperannuationLine percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Superannuation rate percentage
   *
   * @return percentage
   */
  @ApiModelProperty(value = "Superannuation rate percentage")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public SuperannuationLine manualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
    return this;
  }

  /**
   * manual adjustment made
   *
   * @return manualAdjustment
   */
  @ApiModelProperty(value = "manual adjustment made")
  public Boolean getManualAdjustment() {
    return manualAdjustment;
  }

  public void setManualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperannuationLine superannuationLine = (SuperannuationLine) o;
    return Objects.equals(this.superannuationTypeID, superannuationLine.superannuationTypeID)
        && Objects.equals(this.displayName, superannuationLine.displayName)
        && Objects.equals(this.amount, superannuationLine.amount)
        && Objects.equals(this.fixedAmount, superannuationLine.fixedAmount)
        && Objects.equals(this.percentage, superannuationLine.percentage)
        && Objects.equals(this.manualAdjustment, superannuationLine.manualAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        superannuationTypeID, displayName, amount, fixedAmount, percentage, manualAdjustment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperannuationLine {\n");
    sb.append("    superannuationTypeID: ")
        .append(toIndentedString(superannuationTypeID))
        .append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    manualAdjustment: ").append(toIndentedString(manualAdjustment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
