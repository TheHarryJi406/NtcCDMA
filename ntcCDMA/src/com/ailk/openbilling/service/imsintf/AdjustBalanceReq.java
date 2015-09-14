
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adjustBalanceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adjustBalanceReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjust_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="rtner" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sBalance" type="{http://imsintf.service.openbilling.ailk.com/}sBalance" minOccurs="0"/>
 *         &lt;element name="freeResourceList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceList" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maximum_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adjustBalanceReq", propOrder = {
    "adjustType",
    "outerAcctId",
    "acctId",
    "phoneId",
    "flag",
    "rtner",
    "remark",
    "notifyFlag",
    "sBalance",
    "freeResourceList",
    "userId",
    "maximumFlag"
})
public class AdjustBalanceReq {

    @XmlElement(name = "adjust_type")
    protected Short adjustType;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected Short flag;
    protected Short rtner;
    protected String remark;
    @XmlElement(name = "notify_flag")
    protected Short notifyFlag;
    protected SBalance sBalance;
    protected FreeResourceList freeResourceList;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "maximum_flag")
    protected Short maximumFlag;

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
     * Gets the value of the notifyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyFlag() {
        return notifyFlag;
    }

    /**
     * Sets the value of the notifyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyFlag(Short value) {
        this.notifyFlag = value;
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
     * Gets the value of the freeResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceList }
     *     
     */
    public FreeResourceList getFreeResourceList() {
        return freeResourceList;
    }

    /**
     * Sets the value of the freeResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceList }
     *     
     */
    public void setFreeResourceList(FreeResourceList value) {
        this.freeResourceList = value;
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

}
