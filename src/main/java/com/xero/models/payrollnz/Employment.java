/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.4.3
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
import org.threeten.bp.LocalDate;

/** Employment */
public class Employment {
  StringUtil util = new StringUtil();

  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("payRunCalendarID")
  private UUID payRunCalendarID;

  @JsonProperty("startDate")
  private LocalDate startDate;

  public Employment payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

  /**
   * Xero unique identifier for the payroll calendar of the employee
   *
   * @return payrollCalendarID
   */
  @ApiModelProperty(value = "Xero unique identifier for the payroll calendar of the employee")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public Employment payRunCalendarID(UUID payRunCalendarID) {
    this.payRunCalendarID = payRunCalendarID;
    return this;
  }

  /**
   * Xero unique identifier for the payrun calendar for the employee (Deprecated in version 1.1.6)
   *
   * @return payRunCalendarID
   */
  @ApiModelProperty(
      value =
          "Xero unique identifier for the payrun calendar for the employee (Deprecated in version"
              + " 1.1.6)")
  public UUID getPayRunCalendarID() {
    return payRunCalendarID;
  }

  public void setPayRunCalendarID(UUID payRunCalendarID) {
    this.payRunCalendarID = payRunCalendarID;
  }

  public Employment startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the employment (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(value = "Start date of the employment (YYYY-MM-DD)")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employment employment = (Employment) o;
    return Objects.equals(this.payrollCalendarID, employment.payrollCalendarID)
        && Objects.equals(this.payRunCalendarID, employment.payRunCalendarID)
        && Objects.equals(this.startDate, employment.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollCalendarID, payRunCalendarID, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employment {\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    payRunCalendarID: ").append(toIndentedString(payRunCalendarID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
