
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sFristActiveReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sFristActiveReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activation_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="device_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sms_lang" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ivr_lang" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ussd_lang" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sFristActiveReq", propOrder = {
    "userId",
    "phoneId",
    "activationTime",
    "deviceType",
    "smsLang",
    "ivrLang",
    "ussdLang",
    "location",
    "balance"
})
public class SFristActiveReq {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "activation_time")
    protected String activationTime;
    @XmlElement(name = "device_type")
    protected String deviceType;
    @XmlElement(name = "sms_lang")
    protected Short smsLang;
    @XmlElement(name = "ivr_lang")
    protected Short ivrLang;
    @XmlElement(name = "ussd_lang")
    protected Short ussdLang;
    protected String location;
    protected SBalance balance;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

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
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationTime(String value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the smsLang property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSmsLang() {
        return smsLang;
    }

    /**
     * Sets the value of the smsLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSmsLang(Short value) {
        this.smsLang = value;
    }

    /**
     * Gets the value of the ivrLang property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIvrLang() {
        return ivrLang;
    }

    /**
     * Sets the value of the ivrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIvrLang(Short value) {
        this.ivrLang = value;
    }

    /**
     * Gets the value of the ussdLang property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUssdLang() {
        return ussdLang;
    }

    /**
     * Sets the value of the ussdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUssdLang(Short value) {
        this.ussdLang = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setBalance(SBalance value) {
        this.balance = value;
    }

}
