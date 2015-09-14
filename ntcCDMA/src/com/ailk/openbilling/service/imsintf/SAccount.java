
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prov_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_parent_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acct_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="acct_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="acct_class" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="acct_segment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_class" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="due_day" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="bill_dispatching" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="bill_language_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="force_cycle" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="balance_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="county_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sign_credit_control" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="urge_stop_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bill_cycle" type="{http://imsintf.service.openbilling.ailk.com/}sBillCycle" minOccurs="0"/>
 *         &lt;element name="pay_channel_list" type="{http://imsintf.service.openbilling.ailk.com/}sPayChannelList" minOccurs="0"/>
 *         &lt;element name="list_ext_param" type="{http://imsintf.service.openbilling.ailk.com/}extendParamList" minOccurs="0"/>
 *         &lt;element name="bill_sts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tax_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sAccount", propOrder = {
    "outerAcctId",
    "acctId",
    "provCode",
    "regionCode",
    "outerParentAcctId",
    "parentAcctId",
    "outerCustId",
    "custId",
    "acctName",
    "company",
    "acctType",
    "acctClass",
    "acctSegment",
    "status",
    "createDate",
    "validDate",
    "expireDate",
    "creditClass",
    "credit",
    "budget",
    "measureId",
    "dueDay",
    "billDispatching",
    "billLanguageId",
    "forceCycle",
    "balanceType",
    "countyCode",
    "signCreditControl",
    "urgeStopFlag",
    "billCycle",
    "payChannelList",
    "listExtParam",
    "billSts",
    "taxFlag"
})
public class SAccount {

    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "prov_code")
    protected Short provCode;
    @XmlElement(name = "region_code")
    protected Short regionCode;
    @XmlElement(name = "outer_parent_acct_id")
    protected String outerParentAcctId;
    @XmlElement(name = "parent_acct_id")
    protected Long parentAcctId;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "acct_name")
    protected String acctName;
    protected Integer company;
    @XmlElement(name = "acct_type")
    protected Short acctType;
    @XmlElement(name = "acct_class")
    protected Short acctClass;
    @XmlElement(name = "acct_segment")
    protected Short acctSegment;
    protected Short status;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "credit_class")
    protected Short creditClass;
    protected Double credit;
    protected Double budget;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    @XmlElement(name = "due_day")
    protected Short dueDay;
    @XmlElement(name = "bill_dispatching")
    protected Short billDispatching;
    @XmlElement(name = "bill_language_id")
    protected Short billLanguageId;
    @XmlElement(name = "force_cycle")
    protected Short forceCycle;
    @XmlElement(name = "balance_type")
    protected Integer balanceType;
    @XmlElement(name = "county_code")
    protected Integer countyCode;
    @XmlElement(name = "sign_credit_control")
    protected Integer signCreditControl;
    @XmlElement(name = "urge_stop_flag")
    protected Integer urgeStopFlag;
    @XmlElement(name = "bill_cycle")
    protected SBillCycle billCycle;
    @XmlElement(name = "pay_channel_list")
    protected SPayChannelList payChannelList;
    @XmlElement(name = "list_ext_param")
    protected ExtendParamList listExtParam;
    @XmlElement(name = "bill_sts")
    protected Integer billSts;
    @XmlElement(name = "tax_flag")
    protected Integer taxFlag;

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
     * Gets the value of the provCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProvCode() {
        return provCode;
    }

    /**
     * Sets the value of the provCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProvCode(Short value) {
        this.provCode = value;
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
     * Gets the value of the outerParentAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterParentAcctId() {
        return outerParentAcctId;
    }

    /**
     * Sets the value of the outerParentAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterParentAcctId(String value) {
        this.outerParentAcctId = value;
    }

    /**
     * Gets the value of the parentAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentAcctId() {
        return parentAcctId;
    }

    /**
     * Sets the value of the parentAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentAcctId(Long value) {
        this.parentAcctId = value;
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
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompany(Integer value) {
        this.company = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAcctType(Short value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctClass property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAcctClass() {
        return acctClass;
    }

    /**
     * Sets the value of the acctClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAcctClass(Short value) {
        this.acctClass = value;
    }

    /**
     * Gets the value of the acctSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAcctSegment() {
        return acctSegment;
    }

    /**
     * Sets the value of the acctSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAcctSegment(Short value) {
        this.acctSegment = value;
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
     * Gets the value of the creditClass property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreditClass() {
        return creditClass;
    }

    /**
     * Sets the value of the creditClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCreditClass(Short value) {
        this.creditClass = value;
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
     * Gets the value of the dueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDueDay() {
        return dueDay;
    }

    /**
     * Sets the value of the dueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDueDay(Short value) {
        this.dueDay = value;
    }

    /**
     * Gets the value of the billDispatching property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillDispatching() {
        return billDispatching;
    }

    /**
     * Sets the value of the billDispatching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillDispatching(Short value) {
        this.billDispatching = value;
    }

    /**
     * Gets the value of the billLanguageId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillLanguageId() {
        return billLanguageId;
    }

    /**
     * Sets the value of the billLanguageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillLanguageId(Short value) {
        this.billLanguageId = value;
    }

    /**
     * Gets the value of the forceCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getForceCycle() {
        return forceCycle;
    }

    /**
     * Sets the value of the forceCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setForceCycle(Short value) {
        this.forceCycle = value;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalanceType(Integer value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountyCode(Integer value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the signCreditControl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignCreditControl() {
        return signCreditControl;
    }

    /**
     * Sets the value of the signCreditControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignCreditControl(Integer value) {
        this.signCreditControl = value;
    }

    /**
     * Gets the value of the urgeStopFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrgeStopFlag() {
        return urgeStopFlag;
    }

    /**
     * Sets the value of the urgeStopFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrgeStopFlag(Integer value) {
        this.urgeStopFlag = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link SBillCycle }
     *     
     */
    public SBillCycle getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBillCycle }
     *     
     */
    public void setBillCycle(SBillCycle value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the payChannelList property.
     * 
     * @return
     *     possible object is
     *     {@link SPayChannelList }
     *     
     */
    public SPayChannelList getPayChannelList() {
        return payChannelList;
    }

    /**
     * Sets the value of the payChannelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPayChannelList }
     *     
     */
    public void setPayChannelList(SPayChannelList value) {
        this.payChannelList = value;
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
     * Gets the value of the billSts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillSts() {
        return billSts;
    }

    /**
     * Sets the value of the billSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillSts(Integer value) {
        this.billSts = value;
    }

    /**
     * Gets the value of the taxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxFlag() {
        return taxFlag;
    }

    /**
     * Sets the value of the taxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxFlag(Integer value) {
        this.taxFlag = value;
    }

}
