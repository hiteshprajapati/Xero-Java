/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LinkedTransaction
 */

public class LinkedTransaction {
  
  @JsonProperty("SourceTransactionID")
  private UUID sourceTransactionID = null;

  
  @JsonProperty("SourceLineItemID")
  private UUID sourceLineItemID = null;

  
  @JsonProperty("ContactID")
  private UUID contactID = null;

  
  @JsonProperty("TargetTransactionID")
  private UUID targetTransactionID = null;

  
  @JsonProperty("TargetLineItemID")
  private UUID targetLineItemID = null;

  
  @JsonProperty("LinkedTransactionID")
  private UUID linkedTransactionID = null;

  
  @JsonProperty("Status")
  private String status = null;

  
  @JsonProperty("Type")
  private String type = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC = null;

  
  @JsonProperty("SourceTransactionTypeCode")
  private String sourceTransactionTypeCode = null;

  public LinkedTransaction sourceTransactionID(UUID sourceTransactionID) {
    this.sourceTransactionID = sourceTransactionID;
    return this;
  }

   /**
   * Filter by the SourceTransactionID. Get all the linked transactions created from a particular ACCPAY invoice
   * @return sourceTransactionID
  **/
  @ApiModelProperty(value = "Filter by the SourceTransactionID. Get all the linked transactions created from a particular ACCPAY invoice")
  public UUID getSourceTransactionID() {
    return sourceTransactionID;
  }

  public void setSourceTransactionID(UUID sourceTransactionID) {
    this.sourceTransactionID = sourceTransactionID;
  }

  public LinkedTransaction sourceLineItemID(UUID sourceLineItemID) {
    this.sourceLineItemID = sourceLineItemID;
    return this;
  }

   /**
   * The line item identifier from the source transaction.
   * @return sourceLineItemID
  **/
  @ApiModelProperty(required = true, value = "The line item identifier from the source transaction.")
  public UUID getSourceLineItemID() {
    return sourceLineItemID;
  }

  public void setSourceLineItemID(UUID sourceLineItemID) {
    this.sourceLineItemID = sourceLineItemID;
  }

  public LinkedTransaction contactID(UUID contactID) {
    this.contactID = contactID;
    return this;
  }

   /**
   * Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID&#x3D;4bb34b03-3378-4bb2-a0ed-6345abf3224e&amp;Status&#x3D;APPROVED.
   * @return contactID
  **/
  @ApiModelProperty(value = "Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID=4bb34b03-3378-4bb2-a0ed-6345abf3224e&Status=APPROVED.")
  public UUID getContactID() {
    return contactID;
  }

  public void setContactID(UUID contactID) {
    this.contactID = contactID;
  }

  public LinkedTransaction targetTransactionID(UUID targetTransactionID) {
    this.targetTransactionID = targetTransactionID;
    return this;
  }

   /**
   * Filter by the TargetTransactionID. Get all the linked transactions  allocated to a particular ACCREC invoice
   * @return targetTransactionID
  **/
  @ApiModelProperty(value = "Filter by the TargetTransactionID. Get all the linked transactions  allocated to a particular ACCREC invoice")
  public UUID getTargetTransactionID() {
    return targetTransactionID;
  }

  public void setTargetTransactionID(UUID targetTransactionID) {
    this.targetTransactionID = targetTransactionID;
  }

  public LinkedTransaction targetLineItemID(UUID targetLineItemID) {
    this.targetLineItemID = targetLineItemID;
    return this;
  }

   /**
   * The line item identifier from the target transaction. It is possible  to link multiple billable expenses to the same TargetLineItemID.
   * @return targetLineItemID
  **/
  @ApiModelProperty(value = "The line item identifier from the target transaction. It is possible  to link multiple billable expenses to the same TargetLineItemID.")
  public UUID getTargetLineItemID() {
    return targetLineItemID;
  }

  public void setTargetLineItemID(UUID targetLineItemID) {
    this.targetLineItemID = targetLineItemID;
  }

  public LinkedTransaction linkedTransactionID(UUID linkedTransactionID) {
    this.linkedTransactionID = linkedTransactionID;
    return this;
  }

   /**
   * The Xero identifier for an Linked Transaction e.g. /LinkedTransactions/297c2dc5-cc47-4afd-8ec8-74990b8761e9
   * @return linkedTransactionID
  **/
  @ApiModelProperty(value = "The Xero identifier for an Linked Transaction e.g. /LinkedTransactions/297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getLinkedTransactionID() {
    return linkedTransactionID;
  }

  public void setLinkedTransactionID(UUID linkedTransactionID) {
    this.linkedTransactionID = linkedTransactionID;
  }

  public LinkedTransaction status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID&#x3D;4bb34b03-3378-4bb2-a0ed-6345abf3224e&amp;Status&#x3D;APPROVED.
   * @return status
  **/
  @ApiModelProperty(value = "Filter by the combination of ContactID and Status. Get all the linked transactions that have been assigned to a particular customer and have a particular status e.g. GET /LinkedTransactions?ContactID=4bb34b03-3378-4bb2-a0ed-6345abf3224e&Status=APPROVED.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LinkedTransaction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This will always be BILLABLEEXPENSE. More types may be added in future.
   * @return type
  **/
  @ApiModelProperty(value = "This will always be BILLABLEEXPENSE. More types may be added in future.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LinkedTransaction updatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * The last modified date in UTC format
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "The last modified date in UTC format")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public LinkedTransaction sourceTransactionTypeCode(String sourceTransactionTypeCode) {
    this.sourceTransactionTypeCode = sourceTransactionTypeCode;
    return this;
  }

   /**
   * The Type of the source tranasction. This will be ACCPAY if the linked transaction was created from an invoice and SPEND if it was created from a bank transaction.
   * @return sourceTransactionTypeCode
  **/
  @ApiModelProperty(value = "The Type of the source tranasction. This will be ACCPAY if the linked transaction was created from an invoice and SPEND if it was created from a bank transaction.")
  public String getSourceTransactionTypeCode() {
    return sourceTransactionTypeCode;
  }

  public void setSourceTransactionTypeCode(String sourceTransactionTypeCode) {
    this.sourceTransactionTypeCode = sourceTransactionTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedTransaction linkedTransaction = (LinkedTransaction) o;
    return Objects.equals(this.sourceTransactionID, linkedTransaction.sourceTransactionID) &&
        Objects.equals(this.sourceLineItemID, linkedTransaction.sourceLineItemID) &&
        Objects.equals(this.contactID, linkedTransaction.contactID) &&
        Objects.equals(this.targetTransactionID, linkedTransaction.targetTransactionID) &&
        Objects.equals(this.targetLineItemID, linkedTransaction.targetLineItemID) &&
        Objects.equals(this.linkedTransactionID, linkedTransaction.linkedTransactionID) &&
        Objects.equals(this.status, linkedTransaction.status) &&
        Objects.equals(this.type, linkedTransaction.type) &&
        Objects.equals(this.updatedDateUTC, linkedTransaction.updatedDateUTC) &&
        Objects.equals(this.sourceTransactionTypeCode, linkedTransaction.sourceTransactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceTransactionID, sourceLineItemID, contactID, targetTransactionID, targetLineItemID, linkedTransactionID, status, type, updatedDateUTC, sourceTransactionTypeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedTransaction {\n");
    
    sb.append("    sourceTransactionID: ").append(toIndentedString(sourceTransactionID)).append("\n");
    sb.append("    sourceLineItemID: ").append(toIndentedString(sourceLineItemID)).append("\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    targetTransactionID: ").append(toIndentedString(targetTransactionID)).append("\n");
    sb.append("    targetLineItemID: ").append(toIndentedString(targetLineItemID)).append("\n");
    sb.append("    linkedTransactionID: ").append(toIndentedString(linkedTransactionID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    sourceTransactionTypeCode: ").append(toIndentedString(sourceTransactionTypeCode)).append("\n");
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

