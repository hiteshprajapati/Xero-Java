/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.5
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
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ExternalLink
 */

public class ExternalLink {
  StringUtil util = new StringUtil();
  /**
   * See External link types
   */
  public enum LinkTypeEnum {
    FACEBOOK("Facebook"),
    
    GOOGLEPLUS("GooglePlus"),
    
    LINKEDIN("LinkedIn"),
    
    TWITTER("Twitter"),
    
    WEBSITE("Website");

    private String value;

    LinkTypeEnum(String value) {
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
    public static LinkTypeEnum fromValue(String value) {
      for (LinkTypeEnum b : LinkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("LinkType")
  private LinkTypeEnum linkType;

  
  @JsonProperty("Url")
  private String url;

  
  @JsonProperty("Description")
  private String description;
  public ExternalLink linkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * See External link types
   * @return linkType
  **/
  @ApiModelProperty(value = "See External link types")
  public LinkTypeEnum getLinkType() {
    return linkType;
  }

  public void setLinkType(LinkTypeEnum linkType) {
    this.linkType = linkType;
  }

  public ExternalLink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL for service e.g. http://twitter.com/xeroapi
   * @return url
  **/
  @ApiModelProperty(value = "URL for service e.g. http://twitter.com/xeroapi")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ExternalLink description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLink externalLink = (ExternalLink) o;
    return Objects.equals(this.linkType, externalLink.linkType) &&
        Objects.equals(this.url, externalLink.url) &&
        Objects.equals(this.description, externalLink.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkType, url, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalLink {\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

