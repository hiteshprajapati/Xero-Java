/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.4.3
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EmployeeLeaveTypeObject */
public class EmployeeLeaveTypeObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("leaveType")
  private EmployeeLeaveType leaveType;

  public EmployeeLeaveTypeObject pagination(Pagination pagination) {
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

  public EmployeeLeaveTypeObject problem(Problem problem) {
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

  public EmployeeLeaveTypeObject leaveType(EmployeeLeaveType leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * Get leaveType
   *
   * @return leaveType
   */
  @ApiModelProperty(value = "")
  public EmployeeLeaveType getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(EmployeeLeaveType leaveType) {
    this.leaveType = leaveType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaveTypeObject employeeLeaveTypeObject = (EmployeeLeaveTypeObject) o;
    return Objects.equals(this.pagination, employeeLeaveTypeObject.pagination)
        && Objects.equals(this.problem, employeeLeaveTypeObject.problem)
        && Objects.equals(this.leaveType, employeeLeaveTypeObject.leaveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, leaveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveTypeObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
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
