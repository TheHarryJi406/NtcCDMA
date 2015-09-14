
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBillCycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBillCycle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cycle_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cycle_unit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="first_bill_day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBillCycle", propOrder = {
    "cycleType",
    "cycleUnit",
    "firstBillDay"
})
public class SBillCycle {

    @XmlElement(name = "cycle_type")
    protected Integer cycleType;
    @XmlElement(name = "cycle_unit")
    protected Integer cycleUnit;
    @XmlElement(name = "first_bill_day")
    protected Integer firstBillDay;

    /**
     * Gets the value of the cycleType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleType() {
        return cycleType;
    }

    /**
     * Sets the value of the cycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleType(Integer value) {
        this.cycleType = value;
    }

    /**
     * Gets the value of the cycleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleUnit() {
        return cycleUnit;
    }

    /**
     * Sets the value of the cycleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleUnit(Integer value) {
        this.cycleUnit = value;
    }

    /**
     * Gets the value of the firstBillDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstBillDay() {
        return firstBillDay;
    }

    /**
     * Sets the value of the firstBillDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstBillDay(Integer value) {
        this.firstBillDay = value;
    }

}
