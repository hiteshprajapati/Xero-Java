/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.appstore;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** Product */
public class Product {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
  /**
   * The pricing model of the product: * FIXED: Customers are charged a fixed amount for each
   * billing period * PER_SEAT: Customers are charged based on the number of units they purchase
   */
  public enum TypeEnum {
    /** FIXED */
    FIXED("FIXED"),

    /** PER_SEAT */
    PER_SEAT("PER_SEAT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;
  /**
   * The unique identifier for the product
   *
   * @param id UUID
   * @return Product
   */
  public Product id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the product
   *
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier for the product")
  /**
   * The unique identifier for the product
   *
   * @return id UUID
   */
  public UUID getId() {
    return id;
  }

  /**
   * The unique identifier for the product
   *
   * @param id UUID
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * The name of the product
   *
   * @param name String
   * @return Product
   */
  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the product
   *
   * @return name
   */
  @ApiModelProperty(value = "The name of the product")
  /**
   * The name of the product
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * The name of the product
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The pricing model of the product: * FIXED: Customers are charged a fixed amount for each
   * billing period * PER_SEAT: Customers are charged based on the number of units they purchase
   *
   * @param type TypeEnum
   * @return Product
   */
  public Product type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The pricing model of the product: * FIXED: Customers are charged a fixed amount for each
   * billing period * PER_SEAT: Customers are charged based on the number of units they purchase
   *
   * @return type
   */
  @ApiModelProperty(
      value =
          "The pricing model of the product: * FIXED: Customers are charged a fixed amount for"
              + " each billing period * PER_SEAT: Customers are charged based on the number of"
              + " units they purchase ")
  /**
   * The pricing model of the product: * FIXED: Customers are charged a fixed amount for each
   * billing period * PER_SEAT: Customers are charged based on the number of units they purchase
   *
   * @return type TypeEnum
   */
  public TypeEnum getType() {
    return type;
  }

  /**
   * The pricing model of the product: * FIXED: Customers are charged a fixed amount for each
   * billing period * PER_SEAT: Customers are charged based on the number of units they purchase
   *
   * @param type TypeEnum
   */
  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id)
        && Objects.equals(this.name, product.name)
        && Objects.equals(this.type, product.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
