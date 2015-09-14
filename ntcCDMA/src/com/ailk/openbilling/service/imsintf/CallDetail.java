
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="real_total_event_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_event_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="real_duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_charge_domestic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="total_charge_domestic_vat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="total_charge_international" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callDetail", propOrder = {
    "eventType",
    "realTotalEventType",
    "totalEventType",
    "realDuration",
    "totalChargeDomestic",
    "totalChargeDomesticVat",
    "totalChargeInternational"
})
public class CallDetail {

    @XmlElement(name = "event_type")
    protected int eventType;
    @XmlElement(name = "real_total_event_type")
    protected int realTotalEventType;
    @XmlElement(name = "total_event_type")
    protected int totalEventType;
    @XmlElement(name = "real_duration")
    protected int realDuration;
    @XmlElement(name = "total_charge_domestic")
    protected Long totalChargeDomestic;
    @XmlElement(name = "total_charge_domestic_vat")
    protected Long totalChargeDomesticVat;
    @XmlElement(name = "total_charge_international")
    protected Long totalChargeInternational;

    /**
     * Gets the value of the eventType property.
     * 
     */
    public int getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     */
    public void setEventType(int value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the realTotalEventType property.
     * 
     */
    public int getRealTotalEventType() {
        return realTotalEventType;
    }

    /**
     * Sets the value of the realTotalEventType property.
     * 
     */
    public void setRealTotalEventType(int value) {
        this.realTotalEventType = value;
    }

    /**
     * Gets the value of the totalEventType property.
     * 
     */
    public int getTotalEventType() {
        return totalEventType;
    }

    /**
     * Sets the value of the totalEventType property.
     * 
     */
    public void setTotalEventType(int value) {
        this.totalEventType = value;
    }

    /**
     * Gets the value of the realDuration property.
     * 
     */
    public int getRealDuration() {
        return realDuration;
    }

    /**
     * Sets the value of the realDuration property.
     * 
     */
    public void setRealDuration(int value) {
        this.realDuration = value;
    }

    /**
     * Gets the value of the totalChargeDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalChargeDomestic() {
        return totalChargeDomestic;
    }

    /**
     * Sets the value of the totalChargeDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalChargeDomestic(Long value) {
        this.totalChargeDomestic = value;
    }

    /**
     * Gets the value of the totalChargeDomesticVat property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalChargeDomesticVat() {
        return totalChargeDomesticVat;
    }

    /**
     * Sets the value of the totalChargeDomesticVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalChargeDomesticVat(Long value) {
        this.totalChargeDomesticVat = value;
    }

    /**
     * Gets the value of the totalChargeInternational property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalChargeInternational() {
        return totalChargeInternational;
    }

    /**
     * Sets the value of the totalChargeInternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalChargeInternational(Long value) {
        this.totalChargeInternational = value;
    }

}
