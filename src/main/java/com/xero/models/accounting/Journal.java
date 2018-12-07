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
import com.xero.models.accounting.JournalLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Journal
 */

public class Journal {
  
  @JsonProperty("JournalID")
  private UUID journalID = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("JournalDate")
  private LocalDate journalDate = null;

  
  @JsonProperty("JournalNumber")
  private String journalNumber = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC = null;

  
  @JsonProperty("Reference")
  private String reference = null;

  
  @JsonProperty("SourceID")
  private UUID sourceID = null;

  
  @JsonProperty("SourceType")
  private String sourceType = null;

  
  @JsonProperty("JournalLines")
  private List<JournalLine> journalLines = null;

  public Journal journalID(UUID journalID) {
    this.journalID = journalID;
    return this;
  }

   /**
   * Xero identifier
   * @return journalID
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getJournalID() {
    return journalID;
  }

  public void setJournalID(UUID journalID) {
    this.journalID = journalID;
  }

  public Journal journalDate(LocalDate journalDate) {
    this.journalDate = journalDate;
    return this;
  }

   /**
   * Date the journal was posted
   * @return journalDate
  **/
  @ApiModelProperty(value = "Date the journal was posted")
  public LocalDate getJournalDate() {
    return journalDate;
  }

  public void setJournalDate(LocalDate journalDate) {
    this.journalDate = journalDate;
  }

  public Journal journalNumber(String journalNumber) {
    this.journalNumber = journalNumber;
    return this;
  }

   /**
   * Xero generated journal number
   * @return journalNumber
  **/
  @ApiModelProperty(value = "Xero generated journal number")
  public String getJournalNumber() {
    return journalNumber;
  }

  public void setJournalNumber(String journalNumber) {
    this.journalNumber = journalNumber;
  }

   /**
   * Created date UTC format
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "Created date UTC format")
  public OffsetDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }

  public Journal reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * reference field for additional indetifying information
   * @return reference
  **/
  @ApiModelProperty(value = "reference field for additional indetifying information")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Journal sourceID(UUID sourceID) {
    this.sourceID = sourceID;
    return this;
  }

   /**
   * The identifier for the source transaction (e.g. InvoiceID)
   * @return sourceID
  **/
  @ApiModelProperty(value = "The identifier for the source transaction (e.g. InvoiceID)")
  public UUID getSourceID() {
    return sourceID;
  }

  public void setSourceID(UUID sourceID) {
    this.sourceID = sourceID;
  }

  public Journal sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The journal source type. The type of transaction that created the journal
   * @return sourceType
  **/
  @ApiModelProperty(value = "The journal source type. The type of transaction that created the journal")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Journal journalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
    return this;
  }

  public Journal addJournalLinesItem(JournalLine journalLinesItem) {
    if (this.journalLines == null) {
      this.journalLines = new ArrayList<JournalLine>();
    }
    this.journalLines.add(journalLinesItem);
    return this;
  }

   /**
   * See JournalLines
   * @return journalLines
  **/
  @ApiModelProperty(value = "See JournalLines")
  public List<JournalLine> getJournalLines() {
    return journalLines;
  }

  public void setJournalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.journalID, journal.journalID) &&
        Objects.equals(this.journalDate, journal.journalDate) &&
        Objects.equals(this.journalNumber, journal.journalNumber) &&
        Objects.equals(this.createdDateUTC, journal.createdDateUTC) &&
        Objects.equals(this.reference, journal.reference) &&
        Objects.equals(this.sourceID, journal.sourceID) &&
        Objects.equals(this.sourceType, journal.sourceType) &&
        Objects.equals(this.journalLines, journal.journalLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journalID, journalDate, journalNumber, createdDateUTC, reference, sourceID, sourceType, journalLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    
    sb.append("    journalID: ").append(toIndentedString(journalID)).append("\n");
    sb.append("    journalDate: ").append(toIndentedString(journalDate)).append("\n");
    sb.append("    journalNumber: ").append(toIndentedString(journalNumber)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    journalLines: ").append(toIndentedString(journalLines)).append("\n");
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

