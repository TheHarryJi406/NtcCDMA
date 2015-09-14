
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sOperInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sOperInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="so_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busi_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="so_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="so_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charge_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="isnormal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="op_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prov_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="county_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="org_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rso_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_monitor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="step_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="source_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sOperInfo", propOrder = {
    "soNbr",
    "busiCode",
    "soMode",
    "soDate",
    "chargeFlag",
    "isnormal",
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "opId",
    "provCode",
    "regionCode",
    "countyCode",
    "orgId",
    "rsoNbr",
    "isMonitor",
    "remark",
    "stepId",
    "sourceSystem",
    "notifyFlag"
})
public class SOperInfo {

    @XmlElement(name = "so_nbr")
    protected String soNbr;
    @XmlElement(name = "busi_code")
    protected Integer busiCode;
    @XmlElement(name = "so_mode")
    protected Short soMode;
    @XmlElement(name = "so_date")
    protected String soDate;
    @XmlElement(name = "charge_flag")
    protected Short chargeFlag;
    protected Short isnormal;
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
    @XmlElement(name = "op_id")
    protected Long opId;
    @XmlElement(name = "prov_code")
    protected Short provCode;
    @XmlElement(name = "region_code")
    protected Short regionCode;
    @XmlElement(name = "county_code")
    protected Short countyCode;
    @XmlElement(name = "org_id")
    protected Integer orgId;
    @XmlElement(name = "rso_nbr")
    protected String rsoNbr;
    @XmlElement(name = "is_monitor")
    protected Short isMonitor;
    protected String remark;
    @XmlElement(name = "step_id")
    protected Short stepId;
    @XmlElement(name = "source_system")
    protected String sourceSystem;
    @XmlElement(name = "notify_flag")
    protected Short notifyFlag;

    /**
     * Gets the value of the soNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNbr() {
        return soNbr;
    }

    /**
     * Sets the value of the soNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNbr(String value) {
        this.soNbr = value;
    }

    /**
     * Gets the value of the busiCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusiCode() {
        return busiCode;
    }

    /**
     * Sets the value of the busiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusiCode(Integer value) {
        this.busiCode = value;
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
     * Gets the value of the soDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoDate() {
        return soDate;
    }

    /**
     * Sets the value of the soDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoDate(String value) {
        this.soDate = value;
    }

    /**
     * Gets the value of the chargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChargeFlag() {
        return chargeFlag;
    }

    /**
     * Sets the value of the chargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChargeFlag(Short value) {
        this.chargeFlag = value;
    }

    /**
     * Gets the value of the isnormal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsnormal() {
        return isnormal;
    }

    /**
     * Sets the value of the isnormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsnormal(Short value) {
        this.isnormal = value;
    }

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
     * Gets the value of the provCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProvCode() {
        return provCode;
    }

    /**
     * Sets the value of the provCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProvCode(Short value) {
        this.provCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegionCode(Short value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCountyCode(Short value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrgId(Integer value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the rsoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsoNbr() {
        return rsoNbr;
    }

    /**
     * Sets the value of the rsoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsoNbr(String value) {
        this.rsoNbr = value;
    }

    /**
     * Gets the value of the isMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsMonitor() {
        return isMonitor;
    }

    /**
     * Sets the value of the isMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsMonitor(Short value) {
        this.isMonitor = value;
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
     * Gets the value of the stepId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStepId() {
        return stepId;
    }

    /**
     * Sets the value of the stepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStepId(Short value) {
        this.stepId = value;
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

}
