
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="org_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_org_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="target_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_target_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="target_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="op_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transfer_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transfer_rule_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="transfer_times" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgOldBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="orgNewBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="targetOldBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="targetNewBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="orgOldFreeResource" type="{http://imsintf.service.openbilling.ailk.com/}freeResource" minOccurs="0"/>
 *         &lt;element name="orgNewFreeResource" type="{http://imsintf.service.openbilling.ailk.com/}freeResource" minOccurs="0"/>
 *         &lt;element name="targetOldFreeResource" type="{http://imsintf.service.openbilling.ailk.com/}freeResource" minOccurs="0"/>
 *         &lt;element name="targetNewFreeResource" type="{http://imsintf.service.openbilling.ailk.com/}freeResource" minOccurs="0"/>
 *         &lt;element name="oneTimeFee" type="{http://imsintf.service.openbilling.ailk.com/}feeItemList" minOccurs="0"/>
 *         &lt;element name="so_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="source_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferLog", propOrder = {
    "orgPhoneId",
    "outerOrgAcctId",
    "orgAcctId",
    "targetPhoneId",
    "outerTargetAcctId",
    "targetAcctId",
    "flag",
    "opId",
    "transferDate",
    "transferRuleId",
    "transferTimes",
    "remark",
    "orgOldBalance",
    "orgNewBalance",
    "targetOldBalance",
    "targetNewBalance",
    "orgOldFreeResource",
    "orgNewFreeResource",
    "targetOldFreeResource",
    "targetNewFreeResource",
    "oneTimeFee",
    "soMode",
    "sourceSystem",
    "transactionId"
})
public class TransferLog {

    @XmlElement(name = "org_phone_id")
    protected String orgPhoneId;
    @XmlElement(name = "outer_org_acct_id")
    protected String outerOrgAcctId;
    @XmlElement(name = "org_acct_id")
    protected Long orgAcctId;
    @XmlElement(name = "target_phone_id")
    protected String targetPhoneId;
    @XmlElement(name = "outer_target_acct_id")
    protected String outerTargetAcctId;
    @XmlElement(name = "target_acct_id")
    protected Long targetAcctId;
    protected short flag;
    @XmlElement(name = "op_id")
    protected Integer opId;
    @XmlElement(name = "transfer_date")
    protected String transferDate;
    @XmlElement(name = "transfer_rule_id")
    protected short transferRuleId;
    @XmlElement(name = "transfer_times")
    protected Long transferTimes;
    protected String remark;
    protected SBalance orgOldBalance;
    protected SBalance orgNewBalance;
    protected SBalance targetOldBalance;
    protected SBalance targetNewBalance;
    protected FreeResource orgOldFreeResource;
    protected FreeResource orgNewFreeResource;
    protected FreeResource targetOldFreeResource;
    protected FreeResource targetNewFreeResource;
    protected FeeItemList oneTimeFee;
    @XmlElement(name = "so_mode")
    protected Short soMode;
    @XmlElement(name = "source_system")
    protected String sourceSystem;
    @XmlElement(name = "transaction_id")
    protected String transactionId;

    /**
     * Gets the value of the orgPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPhoneId() {
        return orgPhoneId;
    }

    /**
     * Sets the value of the orgPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPhoneId(String value) {
        this.orgPhoneId = value;
    }

    /**
     * Gets the value of the outerOrgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterOrgAcctId() {
        return outerOrgAcctId;
    }

    /**
     * Sets the value of the outerOrgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterOrgAcctId(String value) {
        this.outerOrgAcctId = value;
    }

    /**
     * Gets the value of the orgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgAcctId() {
        return orgAcctId;
    }

    /**
     * Sets the value of the orgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgAcctId(Long value) {
        this.orgAcctId = value;
    }

    /**
     * Gets the value of the targetPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPhoneId() {
        return targetPhoneId;
    }

    /**
     * Sets the value of the targetPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPhoneId(String value) {
        this.targetPhoneId = value;
    }

    /**
     * Gets the value of the outerTargetAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterTargetAcctId() {
        return outerTargetAcctId;
    }

    /**
     * Sets the value of the outerTargetAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterTargetAcctId(String value) {
        this.outerTargetAcctId = value;
    }

    /**
     * Gets the value of the targetAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetAcctId() {
        return targetAcctId;
    }

    /**
     * Sets the value of the targetAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetAcctId(Long value) {
        this.targetAcctId = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getOpId() {
        return opId;
    }

    /**
     * Sets the value of the opId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpId(Integer value) {
        this.opId = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDate(String value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the transferRuleId property.
     * 
     */
    public short getTransferRuleId() {
        return transferRuleId;
    }

    /**
     * Sets the value of the transferRuleId property.
     * 
     */
    public void setTransferRuleId(short value) {
        this.transferRuleId = value;
    }

    /**
     * Gets the value of the transferTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTimes() {
        return transferTimes;
    }

    /**
     * Sets the value of the transferTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTimes(Long value) {
        this.transferTimes = value;
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
     * Gets the value of the orgOldBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getOrgOldBalance() {
        return orgOldBalance;
    }

    /**
     * Sets the value of the orgOldBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setOrgOldBalance(SBalance value) {
        this.orgOldBalance = value;
    }

    /**
     * Gets the value of the orgNewBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getOrgNewBalance() {
        return orgNewBalance;
    }

    /**
     * Sets the value of the orgNewBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setOrgNewBalance(SBalance value) {
        this.orgNewBalance = value;
    }

    /**
     * Gets the value of the targetOldBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getTargetOldBalance() {
        return targetOldBalance;
    }

    /**
     * Sets the value of the targetOldBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setTargetOldBalance(SBalance value) {
        this.targetOldBalance = value;
    }

    /**
     * Gets the value of the targetNewBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getTargetNewBalance() {
        return targetNewBalance;
    }

    /**
     * Sets the value of the targetNewBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setTargetNewBalance(SBalance value) {
        this.targetNewBalance = value;
    }

    /**
     * Gets the value of the orgOldFreeResource property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResource }
     *     
     */
    public FreeResource getOrgOldFreeResource() {
        return orgOldFreeResource;
    }

    /**
     * Sets the value of the orgOldFreeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResource }
     *     
     */
    public void setOrgOldFreeResource(FreeResource value) {
        this.orgOldFreeResource = value;
    }

    /**
     * Gets the value of the orgNewFreeResource property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResource }
     *     
     */
    public FreeResource getOrgNewFreeResource() {
        return orgNewFreeResource;
    }

    /**
     * Sets the value of the orgNewFreeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResource }
     *     
     */
    public void setOrgNewFreeResource(FreeResource value) {
        this.orgNewFreeResource = value;
    }

    /**
     * Gets the value of the targetOldFreeResource property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResource }
     *     
     */
    public FreeResource getTargetOldFreeResource() {
        return targetOldFreeResource;
    }

    /**
     * Sets the value of the targetOldFreeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResource }
     *     
     */
    public void setTargetOldFreeResource(FreeResource value) {
        this.targetOldFreeResource = value;
    }

    /**
     * Gets the value of the targetNewFreeResource property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResource }
     *     
     */
    public FreeResource getTargetNewFreeResource() {
        return targetNewFreeResource;
    }

    /**
     * Sets the value of the targetNewFreeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResource }
     *     
     */
    public void setTargetNewFreeResource(FreeResource value) {
        this.targetNewFreeResource = value;
    }

    /**
     * Gets the value of the oneTimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeItemList }
     *     
     */
    public FeeItemList getOneTimeFee() {
        return oneTimeFee;
    }

    /**
     * Sets the value of the oneTimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeItemList }
     *     
     */
    public void setOneTimeFee(FeeItemList value) {
        this.oneTimeFee = value;
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

}
