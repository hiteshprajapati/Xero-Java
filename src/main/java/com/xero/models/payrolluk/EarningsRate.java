/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** EarningsRate */
public class EarningsRate {
  StringUtil util = new StringUtil();

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("name")
  private String name;
  /** Indicates how an employee will be paid when taking this type of earning */
  public enum EarningsTypeEnum {
    ALLOWANCE("Allowance"),

    BACKPAY("Backpay"),

    BONUS("Bonus"),

    COMMISSION("Commission"),

    LUMPSUM("LumpSum"),

    OTHEREARNINGS("OtherEarnings"),

    OVERTIMEEARNINGS("OvertimeEarnings"),

    REGULAREARNINGS("RegularEarnings"),

    STATUTORYADOPTIONPAY("StatutoryAdoptionPay"),

    STATUTORYMATERNITYPAY("StatutoryMaternityPay"),

    STATUTORYPATERNITYPAY("StatutoryPaternityPay"),

    STATUTORYSHAREDPARENTALPAY("StatutorySharedParentalPay"),

    STATUTORYSICKPAY("StatutorySickPay"),

    TIPS_DIRECT_("Tips(Direct)"),

    TIPS_NON_DIRECT_("Tips(Non-Direct)");

    private String value;

    EarningsTypeEnum(String value) {
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
    public static EarningsTypeEnum fromValue(String value) {
      for (EarningsTypeEnum b : EarningsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("earningsType")
  private EarningsTypeEnum earningsType;
  /** Indicates the type of the earning rate */
  public enum RateTypeEnum {
    RATEPERUNIT("RatePerUnit"),

    MULTIPLEOFORDINARYEARNINGSRATE("MultipleOfOrdinaryEarningsRate"),

    FIXEDAMOUNT("FixedAmount");

    private String value;

    RateTypeEnum(String value) {
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
    public static RateTypeEnum fromValue(String value) {
      for (RateTypeEnum b : RateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("rateType")
  private RateTypeEnum rateType;

  @JsonProperty("typeOfUnits")
  private String typeOfUnits;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;

  @JsonProperty("expenseAccountID")
  private UUID expenseAccountID;

  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;

  @JsonProperty("multipleOfOrdinaryEarningsRate")
  private Double multipleOfOrdinaryEarningsRate;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  public EarningsRate earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero unique identifier for an earning rate
   *
   * @return earningsRateID
   */
  @ApiModelProperty(value = "Xero unique identifier for an earning rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public EarningsRate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the earning rate
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the earning rate")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EarningsRate earningsType(EarningsTypeEnum earningsType) {
    this.earningsType = earningsType;
    return this;
  }

  /**
   * Indicates how an employee will be paid when taking this type of earning
   *
   * @return earningsType
   */
  @ApiModelProperty(
      required = true,
      value = "Indicates how an employee will be paid when taking this type of earning")
  public EarningsTypeEnum getEarningsType() {
    return earningsType;
  }

  public void setEarningsType(EarningsTypeEnum earningsType) {
    this.earningsType = earningsType;
  }

  public EarningsRate rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Indicates the type of the earning rate
   *
   * @return rateType
   */
  @ApiModelProperty(required = true, value = "Indicates the type of the earning rate")
  public RateTypeEnum getRateType() {
    return rateType;
  }

  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  public EarningsRate typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

  /**
   * The type of units used to record earnings
   *
   * @return typeOfUnits
   */
  @ApiModelProperty(required = true, value = "The type of units used to record earnings")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }

  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }

  public EarningsRate currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Indicates whether an earning type is active
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Indicates whether an earning type is active")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  public EarningsRate expenseAccountID(UUID expenseAccountID) {
    this.expenseAccountID = expenseAccountID;
    return this;
  }

  /**
   * The account that will be used for the earnings rate
   *
   * @return expenseAccountID
   */
  @ApiModelProperty(required = true, value = "The account that will be used for the earnings rate")
  public UUID getExpenseAccountID() {
    return expenseAccountID;
  }

  public void setExpenseAccountID(UUID expenseAccountID) {
    this.expenseAccountID = expenseAccountID;
  }

  public EarningsRate ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * Default rate per unit (optional). Only applicable if RateType is RatePerUnit
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(
      value = "Default rate per unit (optional). Only applicable if RateType is RatePerUnit")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public EarningsRate multipleOfOrdinaryEarningsRate(Double multipleOfOrdinaryEarningsRate) {
    this.multipleOfOrdinaryEarningsRate = multipleOfOrdinaryEarningsRate;
    return this;
  }

  /**
   * This is the multiplier used to calculate the rate per unit, based on the employee’s ordinary
   * earnings rate. For example, for time and a half enter 1.5. Only applicable if RateType is
   * MultipleOfOrdinaryEarningsRate
   *
   * @return multipleOfOrdinaryEarningsRate
   */
  @ApiModelProperty(
      value =
          "This is the multiplier used to calculate the rate per unit, based on the employee’s"
              + " ordinary earnings rate. For example, for time and a half enter 1.5. Only"
              + " applicable if RateType is MultipleOfOrdinaryEarningsRate")
  public Double getMultipleOfOrdinaryEarningsRate() {
    return multipleOfOrdinaryEarningsRate;
  }

  public void setMultipleOfOrdinaryEarningsRate(Double multipleOfOrdinaryEarningsRate) {
    this.multipleOfOrdinaryEarningsRate = multipleOfOrdinaryEarningsRate;
  }

  public EarningsRate fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Optional Fixed Rate Amount. Applicable for FixedAmount Rate
   *
   * @return fixedAmount
   */
  @ApiModelProperty(value = "Optional Fixed Rate Amount. Applicable for FixedAmount Rate")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsRate earningsRate = (EarningsRate) o;
    return Objects.equals(this.earningsRateID, earningsRate.earningsRateID)
        && Objects.equals(this.name, earningsRate.name)
        && Objects.equals(this.earningsType, earningsRate.earningsType)
        && Objects.equals(this.rateType, earningsRate.rateType)
        && Objects.equals(this.typeOfUnits, earningsRate.typeOfUnits)
        && Objects.equals(this.currentRecord, earningsRate.currentRecord)
        && Objects.equals(this.expenseAccountID, earningsRate.expenseAccountID)
        && Objects.equals(this.ratePerUnit, earningsRate.ratePerUnit)
        && Objects.equals(
            this.multipleOfOrdinaryEarningsRate, earningsRate.multipleOfOrdinaryEarningsRate)
        && Objects.equals(this.fixedAmount, earningsRate.fixedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        earningsRateID,
        name,
        earningsType,
        rateType,
        typeOfUnits,
        currentRecord,
        expenseAccountID,
        ratePerUnit,
        multipleOfOrdinaryEarningsRate,
        fixedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRate {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    earningsType: ").append(toIndentedString(earningsType)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    expenseAccountID: ").append(toIndentedString(expenseAccountID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    multipleOfOrdinaryEarningsRate: ")
        .append(toIndentedString(multipleOfOrdinaryEarningsRate))
        .append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
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
