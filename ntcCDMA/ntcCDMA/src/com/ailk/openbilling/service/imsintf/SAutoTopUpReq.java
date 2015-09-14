
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sAutoTopUpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sAutoTopUpReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pay_user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pay_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="autoTopUpRelList" type="{http://imsintf.service.openbilling.ailk.com/}autoTopUpRelationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sAutoTopUpReq", propOrder = {
    "operType",
    "outerPayAcctId",
    "payAcctId",
    "payUserId",
    "payPhoneId",
    "notificationFlag",
    "autoTopUpRelList"
})
public class SAutoTopUpReq {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "outer_pay_acct_id")
    protected String outerPayAcctId;
    @XmlElement(name = "pay_acct_id")
    protected Long payAcctId;
    @XmlElement(name = "pay_user_id")
    protected Long payUserId;
    @XmlElement(name = "pay_phone_id")
    protected String payPhoneId;
    @XmlElement(name = "notification_flag")
    protected Short notificationFlag;
    protected AutoTopUpRelationList autoTopUpRelList;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperType(Short value) {
        this.operType = value;
    }

    /**
     * Gets the value of the outerPayAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterPayAcctId() {
        return outerPayAcctId;
    }

    /**
     * Sets the value of the outerPayAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterPayAcctId(String value) {
        this.outerPayAcctId = value;
    }

    /**
     * Gets the value of the payAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayAcctId() {
        return payAcctId;
    }

    /**
     * Sets the value of the payAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayAcctId(Long value) {
        this.payAcctId = value;
    }

    /**
     * Gets the value of the payUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayUserId() {
        return payUserId;
    }

    /**
     * Sets the value of the payUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayUserId(Long value) {
        this.payUserId = value;
    }

    /**
     * Gets the value of the payPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPhoneId() {
        return payPhoneId;
    }

    /**
     * Sets the value of the payPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPhoneId(String value) {
        this.payPhoneId = value;
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
     * Gets the value of the autoTopUpRelList property.
     * 
     * @return
     *     possible object is
     *     {@link AutoTopUpRelationList }
     *     
     */
    public AutoTopUpRelationList getAutoTopUpRelList() {
        return autoTopUpRelList;
    }

    /**
     * Sets the value of the autoTopUpRelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoTopUpRelationList }
     *     
     */
    public void setAutoTopUpRelList(AutoTopUpRelationList value) {
        this.autoTopUpRelList = value;
    }

}
