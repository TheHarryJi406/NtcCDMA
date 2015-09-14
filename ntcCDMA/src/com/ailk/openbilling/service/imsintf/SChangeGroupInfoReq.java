
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sChangeGroupInfoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sChangeGroupInfoReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="max_group_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="main_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clip_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outgoing_cs_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ocs_routing_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="espace_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupOutgingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="group_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sChangeGroupInfoReq", propOrder = {
    "outerGroupId",
    "groupId",
    "maxGroupNumber",
    "mainPhoneId",
    "validDate",
    "expireDate",
    "outerBillableAcctId",
    "billableAcctId",
    "contactPhone",
    "clipFlag",
    "outgoingCsFlag",
    "ocsRoutingFlag",
    "espaceFlag",
    "inGroupOutgoingCall",
    "inGroupIncomingCall",
    "crossGroupOutgoingCall",
    "crossGroupIncomingCall",
    "specOutgoingCall",
    "specIncomingCall",
    "outGroupOutgingCall",
    "outGroupIncomingCall",
    "groupType"
})
public class SChangeGroupInfoReq {

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "max_group_number")
    protected Integer maxGroupNumber;
    @XmlElement(name = "main_phone_id")
    protected String mainPhoneId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "outer_billable_acct_id")
    protected String outerBillableAcctId;
    @XmlElement(name = "billable_acct_id")
    protected Long billableAcctId;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "clip_flag")
    protected Integer clipFlag;
    @XmlElement(name = "outgoing_cs_flag")
    protected Integer outgoingCsFlag;
    @XmlElement(name = "ocs_routing_flag")
    protected Integer ocsRoutingFlag;
    @XmlElement(name = "espace_flag")
    protected Integer espaceFlag;
    protected Integer inGroupOutgoingCall;
    protected Integer inGroupIncomingCall;
    protected Integer crossGroupOutgoingCall;
    protected Integer crossGroupIncomingCall;
    protected Integer specOutgoingCall;
    protected Integer specIncomingCall;
    protected Integer outGroupOutgingCall;
    protected Integer outGroupIncomingCall;
    @XmlElement(name = "group_type")
    protected Short groupType;

    /**
     * Gets the value of the outerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterGroupId() {
        return outerGroupId;
    }

    /**
     * Sets the value of the outerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterGroupId(String value) {
        this.outerGroupId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the maxGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGroupNumber() {
        return maxGroupNumber;
    }

    /**
     * Sets the value of the maxGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGroupNumber(Integer value) {
        this.maxGroupNumber = value;
    }

    /**
     * Gets the value of the mainPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneId() {
        return mainPhoneId;
    }

    /**
     * Sets the value of the mainPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneId(String value) {
        this.mainPhoneId = value;
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
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the clipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClipFlag() {
        return clipFlag;
    }

    /**
     * Sets the value of the clipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClipFlag(Integer value) {
        this.clipFlag = value;
    }

    /**
     * Gets the value of the outgoingCsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutgoingCsFlag() {
        return outgoingCsFlag;
    }

    /**
     * Sets the value of the outgoingCsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutgoingCsFlag(Integer value) {
        this.outgoingCsFlag = value;
    }

    /**
     * Gets the value of the ocsRoutingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOcsRoutingFlag() {
        return ocsRoutingFlag;
    }

    /**
     * Sets the value of the ocsRoutingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOcsRoutingFlag(Integer value) {
        this.ocsRoutingFlag = value;
    }

    /**
     * Gets the value of the espaceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEspaceFlag() {
        return espaceFlag;
    }

    /**
     * Sets the value of the espaceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEspaceFlag(Integer value) {
        this.espaceFlag = value;
    }

    /**
     * Gets the value of the inGroupOutgoingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInGroupOutgoingCall() {
        return inGroupOutgoingCall;
    }

    /**
     * Sets the value of the inGroupOutgoingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInGroupOutgoingCall(Integer value) {
        this.inGroupOutgoingCall = value;
    }

    /**
     * Gets the value of the inGroupIncomingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInGroupIncomingCall() {
        return inGroupIncomingCall;
    }

    /**
     * Sets the value of the inGroupIncomingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInGroupIncomingCall(Integer value) {
        this.inGroupIncomingCall = value;
    }

    /**
     * Gets the value of the crossGroupOutgoingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrossGroupOutgoingCall() {
        return crossGroupOutgoingCall;
    }

    /**
     * Sets the value of the crossGroupOutgoingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrossGroupOutgoingCall(Integer value) {
        this.crossGroupOutgoingCall = value;
    }

    /**
     * Gets the value of the crossGroupIncomingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrossGroupIncomingCall() {
        return crossGroupIncomingCall;
    }

    /**
     * Sets the value of the crossGroupIncomingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrossGroupIncomingCall(Integer value) {
        this.crossGroupIncomingCall = value;
    }

    /**
     * Gets the value of the specOutgoingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecOutgoingCall() {
        return specOutgoingCall;
    }

    /**
     * Sets the value of the specOutgoingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecOutgoingCall(Integer value) {
        this.specOutgoingCall = value;
    }

    /**
     * Gets the value of the specIncomingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecIncomingCall() {
        return specIncomingCall;
    }

    /**
     * Sets the value of the specIncomingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecIncomingCall(Integer value) {
        this.specIncomingCall = value;
    }

    /**
     * Gets the value of the outGroupOutgingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutGroupOutgingCall() {
        return outGroupOutgingCall;
    }

    /**
     * Sets the value of the outGroupOutgingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutGroupOutgingCall(Integer value) {
        this.outGroupOutgingCall = value;
    }

    /**
     * Gets the value of the outGroupIncomingCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutGroupIncomingCall() {
        return outGroupIncomingCall;
    }

    /**
     * Sets the value of the outGroupIncomingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutGroupIncomingCall(Integer value) {
        this.outGroupIncomingCall = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGroupType(Short value) {
        this.groupType = value;
    }

}
