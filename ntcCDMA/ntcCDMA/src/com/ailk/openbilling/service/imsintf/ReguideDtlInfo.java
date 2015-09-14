
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reguideDtlInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reguideDtlInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oppNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalActualCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalUsageCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargeUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalOwnerPaid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalPayerPaid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reguideAcctInfoList" type="{http://imsintf.service.openbilling.ailk.com/}reguideAcctInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reguideDtlInfo", propOrder = {
    "startTime",
    "oppNumber",
    "totalUsage",
    "unit",
    "totalActualCharge",
    "totalUsageCharge",
    "chargeUnit",
    "totalOwnerPaid",
    "totalPayerPaid",
    "reguideAcctInfoList"
})
public class ReguideDtlInfo {

    protected String startTime;
    protected String oppNumber;
    protected Long totalUsage;
    protected Integer unit;
    protected Long totalActualCharge;
    protected Long totalUsageCharge;
    protected Integer chargeUnit;
    protected Long totalOwnerPaid;
    protected Long totalPayerPaid;
    protected ReguideAcctInfoList reguideAcctInfoList;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the oppNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppNumber() {
        return oppNumber;
    }

    /**
     * Sets the value of the oppNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppNumber(String value) {
        this.oppNumber = value;
    }

    /**
     * Gets the value of the totalUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalUsage() {
        return totalUsage;
    }

    /**
     * Sets the value of the totalUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalUsage(Long value) {
        this.totalUsage = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnit(Integer value) {
        this.unit = value;
    }

    /**
     * Gets the value of the totalActualCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalActualCharge() {
        return totalActualCharge;
    }

    /**
     * Sets the value of the totalActualCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalActualCharge(Long value) {
        this.totalActualCharge = value;
    }

    /**
     * Gets the value of the totalUsageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalUsageCharge() {
        return totalUsageCharge;
    }

    /**
     * Sets the value of the totalUsageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalUsageCharge(Long value) {
        this.totalUsageCharge = value;
    }

    /**
     * Gets the value of the chargeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeUnit() {
        return chargeUnit;
    }

    /**
     * Sets the value of the chargeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeUnit(Integer value) {
        this.chargeUnit = value;
    }

    /**
     * Gets the value of the totalOwnerPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalOwnerPaid() {
        return totalOwnerPaid;
    }

    /**
     * Sets the value of the totalOwnerPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalOwnerPaid(Long value) {
        this.totalOwnerPaid = value;
    }

    /**
     * Gets the value of the totalPayerPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPayerPaid() {
        return totalPayerPaid;
    }

    /**
     * Sets the value of the totalPayerPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPayerPaid(Long value) {
        this.totalPayerPaid = value;
    }

    /**
     * Gets the value of the reguideAcctInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ReguideAcctInfoList }
     *     
     */
    public ReguideAcctInfoList getReguideAcctInfoList() {
        return reguideAcctInfoList;
    }

    /**
     * Sets the value of the reguideAcctInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReguideAcctInfoList }
     *     
     */
    public void setReguideAcctInfoList(ReguideAcctInfoList value) {
        this.reguideAcctInfoList = value;
    }

}
