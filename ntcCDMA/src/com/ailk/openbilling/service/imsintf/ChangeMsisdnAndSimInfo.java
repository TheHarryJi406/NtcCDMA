
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeMsisdnAndSimInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeMsisdnAndSimInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="change_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="new_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="old_imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="serial_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeMsisdnAndSimInfo", propOrder = {
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "changeType",
    "newPhoneId",
    "oldImsi",
    "newImsi",
    "notificationFlag",
    "serialNo"
})
public class ChangeMsisdnAndSimInfo {

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
    @XmlElement(name = "change_type")
    protected Short changeType;
    @XmlElement(name = "new_phone_id")
    protected String newPhoneId;
    @XmlElement(name = "old_imsi")
    protected String oldImsi;
    @XmlElement(name = "new_imsi")
    protected String newImsi;
    @XmlElement(name = "notification_flag")
    protected Short notificationFlag;
    @XmlElement(name = "serial_no")
    protected String serialNo;

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
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChangeType(Short value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the newPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPhoneId() {
        return newPhoneId;
    }

    /**
     * Sets the value of the newPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPhoneId(String value) {
        this.newPhoneId = value;
    }

    /**
     * Gets the value of the oldImsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldImsi() {
        return oldImsi;
    }

    /**
     * Sets the value of the oldImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldImsi(String value) {
        this.oldImsi = value;
    }

    /**
     * Gets the value of the newImsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewImsi() {
        return newImsi;
    }

    /**
     * Sets the value of the newImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewImsi(String value) {
        this.newImsi = value;
    }

    /**
     * Gets the value of the notificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotificationFlag() {
        return notificationFlag;
    }

    /**
     * Sets the value of the notificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotificationFlag(Short value) {
        this.notificationFlag = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

}
