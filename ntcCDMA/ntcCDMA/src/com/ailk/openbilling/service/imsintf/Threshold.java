
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="notify_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="notify_addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threshold", propOrder = {
    "threshold",
    "notifyType",
    "notifyAddr",
    "notifyPhoneId"
})
public class Threshold {

    protected Double threshold;
    @XmlElement(name = "notify_type")
    protected Short notifyType;
    @XmlElement(name = "notify_addr")
    protected String notifyAddr;
    @XmlElement(name = "notify_phone_id")
    protected String notifyPhoneId;

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

    /**
     * Gets the value of the notifyType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyType() {
        return notifyType;
    }

    /**
     * Sets the value of the notifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyType(Short value) {
        this.notifyType = value;
    }

    /**
     * Gets the value of the notifyAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddr() {
        return notifyAddr;
    }

    /**
     * Sets the value of the notifyAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddr(String value) {
        this.notifyAddr = value;
    }

    /**
     * Gets the value of the notifyPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyPhoneId() {
        return notifyPhoneId;
    }

    /**
     * Sets the value of the notifyPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyPhoneId(String value) {
        this.notifyPhoneId = value;
    }

}
