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
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LineItemTracking
 */

public class LineItemTracking {

  
  @JsonProperty("TrackingCategoryID")
  private UUID trackingCategoryID;

  
  @JsonProperty("TrackingOptionID")
  private UUID trackingOptionID;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("Option")
  private String option;
  public LineItemTracking trackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
    return this;
  }

   /**
   * The Xero identifier for a tracking category
   * @return trackingCategoryID
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The Xero identifier for a tracking category")
  public UUID getTrackingCategoryID() {
    return trackingCategoryID;
  }

  public void setTrackingCategoryID(UUID trackingCategoryID) {
    this.trackingCategoryID = trackingCategoryID;
  }

  public LineItemTracking trackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
    return this;
  }

   /**
   * The Xero identifier for a tracking category option
   * @return trackingOptionID
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The Xero identifier for a tracking category option")
  public UUID getTrackingOptionID() {
    return trackingOptionID;
  }

  public void setTrackingOptionID(UUID trackingOptionID) {
    this.trackingOptionID = trackingOptionID;
  }

  public LineItemTracking name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tracking category
   * @return name
  **/
  @ApiModelProperty(example = "Region", value = "The name of the tracking category")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LineItemTracking option(String option) {
    this.option = option;
    return this;
  }

   /**
   * See Tracking Options
   * @return option
  **/
  @ApiModelProperty(example = "North", value = "See Tracking Options")
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemTracking lineItemTracking = (LineItemTracking) o;
    return Objects.equals(this.trackingCategoryID, lineItemTracking.trackingCategoryID) &&
        Objects.equals(this.trackingOptionID, lineItemTracking.trackingOptionID) &&
        Objects.equals(this.name, lineItemTracking.name) &&
        Objects.equals(this.option, lineItemTracking.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingCategoryID, trackingOptionID, name, option);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemTracking {\n");
    sb.append("    trackingCategoryID: ").append(toIndentedString(trackingCategoryID)).append("\n");
    sb.append("    trackingOptionID: ").append(toIndentedString(trackingOptionID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

