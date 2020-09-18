/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.15
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

/** Payslip */
public class Payslip {
  StringUtil util = new StringUtil();

  @JsonProperty("paySlipID")
  private UUID paySlipID;

  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("payRunID")
  private UUID payRunID;

  @JsonProperty("lastEdited")
  private LocalDateTime lastEdited;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("totalEarnings")
  private Double totalEarnings;

  @JsonProperty("grossEarnings")
  private Double grossEarnings;

  @JsonProperty("totalPay")
  private Double totalPay;

  @JsonProperty("totalEmployerTaxes")
  private Double totalEmployerTaxes;

  @JsonProperty("totalEmployeeTaxes")
  private Double totalEmployeeTaxes;

  @JsonProperty("totalDeductions")
  private Double totalDeductions;

  @JsonProperty("totalReimbursements")
  private Double totalReimbursements;

  @JsonProperty("totalCourtOrders")
  private Double totalCourtOrders;

  @JsonProperty("totalBenefits")
  private Double totalBenefits;

  @JsonProperty("bacsHash")
  private String bacsHash;
  /** The payment method code */
  public enum PaymentMethodEnum {
    CHEQUE("Cheque"),

    ELECTRONICALLY("Electronically"),

    MANUAL("Manual");

    private String value;

    PaymentMethodEnum(String value) {
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
    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("paymentMethod")
  private PaymentMethodEnum paymentMethod;

  @JsonProperty("earningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("leaveEarningsLines")
  private List<LeaveEarningsLine> leaveEarningsLines = new ArrayList<LeaveEarningsLine>();

  @JsonProperty("timesheetEarningsLines")
  private List<TimesheetEarningsLine> timesheetEarningsLines =
      new ArrayList<TimesheetEarningsLine>();

  @JsonProperty("deductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  @JsonProperty("reimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  @JsonProperty("leaveAccrualLines")
  private List<LeaveAccrualLine> leaveAccrualLines = new ArrayList<LeaveAccrualLine>();

  @JsonProperty("benefitLines")
  private List<BenefitLine> benefitLines = new ArrayList<BenefitLine>();

  @JsonProperty("paymentLines")
  private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

  @JsonProperty("employeeTaxLines")
  private List<TaxLine> employeeTaxLines = new ArrayList<TaxLine>();

  @JsonProperty("courtOrderLines")
  private List<CourtOrderLine> courtOrderLines = new ArrayList<CourtOrderLine>();

  public Payslip paySlipID(UUID paySlipID) {
    this.paySlipID = paySlipID;
    return this;
  }

  /**
   * The Xero identifier for a Payslip
   *
   * @return paySlipID
   */
  @ApiModelProperty(value = "The Xero identifier for a Payslip")
  public UUID getPaySlipID() {
    return paySlipID;
  }

  public void setPaySlipID(UUID paySlipID) {
    this.paySlipID = paySlipID;
  }

  public Payslip employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for payroll employee
   *
   * @return employeeID
   */
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Payslip payRunID(UUID payRunID) {
    this.payRunID = payRunID;
    return this;
  }

  /**
   * The Xero identifier for the associated payrun
   *
   * @return payRunID
   */
  @ApiModelProperty(value = "The Xero identifier for the associated payrun")
  public UUID getPayRunID() {
    return payRunID;
  }

  public void setPayRunID(UUID payRunID) {
    this.payRunID = payRunID;
  }

  public Payslip lastEdited(LocalDateTime lastEdited) {
    this.lastEdited = lastEdited;
    return this;
  }

  /**
   * The date payslip was last updated
   *
   * @return lastEdited
   */
  @ApiModelProperty(value = "The date payslip was last updated")
  public LocalDateTime getLastEdited() {
    return lastEdited;
  }

  public void setLastEdited(LocalDateTime lastEdited) {
    this.lastEdited = lastEdited;
  }

  public Payslip firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Employee first name
   *
   * @return firstName
   */
  @ApiModelProperty(value = "Employee first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Payslip lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Employee last name
   *
   * @return lastName
   */
  @ApiModelProperty(value = "Employee last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Payslip totalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
    return this;
  }

  /**
   * Total earnings before any deductions. Same as gross earnings for UK.
   *
   * @return totalEarnings
   */
  @ApiModelProperty(value = "Total earnings before any deductions. Same as gross earnings for UK.")
  public Double getTotalEarnings() {
    return totalEarnings;
  }

  public void setTotalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public Payslip grossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
    return this;
  }

  /**
   * Total earnings before any deductions. Same as total earnings for UK.
   *
   * @return grossEarnings
   */
  @ApiModelProperty(value = "Total earnings before any deductions. Same as total earnings for UK.")
  public Double getGrossEarnings() {
    return grossEarnings;
  }

  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }

  public Payslip totalPay(Double totalPay) {
    this.totalPay = totalPay;
    return this;
  }

  /**
   * The employee net pay
   *
   * @return totalPay
   */
  @ApiModelProperty(value = "The employee net pay")
  public Double getTotalPay() {
    return totalPay;
  }

  public void setTotalPay(Double totalPay) {
    this.totalPay = totalPay;
  }

  public Payslip totalEmployerTaxes(Double totalEmployerTaxes) {
    this.totalEmployerTaxes = totalEmployerTaxes;
    return this;
  }

  /**
   * The employer&#39;s tax obligation
   *
   * @return totalEmployerTaxes
   */
  @ApiModelProperty(value = "The employer's tax obligation")
  public Double getTotalEmployerTaxes() {
    return totalEmployerTaxes;
  }

  public void setTotalEmployerTaxes(Double totalEmployerTaxes) {
    this.totalEmployerTaxes = totalEmployerTaxes;
  }

  public Payslip totalEmployeeTaxes(Double totalEmployeeTaxes) {
    this.totalEmployeeTaxes = totalEmployeeTaxes;
    return this;
  }

  /**
   * The part of an employee&#39;s earnings that is deducted for tax purposes
   *
   * @return totalEmployeeTaxes
   */
  @ApiModelProperty(value = "The part of an employee's earnings that is deducted for tax purposes")
  public Double getTotalEmployeeTaxes() {
    return totalEmployeeTaxes;
  }

  public void setTotalEmployeeTaxes(Double totalEmployeeTaxes) {
    this.totalEmployeeTaxes = totalEmployeeTaxes;
  }

  public Payslip totalDeductions(Double totalDeductions) {
    this.totalDeductions = totalDeductions;
    return this;
  }

  /**
   * Total amount subtracted from an employee&#39;s earnings to reach total pay
   *
   * @return totalDeductions
   */
  @ApiModelProperty(
      value = "Total amount subtracted from an employee's earnings to reach total pay")
  public Double getTotalDeductions() {
    return totalDeductions;
  }

  public void setTotalDeductions(Double totalDeductions) {
    this.totalDeductions = totalDeductions;
  }

  public Payslip totalReimbursements(Double totalReimbursements) {
    this.totalReimbursements = totalReimbursements;
    return this;
  }

  /**
   * Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket
   * expenses when the person incurs those expenses through employment
   *
   * @return totalReimbursements
   */
  @ApiModelProperty(
      value =
          "Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket"
              + " expenses when the person incurs those expenses through employment")
  public Double getTotalReimbursements() {
    return totalReimbursements;
  }

  public void setTotalReimbursements(Double totalReimbursements) {
    this.totalReimbursements = totalReimbursements;
  }

  public Payslip totalCourtOrders(Double totalCourtOrders) {
    this.totalCourtOrders = totalCourtOrders;
    return this;
  }

  /**
   * Total amounts required by law to subtract from the employee&#39;s earnings
   *
   * @return totalCourtOrders
   */
  @ApiModelProperty(
      value = "Total amounts required by law to subtract from the employee's earnings")
  public Double getTotalCourtOrders() {
    return totalCourtOrders;
  }

  public void setTotalCourtOrders(Double totalCourtOrders) {
    this.totalCourtOrders = totalCourtOrders;
  }

  public Payslip totalBenefits(Double totalBenefits) {
    this.totalBenefits = totalBenefits;
    return this;
  }

  /**
   * Benefits (also called fringe benefits, perquisites or perks) are various non-earnings
   * compensations provided to employees in addition to their normal earnings or salaries
   *
   * @return totalBenefits
   */
  @ApiModelProperty(
      value =
          "Benefits (also called fringe benefits, perquisites or perks) are various non-earnings"
              + " compensations provided to employees in addition to their normal earnings or"
              + " salaries")
  public Double getTotalBenefits() {
    return totalBenefits;
  }

  public void setTotalBenefits(Double totalBenefits) {
    this.totalBenefits = totalBenefits;
  }

  public Payslip bacsHash(String bacsHash) {
    this.bacsHash = bacsHash;
    return this;
  }

  /**
   * BACS Service User Number
   *
   * @return bacsHash
   */
  @ApiModelProperty(value = "BACS Service User Number")
  public String getBacsHash() {
    return bacsHash;
  }

  public void setBacsHash(String bacsHash) {
    this.bacsHash = bacsHash;
  }

  public Payslip paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method code
   *
   * @return paymentMethod
   */
  @ApiModelProperty(value = "The payment method code")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Payslip earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  public Payslip addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

  /**
   * Get earningsLines
   *
   * @return earningsLines
   */
  @ApiModelProperty(value = "")
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  public Payslip leaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
    return this;
  }

  public Payslip addLeaveEarningsLinesItem(LeaveEarningsLine leaveEarningsLinesItem) {
    if (this.leaveEarningsLines == null) {
      this.leaveEarningsLines = new ArrayList<LeaveEarningsLine>();
    }
    this.leaveEarningsLines.add(leaveEarningsLinesItem);
    return this;
  }

  /**
   * Get leaveEarningsLines
   *
   * @return leaveEarningsLines
   */
  @ApiModelProperty(value = "")
  public List<LeaveEarningsLine> getLeaveEarningsLines() {
    return leaveEarningsLines;
  }

  public void setLeaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
  }

  public Payslip timesheetEarningsLines(List<TimesheetEarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
    return this;
  }

  public Payslip addTimesheetEarningsLinesItem(TimesheetEarningsLine timesheetEarningsLinesItem) {
    if (this.timesheetEarningsLines == null) {
      this.timesheetEarningsLines = new ArrayList<TimesheetEarningsLine>();
    }
    this.timesheetEarningsLines.add(timesheetEarningsLinesItem);
    return this;
  }

  /**
   * Get timesheetEarningsLines
   *
   * @return timesheetEarningsLines
   */
  @ApiModelProperty(value = "")
  public List<TimesheetEarningsLine> getTimesheetEarningsLines() {
    return timesheetEarningsLines;
  }

  public void setTimesheetEarningsLines(List<TimesheetEarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
  }

  public Payslip deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  public Payslip addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

  /**
   * Get deductionLines
   *
   * @return deductionLines
   */
  @ApiModelProperty(value = "")
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  public Payslip reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  public Payslip addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
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

  public Payslip leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
    return this;
  }

  public Payslip addLeaveAccrualLinesItem(LeaveAccrualLine leaveAccrualLinesItem) {
    if (this.leaveAccrualLines == null) {
      this.leaveAccrualLines = new ArrayList<LeaveAccrualLine>();
    }
    this.leaveAccrualLines.add(leaveAccrualLinesItem);
    return this;
  }

  /**
   * Get leaveAccrualLines
   *
   * @return leaveAccrualLines
   */
  @ApiModelProperty(value = "")
  public List<LeaveAccrualLine> getLeaveAccrualLines() {
    return leaveAccrualLines;
  }

  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
  }

  public Payslip benefitLines(List<BenefitLine> benefitLines) {
    this.benefitLines = benefitLines;
    return this;
  }

  public Payslip addBenefitLinesItem(BenefitLine benefitLinesItem) {
    if (this.benefitLines == null) {
      this.benefitLines = new ArrayList<BenefitLine>();
    }
    this.benefitLines.add(benefitLinesItem);
    return this;
  }

  /**
   * Get benefitLines
   *
   * @return benefitLines
   */
  @ApiModelProperty(value = "")
  public List<BenefitLine> getBenefitLines() {
    return benefitLines;
  }

  public void setBenefitLines(List<BenefitLine> benefitLines) {
    this.benefitLines = benefitLines;
  }

  public Payslip paymentLines(List<PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
    return this;
  }

  public Payslip addPaymentLinesItem(PaymentLine paymentLinesItem) {
    if (this.paymentLines == null) {
      this.paymentLines = new ArrayList<PaymentLine>();
    }
    this.paymentLines.add(paymentLinesItem);
    return this;
  }

  /**
   * Get paymentLines
   *
   * @return paymentLines
   */
  @ApiModelProperty(value = "")
  public List<PaymentLine> getPaymentLines() {
    return paymentLines;
  }

  public void setPaymentLines(List<PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
  }

  public Payslip employeeTaxLines(List<TaxLine> employeeTaxLines) {
    this.employeeTaxLines = employeeTaxLines;
    return this;
  }

  public Payslip addEmployeeTaxLinesItem(TaxLine employeeTaxLinesItem) {
    if (this.employeeTaxLines == null) {
      this.employeeTaxLines = new ArrayList<TaxLine>();
    }
    this.employeeTaxLines.add(employeeTaxLinesItem);
    return this;
  }

  /**
   * Get employeeTaxLines
   *
   * @return employeeTaxLines
   */
  @ApiModelProperty(value = "")
  public List<TaxLine> getEmployeeTaxLines() {
    return employeeTaxLines;
  }

  public void setEmployeeTaxLines(List<TaxLine> employeeTaxLines) {
    this.employeeTaxLines = employeeTaxLines;
  }

  public Payslip courtOrderLines(List<CourtOrderLine> courtOrderLines) {
    this.courtOrderLines = courtOrderLines;
    return this;
  }

  public Payslip addCourtOrderLinesItem(CourtOrderLine courtOrderLinesItem) {
    if (this.courtOrderLines == null) {
      this.courtOrderLines = new ArrayList<CourtOrderLine>();
    }
    this.courtOrderLines.add(courtOrderLinesItem);
    return this;
  }

  /**
   * Get courtOrderLines
   *
   * @return courtOrderLines
   */
  @ApiModelProperty(value = "")
  public List<CourtOrderLine> getCourtOrderLines() {
    return courtOrderLines;
  }

  public void setCourtOrderLines(List<CourtOrderLine> courtOrderLines) {
    this.courtOrderLines = courtOrderLines;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payslip payslip = (Payslip) o;
    return Objects.equals(this.paySlipID, payslip.paySlipID)
        && Objects.equals(this.employeeID, payslip.employeeID)
        && Objects.equals(this.payRunID, payslip.payRunID)
        && Objects.equals(this.lastEdited, payslip.lastEdited)
        && Objects.equals(this.firstName, payslip.firstName)
        && Objects.equals(this.lastName, payslip.lastName)
        && Objects.equals(this.totalEarnings, payslip.totalEarnings)
        && Objects.equals(this.grossEarnings, payslip.grossEarnings)
        && Objects.equals(this.totalPay, payslip.totalPay)
        && Objects.equals(this.totalEmployerTaxes, payslip.totalEmployerTaxes)
        && Objects.equals(this.totalEmployeeTaxes, payslip.totalEmployeeTaxes)
        && Objects.equals(this.totalDeductions, payslip.totalDeductions)
        && Objects.equals(this.totalReimbursements, payslip.totalReimbursements)
        && Objects.equals(this.totalCourtOrders, payslip.totalCourtOrders)
        && Objects.equals(this.totalBenefits, payslip.totalBenefits)
        && Objects.equals(this.bacsHash, payslip.bacsHash)
        && Objects.equals(this.paymentMethod, payslip.paymentMethod)
        && Objects.equals(this.earningsLines, payslip.earningsLines)
        && Objects.equals(this.leaveEarningsLines, payslip.leaveEarningsLines)
        && Objects.equals(this.timesheetEarningsLines, payslip.timesheetEarningsLines)
        && Objects.equals(this.deductionLines, payslip.deductionLines)
        && Objects.equals(this.reimbursementLines, payslip.reimbursementLines)
        && Objects.equals(this.leaveAccrualLines, payslip.leaveAccrualLines)
        && Objects.equals(this.benefitLines, payslip.benefitLines)
        && Objects.equals(this.paymentLines, payslip.paymentLines)
        && Objects.equals(this.employeeTaxLines, payslip.employeeTaxLines)
        && Objects.equals(this.courtOrderLines, payslip.courtOrderLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        paySlipID,
        employeeID,
        payRunID,
        lastEdited,
        firstName,
        lastName,
        totalEarnings,
        grossEarnings,
        totalPay,
        totalEmployerTaxes,
        totalEmployeeTaxes,
        totalDeductions,
        totalReimbursements,
        totalCourtOrders,
        totalBenefits,
        bacsHash,
        paymentMethod,
        earningsLines,
        leaveEarningsLines,
        timesheetEarningsLines,
        deductionLines,
        reimbursementLines,
        leaveAccrualLines,
        benefitLines,
        paymentLines,
        employeeTaxLines,
        courtOrderLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payslip {\n");
    sb.append("    paySlipID: ").append(toIndentedString(paySlipID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    lastEdited: ").append(toIndentedString(lastEdited)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    totalEmployerTaxes: ").append(toIndentedString(totalEmployerTaxes)).append("\n");
    sb.append("    totalEmployeeTaxes: ").append(toIndentedString(totalEmployeeTaxes)).append("\n");
    sb.append("    totalDeductions: ").append(toIndentedString(totalDeductions)).append("\n");
    sb.append("    totalReimbursements: ")
        .append(toIndentedString(totalReimbursements))
        .append("\n");
    sb.append("    totalCourtOrders: ").append(toIndentedString(totalCourtOrders)).append("\n");
    sb.append("    totalBenefits: ").append(toIndentedString(totalBenefits)).append("\n");
    sb.append("    bacsHash: ").append(toIndentedString(bacsHash)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    leaveEarningsLines: ").append(toIndentedString(leaveEarningsLines)).append("\n");
    sb.append("    timesheetEarningsLines: ")
        .append(toIndentedString(timesheetEarningsLines))
        .append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
    sb.append("    benefitLines: ").append(toIndentedString(benefitLines)).append("\n");
    sb.append("    paymentLines: ").append(toIndentedString(paymentLines)).append("\n");
    sb.append("    employeeTaxLines: ").append(toIndentedString(employeeTaxLines)).append("\n");
    sb.append("    courtOrderLines: ").append(toIndentedString(courtOrderLines)).append("\n");
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
