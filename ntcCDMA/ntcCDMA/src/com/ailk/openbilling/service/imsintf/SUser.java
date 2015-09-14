
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="county_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="user_segment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="main_promotion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="os_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="device_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mNP_home_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sms_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ivr_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ussd_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="active_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title_role_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="is_test_number" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="attrUserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="list_ext_param" type="{http://imsintf.service.openbilling.ailk.com/}extendParamList" minOccurs="0"/>
 *         &lt;element name="sUserLifeCycle" type="{http://imsintf.service.openbilling.ailk.com/}sUserLifecycle" minOccurs="0"/>
 *         &lt;element name="serial_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flh_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="continue_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="suspend_stop_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disable_stop_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUser", propOrder = {
    "userId",
    "countyCode",
    "regionCode",
    "phoneId",
    "company",
    "password",
    "imsi",
    "outerAcctId",
    "acctId",
    "outerBillableAcctId",
    "billableAcctId",
    "outerCustId",
    "custId",
    "userType",
    "userSegment",
    "paymentMode",
    "brand",
    "mainPromotion",
    "credit",
    "measureId",
    "budget",
    "status",
    "osStatus",
    "createDate",
    "validDate",
    "expireDate",
    "deviceType",
    "imei",
    "mnpHomeArea",
    "smsLanguage",
    "ivrLanguage",
    "ussdLanguage",
    "activeDate",
    "titleRoleId",
    "isTestNumber",
    "attrUserEmail",
    "listExtParam",
    "sUserLifeCycle",
    "serialNo",
    "flhFlag",
    "continueFlag",
    "suspendStopDate",
    "disableStopDate"
})
public class SUser {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "county_code")
    protected Short countyCode;
    @XmlElement(name = "region_code")
    protected Short regionCode;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected String company;
    protected String password;
    protected String imsi;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "outer_billable_acct_id")
    protected String outerBillableAcctId;
    @XmlElement(name = "billable_acct_id")
    protected Long billableAcctId;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "user_type")
    protected Short userType;
    @XmlElement(name = "user_segment")
    protected Short userSegment;
    @XmlElement(name = "payment_mode")
    protected Short paymentMode;
    protected Short brand;
    @XmlElement(name = "main_promotion")
    protected Integer mainPromotion;
    protected Double credit;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    protected Double budget;
    protected Short status;
    @XmlElement(name = "os_status")
    protected String osStatus;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "device_type")
    protected String deviceType;
    @XmlElement(name = "iMEI")
    protected String imei;
    @XmlElement(name = "mNP_home_area")
    protected String mnpHomeArea;
    @XmlElement(name = "sms_language")
    protected Short smsLanguage;
    @XmlElement(name = "ivr_language")
    protected Short ivrLanguage;
    @XmlElement(name = "ussd_language")
    protected Short ussdLanguage;
    @XmlElement(name = "active_date")
    protected String activeDate;
    @XmlElement(name = "title_role_id")
    protected Short titleRoleId;
    @XmlElement(name = "is_test_number")
    protected Short isTestNumber;
    protected String attrUserEmail;
    @XmlElement(name = "list_ext_param")
    protected ExtendParamList listExtParam;
    protected SUserLifecycle sUserLifeCycle;
    @XmlElement(name = "serial_no")
    protected String serialNo;
    @XmlElement(name = "flh_flag")
    protected Short flhFlag;
    @XmlElement(name = "continue_flag")
    protected Short continueFlag;
    @XmlElement(name = "suspend_stop_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspendStopDate;
    @XmlElement(name = "disable_stop_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disableStopDate;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCountyCode(Short value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegionCode(Short value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneId(String value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the outerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterAcctId() {
        return outerAcctId;
    }

    /**
     * Sets the value of the outerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterAcctId(String value) {
        this.outerAcctId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the outerBillableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterBillableAcctId() {
        return outerBillableAcctId;
    }

    /**
     * Sets the value of the outerBillableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterBillableAcctId(String value) {
        this.outerBillableAcctId = value;
    }

    /**
     * Gets the value of the billableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillableAcctId() {
        return billableAcctId;
    }

    /**
     * Sets the value of the billableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillableAcctId(Long value) {
        this.billableAcctId = value;
    }

    /**
     * Gets the value of the outerCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterCustId() {
        return outerCustId;
    }

    /**
     * Sets the value of the outerCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterCustId(String value) {
        this.outerCustId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustId(Long value) {
        this.custId = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserType(Short value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserSegment() {
        return userSegment;
    }

    /**
     * Sets the value of the userSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserSegment(Short value) {
        this.userSegment = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentMode(Short value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBrand(Short value) {
        this.brand = value;
    }

    /**
     * Gets the value of the mainPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainPromotion() {
        return mainPromotion;
    }

    /**
     * Sets the value of the mainPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainPromotion(Integer value) {
        this.mainPromotion = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCredit(Double value) {
        this.credit = value;
    }

    /**
     * Gets the value of the measureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Sets the value of the measureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudget(Double value) {
        this.budget = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the osStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsStatus() {
        return osStatus;
    }

    /**
     * Sets the value of the osStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsStatus(String value) {
        this.osStatus = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the mnpHomeArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNPHomeArea() {
        return mnpHomeArea;
    }

    /**
     * Sets the value of the mnpHomeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNPHomeArea(String value) {
        this.mnpHomeArea = value;
    }

    /**
     * Gets the value of the smsLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSmsLanguage() {
        return smsLanguage;
    }

    /**
     * Sets the value of the smsLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSmsLanguage(Short value) {
        this.smsLanguage = value;
    }

    /**
     * Gets the value of the ivrLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIvrLanguage() {
        return ivrLanguage;
    }

    /**
     * Sets the value of the ivrLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIvrLanguage(Short value) {
        this.ivrLanguage = value;
    }

    /**
     * Gets the value of the ussdLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUssdLanguage() {
        return ussdLanguage;
    }

    /**
     * Sets the value of the ussdLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUssdLanguage(Short value) {
        this.ussdLanguage = value;
    }

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDate(String value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the titleRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTitleRoleId() {
        return titleRoleId;
    }

    /**
     * Sets the value of the titleRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTitleRoleId(Short value) {
        this.titleRoleId = value;
    }

    /**
     * Gets the value of the isTestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsTestNumber() {
        return isTestNumber;
    }

    /**
     * Sets the value of the isTestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsTestNumber(Short value) {
        this.isTestNumber = value;
    }

    /**
     * Gets the value of the attrUserEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrUserEmail() {
        return attrUserEmail;
    }

    /**
     * Sets the value of the attrUserEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrUserEmail(String value) {
        this.attrUserEmail = value;
    }

    /**
     * Gets the value of the listExtParam property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendParamList }
     *     
     */
    public ExtendParamList getListExtParam() {
        return listExtParam;
    }

    /**
     * Sets the value of the listExtParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendParamList }
     *     
     */
    public void setListExtParam(ExtendParamList value) {
        this.listExtParam = value;
    }

    /**
     * Gets the value of the sUserLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link SUserLifecycle }
     *     
     */
    public SUserLifecycle getSUserLifeCycle() {
        return sUserLifeCycle;
    }

    /**
     * Sets the value of the sUserLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserLifecycle }
     *     
     */
    public void setSUserLifeCycle(SUserLifecycle value) {
        this.sUserLifeCycle = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the flhFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFlhFlag() {
        return flhFlag;
    }

    /**
     * Sets the value of the flhFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFlhFlag(Short value) {
        this.flhFlag = value;
    }

    /**
     * Gets the value of the continueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContinueFlag() {
        return continueFlag;
    }

    /**
     * Sets the value of the continueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContinueFlag(Short value) {
        this.continueFlag = value;
    }

    /**
     * Gets the value of the suspendStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendStopDate() {
        return suspendStopDate;
    }

    /**
     * Sets the value of the suspendStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendStopDate(XMLGregorianCalendar value) {
        this.suspendStopDate = value;
    }

    /**
     * Gets the value of the disableStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisableStopDate() {
        return disableStopDate;
    }

    /**
     * Sets the value of the disableStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisableStopDate(XMLGregorianCalendar value) {
        this.disableStopDate = value;
    }

}
