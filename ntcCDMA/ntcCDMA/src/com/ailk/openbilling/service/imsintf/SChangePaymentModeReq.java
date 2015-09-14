
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sChangePaymentModeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sChangePaymentModeReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_new_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convert_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="reset_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="last_term_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="hybrid_rule" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="old_payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="new_payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="drop_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sCustomer" type="{http://imsintf.service.openbilling.ailk.com/}sCustomer" minOccurs="0"/>
 *         &lt;element name="sAccount" type="{http://imsintf.service.openbilling.ailk.com/}sAccount" minOccurs="0"/>
 *         &lt;element name="productOrderOperList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderOperList" minOccurs="0"/>
 *         &lt;element name="busiServiceOperList" type="{http://imsintf.service.openbilling.ailk.com/}sBusiServiceOperList" minOccurs="0"/>
 *         &lt;element name="billalbe_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_billalbe_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sChangePaymentModeReq", propOrder = {
    "outerNewAcctId",
    "newAcctId",
    "userId",
    "phoneId",
    "convertFlag",
    "resetFlag",
    "lastTermFlag",
    "hybridRule",
    "oldPaymentMode",
    "newPaymentMode",
    "dropFlag",
    "sCustomer",
    "sAccount",
    "productOrderOperList",
    "busiServiceOperList",
    "billalbeAcctId",
    "outerBillalbeAcctId"
})
public class SChangePaymentModeReq {

    @XmlElement(name = "outer_new_acct_id")
    protected String outerNewAcctId;
    @XmlElement(name = "new_acct_id")
    protected Long newAcctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "convert_flag")
    protected Short convertFlag;
    @XmlElement(name = "reset_flag")
    protected Short resetFlag;
    @XmlElement(name = "last_term_flag")
    protected Short lastTermFlag;
    @XmlElement(name = "hybrid_rule")
    protected Short hybridRule;
    @XmlElement(name = "old_payment_mode")
    protected Short oldPaymentMode;
    @XmlElement(name = "new_payment_mode")
    protected Short newPaymentMode;
    @XmlElement(name = "drop_flag")
    protected Short dropFlag;
    protected SCustomer sCustomer;
    protected SAccount sAccount;
    protected SProductOrderOperList productOrderOperList;
    protected SBusiServiceOperList busiServiceOperList;
    @XmlElement(name = "billalbe_acct_id")
    protected Long billalbeAcctId;
    @XmlElement(name = "outer_billalbe_acct_id")
    protected String outerBillalbeAcctId;

    /**
     * Gets the value of the outerNewAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterNewAcctId() {
        return outerNewAcctId;
    }

    /**
     * Sets the value of the outerNewAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterNewAcctId(String value) {
        this.outerNewAcctId = value;
    }

    /**
     * Gets the value of the newAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewAcctId() {
        return newAcctId;
    }

    /**
     * Sets the value of the newAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewAcctId(Long value) {
        this.newAcctId = value;
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
     * Gets the value of the convertFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getConvertFlag() {
        return convertFlag;
    }

    /**
     * Sets the value of the convertFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setConvertFlag(Short value) {
        this.convertFlag = value;
    }

    /**
     * Gets the value of the resetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getResetFlag() {
        return resetFlag;
    }

    /**
     * Sets the value of the resetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setResetFlag(Short value) {
        this.resetFlag = value;
    }

    /**
     * Gets the value of the lastTermFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLastTermFlag() {
        return lastTermFlag;
    }

    /**
     * Sets the value of the lastTermFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLastTermFlag(Short value) {
        this.lastTermFlag = value;
    }

    /**
     * Gets the value of the hybridRule property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHybridRule() {
        return hybridRule;
    }

    /**
     * Sets the value of the hybridRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHybridRule(Short value) {
        this.hybridRule = value;
    }

    /**
     * Gets the value of the oldPaymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOldPaymentMode() {
        return oldPaymentMode;
    }

    /**
     * Sets the value of the oldPaymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOldPaymentMode(Short value) {
        this.oldPaymentMode = value;
    }

    /**
     * Gets the value of the newPaymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNewPaymentMode() {
        return newPaymentMode;
    }

    /**
     * Sets the value of the newPaymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNewPaymentMode(Short value) {
        this.newPaymentMode = value;
    }

    /**
     * Gets the value of the dropFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDropFlag() {
        return dropFlag;
    }

    /**
     * Sets the value of the dropFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDropFlag(Short value) {
        this.dropFlag = value;
    }

    /**
     * Gets the value of the sCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link SCustomer }
     *     
     */
    public SCustomer getSCustomer() {
        return sCustomer;
    }

    /**
     * Sets the value of the sCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCustomer }
     *     
     */
    public void setSCustomer(SCustomer value) {
        this.sCustomer = value;
    }

    /**
     * Gets the value of the sAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SAccount }
     *     
     */
    public SAccount getSAccount() {
        return sAccount;
    }

    /**
     * Sets the value of the sAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAccount }
     *     
     */
    public void setSAccount(SAccount value) {
        this.sAccount = value;
    }

    /**
     * Gets the value of the productOrderOperList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderOperList }
     *     
     */
    public SProductOrderOperList getProductOrderOperList() {
        return productOrderOperList;
    }

    /**
     * Sets the value of the productOrderOperList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderOperList }
     *     
     */
    public void setProductOrderOperList(SProductOrderOperList value) {
        this.productOrderOperList = value;
    }

    /**
     * Gets the value of the busiServiceOperList property.
     * 
     * @return
     *     possible object is
     *     {@link SBusiServiceOperList }
     *     
     */
    public SBusiServiceOperList getBusiServiceOperList() {
        return busiServiceOperList;
    }

    /**
     * Sets the value of the busiServiceOperList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBusiServiceOperList }
     *     
     */
    public void setBusiServiceOperList(SBusiServiceOperList value) {
        this.busiServiceOperList = value;
    }

    /**
     * Gets the value of the billalbeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillalbeAcctId() {
        return billalbeAcctId;
    }

    /**
     * Sets the value of the billalbeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillalbeAcctId(Long value) {
        this.billalbeAcctId = value;
    }

    /**
     * Gets the value of the outerBillalbeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterBillalbeAcctId() {
        return outerBillalbeAcctId;
    }

    /**
     * Sets the value of the outerBillalbeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterBillalbeAcctId(String value) {
        this.outerBillalbeAcctId = value;
    }

}
