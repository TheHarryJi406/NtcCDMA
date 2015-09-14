
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeUserLanguageReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeUserLanguageReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ussd_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ivr_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sms_language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeUserLanguageReq", propOrder = {
    "phoneId",
    "userId",
    "ussdLanguage",
    "ivrLanguage",
    "smsLanguage"
})
public class ChangeUserLanguageReq {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "ussd_language")
    protected Short ussdLanguage;
    @XmlElement(name = "ivr_language")
    protected Short ivrLanguage;
    @XmlElement(name = "sms_language")
    protected Short smsLanguage;

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
     * Gets the value of the ussdLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUssdLanguage() {
        return ussdLanguage;
    }

    /**
     * Sets the value of the ussdLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUssdLanguage(Short value) {
        this.ussdLanguage = value;
    }

    /**
     * Gets the value of the ivrLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIvrLanguage() {
        return ivrLanguage;
    }

    /**
     * Sets the value of the ivrLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIvrLanguage(Short value) {
        this.ivrLanguage = value;
    }

    /**
     * Gets the value of the smsLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSmsLanguage() {
        return smsLanguage;
    }

    /**
     * Sets the value of the smsLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSmsLanguage(Short value) {
        this.smsLanguage = value;
    }

}
