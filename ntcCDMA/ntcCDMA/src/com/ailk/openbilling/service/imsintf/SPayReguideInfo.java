
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sPayReguideInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sPayReguideInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_pay_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pay_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="part_type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="part_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="max_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="b_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sPayReguideInfo", propOrder = {
    "outerPayAcctId",
    "payAcctId",
    "outerPayCustId",
    "payCustId",
    "payPhoneId",
    "priority",
    "partType",
    "partValue",
    "maxValue",
    "validDate",
    "expireDate",
    "bNumber",
    "measureId",
    "threshold"
})
public class SPayReguideInfo {

    @XmlElement(name = "outer_pay_acct_id")
    protected String outerPayAcctId;
    @XmlElement(name = "pay_acct_id")
    protected Long payAcctId;
    @XmlElement(name = "outer_pay_cust_id")
    protected String outerPayCustId;
    @XmlElement(name = "pay_cust_id")
    protected Long payCustId;
    @XmlElement(name = "pay_phone_id")
    protected String payPhoneId;
    protected Short priority;
    @XmlElement(name = "part_type")
    protected Long partType;
    @XmlElement(name = "part_value")
    protected Double partValue;
    @XmlElement(name = "max_value")
    protected Double maxValue;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "b_number")
    protected String bNumber;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    protected Double threshold;

    /**
     * Gets the value of the outerPayAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterPayAcctId() {
        return outerPayAcctId;
    }

    /**
     * Sets the value of the outerPayAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterPayAcctId(String value) {
        this.outerPayAcctId = value;
    }

    /**
     * Gets the value of the payAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayAcctId() {
        return payAcctId;
    }

    /**
     * Sets the value of the payAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayAcctId(Long value) {
        this.payAcctId = value;
    }

    /**
     * Gets the value of the outerPayCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterPayCustId() {
        return outerPayCustId;
    }

    /**
     * Sets the value of the outerPayCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterPayCustId(String value) {
        this.outerPayCustId = value;
    }

    /**
     * Gets the value of the payCustId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayCustId() {
        return payCustId;
    }

    /**
     * Sets the value of the payCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayCustId(Long value) {
        this.payCustId = value;
    }

    /**
     * Gets the value of the payPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPhoneId() {
        return payPhoneId;
    }

    /**
     * Sets the value of the payPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPhoneId(String value) {
        this.payPhoneId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartType(Long value) {
        this.partType = value;
    }

    /**
     * Gets the value of the partValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPartValue() {
        return partValue;
    }

    /**
     * Sets the value of the partValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPartValue(Double value) {
        this.partValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
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
     * Gets the value of the bNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNumber() {
        return bNumber;
    }

    /**
     * Sets the value of the bNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNumber(String value) {
        this.bNumber = value;
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
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshold(Double value) {
        this.threshold = value;
    }

}
