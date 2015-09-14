
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autoTopUpRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoTopUpRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auto_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_channel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="bank_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_acct_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="additional_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_serial_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_batch_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="auto_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="topup_date" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="notification_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoTopUpRelation", propOrder = {
    "autoId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "amount",
    "validDate",
    "expireDate",
    "payChannel",
    "bankAcctId",
    "bankAcctName",
    "creditCardNo",
    "bankCode",
    "additionalInfo",
    "cardSerialNo",
    "cardBatchNo",
    "cardType",
    "autoType",
    "topupDate",
    "notificationFlag"
})
public class AutoTopUpRelation {

    @XmlElement(name = "auto_id")
    protected String autoId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected Long amount;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "pay_channel")
    protected Short payChannel;
    @XmlElement(name = "bank_acct_id")
    protected String bankAcctId;
    @XmlElement(name = "bank_acct_name")
    protected String bankAcctName;
    @XmlElement(name = "credit_card_no")
    protected String creditCardNo;
    @XmlElement(name = "bank_code")
    protected Integer bankCode;
    @XmlElement(name = "additional_info")
    protected String additionalInfo;
    @XmlElement(name = "card_serial_no")
    protected String cardSerialNo;
    @XmlElement(name = "card_batch_no")
    protected String cardBatchNo;
    @XmlElement(name = "card_type")
    protected Short cardType;
    @XmlElement(name = "auto_type")
    protected Short autoType;
    @XmlElement(name = "topup_date")
    protected Short topupDate;
    @XmlElement(name = "notification_flag")
    protected Short notificationFlag;

    /**
     * Gets the value of the autoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoId() {
        return autoId;
    }

    /**
     * Sets the value of the autoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoId(String value) {
        this.autoId = value;
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
     * Gets the value of the payChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPayChannel() {
        return payChannel;
    }

    /**
     * Sets the value of the payChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPayChannel(Short value) {
        this.payChannel = value;
    }

    /**
     * Gets the value of the bankAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctId() {
        return bankAcctId;
    }

    /**
     * Sets the value of the bankAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctId(String value) {
        this.bankAcctId = value;
    }

    /**
     * Gets the value of the bankAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * Sets the value of the bankAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankCode(Integer value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the cardSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSerialNo() {
        return cardSerialNo;
    }

    /**
     * Sets the value of the cardSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSerialNo(String value) {
        this.cardSerialNo = value;
    }

    /**
     * Gets the value of the cardBatchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBatchNo() {
        return cardBatchNo;
    }

    /**
     * Sets the value of the cardBatchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBatchNo(String value) {
        this.cardBatchNo = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCardType(Short value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the autoType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAutoType() {
        return autoType;
    }

    /**
     * Sets the value of the autoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAutoType(Short value) {
        this.autoType = value;
    }

    /**
     * Gets the value of the topupDate property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTopupDate() {
        return topupDate;
    }

    /**
     * Sets the value of the topupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTopupDate(Short value) {
        this.topupDate = value;
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

}
