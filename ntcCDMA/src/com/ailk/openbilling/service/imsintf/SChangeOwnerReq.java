
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sChangeOwnerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sChangeOwnerReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="change_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_old_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="old_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="convert_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="last_term_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_new_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reset_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="change_promotion_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="prod_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderOperList" minOccurs="0"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_segment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="user_valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sChangeOwnerReq", propOrder = {
    "userId",
    "phoneId",
    "changeType",
    "outerOldAcctId",
    "oldAcctId",
    "outerBillableAcctId",
    "billableAcctId",
    "convertFlag",
    "lastTermFlag",
    "outerNewAcctId",
    "newAcctId",
    "resetFlag",
    "changePromotionFlag",
    "prodList",
    "days",
    "userSegment",
    "userValidDate"
})
public class SChangeOwnerReq {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "change_type")
    protected Short changeType;
    @XmlElement(name = "outer_old_acct_id")
    protected String outerOldAcctId;
    @XmlElement(name = "old_acct_id")
    protected Long oldAcctId;
    @XmlElement(name = "outer_billable_acct_id")
    protected String outerBillableAcctId;
    @XmlElement(name = "billable_acct_id")
    protected Long billableAcctId;
    @XmlElement(name = "convert_flag")
    protected Short convertFlag;
    @XmlElement(name = "last_term_flag")
    protected Short lastTermFlag;
    @XmlElement(name = "outer_new_acct_id")
    protected String outerNewAcctId;
    @XmlElement(name = "new_acct_id")
    protected Long newAcctId;
    @XmlElement(name = "reset_flag")
    protected Short resetFlag;
    @XmlElement(name = "change_promotion_flag")
    protected Short changePromotionFlag;
    @XmlElement(name = "prod_list")
    protected SProductOrderOperList prodList;
    protected Long days;
    @XmlElement(name = "user_segment")
    protected Short userSegment;
    @XmlElement(name = "user_valid_date")
    protected String userValidDate;

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
     * Gets the value of the outerOldAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterOldAcctId() {
        return outerOldAcctId;
    }

    /**
     * Sets the value of the outerOldAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterOldAcctId(String value) {
        this.outerOldAcctId = value;
    }

    /**
     * Gets the value of the oldAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldAcctId() {
        return oldAcctId;
    }

    /**
     * Sets the value of the oldAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldAcctId(Long value) {
        this.oldAcctId = value;
    }

    /**
     * Gets the value of the outerBillableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterBillableAcctId() {
        return outerBillableAcctId;
    }

    /**
     * Sets the value of the outerBillableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterBillableAcctId(String value) {
        this.outerBillableAcctId = value;
    }

    /**
     * Gets the value of the billableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillableAcctId() {
        return billableAcctId;
    }

    /**
     * Sets the value of the billableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillableAcctId(Long value) {
        this.billableAcctId = value;
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
     * Gets the value of the changePromotionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChangePromotionFlag() {
        return changePromotionFlag;
    }

    /**
     * Sets the value of the changePromotionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChangePromotionFlag(Short value) {
        this.changePromotionFlag = value;
    }

    /**
     * Gets the value of the prodList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderOperList }
     *     
     */
    public SProductOrderOperList getProdList() {
        return prodList;
    }

    /**
     * Sets the value of the prodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderOperList }
     *     
     */
    public void setProdList(SProductOrderOperList value) {
        this.prodList = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDays(Long value) {
        this.days = value;
    }

    /**
     * Gets the value of the userSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserSegment() {
        return userSegment;
    }

    /**
     * Sets the value of the userSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserSegment(Short value) {
        this.userSegment = value;
    }

    /**
     * Gets the value of the userValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserValidDate() {
        return userValidDate;
    }

    /**
     * Sets the value of the userValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserValidDate(String value) {
        this.userValidDate = value;
    }

}
