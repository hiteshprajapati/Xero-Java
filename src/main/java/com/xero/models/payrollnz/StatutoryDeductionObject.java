/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.2.15
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

/** StatutoryDeductionObject */
public class StatutoryDeductionObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("statutoryDeduction")
  private StatutoryDeduction statutoryDeduction;

  public StatutoryDeductionObject pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public StatutoryDeductionObject problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public StatutoryDeductionObject statutoryDeduction(StatutoryDeduction statutoryDeduction) {
    this.statutoryDeduction = statutoryDeduction;
    return this;
  }

  /**
   * Get statutoryDeduction
   *
   * @return statutoryDeduction
   */
  @ApiModelProperty(value = "")
  public StatutoryDeduction getStatutoryDeduction() {
    return statutoryDeduction;
  }

  public void setStatutoryDeduction(StatutoryDeduction statutoryDeduction) {
    this.statutoryDeduction = statutoryDeduction;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDeductionObject statutoryDeductionObject = (StatutoryDeductionObject) o;
    return Objects.equals(this.pagination, statutoryDeductionObject.pagination)
        && Objects.equals(this.problem, statutoryDeductionObject.problem)
        && Objects.equals(this.statutoryDeduction, statutoryDeductionObject.statutoryDeduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, statutoryDeduction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeductionObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    statutoryDeduction: ").append(toIndentedString(statutoryDeduction)).append("\n");
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
