
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sAuthParentReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sAuthParentReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_son_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="son_cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_son_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="son_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="son_user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="son_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sAuthParentReq", propOrder = {
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "outerSonCustId",
    "sonCustId",
    "outerSonAcctId",
    "sonAcctId",
    "sonUserId",
    "sonPhoneId"
})
public class SAuthParentReq {

    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "outer_son_cust_id")
    protected String outerSonCustId;
    @XmlElement(name = "son_cust_id")
    protected Long sonCustId;
    @XmlElement(name = "outer_son_acct_id")
    protected String outerSonAcctId;
    @XmlElement(name = "son_acct_id")
    protected Long sonAcctId;
    @XmlElement(name = "son_user_id")
    protected Long sonUserId;
    @XmlElement(name = "son_phone_id")
    protected String sonPhoneId;

    /**
     * Gets the value of the outerCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterCustId() {
        return outerCustId;
    }

    /**
     * Sets the value of the outerCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterCustId(String value) {
        this.outerCustId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustId(Long value) {
        this.custId = value;
    }

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
     * Gets the value of the outerSonCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterSonCustId() {
        return outerSonCustId;
    }

    /**
     * Sets the value of the outerSonCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterSonCustId(String value) {
        this.outerSonCustId = value;
    }

    /**
     * Gets the value of the sonCustId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSonCustId() {
        return sonCustId;
    }

    /**
     * Sets the value of the sonCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSonCustId(Long value) {
        this.sonCustId = value;
    }

    /**
     * Gets the value of the outerSonAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterSonAcctId() {
        return outerSonAcctId;
    }

    /**
     * Sets the value of the outerSonAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterSonAcctId(String value) {
        this.outerSonAcctId = value;
    }

    /**
     * Gets the value of the sonAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSonAcctId() {
        return sonAcctId;
    }

    /**
     * Sets the value of the sonAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSonAcctId(Long value) {
        this.sonAcctId = value;
    }

    /**
     * Gets the value of the sonUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSonUserId() {
        return sonUserId;
    }

    /**
     * Sets the value of the sonUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSonUserId(Long value) {
        this.sonUserId = value;
    }

    /**
     * Gets the value of the sonPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonPhoneId() {
        return sonPhoneId;
    }

    /**
     * Sets the value of the sonPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonPhoneId(String value) {
        this.sonPhoneId = value;
    }

}
