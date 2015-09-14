
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sTopUpInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sTopUpInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recharge_method" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="recharge_partner_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recharge_service_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serial_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batch_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="card_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sTopUpInfo", propOrder = {
    "userId",
    "phoneId",
    "amount",
    "rechargeMethod",
    "rechargePartnerId",
    "rechargeServiceId",
    "serialNo",
    "batchNo",
    "remark",
    "ownerType",
    "outerAcctId",
    "acctId",
    "sBalance",
    "cardType"
})
public class STopUpInfo {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected Long amount;
    @XmlElement(name = "recharge_method")
    protected Short rechargeMethod;
    @XmlElement(name = "recharge_partner_id")
    protected Integer rechargePartnerId;
    @XmlElement(name = "recharge_service_id")
    protected Integer rechargeServiceId;
    @XmlElement(name = "serial_no")
    protected String serialNo;
    @XmlElement(name = "batch_no")
    protected String batchNo;
    protected String remark;
    @XmlElement(name = "owner_type")
    protected Integer ownerType;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    protected SBalance sBalance;
    @XmlElement(name = "card_type")
    protected Short cardType;

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
     * Gets the value of the rechargeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRechargeMethod() {
        return rechargeMethod;
    }

    /**
     * Sets the value of the rechargeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRechargeMethod(Short value) {
        this.rechargeMethod = value;
    }

    /**
     * Gets the value of the rechargePartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRechargePartnerId() {
        return rechargePartnerId;
    }

    /**
     * Sets the value of the rechargePartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRechargePartnerId(Integer value) {
        this.rechargePartnerId = value;
    }

    /**
     * Gets the value of the rechargeServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRechargeServiceId() {
        return rechargeServiceId;
    }

    /**
     * Sets the value of the rechargeServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRechargeServiceId(Integer value) {
        this.rechargeServiceId = value;
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

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerType(Integer value) {
        this.ownerType = value;
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
     * Gets the value of the sBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getSBalance() {
        return sBalance;
    }

    /**
     * Sets the value of the sBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setSBalance(SBalance value) {
        this.sBalance = value;
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

}
