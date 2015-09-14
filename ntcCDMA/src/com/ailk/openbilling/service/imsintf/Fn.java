
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="old_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fn", propOrder = {
    "oldPhoneId",
    "phoneId",
    "validDate",
    "expireDate"
})
public class Fn {

    @XmlElement(name = "old_phone_id")
    protected String oldPhoneId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;

    /**
     * Gets the value of the oldPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPhoneId() {
        return oldPhoneId;
    }

    /**
     * Sets the value of the oldPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPhoneId(String value) {
        this.oldPhoneId = value;
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

}
