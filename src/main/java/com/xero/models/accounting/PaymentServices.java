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
import com.xero.models.accounting.PaymentService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PaymentServices
 */

public class PaymentServices {

  
  @JsonProperty("PaymentServices")
  private List<PaymentService> paymentServices = new ArrayList<PaymentService>();
  public PaymentServices paymentServices(List<PaymentService> paymentServices) {
    this.paymentServices = paymentServices;
    return this;
  }

  public PaymentServices addPaymentServicesItem(PaymentService paymentServicesItem) {
    if (this.paymentServices == null) {
      this.paymentServices = new ArrayList<PaymentService>();
    }
    this.paymentServices.add(paymentServicesItem);
    return this;
  }

   /**
   * Get paymentServices
   * @return paymentServices
  **/
  @ApiModelProperty(value = "")
  public List<PaymentService> getPaymentServices() {
    return paymentServices;
  }

  public void setPaymentServices(List<PaymentService> paymentServices) {
    this.paymentServices = paymentServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServices paymentServices = (PaymentServices) o;
    return Objects.equals(this.paymentServices, paymentServices.paymentServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServices {\n");
    sb.append("    paymentServices: ").append(toIndentedString(paymentServices)).append("\n");
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

