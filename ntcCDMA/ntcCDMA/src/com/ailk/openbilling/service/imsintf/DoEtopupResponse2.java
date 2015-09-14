
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doEtopupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doEtopupResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activestop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueadd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validityadd" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doEtopupResponse", propOrder = {
    "balance",
    "activestop",
    "value",
    "valueadd",
    "validity",
    "validityadd"
})
public class DoEtopupResponse2
    extends BaseResponse
{

    protected String balance;
    protected String activestop;
    protected Long value;
    protected Long valueadd;
    protected String validity;
    protected Long validityadd;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the activestop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivestop() {
        return activestop;
    }

    /**
     * Sets the value of the activestop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivestop(String value) {
        this.activestop = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueadd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueadd() {
        return valueadd;
    }

    /**
     * Sets the value of the valueadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueadd(Long value) {
        this.valueadd = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidity(String value) {
        this.validity = value;
    }

    /**
     * Gets the value of the validityadd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidityadd() {
        return validityadd;
    }

    /**
     * Sets the value of the validityadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidityadd(Long value) {
        this.validityadd = value;
    }

}
