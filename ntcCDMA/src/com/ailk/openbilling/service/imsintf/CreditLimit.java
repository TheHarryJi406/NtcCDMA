
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remain_credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="temp_credit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="advance_payment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unpaid_payment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="credit_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temp_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="unlimited_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="last_bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="next_bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="onetimeFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unbilled_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="exempt_credit_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="exempt_valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exempt_expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditLimit", propOrder = {
    "creditItemId",
    "credit",
    "remainCredit",
    "tempCredit",
    "advancePayment",
    "usage",
    "unpaidPayment",
    "creditType",
    "expireDate",
    "measureId",
    "tempFlag",
    "unlimitedFlag",
    "lastBillDate",
    "nextBillDate",
    "recurringFee",
    "onetimeFee",
    "unbilledAmount",
    "exemptCreditFlag",
    "exemptValidDate",
    "exemptExpireDate"
})
public class CreditLimit {

    protected Integer creditItemId;
    protected Double credit;
    @XmlElement(name = "remain_credit")
    protected Double remainCredit;
    @XmlElement(name = "temp_credit")
    protected Double tempCredit;
    @XmlElement(name = "advance_payment")
    protected Double advancePayment;
    protected Double usage;
    @XmlElement(name = "unpaid_payment")
    protected Double unpaidPayment;
    @XmlElement(name = "credit_type")
    protected Short creditType;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    @XmlElement(name = "temp_flag")
    protected Short tempFlag;
    @XmlElement(name = "unlimited_flag")
    protected Short unlimitedFlag;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    protected Double recurringFee;
    protected Double onetimeFee;
    @XmlElement(name = "unbilled_amount")
    protected Double unbilledAmount;
    @XmlElement(name = "exempt_credit_flag")
    protected Short exemptCreditFlag;
    @XmlElement(name = "exempt_valid_date")
    protected String exemptValidDate;
    @XmlElement(name = "exempt_expire_date")
    protected String exemptExpireDate;

    /**
     * Gets the value of the creditItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditItemId() {
        return creditItemId;
    }

    /**
     * Sets the value of the creditItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditItemId(Integer value) {
        this.creditItemId = value;
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
     * Gets the value of the remainCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainCredit() {
        return remainCredit;
    }

    /**
     * Sets the value of the remainCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainCredit(Double value) {
        this.remainCredit = value;
    }

    /**
     * Gets the value of the tempCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempCredit() {
        return tempCredit;
    }

    /**
     * Sets the value of the tempCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempCredit(Double value) {
        this.tempCredit = value;
    }

    /**
     * Gets the value of the advancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdvancePayment() {
        return advancePayment;
    }

    /**
     * Sets the value of the advancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdvancePayment(Double value) {
        this.advancePayment = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsage(Double value) {
        this.usage = value;
    }

    /**
     * Gets the value of the unpaidPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnpaidPayment() {
        return unpaidPayment;
    }

    /**
     * Sets the value of the unpaidPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnpaidPayment(Double value) {
        this.unpaidPayment = value;
    }

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCreditType(Short value) {
        this.creditType = value;
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
     * Gets the value of the tempFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTempFlag() {
        return tempFlag;
    }

    /**
     * Sets the value of the tempFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTempFlag(Short value) {
        this.tempFlag = value;
    }

    /**
     * Gets the value of the unlimitedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnlimitedFlag() {
        return unlimitedFlag;
    }

    /**
     * Sets the value of the unlimitedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnlimitedFlag(Short value) {
        this.unlimitedFlag = value;
    }

    /**
     * Gets the value of the lastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillDate() {
        return lastBillDate;
    }

    /**
     * Sets the value of the lastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    /**
     * Gets the value of the nextBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBillDate() {
        return nextBillDate;
    }

    /**
     * Sets the value of the nextBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    /**
     * Gets the value of the recurringFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecurringFee() {
        return recurringFee;
    }

    /**
     * Sets the value of the recurringFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecurringFee(Double value) {
        this.recurringFee = value;
    }

    /**
     * Gets the value of the onetimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnetimeFee() {
        return onetimeFee;
    }

    /**
     * Sets the value of the onetimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnetimeFee(Double value) {
        this.onetimeFee = value;
    }

    /**
     * Gets the value of the unbilledAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnbilledAmount() {
        return unbilledAmount;
    }

    /**
     * Sets the value of the unbilledAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnbilledAmount(Double value) {
        this.unbilledAmount = value;
    }

    /**
     * Gets the value of the exemptCreditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getExemptCreditFlag() {
        return exemptCreditFlag;
    }

    /**
     * Sets the value of the exemptCreditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExemptCreditFlag(Short value) {
        this.exemptCreditFlag = value;
    }

    /**
     * Gets the value of the exemptValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptValidDate() {
        return exemptValidDate;
    }

    /**
     * Sets the value of the exemptValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptValidDate(String value) {
        this.exemptValidDate = value;
    }

    /**
     * Gets the value of the exemptExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptExpireDate() {
        return exemptExpireDate;
    }

    /**
     * Sets the value of the exemptExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptExpireDate(String value) {
        this.exemptExpireDate = value;
    }

}
