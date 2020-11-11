/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/** HistoryRecord */
public class HistoryRecord {
  StringUtil util = new StringUtil();

  @JsonProperty("Details")
  private String details;

  @JsonProperty("Changes")
  private String changes;

  @JsonProperty("User")
  private String user;

  @JsonProperty("DateUTC")
  private String dateUTC;

  public HistoryRecord details(String details) {
    this.details = details;
    return this;
  }

  /**
   * details
   *
   * @return details
   */
  @ApiModelProperty(value = "details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public HistoryRecord changes(String changes) {
    this.changes = changes;
    return this;
  }

  /**
   * Name of branding theme
   *
   * @return changes
   */
  @ApiModelProperty(value = "Name of branding theme")
  public String getChanges() {
    return changes;
  }

  public void setChanges(String changes) {
    this.changes = changes;
  }

  public HistoryRecord user(String user) {
    this.user = user;
    return this;
  }

  /**
   * has a value of 0
   *
   * @return user
   */
  @ApiModelProperty(value = "has a value of 0")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  /**
   * UTC timestamp of creation date of branding theme
   *
   * @return dateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of creation date of branding theme")
  public String getDateUTC() {
    return dateUTC;
  }

  public OffsetDateTime getDateUTCAsDate() {
    if (this.dateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.dateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryRecord historyRecord = (HistoryRecord) o;
    return Objects.equals(this.details, historyRecord.details)
        && Objects.equals(this.changes, historyRecord.changes)
        && Objects.equals(this.user, historyRecord.user)
        && Objects.equals(this.dateUTC, historyRecord.dateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, changes, user, dateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryRecord {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dateUTC: ").append(toIndentedString(dateUTC)).append("\n");
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
