/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/** Setting */
public class Setting {
  StringUtil util = new StringUtil();

  @JsonProperty("assetNumberPrefix")
  private String assetNumberPrefix;

  @JsonProperty("assetNumberSequence")
  private String assetNumberSequence;

  @JsonProperty("assetStartDate")
  private LocalDate assetStartDate;

  @JsonProperty("lastDepreciationDate")
  private LocalDate lastDepreciationDate;

  @JsonProperty("defaultGainOnDisposalAccountId")
  private UUID defaultGainOnDisposalAccountId;

  @JsonProperty("defaultLossOnDisposalAccountId")
  private UUID defaultLossOnDisposalAccountId;

  @JsonProperty("defaultCapitalGainOnDisposalAccountId")
  private UUID defaultCapitalGainOnDisposalAccountId;

  @JsonProperty("optInForTax")
  private Boolean optInForTax;

  public Setting assetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
    return this;
  }

  /**
   * The prefix used for fixed asset numbers (“FA-” by default)
   *
   * @return assetNumberPrefix
   */
  @ApiModelProperty(
      example = "FA-",
      value = "The prefix used for fixed asset numbers (“FA-” by default)")
  public String getAssetNumberPrefix() {
    return assetNumberPrefix;
  }

  public void setAssetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
  }

  public Setting assetNumberSequence(String assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
    return this;
  }

  /**
   * The next available sequence number
   *
   * @return assetNumberSequence
   */
  @ApiModelProperty(example = "0022", value = "The next available sequence number")
  public String getAssetNumberSequence() {
    return assetNumberSequence;
  }

  public void setAssetNumberSequence(String assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
  }

  public Setting assetStartDate(LocalDate assetStartDate) {
    this.assetStartDate = assetStartDate;
    return this;
  }

  /**
   * The date depreciation calculations started on registered fixed assets in Xero
   *
   * @return assetStartDate
   */
  @ApiModelProperty(
      value = "The date depreciation calculations started on registered fixed assets in Xero")
  public LocalDate getAssetStartDate() {
    return assetStartDate;
  }

  public void setAssetStartDate(LocalDate assetStartDate) {
    this.assetStartDate = assetStartDate;
  }

  public Setting lastDepreciationDate(LocalDate lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
    return this;
  }

  /**
   * The last depreciation date
   *
   * @return lastDepreciationDate
   */
  @ApiModelProperty(value = "The last depreciation date")
  public LocalDate getLastDepreciationDate() {
    return lastDepreciationDate;
  }

  public void setLastDepreciationDate(LocalDate lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
  }

  public Setting defaultGainOnDisposalAccountId(UUID defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that gains are posted to
   *
   * @return defaultGainOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "346ddb97-739a-4274-b43b-66aa3218d17c",
      value = "Default account that gains are posted to")
  public UUID getDefaultGainOnDisposalAccountId() {
    return defaultGainOnDisposalAccountId;
  }

  public void setDefaultGainOnDisposalAccountId(UUID defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
  }

  public Setting defaultLossOnDisposalAccountId(UUID defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that losses are posted to
   *
   * @return defaultLossOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "1b798541-24e2-4855-9309-c023a0b576f3",
      value = "Default account that losses are posted to")
  public UUID getDefaultLossOnDisposalAccountId() {
    return defaultLossOnDisposalAccountId;
  }

  public void setDefaultLossOnDisposalAccountId(UUID defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
  }

  public Setting defaultCapitalGainOnDisposalAccountId(UUID defaultCapitalGainOnDisposalAccountId) {
    this.defaultCapitalGainOnDisposalAccountId = defaultCapitalGainOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that capital gains are posted to
   *
   * @return defaultCapitalGainOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "6d6a0bdb-e118-45d8-a023-2ad617ec1cb7",
      value = "Default account that capital gains are posted to")
  public UUID getDefaultCapitalGainOnDisposalAccountId() {
    return defaultCapitalGainOnDisposalAccountId;
  }

  public void setDefaultCapitalGainOnDisposalAccountId(UUID defaultCapitalGainOnDisposalAccountId) {
    this.defaultCapitalGainOnDisposalAccountId = defaultCapitalGainOnDisposalAccountId;
  }

  public Setting optInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
    return this;
  }

  /**
   * opt in for tax calculation
   *
   * @return optInForTax
   */
  @ApiModelProperty(example = "false", value = "opt in for tax calculation")
  public Boolean getOptInForTax() {
    return optInForTax;
  }

  public void setOptInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.assetNumberPrefix, setting.assetNumberPrefix)
        && Objects.equals(this.assetNumberSequence, setting.assetNumberSequence)
        && Objects.equals(this.assetStartDate, setting.assetStartDate)
        && Objects.equals(this.lastDepreciationDate, setting.lastDepreciationDate)
        && Objects.equals(
            this.defaultGainOnDisposalAccountId, setting.defaultGainOnDisposalAccountId)
        && Objects.equals(
            this.defaultLossOnDisposalAccountId, setting.defaultLossOnDisposalAccountId)
        && Objects.equals(
            this.defaultCapitalGainOnDisposalAccountId,
            setting.defaultCapitalGainOnDisposalAccountId)
        && Objects.equals(this.optInForTax, setting.optInForTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetNumberPrefix,
        assetNumberSequence,
        assetStartDate,
        lastDepreciationDate,
        defaultGainOnDisposalAccountId,
        defaultLossOnDisposalAccountId,
        defaultCapitalGainOnDisposalAccountId,
        optInForTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    sb.append("    assetNumberPrefix: ").append(toIndentedString(assetNumberPrefix)).append("\n");
    sb.append("    assetNumberSequence: ")
        .append(toIndentedString(assetNumberSequence))
        .append("\n");
    sb.append("    assetStartDate: ").append(toIndentedString(assetStartDate)).append("\n");
    sb.append("    lastDepreciationDate: ")
        .append(toIndentedString(lastDepreciationDate))
        .append("\n");
    sb.append("    defaultGainOnDisposalAccountId: ")
        .append(toIndentedString(defaultGainOnDisposalAccountId))
        .append("\n");
    sb.append("    defaultLossOnDisposalAccountId: ")
        .append(toIndentedString(defaultLossOnDisposalAccountId))
        .append("\n");
    sb.append("    defaultCapitalGainOnDisposalAccountId: ")
        .append(toIndentedString(defaultCapitalGainOnDisposalAccountId))
        .append("\n");
    sb.append("    optInForTax: ").append(toIndentedString(optInForTax)).append("\n");
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
