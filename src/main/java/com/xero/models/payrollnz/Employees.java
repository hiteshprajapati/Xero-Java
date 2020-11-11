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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Employees */
public class Employees {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("employees")
  private List<Employee> employees = new ArrayList<Employee>();

  public Employees pagination(Pagination pagination) {
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

  public Employees problem(Problem problem) {
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

  public Employees employees(List<Employee> employees) {
    this.employees = employees;
    return this;
  }

  public Employees addEmployeesItem(Employee employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<Employee>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   *
   * @return employees
   */
  @ApiModelProperty(value = "")
  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employees employees = (Employees) o;
    return Objects.equals(this.pagination, employees.pagination)
        && Objects.equals(this.problem, employees.problem)
        && Objects.equals(this.employees, employees.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employees {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
