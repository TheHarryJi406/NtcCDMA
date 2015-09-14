
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prodStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prodStateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodcut_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offering_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offering_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prod_state" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prodStateResult", propOrder = {
    "phoneId",
    "prodcutId",
    "offeringId",
    "offeringType",
    "validDate",
    "expireDate",
    "prodState"
})
public class ProdStateResult {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "prodcut_id")
    protected Long prodcutId;
    @XmlElement(name = "offering_id")
    protected int offeringId;
    @XmlElement(name = "offering_type")
    protected Short offeringType;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "prod_state")
    protected Short prodState;

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
     * Gets the value of the prodcutId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProdcutId() {
        return prodcutId;
    }

    /**
     * Sets the value of the prodcutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProdcutId(Long value) {
        this.prodcutId = value;
    }

    /**
     * Gets the value of the offeringId property.
     * 
     */
    public int getOfferingId() {
        return offeringId;
    }

    /**
     * Sets the value of the offeringId property.
     * 
     */
    public void setOfferingId(int value) {
        this.offeringId = value;
    }

    /**
     * Gets the value of the offeringType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOfferingType() {
        return offeringType;
    }

    /**
     * Sets the value of the offeringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOfferingType(Short value) {
        this.offeringType = value;
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

    /**
     * Gets the value of the prodState property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProdState() {
        return prodState;
    }

    /**
     * Sets the value of the prodState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProdState(Short value) {
        this.prodState = value;
    }

}
