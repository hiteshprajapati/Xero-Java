/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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
import com.xero.models.accounting.Address;
import com.xero.models.accounting.ExternalLink;
import com.xero.models.accounting.PaymentTerm;
import com.xero.models.accounting.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Organisation
 */

public class Organisation {
  
  @JsonProperty("APIKey")
  private String apIKey = null;

  
  @JsonProperty("Name")
  private String name = null;

  
  @JsonProperty("LegalName")
  private String legalName = null;

  
  @JsonProperty("PaysTax")
  private Boolean paysTax = null;

  /**
   * See Version Types
   */
  public enum VersionEnum {
    AU("AU"),
    
    NZ("NZ"),
    
    GLOBAL("GLOBAL"),
    
    UK("UK"),
    
    US("US"),
    
    AUONRAMP("AUONRAMP"),
    
    NZONRAMP("NZONRAMP"),
    
    GLOBALONRAMP("GLOBALONRAMP"),
    
    UKONRAMP("UKONRAMP"),
    
    USONRAMP("USONRAMP");

    private String value;

    VersionEnum(String value) {
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
    public static VersionEnum fromValue(String text) {
      for (VersionEnum b : VersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Version")
  private VersionEnum version = null;

  /**
   * Organisation Type
   */
  public enum OrganisationTypeEnum {
    COMPANY("COMPANY"),
    
    CHARITY("CHARITY"),
    
    CLUBSOCIETY("CLUBSOCIETY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    PRACTICE("PRACTICE"),
    
    PERSON("PERSON"),
    
    SOLETRADER("SOLETRADER"),
    
    TRUST("TRUST");

    private String value;

    OrganisationTypeEnum(String value) {
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
    public static OrganisationTypeEnum fromValue(String text) {
      for (OrganisationTypeEnum b : OrganisationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("OrganisationType")
  private OrganisationTypeEnum organisationType = null;

  
  @JsonProperty("BaseCurrency")
  private String baseCurrency = null;

  
  @JsonProperty("CountryCode")
  private String countryCode = null;

  
  @JsonProperty("IsDemoCompany")
  private Boolean isDemoCompany = null;

  
  @JsonProperty("OrganisationStatus")
  private String organisationStatus = null;

  
  @JsonProperty("RegistrationNumber")
  private String registrationNumber = null;

  
  @JsonProperty("TaxNumber")
  private String taxNumber = null;

  
  @JsonProperty("FinancialYearEndDay")
  private Integer financialYearEndDay = null;

  
  @JsonProperty("FinancialYearEndMonth")
  private Integer financialYearEndMonth = null;

  /**
   * The accounting basis used for tax returns. See Sales Tax Basis
   */
  public enum SalesTaxBasisEnum {
    PAYMENTS("PAYMENTS"),
    
    INVOICE("INVOICE"),
    
    NONE("NONE"),
    
    CASH("CASH"),
    
    ACCRUAL("ACCRUAL"),
    
    FLATRATECASH("FLATRATECASH"),
    
    FLATRATEACCRUAL("FLATRATEACCRUAL"),
    
    ACCRUALS("ACCRUALS");

    private String value;

    SalesTaxBasisEnum(String value) {
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
    public static SalesTaxBasisEnum fromValue(String text) {
      for (SalesTaxBasisEnum b : SalesTaxBasisEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("SalesTaxBasis")
  private SalesTaxBasisEnum salesTaxBasis = null;

  /**
   * The frequency with which tax returns are processed. See Sales Tax Period
   */
  public enum SalesTaxPeriodEnum {
    MONTHLY("MONTHLY"),
    
    QUARTERLY1("QUARTERLY1"),
    
    QUARTERLY2("QUARTERLY2"),
    
    QUARTERLY3("QUARTERLY3"),
    
    ANNUALLY("ANNUALLY"),
    
    ONEMONTHS("ONEMONTHS"),
    
    TWOMONTHS("TWOMONTHS"),
    
    SIXMONTHS("SIXMONTHS"),
    
    _1MONTHLY("1MONTHLY"),
    
    _2MONTHLY("2MONTHLY"),
    
    _3MONTHLY("3MONTHLY"),
    
    _6MONTHLY("6MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    YEARLY("YEARLY");

    private String value;

    SalesTaxPeriodEnum(String value) {
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
    public static SalesTaxPeriodEnum fromValue(String text) {
      for (SalesTaxPeriodEnum b : SalesTaxPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("SalesTaxPeriod")
  private SalesTaxPeriodEnum salesTaxPeriod = null;

  
  @JsonProperty("DefaultSalesTax")
  private String defaultSalesTax = null;

  
  @JsonProperty("DefaultPurchasesTax")
  private String defaultPurchasesTax = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("PeriodLockDate")
  private LocalDate periodLockDate = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("EndOfYearLockDate")
  private LocalDate endOfYearLockDate = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC = null;

  
  @JsonProperty("Timezone")
  private String timezone = null;

  /**
   * Organisation Type
   */
  public enum OrganisationEntityTypeEnum {
    COMPANY("COMPANY"),
    
    CHARITY("CHARITY"),
    
    CLUBSOCIETY("CLUBSOCIETY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    PRACTICE("PRACTICE"),
    
    PERSON("PERSON"),
    
    SOLETRADER("SOLETRADER"),
    
    TRUST("TRUST");

    private String value;

    OrganisationEntityTypeEnum(String value) {
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
    public static OrganisationEntityTypeEnum fromValue(String text) {
      for (OrganisationEntityTypeEnum b : OrganisationEntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("OrganisationEntityType")
  private OrganisationEntityTypeEnum organisationEntityType = null;

  
  @JsonProperty("ShortCode")
  private String shortCode = null;

  /**
   * Organisation Classes describe which plan the Xero organisation is on (e.g. DEMO, TRIAL, PREMIUM)
   */
  public enum PropertyClassEnum {
    DEMO("DEMO"),
    
    TRIAL("TRIAL"),
    
    STARTER("STARTER"),
    
    STANDARD("STANDARD"),
    
    PREMIUM("PREMIUM"),
    
    PREMIUM_20("PREMIUM_20"),
    
    PREMIUM_50("PREMIUM_50"),
    
    PREMIUM_100("PREMIUM_100"),
    
    LEDGER("LEDGER"),
    
    GST_CASHBOOK("GST_CASHBOOK"),
    
    NON_GST_CASHBOOK("NON_GST_CASHBOOK");

    private String value;

    PropertyClassEnum(String value) {
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
    public static PropertyClassEnum fromValue(String text) {
      for (PropertyClassEnum b : PropertyClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Class")
  private PropertyClassEnum propertyClass = null;

  
  @JsonProperty("LineOfBusiness")
  private String lineOfBusiness = null;

  
  @JsonProperty("Addresses")
  private List<Address> addresses = null;

  
  @JsonProperty("Phones")
  private List<Phone> phones = null;

  
  @JsonProperty("ExternalLinks")
  private List<ExternalLink> externalLinks = null;

  
  @JsonProperty("PaymentTerms")
  private PaymentTerm paymentTerms = null;

  public Organisation apIKey(String apIKey) {
    this.apIKey = apIKey;
    return this;
  }

   /**
   * Display a unique key used for Xero-to-Xero transactions
   * @return apIKey
  **/
  @ApiModelProperty(value = "Display a unique key used for Xero-to-Xero transactions")
  public String getApIKey() {
    return apIKey;
  }

  public void setApIKey(String apIKey) {
    this.apIKey = apIKey;
  }

  public Organisation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of organisation shown in Xero
   * @return name
  **/
  @ApiModelProperty(value = "Display name of organisation shown in Xero")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organisation legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * Organisation name shown on Reports
   * @return legalName
  **/
  @ApiModelProperty(value = "Organisation name shown on Reports")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Organisation paysTax(Boolean paysTax) {
    this.paysTax = paysTax;
    return this;
  }

   /**
   * Boolean to describe if organisation is registered with a local tax authority i.e. true, false
   * @return paysTax
  **/
  @ApiModelProperty(value = "Boolean to describe if organisation is registered with a local tax authority i.e. true, false")
  public Boolean getPaysTax() {
    return paysTax;
  }

  public void setPaysTax(Boolean paysTax) {
    this.paysTax = paysTax;
  }

  public Organisation version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * See Version Types
   * @return version
  **/
  @ApiModelProperty(value = "See Version Types")
  public VersionEnum getVersion() {
    return version;
  }

  public void setVersion(VersionEnum version) {
    this.version = version;
  }

  public Organisation organisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
    return this;
  }

   /**
   * Organisation Type
   * @return organisationType
  **/
  @ApiModelProperty(value = "Organisation Type")
  public OrganisationTypeEnum getOrganisationType() {
    return organisationType;
  }

  public void setOrganisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
  }

  public Organisation baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Default currency for organisation. See ISO 4217 Currency Codes
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "Default currency for organisation. See ISO 4217 Currency Codes")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public Organisation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code for organisation. See ISO 3166-2 Country Codes
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code for organisation. See ISO 3166-2 Country Codes")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Organisation isDemoCompany(Boolean isDemoCompany) {
    this.isDemoCompany = isDemoCompany;
    return this;
  }

   /**
   * Boolean to describe if organisation is a demo company.
   * @return isDemoCompany
  **/
  @ApiModelProperty(value = "Boolean to describe if organisation is a demo company.")
  public Boolean getIsDemoCompany() {
    return isDemoCompany;
  }

  public void setIsDemoCompany(Boolean isDemoCompany) {
    this.isDemoCompany = isDemoCompany;
  }

  public Organisation organisationStatus(String organisationStatus) {
    this.organisationStatus = organisationStatus;
    return this;
  }

   /**
   * Will be set to ACTIVE if you can connect to organisation via the Xero API
   * @return organisationStatus
  **/
  @ApiModelProperty(value = "Will be set to ACTIVE if you can connect to organisation via the Xero API")
  public String getOrganisationStatus() {
    return organisationStatus;
  }

  public void setOrganisationStatus(String organisationStatus) {
    this.organisationStatus = organisationStatus;
  }

  public Organisation registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Shows for New Zealand, Australian and UK organisations
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "Shows for New Zealand, Australian and UK organisations")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public Organisation taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Shown if set. Displays in the Xero UI as Tax File Number (AU), GST Number (NZ), VAT Number (UK) and Tax ID Number (US &amp; Global).
   * @return taxNumber
  **/
  @ApiModelProperty(value = "Shown if set. Displays in the Xero UI as Tax File Number (AU), GST Number (NZ), VAT Number (UK) and Tax ID Number (US & Global).")
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public Organisation financialYearEndDay(Integer financialYearEndDay) {
    this.financialYearEndDay = financialYearEndDay;
    return this;
  }

   /**
   * Calendar day e.g. 0-31
   * @return financialYearEndDay
  **/
  @ApiModelProperty(value = "Calendar day e.g. 0-31")
  public Integer getFinancialYearEndDay() {
    return financialYearEndDay;
  }

  public void setFinancialYearEndDay(Integer financialYearEndDay) {
    this.financialYearEndDay = financialYearEndDay;
  }

  public Organisation financialYearEndMonth(Integer financialYearEndMonth) {
    this.financialYearEndMonth = financialYearEndMonth;
    return this;
  }

   /**
   * Calendar Month e.g. 1-12
   * @return financialYearEndMonth
  **/
  @ApiModelProperty(value = "Calendar Month e.g. 1-12")
  public Integer getFinancialYearEndMonth() {
    return financialYearEndMonth;
  }

  public void setFinancialYearEndMonth(Integer financialYearEndMonth) {
    this.financialYearEndMonth = financialYearEndMonth;
  }

  public Organisation salesTaxBasis(SalesTaxBasisEnum salesTaxBasis) {
    this.salesTaxBasis = salesTaxBasis;
    return this;
  }

   /**
   * The accounting basis used for tax returns. See Sales Tax Basis
   * @return salesTaxBasis
  **/
  @ApiModelProperty(value = "The accounting basis used for tax returns. See Sales Tax Basis")
  public SalesTaxBasisEnum getSalesTaxBasis() {
    return salesTaxBasis;
  }

  public void setSalesTaxBasis(SalesTaxBasisEnum salesTaxBasis) {
    this.salesTaxBasis = salesTaxBasis;
  }

  public Organisation salesTaxPeriod(SalesTaxPeriodEnum salesTaxPeriod) {
    this.salesTaxPeriod = salesTaxPeriod;
    return this;
  }

   /**
   * The frequency with which tax returns are processed. See Sales Tax Period
   * @return salesTaxPeriod
  **/
  @ApiModelProperty(value = "The frequency with which tax returns are processed. See Sales Tax Period")
  public SalesTaxPeriodEnum getSalesTaxPeriod() {
    return salesTaxPeriod;
  }

  public void setSalesTaxPeriod(SalesTaxPeriodEnum salesTaxPeriod) {
    this.salesTaxPeriod = salesTaxPeriod;
  }

  public Organisation defaultSalesTax(String defaultSalesTax) {
    this.defaultSalesTax = defaultSalesTax;
    return this;
  }

   /**
   * The default for LineAmountTypes on sales transactions
   * @return defaultSalesTax
  **/
  @ApiModelProperty(value = "The default for LineAmountTypes on sales transactions")
  public String getDefaultSalesTax() {
    return defaultSalesTax;
  }

  public void setDefaultSalesTax(String defaultSalesTax) {
    this.defaultSalesTax = defaultSalesTax;
  }

  public Organisation defaultPurchasesTax(String defaultPurchasesTax) {
    this.defaultPurchasesTax = defaultPurchasesTax;
    return this;
  }

   /**
   * The default for LineAmountTypes on purchase transactions
   * @return defaultPurchasesTax
  **/
  @ApiModelProperty(value = "The default for LineAmountTypes on purchase transactions")
  public String getDefaultPurchasesTax() {
    return defaultPurchasesTax;
  }

  public void setDefaultPurchasesTax(String defaultPurchasesTax) {
    this.defaultPurchasesTax = defaultPurchasesTax;
  }

  public Organisation periodLockDate(LocalDate periodLockDate) {
    this.periodLockDate = periodLockDate;
    return this;
  }

   /**
   * Shown if set. See lock dates
   * @return periodLockDate
  **/
  @ApiModelProperty(value = "Shown if set. See lock dates")
  public LocalDate getPeriodLockDate() {
    return periodLockDate;
  }

  public void setPeriodLockDate(LocalDate periodLockDate) {
    this.periodLockDate = periodLockDate;
  }

  public Organisation endOfYearLockDate(LocalDate endOfYearLockDate) {
    this.endOfYearLockDate = endOfYearLockDate;
    return this;
  }

   /**
   * Shown if set. See lock dates
   * @return endOfYearLockDate
  **/
  @ApiModelProperty(value = "Shown if set. See lock dates")
  public LocalDate getEndOfYearLockDate() {
    return endOfYearLockDate;
  }

  public void setEndOfYearLockDate(LocalDate endOfYearLockDate) {
    this.endOfYearLockDate = endOfYearLockDate;
  }

  public Organisation createdDateUTC(OffsetDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
    return this;
  }

   /**
   * Timestamp when the organisation was created in Xero
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "Timestamp when the organisation was created in Xero")
  public OffsetDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }

  public void setCreatedDateUTC(OffsetDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
  }

  public Organisation timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone specifications
   * @return timezone
  **/
  @ApiModelProperty(value = "Timezone specifications")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Organisation organisationEntityType(OrganisationEntityTypeEnum organisationEntityType) {
    this.organisationEntityType = organisationEntityType;
    return this;
  }

   /**
   * Organisation Type
   * @return organisationEntityType
  **/
  @ApiModelProperty(value = "Organisation Type")
  public OrganisationEntityTypeEnum getOrganisationEntityType() {
    return organisationEntityType;
  }

  public void setOrganisationEntityType(OrganisationEntityTypeEnum organisationEntityType) {
    this.organisationEntityType = organisationEntityType;
  }

  public Organisation shortCode(String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

   /**
   * A unique identifier for the organisation. Potential uses.
   * @return shortCode
  **/
  @ApiModelProperty(value = "A unique identifier for the organisation. Potential uses.")
  public String getShortCode() {
    return shortCode;
  }

  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  public Organisation propertyClass(PropertyClassEnum propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Organisation Classes describe which plan the Xero organisation is on (e.g. DEMO, TRIAL, PREMIUM)
   * @return propertyClass
  **/
  @ApiModelProperty(value = "Organisation Classes describe which plan the Xero organisation is on (e.g. DEMO, TRIAL, PREMIUM)")
  public PropertyClassEnum getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(PropertyClassEnum propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Organisation lineOfBusiness(String lineOfBusiness) {
    this.lineOfBusiness = lineOfBusiness;
    return this;
  }

   /**
   * Description of business type as defined in Organisation settings
   * @return lineOfBusiness
  **/
  @ApiModelProperty(value = "Description of business type as defined in Organisation settings")
  public String getLineOfBusiness() {
    return lineOfBusiness;
  }

  public void setLineOfBusiness(String lineOfBusiness) {
    this.lineOfBusiness = lineOfBusiness;
  }

  public Organisation addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Organisation addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Address details for organisation – see Addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "Address details for organisation – see Addresses")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Organisation phones(List<Phone> phones) {
    this.phones = phones;
    return this;
  }

  public Organisation addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Phone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Phones details for organisation – see Phones
   * @return phones
  **/
  @ApiModelProperty(value = "Phones details for organisation – see Phones")
  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public Organisation externalLinks(List<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public Organisation addExternalLinksItem(ExternalLink externalLinksItem) {
    if (this.externalLinks == null) {
      this.externalLinks = new ArrayList<ExternalLink>();
    }
    this.externalLinks.add(externalLinksItem);
    return this;
  }

   /**
   * Organisation profile links for popular services such as Facebook, Twitter, GooglePlus and LinkedIn. You can also add link to your website here. Shown if Organisation settings  is updated in Xero. See ExternalLinks below
   * @return externalLinks
  **/
  @ApiModelProperty(value = "Organisation profile links for popular services such as Facebook, Twitter, GooglePlus and LinkedIn. You can also add link to your website here. Shown if Organisation settings  is updated in Xero. See ExternalLinks below")
  public List<ExternalLink> getExternalLinks() {
    return externalLinks;
  }

  public void setExternalLinks(List<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
  }

  public Organisation paymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Get paymentTerms
   * @return paymentTerms
  **/
  @ApiModelProperty(value = "")
  public PaymentTerm getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.apIKey, organisation.apIKey) &&
        Objects.equals(this.name, organisation.name) &&
        Objects.equals(this.legalName, organisation.legalName) &&
        Objects.equals(this.paysTax, organisation.paysTax) &&
        Objects.equals(this.version, organisation.version) &&
        Objects.equals(this.organisationType, organisation.organisationType) &&
        Objects.equals(this.baseCurrency, organisation.baseCurrency) &&
        Objects.equals(this.countryCode, organisation.countryCode) &&
        Objects.equals(this.isDemoCompany, organisation.isDemoCompany) &&
        Objects.equals(this.organisationStatus, organisation.organisationStatus) &&
        Objects.equals(this.registrationNumber, organisation.registrationNumber) &&
        Objects.equals(this.taxNumber, organisation.taxNumber) &&
        Objects.equals(this.financialYearEndDay, organisation.financialYearEndDay) &&
        Objects.equals(this.financialYearEndMonth, organisation.financialYearEndMonth) &&
        Objects.equals(this.salesTaxBasis, organisation.salesTaxBasis) &&
        Objects.equals(this.salesTaxPeriod, organisation.salesTaxPeriod) &&
        Objects.equals(this.defaultSalesTax, organisation.defaultSalesTax) &&
        Objects.equals(this.defaultPurchasesTax, organisation.defaultPurchasesTax) &&
        Objects.equals(this.periodLockDate, organisation.periodLockDate) &&
        Objects.equals(this.endOfYearLockDate, organisation.endOfYearLockDate) &&
        Objects.equals(this.createdDateUTC, organisation.createdDateUTC) &&
        Objects.equals(this.timezone, organisation.timezone) &&
        Objects.equals(this.organisationEntityType, organisation.organisationEntityType) &&
        Objects.equals(this.shortCode, organisation.shortCode) &&
        Objects.equals(this.propertyClass, organisation.propertyClass) &&
        Objects.equals(this.lineOfBusiness, organisation.lineOfBusiness) &&
        Objects.equals(this.addresses, organisation.addresses) &&
        Objects.equals(this.phones, organisation.phones) &&
        Objects.equals(this.externalLinks, organisation.externalLinks) &&
        Objects.equals(this.paymentTerms, organisation.paymentTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIKey, name, legalName, paysTax, version, organisationType, baseCurrency, countryCode, isDemoCompany, organisationStatus, registrationNumber, taxNumber, financialYearEndDay, financialYearEndMonth, salesTaxBasis, salesTaxPeriod, defaultSalesTax, defaultPurchasesTax, periodLockDate, endOfYearLockDate, createdDateUTC, timezone, organisationEntityType, shortCode, propertyClass, lineOfBusiness, addresses, phones, externalLinks, paymentTerms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    
    sb.append("    apIKey: ").append(toIndentedString(apIKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    paysTax: ").append(toIndentedString(paysTax)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    organisationType: ").append(toIndentedString(organisationType)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    isDemoCompany: ").append(toIndentedString(isDemoCompany)).append("\n");
    sb.append("    organisationStatus: ").append(toIndentedString(organisationStatus)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    financialYearEndDay: ").append(toIndentedString(financialYearEndDay)).append("\n");
    sb.append("    financialYearEndMonth: ").append(toIndentedString(financialYearEndMonth)).append("\n");
    sb.append("    salesTaxBasis: ").append(toIndentedString(salesTaxBasis)).append("\n");
    sb.append("    salesTaxPeriod: ").append(toIndentedString(salesTaxPeriod)).append("\n");
    sb.append("    defaultSalesTax: ").append(toIndentedString(defaultSalesTax)).append("\n");
    sb.append("    defaultPurchasesTax: ").append(toIndentedString(defaultPurchasesTax)).append("\n");
    sb.append("    periodLockDate: ").append(toIndentedString(periodLockDate)).append("\n");
    sb.append("    endOfYearLockDate: ").append(toIndentedString(endOfYearLockDate)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    organisationEntityType: ").append(toIndentedString(organisationEntityType)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    lineOfBusiness: ").append(toIndentedString(lineOfBusiness)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
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

