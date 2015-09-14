
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sTransferReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sTransferReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_org_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="org_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_target_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="target_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="target_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rule_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="times" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="org_owner_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="target_owner_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sTransferReq", propOrder = {
    "outerOrgAcctId",
    "orgAcctId",
    "orgPhoneId",
    "outerTargetAcctId",
    "targetAcctId",
    "targetPhoneId",
    "ruleId",
    "times",
    "orgOwnerType",
    "targetOwnerType"
})
public class STransferReq {

    @XmlElement(name = "outer_org_acct_id")
    protected String outerOrgAcctId;
    @XmlElement(name = "org_acct_id")
    protected Long orgAcctId;
    @XmlElement(name = "org_phone_id")
    protected String orgPhoneId;
    @XmlElement(name = "outer_target_acct_id")
    protected String outerTargetAcctId;
    @XmlElement(name = "target_acct_id")
    protected Long targetAcctId;
    @XmlElement(name = "target_phone_id")
    protected String targetPhoneId;
    @XmlElement(name = "rule_id")
    protected Long ruleId;
    protected Short times;
    @XmlElement(name = "org_owner_type")
    protected Integer orgOwnerType;
    @XmlElement(name = "target_owner_type")
    protected Integer targetOwnerType;

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
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTimes(Short value) {
        this.times = value;
    }

    /**
     * Gets the value of the orgOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrgOwnerType() {
        return orgOwnerType;
    }

    /**
     * Sets the value of the orgOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrgOwnerType(Integer value) {
        this.orgOwnerType = value;
    }

    /**
     * Gets the value of the targetOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetOwnerType() {
        return targetOwnerType;
    }

    /**
     * Sets the value of the targetOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetOwnerType(Integer value) {
        this.targetOwnerType = value;
    }

}
