/*
 * Bank Feeds API
 * This specifing endpoints Xero Bank feeds API
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** FeedConnection */
public class FeedConnection {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("accountToken")
  private String accountToken;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountId")
  private UUID accountId;
  /**
   * High level bank account type - BANK CREDITCARD BANK encompasses all bank account types other
   * than credit cards.
   */
  public enum AccountTypeEnum {
    BANK("BANK"),

    CREDITCARD("CREDITCARD");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("accountType")
  private AccountTypeEnum accountType;

  @JsonProperty("currency")
  private CurrencyCode currency;

  @JsonProperty("country")
  private CountryCode country;
  /** the current status of the feed connection */
  public enum StatusEnum {
    PENDING("PENDING"),

    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("error")
  private Error error;

  public FeedConnection id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * GUID used to identify the Account.
   *
   * @return id
   */
  @ApiModelProperty(
      example = "00d3cf8d-95dc-4466-8dc0-47e6d1197e28",
      value = "GUID used to identify the Account.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FeedConnection accountToken(String accountToken) {
    this.accountToken = accountToken;
    return this;
  }

  /**
   * This account identifier is generated by the financial institute (FI). This must be unique for
   * your financial institute. maximum: 50
   *
   * @return accountToken
   */
  @ApiModelProperty(
      example = "10000123",
      value =
          "This account identifier is generated by the financial institute (FI). This must be"
              + " unique for your financial institute.")
  public String getAccountToken() {
    return accountToken;
  }

  public void setAccountToken(String accountToken) {
    this.accountToken = accountToken;
  }

  public FeedConnection accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * String(40) when AccountType is BANK String(4) when AccountType is CREDITCARD The Account Number
   * is used to match the feed to a Xero Bank Account. The API will create a new Xero Bank Account
   * if a match to an existing Xero Bank Account is not found. Only the last 4 digits must be
   * supplied for Credit Card numbers. Must be included if AccountId is not specified. maximum: 40
   *
   * @return accountNumber
   */
  @ApiModelProperty(
      example = "3809087654321500",
      value =
          "String(40) when AccountType is BANK String(4) when AccountType is CREDITCARD The"
              + " Account Number is used to match the feed to a Xero Bank Account. The API will"
              + " create a new Xero Bank Account if a match to an existing Xero Bank Account is"
              + " not found. Only the last 4 digits must be supplied for Credit Card numbers. Must"
              + " be included if AccountId is not specified.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public FeedConnection accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The Account Name will be used for the creation of a new Xero Bank Account if a matching Xero
   * Bank Account is not found. maximum: 30
   *
   * @return accountName
   */
  @ApiModelProperty(
      example = "Joe's Savings Account",
      value =
          "The Account Name will be used for the creation of a new Xero Bank Account if a matching"
              + " Xero Bank Account is not found.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public FeedConnection accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Xero identifier for a bank account in Xero. Must be included if AccountNumber is not specified.
   *
   * @return accountId
   */
  @ApiModelProperty(
      example = "079a88ea-276d-41fb-a1f1-366ef3e22921",
      value =
          "Xero identifier for a bank account in Xero. Must be included if AccountNumber is not"
              + " specified.")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public FeedConnection accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * High level bank account type - BANK CREDITCARD BANK encompasses all bank account types other
   * than credit cards.
   *
   * @return accountType
   */
  @ApiModelProperty(
      example = "BANK",
      value =
          "High level bank account type - BANK CREDITCARD BANK encompasses all bank account types"
              + " other than credit cards.")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public FeedConnection currency(CurrencyCode currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  public FeedConnection country(CountryCode country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   *
   * @return country
   */
  @ApiModelProperty(value = "")
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  public FeedConnection status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * the current status of the feed connection
   *
   * @return status
   */
  @ApiModelProperty(example = "REJECTED", value = "the current status of the feed connection")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FeedConnection error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   *
   * @return error
   */
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedConnection feedConnection = (FeedConnection) o;
    return Objects.equals(this.id, feedConnection.id)
        && Objects.equals(this.accountToken, feedConnection.accountToken)
        && Objects.equals(this.accountNumber, feedConnection.accountNumber)
        && Objects.equals(this.accountName, feedConnection.accountName)
        && Objects.equals(this.accountId, feedConnection.accountId)
        && Objects.equals(this.accountType, feedConnection.accountType)
        && Objects.equals(this.currency, feedConnection.currency)
        && Objects.equals(this.country, feedConnection.country)
        && Objects.equals(this.status, feedConnection.status)
        && Objects.equals(this.error, feedConnection.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        accountToken,
        accountNumber,
        accountName,
        accountId,
        accountType,
        currency,
        country,
        status,
        error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountToken: ").append(toIndentedString(accountToken)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
