
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="op_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adjust_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="adjust_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="freeResourceLogList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceLog" minOccurs="0"/>
 *         &lt;element name="oldBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="newBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="so_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="source_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximum_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="rtner" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="failed_Reson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustLog", propOrder = {
    "phoneId",
    "outerAcctId",
    "acctId",
    "flag",
    "opId",
    "adjustType",
    "adjustTime",
    "amount",
    "days",
    "remark",
    "startFlag",
    "freeResourceLogList",
    "oldBalance",
    "newBalance",
    "soMode",
    "sourceSystem",
    "transactionId",
    "maximumFlag",
    "rtner",
    "failedReson"
})
public class AdjustLog {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected long acctId;
    protected Short flag;
    @XmlElement(name = "op_id")
    protected Long opId;
    @XmlElement(name = "adjust_type")
    protected Short adjustType;
    @XmlElement(name = "adjust_time")
    protected String adjustTime;
    protected Long amount;
    protected Long days;
    protected String remark;
    @XmlElement(name = "start_flag")
    protected Short startFlag;
    protected FreeResourceLog freeResourceLogList;
    protected SBalance oldBalance;
    protected SBalance newBalance;
    @XmlElement(name = "so_mode")
    protected Short soMode;
    @XmlElement(name = "source_system")
    protected String sourceSystem;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "maximum_flag")
    protected Short maximumFlag;
    protected Short rtner;
    @XmlElement(name = "failed_Reson")
    protected String failedReson;

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
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFlag(Short value) {
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
     * Gets the value of the adjustType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAdjustType() {
        return adjustType;
    }

    /**
     * Sets the value of the adjustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAdjustType(Short value) {
        this.adjustType = value;
    }

    /**
     * Gets the value of the adjustTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustTime() {
        return adjustTime;
    }

    /**
     * Sets the value of the adjustTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustTime(String value) {
        this.adjustTime = value;
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
     * Gets the value of the startFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStartFlag() {
        return startFlag;
    }

    /**
     * Sets the value of the startFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStartFlag(Short value) {
        this.startFlag = value;
    }

    /**
     * Gets the value of the freeResourceLogList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceLog }
     *     
     */
    public FreeResourceLog getFreeResourceLogList() {
        return freeResourceLogList;
    }

    /**
     * Sets the value of the freeResourceLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceLog }
     *     
     */
    public void setFreeResourceLogList(FreeResourceLog value) {
        this.freeResourceLogList = value;
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
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalance }
     *     
     */
    public SBalance getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalance }
     *     
     */
    public void setNewBalance(SBalance value) {
        this.newBalance = value;
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
     * Gets the value of the maximumFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaximumFlag() {
        return maximumFlag;
    }

    /**
     * Sets the value of the maximumFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaximumFlag(Short value) {
        this.maximumFlag = value;
    }

    /**
     * Gets the value of the rtner property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRtner() {
        return rtner;
    }

    /**
     * Sets the value of the rtner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRtner(Short value) {
        this.rtner = value;
    }

    /**
     * Gets the value of the failedReson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedReson() {
        return failedReson;
    }

    /**
     * Sets the value of the failedReson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedReson(String value) {
        this.failedReson = value;
    }

}
