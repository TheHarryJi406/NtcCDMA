
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sQueryCDRReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryCDRReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domestic_international" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="queryCDRTypeList" type="{http://imsintf.service.openbilling.ailk.com/}queryCDRTypeList" minOccurs="0"/>
 *         &lt;element name="callUsageCondition" type="{http://imsintf.service.openbilling.ailk.com/}callUsageCondition" minOccurs="0"/>
 *         &lt;element name="sort_by" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="heading_style" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="additional_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offLineFlag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryCDRReq", propOrder = {
    "phoneId",
    "acctId",
    "paymentMode",
    "startDate",
    "endDate",
    "domesticInternational",
    "queryCDRTypeList",
    "callUsageCondition",
    "sortBy",
    "headingStyle",
    "additionalInfo",
    "invoiceNo",
    "offLineFlag"
})
public class SQueryCDRReq {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "payment_mode")
    protected Short paymentMode;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "domestic_international")
    protected Short domesticInternational;
    protected QueryCDRTypeList queryCDRTypeList;
    protected CallUsageCondition callUsageCondition;
    @XmlElement(name = "sort_by")
    protected Short sortBy;
    @XmlElement(name = "heading_style")
    protected Short headingStyle;
    @XmlElement(name = "additional_info")
    protected String additionalInfo;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    protected Short offLineFlag;

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the domesticInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDomesticInternational() {
        return domesticInternational;
    }

    /**
     * Sets the value of the domesticInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDomesticInternational(Short value) {
        this.domesticInternational = value;
    }

    /**
     * Gets the value of the queryCDRTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCDRTypeList }
     *     
     */
    public QueryCDRTypeList getQueryCDRTypeList() {
        return queryCDRTypeList;
    }

    /**
     * Sets the value of the queryCDRTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCDRTypeList }
     *     
     */
    public void setQueryCDRTypeList(QueryCDRTypeList value) {
        this.queryCDRTypeList = value;
    }

    /**
     * Gets the value of the callUsageCondition property.
     * 
     * @return
     *     possible object is
     *     {@link CallUsageCondition }
     *     
     */
    public CallUsageCondition getCallUsageCondition() {
        return callUsageCondition;
    }

    /**
     * Sets the value of the callUsageCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallUsageCondition }
     *     
     */
    public void setCallUsageCondition(CallUsageCondition value) {
        this.callUsageCondition = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSortBy(Short value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the headingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHeadingStyle() {
        return headingStyle;
    }

    /**
     * Sets the value of the headingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHeadingStyle(Short value) {
        this.headingStyle = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the offLineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffLineFlag() {
        return offLineFlag;
    }

    /**
     * Sets the value of the offLineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffLineFlag(Short value) {
        this.offLineFlag = value;
    }

}
