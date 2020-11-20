/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The reimbursement type lines */
@ApiModel(description = "The reimbursement type lines")
public class ReimbursementLines {
  StringUtil util = new StringUtil();

  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  public ReimbursementLines reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  public ReimbursementLines addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

  /**
   * Get reimbursementLines
   *
   * @return reimbursementLines
   */
  @ApiModelProperty(value = "")
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReimbursementLines reimbursementLines = (ReimbursementLines) o;
    return Objects.equals(this.reimbursementLines, reimbursementLines.reimbursementLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementLines {\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
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
