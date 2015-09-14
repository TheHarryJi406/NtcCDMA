
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etopupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etopupReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardpin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charge_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etopupReq", propOrder = {
    "phoneId",
    "batchno",
    "serialno",
    "cardpin",
    "chargeType"
})
public class EtopupReq {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected String batchno;
    protected String serialno;
    protected String cardpin;
    @XmlElement(name = "charge_type")
    protected Short chargeType;

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
     * Gets the value of the batchno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchno() {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchno(String value) {
        this.batchno = value;
    }

    /**
     * Gets the value of the serialno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * Sets the value of the serialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialno(String value) {
        this.serialno = value;
    }

    /**
     * Gets the value of the cardpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardpin() {
        return cardpin;
    }

    /**
     * Sets the value of the cardpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardpin(String value) {
        this.cardpin = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChargeType(Short value) {
        this.chargeType = value;
    }

}
