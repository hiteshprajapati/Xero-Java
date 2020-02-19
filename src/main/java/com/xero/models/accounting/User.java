/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.1
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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * User
 */

public class User {

  
  @JsonProperty("UserID")
  private UUID userID;

  
  @JsonProperty("EmailAddress")
  private String emailAddress;

  
  @JsonProperty("FirstName")
  private String firstName;

  
  @JsonProperty("LastName")
  private String lastName;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC;

  
  @JsonProperty("IsSubscriber")
  private Boolean isSubscriber;
  /**
   * User role that defines permissions in Xero and via API (READONLY, INVOICEONLY, STANDARD, FINANCIALADVISER, etc)
   */
  public enum OrganisationRoleEnum {
    READONLY("READONLY"),
    
    INVOICEONLY("INVOICEONLY"),
    
    STANDARD("STANDARD"),
    
    FINANCIALADVISER("FINANCIALADVISER"),
    
    MANAGEDCLIENT("MANAGEDCLIENT"),
    
    CASHBOOKCLIENT("CASHBOOKCLIENT"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    OrganisationRoleEnum(String value) {
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
    public static OrganisationRoleEnum fromValue(String value) {
      for (OrganisationRoleEnum b : OrganisationRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("OrganisationRole")
  private OrganisationRoleEnum organisationRole;
  public User userID(UUID userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Xero identifier
   * @return userID
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getUserID() {
    return userID;
  }

  public void setUserID(UUID userID) {
    this.userID = userID;
  }

  public User emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of user
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Email address of user")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of user
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of user
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User updatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * Timestamp of last change to user
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "Timestamp of last change to user")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public User isSubscriber(Boolean isSubscriber) {
    this.isSubscriber = isSubscriber;
    return this;
  }

   /**
   * Boolean to indicate if user is the subscriber
   * @return isSubscriber
  **/
  @ApiModelProperty(value = "Boolean to indicate if user is the subscriber")
  public Boolean getIsSubscriber() {
    return isSubscriber;
  }

  public void setIsSubscriber(Boolean isSubscriber) {
    this.isSubscriber = isSubscriber;
  }

  public User organisationRole(OrganisationRoleEnum organisationRole) {
    this.organisationRole = organisationRole;
    return this;
  }

   /**
   * User role that defines permissions in Xero and via API (READONLY, INVOICEONLY, STANDARD, FINANCIALADVISER, etc)
   * @return organisationRole
  **/
  @ApiModelProperty(value = "User role that defines permissions in Xero and via API (READONLY, INVOICEONLY, STANDARD, FINANCIALADVISER, etc)")
  public OrganisationRoleEnum getOrganisationRole() {
    return organisationRole;
  }

  public void setOrganisationRole(OrganisationRoleEnum organisationRole) {
    this.organisationRole = organisationRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userID, user.userID) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.updatedDateUTC, user.updatedDateUTC) &&
        Objects.equals(this.isSubscriber, user.isSubscriber) &&
        Objects.equals(this.organisationRole, user.organisationRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, emailAddress, firstName, lastName, updatedDateUTC, isSubscriber, organisationRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isSubscriber: ").append(toIndentedString(isSubscriber)).append("\n");
    sb.append("    organisationRole: ").append(toIndentedString(organisationRole)).append("\n");
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

