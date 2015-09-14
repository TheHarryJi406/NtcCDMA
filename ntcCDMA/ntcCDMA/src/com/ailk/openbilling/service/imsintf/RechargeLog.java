
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechargeLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechargeLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="op_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recharge_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_serial_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recharge_method" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="recharge_partner_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recharge_service_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_batch_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="newBalanceList" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *         &lt;element name="so_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="source_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validity_period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extra_validity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freeResrouceGroupList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceGroupList" minOccurs="0"/>
 *         &lt;element name="productOrdResultList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargeLog", propOrder = {
    "phoneId",
    "outerAcctId",
    "acctId",
    "flag",
    "opId",
    "rechargeTime",
    "amount",
    "remark",
    "cardSerialNo",
    "rechargeMethod",
    "rechargePartnerId",
    "rechargeServiceId",
    "paymentMode",
    "cardBatchNo",
    "oldBalance",
    "newBalanceList",
    "soMode",
    "sourceSystem",
    "transactionId",
    "validityPeriod",
    "extraValidity",
    "freeResrouceGroupList",
    "productOrdResultList"
})
public class RechargeLog {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected long acctId;
    protected short flag;
    @XmlElement(name = "op_id")
    protected Long opId;
    @XmlElement(name = "recharge_time")
    protected String rechargeTime;
    protected long amount;
    protected String remark;
    @XmlElement(name = "card_serial_no")
    protected String cardSerialNo;
    @XmlElement(name = "recharge_method")
    protected Short rechargeMethod;
    @XmlElement(name = "recharge_partner_id")
    protected String rechargePartnerId;
    @XmlElement(name = "recharge_service_id")
    protected Integer rechargeServiceId;
    @XmlElement(name = "payment_mode")
    protected String paymentMode;
    @XmlElement(name = "card_batch_no")
    protected String cardBatchNo;
    protected SBalance oldBalance;
    protected SBalanceList newBalanceList;
    @XmlElement(name = "so_mode")
    protected Short soMode;
    @XmlElement(name = "source_system")
    protected String sourceSystem;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "validity_period")
    protected Integer validityPeriod;
    @XmlElement(name = "extra_validity")
    protected Integer extraValidity;
    protected FreeResourceGroupList freeResrouceGroupList;
    protected SProductOrderList productOrdResultList;

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
     */
    public long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     */
    public void setAcctId(long value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     */
    public short getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     */
    public void setFlag(short value) {
        this.flag = value;
    }

    /**
     * Gets the value of the opId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpId() {
        return opId;
    }

    /**
     * Sets the value of the opId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpId(Long value) {
        this.opId = value;
    }

    /**
     * Gets the value of the rechargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeTime() {
        return rechargeTime;
    }

    /**
     * Sets the value of the rechargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeTime(String value) {
        this.rechargeTime = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
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
     *     {@link String }
     *     
     */
    public String getRechargePartnerId() {
        return rechargePartnerId;
    }

    /**
     * Sets the value of the rechargePartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargePartnerId(String value) {
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
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
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
     * Gets the value of the oldBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getOldBalance() {
        return oldBalance;
    }

    /**
     * Sets the value of the oldBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setOldBalance(SBalance value) {
        this.oldBalance = value;
    }

    /**
     * Gets the value of the newBalanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getNewBalanceList() {
        return newBalanceList;
    }

    /**
     * Sets the value of the newBalanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setNewBalanceList(SBalanceList value) {
        this.newBalanceList = value;
    }

    /**
     * Gets the value of the soMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSoMode() {
        return soMode;
    }

    /**
     * Sets the value of the soMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSoMode(Short value) {
        this.soMode = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidityPeriod(Integer value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the extraValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtraValidity() {
        return extraValidity;
    }

    /**
     * Sets the value of the extraValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtraValidity(Integer value) {
        this.extraValidity = value;
    }

    /**
     * Gets the value of the freeResrouceGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public FreeResourceGroupList getFreeResrouceGroupList() {
        return freeResrouceGroupList;
    }

    /**
     * Sets the value of the freeResrouceGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public void setFreeResrouceGroupList(FreeResourceGroupList value) {
        this.freeResrouceGroupList = value;
    }

    /**
     * Gets the value of the productOrdResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProductOrdResultList() {
        return productOrdResultList;
    }

    /**
     * Sets the value of the productOrdResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProductOrdResultList(SProductOrderList value) {
        this.productOrdResultList = value;
    }

}
