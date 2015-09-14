
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="history_points" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="current_points" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spoints", propOrder = {
    "outerAcctId",
    "acctId",
    "phoneId",
    "historyPoints",
    "currentPoints"
})
public class Spoints {

    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "history_points")
    protected Long historyPoints;
    @XmlElement(name = "current_points")
    protected Long currentPoints;

    /**
     * Gets the value of the outerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterAcctId() {
        return outerAcctId;
    }

    /**
     * Sets the value of the outerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterAcctId(String value) {
        this.outerAcctId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
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
     * Gets the value of the historyPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistoryPoints() {
        return historyPoints;
    }

    /**
     * Sets the value of the historyPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistoryPoints(Long value) {
        this.historyPoints = value;
    }

    /**
     * Gets the value of the currentPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentPoints() {
        return currentPoints;
    }

    /**
     * Sets the value of the currentPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentPoints(Long value) {
        this.currentPoints = value;
    }

}
