
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeResourceLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeResourceLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeResourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remainAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeResourceLog", propOrder = {
    "freeResourceId",
    "amount",
    "remainAmount"
})
public class FreeResourceLog {

    protected Long freeResourceId;
    protected Long amount;
    protected Long remainAmount;

    /**
     * Gets the value of the freeResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeResourceId() {
        return freeResourceId;
    }

    /**
     * Sets the value of the freeResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeResourceId(Long value) {
        this.freeResourceId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the remainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainAmount() {
        return remainAmount;
    }

    /**
     * Sets the value of the remainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainAmount(Long value) {
        this.remainAmount = value;
    }

}
