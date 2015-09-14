
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reguideItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reguideItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalActualCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalUsageCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reguideDtlInfoList" type="{http://imsintf.service.openbilling.ailk.com/}reguideDtlInfoList" minOccurs="0"/>
 *         &lt;element name="reguideMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargeUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalActualUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reguideItemInfo", propOrder = {
    "itemId",
    "totalActualCharge",
    "totalUsageCharge",
    "reguideDtlInfoList",
    "reguideMobileNo",
    "unit",
    "chargeUnit",
    "totalActualUsage"
})
public class ReguideItemInfo {

    protected Long itemId;
    protected Long totalActualCharge;
    protected Long totalUsageCharge;
    protected ReguideDtlInfoList reguideDtlInfoList;
    protected String reguideMobileNo;
    protected Integer unit;
    protected Integer chargeUnit;
    protected Long totalActualUsage;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemId(Long value) {
        this.itemId = value;
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
     * Gets the value of the reguideDtlInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ReguideDtlInfoList }
     *     
     */
    public ReguideDtlInfoList getReguideDtlInfoList() {
        return reguideDtlInfoList;
    }

    /**
     * Sets the value of the reguideDtlInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReguideDtlInfoList }
     *     
     */
    public void setReguideDtlInfoList(ReguideDtlInfoList value) {
        this.reguideDtlInfoList = value;
    }

    /**
     * Gets the value of the reguideMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReguideMobileNo() {
        return reguideMobileNo;
    }

    /**
     * Sets the value of the reguideMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReguideMobileNo(String value) {
        this.reguideMobileNo = value;
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
     * Gets the value of the totalActualUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalActualUsage() {
        return totalActualUsage;
    }

    /**
     * Sets the value of the totalActualUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalActualUsage(Long value) {
        this.totalActualUsage = value;
    }

}
