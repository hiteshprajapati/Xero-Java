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
import com.xero.models.accounting.Address;
import com.xero.models.accounting.CountryCode;
import com.xero.models.accounting.CurrencyCode;
import com.xero.models.accounting.ExternalLink;
import com.xero.models.accounting.PaymentTerm;
import com.xero.models.accounting.Phone;
import com.xero.models.accounting.TimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Organisation
 */

public class Organisation {
  StringUtil util = new StringUtil();

  
  @JsonProperty("OrganisationID")
  private UUID organisationID;

  
  @JsonProperty("APIKey")
  private String apIKey;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("LegalName")
  private String legalName;

  
  @JsonProperty("PaysTax")
  private Boolean paysTax;
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
    public static VersionEnum fromValue(String value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("Version")
  private VersionEnum version;
  /**
   * Organisation Type
   */
  public enum OrganisationTypeEnum {
    ACCOUNTING_PRACTICE("ACCOUNTING_PRACTICE"),
    
    COMPANY("COMPANY"),
    
    CHARITY("CHARITY"),
    
    CLUB_OR_SOCIETY("CLUB_OR_SOCIETY"),
    
    LOOK_THROUGH_COMPANY("LOOK_THROUGH_COMPANY"),
    
    NOT_FOR_PROFIT("NOT_FOR_PROFIT"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    S_CORPORATION("S_CORPORATION"),
    
    SELF_MANAGED_SUPERANNUATION_FUND("SELF_MANAGED_SUPERANNUATION_FUND"),
    
    SOLE_TRADER("SOLE_TRADER"),
    
    SUPERANNUATION_FUND("SUPERANNUATION_FUND"),
    
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
    public static OrganisationTypeEnum fromValue(String value) {
      for (OrganisationTypeEnum b : OrganisationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("OrganisationType")
  private OrganisationTypeEnum organisationType;

  
  @JsonProperty("BaseCurrency")
  private CurrencyCode baseCurrency;

  
  @JsonProperty("CountryCode")
  private CountryCode countryCode;

  
  @JsonProperty("IsDemoCompany")
  private Boolean isDemoCompany;

  
  @JsonProperty("OrganisationStatus")
  private String organisationStatus;

  
  @JsonProperty("RegistrationNumber")
  private String registrationNumber;

  
  @JsonProperty("TaxNumber")
  private String taxNumber;

  
  @JsonProperty("FinancialYearEndDay")
  private Integer financialYearEndDay;

  
  @JsonProperty("FinancialYearEndMonth")
  private Integer financialYearEndMonth;
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
    public static SalesTaxBasisEnum fromValue(String value) {
      for (SalesTaxBasisEnum b : SalesTaxBasisEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("SalesTaxBasis")
  private SalesTaxBasisEnum salesTaxBasis;
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
    
    YEARLY("YEARLY"),
    
    NONE("NONE");

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
    public static SalesTaxPeriodEnum fromValue(String value) {
      for (SalesTaxPeriodEnum b : SalesTaxPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("SalesTaxPeriod")
  private SalesTaxPeriodEnum salesTaxPeriod;

  
  @JsonProperty("DefaultSalesTax")
  private String defaultSalesTax;

  
  @JsonProperty("DefaultPurchasesTax")
  private String defaultPurchasesTax;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("PeriodLockDate")
  private LocalDate periodLockDate;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("EndOfYearLockDate")
  private LocalDate endOfYearLockDate;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC;

  
  @JsonProperty("Timezone")
  private TimeZone timezone;
  /**
   * Organisation Type
   */
  public enum OrganisationEntityTypeEnum {
    ACCOUNTING_PRACTICE("ACCOUNTING_PRACTICE"),
    
    COMPANY("COMPANY"),
    
    CHARITY("CHARITY"),
    
    CLUB_OR_SOCIETY("CLUB_OR_SOCIETY"),
    
    LOOK_THROUGH_COMPANY("LOOK_THROUGH_COMPANY"),
    
    NOT_FOR_PROFIT("NOT_FOR_PROFIT"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    S_CORPORATION("S_CORPORATION"),
    
    SELF_MANAGED_SUPERANNUATION_FUND("SELF_MANAGED_SUPERANNUATION_FUND"),
    
    SOLE_TRADER("SOLE_TRADER"),
    
    SUPERANNUATION_FUND("SUPERANNUATION_FUND"),
    
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
    public static OrganisationEntityTypeEnum fromValue(String value) {
      for (OrganisationEntityTypeEnum b : OrganisationEntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("OrganisationEntityType")
  private OrganisationEntityTypeEnum organisationEntityType;

  
  @JsonProperty("ShortCode")
  private String shortCode;
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
    public static PropertyClassEnum fromValue(String value) {
      for (PropertyClassEnum b : PropertyClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("Class")
  private PropertyClassEnum propertyClass;
  /**
   * BUSINESS or PARTNER. Partner edition organisations are sold exclusively through accounting partners and have restricted functionality (e.g. no access to invoicing)
   */
  public enum EditionEnum {
    BUSINESS("BUSINESS"),
    
    PARTNER("PARTNER");

    private String value;

    EditionEnum(String value) {
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
    public static EditionEnum fromValue(String value) {
      for (EditionEnum b : EditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("Edition")
  private EditionEnum edition;

  
  @JsonProperty("LineOfBusiness")
  private String lineOfBusiness;

  
  @JsonProperty("Addresses")
  private List<Address> addresses = new ArrayList<Address>();

  
  @JsonProperty("Phones")
  private List<Phone> phones = new ArrayList<Phone>();

  
  @JsonProperty("ExternalLinks")
  private List<ExternalLink> externalLinks = new ArrayList<ExternalLink>();

  
  @JsonProperty("PaymentTerms")
  private PaymentTerm paymentTerms = null;
  public Organisation organisationID(UUID organisationID) {
    this.organisationID = organisationID;
    return this;
  }

   /**
   * Unique Xero identifier
   * @return organisationID
  **/
  @ApiModelProperty(example = "8be9db36-3598-4755-ba5c-c2dbc8c4a7a2", value = "Unique Xero identifier")
  public UUID getOrganisationID() {
    return organisationID;
  }

  public void setOrganisationID(UUID organisationID) {
    this.organisationID = organisationID;
  }

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

  public Organisation baseCurrency(CurrencyCode baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Get baseCurrency
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(CurrencyCode baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public Organisation countryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
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

  public Organisation timezone(TimeZone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public TimeZone getTimezone() {
    return timezone;
  }

  public void setTimezone(TimeZone timezone) {
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

  public Organisation edition(EditionEnum edition) {
    this.edition = edition;
    return this;
  }

   /**
   * BUSINESS or PARTNER. Partner edition organisations are sold exclusively through accounting partners and have restricted functionality (e.g. no access to invoicing)
   * @return edition
  **/
  @ApiModelProperty(value = "BUSINESS or PARTNER. Partner edition organisations are sold exclusively through accounting partners and have restricted functionality (e.g. no access to invoicing)")
  public EditionEnum getEdition() {
    return edition;
  }

  public void setEdition(EditionEnum edition) {
    this.edition = edition;
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
   * Organisation profile links for popular services such as Facebook,Twitter, GooglePlus and LinkedIn. You can also add link to your website here. Shown if Organisation settings  is updated in Xero. See ExternalLinks below
   * @return externalLinks
  **/
  @ApiModelProperty(value = "Organisation profile links for popular services such as Facebook,Twitter, GooglePlus and LinkedIn. You can also add link to your website here. Shown if Organisation settings  is updated in Xero. See ExternalLinks below")
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
    return Objects.equals(this.organisationID, organisation.organisationID) &&
        Objects.equals(this.apIKey, organisation.apIKey) &&
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
        Objects.equals(this.edition, organisation.edition) &&
        Objects.equals(this.lineOfBusiness, organisation.lineOfBusiness) &&
        Objects.equals(this.addresses, organisation.addresses) &&
        Objects.equals(this.phones, organisation.phones) &&
        Objects.equals(this.externalLinks, organisation.externalLinks) &&
        Objects.equals(this.paymentTerms, organisation.paymentTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationID, apIKey, name, legalName, paysTax, version, organisationType, baseCurrency, countryCode, isDemoCompany, organisationStatus, registrationNumber, taxNumber, financialYearEndDay, financialYearEndMonth, salesTaxBasis, salesTaxPeriod, defaultSalesTax, defaultPurchasesTax, periodLockDate, endOfYearLockDate, createdDateUTC, timezone, organisationEntityType, shortCode, propertyClass, edition, lineOfBusiness, addresses, phones, externalLinks, paymentTerms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    organisationID: ").append(toIndentedString(organisationID)).append("\n");
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
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
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

