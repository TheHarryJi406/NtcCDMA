
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subActualUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subActualUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sub_group_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="after_discount_charge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="peak_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="before_discount_charge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subActualUsage", propOrder = {
    "subGroupName",
    "afterDiscountCharge",
    "unit",
    "usage",
    "peakTime",
    "beforeDiscountCharge"
})
public class SubActualUsage {

    @XmlElement(name = "sub_group_name")
    protected String subGroupName;
    @XmlElement(name = "after_discount_charge")
    protected Long afterDiscountCharge;
    protected Short unit;
    protected Long usage;
    @XmlElement(name = "peak_time")
    protected String peakTime;
    @XmlElement(name = "before_discount_charge")
    protected Long beforeDiscountCharge;

    /**
     * Gets the value of the subGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupName() {
        return subGroupName;
    }

    /**
     * Sets the value of the subGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupName(String value) {
        this.subGroupName = value;
    }

    /**
     * Gets the value of the afterDiscountCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAfterDiscountCharge() {
        return afterDiscountCharge;
    }

    /**
     * Sets the value of the afterDiscountCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAfterDiscountCharge(Long value) {
        this.afterDiscountCharge = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnit(Short value) {
        this.unit = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsage(Long value) {
        this.usage = value;
    }

    /**
     * Gets the value of the peakTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeakTime() {
        return peakTime;
    }

    /**
     * Sets the value of the peakTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeakTime(String value) {
        this.peakTime = value;
    }

    /**
     * Gets the value of the beforeDiscountCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeforeDiscountCharge() {
        return beforeDiscountCharge;
    }

    /**
     * Sets the value of the beforeDiscountCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeforeDiscountCharge(Long value) {
        this.beforeDiscountCharge = value;
    }

}
