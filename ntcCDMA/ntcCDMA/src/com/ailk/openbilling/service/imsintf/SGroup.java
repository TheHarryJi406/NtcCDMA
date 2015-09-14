
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_parent_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="main_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="max_group_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="group_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="group_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outer_billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cLIP_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGoing_cs_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ocs_routing_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="espace_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specail_number_list" type="{http://imsintf.service.openbilling.ailk.com/}specialNumberList" minOccurs="0"/>
 *         &lt;element name="inGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupOutgingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sGroup", propOrder = {
    "outerGroupId",
    "groupId",
    "outerParentGroupId",
    "parentGroupId",
    "mainPhoneId",
    "maxGroupNumber",
    "groupType",
    "groupName",
    "contactPhone",
    "status",
    "outerBillableAcctId",
    "billableAcctId",
    "outerCustId",
    "custId",
    "validDate",
    "expireDate",
    "clipFlag",
    "outGoingCsFlag",
    "ocsRoutingFlag",
    "espaceFlag",
    "specailNumberList",
    "inGroupOutgoingCall",
    "inGroupIncomingCall",
    "crossGroupOutgoingCall",
    "crossGroupIncomingCall",
    "outGroupOutgingCall",
    "outGroupIncomingCall",
    "specOutgoingCall",
    "specIncomingCall"
})
public class SGroup {

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "outer_parent_group_id")
    protected String outerParentGroupId;
    @XmlElement(name = "parent_group_id")
    protected Long parentGroupId;
    @XmlElement(name = "main_phone_id")
    protected String mainPhoneId;
    @XmlElement(name = "max_group_number")
    protected Integer maxGroupNumber;
    @XmlElement(name = "group_type")
    protected Short groupType;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    protected Integer status;
    @XmlElement(name = "outer_billable_acct_id")
    protected String outerBillableAcctId;
    @XmlElement(name = "billable_acct_id")
    protected Long billableAcctId;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "cLIP_flag")
    protected Integer clipFlag;
    @XmlElement(name = "outGoing_cs_flag")
    protected Integer outGoingCsFlag;
    @XmlElement(name = "ocs_routing_flag")
    protected Integer ocsRoutingFlag;
    @XmlElement(name = "espace_flag")
    protected Integer espaceFlag;
    @XmlElement(name = "specail_number_list")
    protected SpecialNumberList specailNumberList;
    protected Integer inGroupOutgoingCall;
    protected Integer inGroupIncomingCall;
    protected Integer crossGroupOutgoingCall;
    protected Integer crossGroupIncomingCall;
    protected Integer outGroupOutgingCall;
    protected Integer outGroupIncomingCall;
    protected Integer specOutgoingCall;
    protected Integer specIncomingCall;

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
     * Gets the value of the outerParentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterParentGroupId() {
        return outerParentGroupId;
    }

    /**
     * Sets the value of the outerParentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterParentGroupId(String value) {
        this.outerParentGroupId = value;
    }

    /**
     * Gets the value of the parentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentGroupId() {
        return parentGroupId;
    }

    /**
     * Sets the value of the parentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentGroupId(Long value) {
        this.parentGroupId = value;
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

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
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
     * Gets the value of the clipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLIPFlag() {
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
    public void setCLIPFlag(Integer value) {
        this.clipFlag = value;
    }

    /**
     * Gets the value of the outGoingCsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutGoingCsFlag() {
        return outGoingCsFlag;
    }

    /**
     * Sets the value of the outGoingCsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutGoingCsFlag(Integer value) {
        this.outGoingCsFlag = value;
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
     * Gets the value of the specailNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNumberList }
     *     
     */
    public SpecialNumberList getSpecailNumberList() {
        return specailNumberList;
    }

    /**
     * Sets the value of the specailNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNumberList }
     *     
     */
    public void setSpecailNumberList(SpecialNumberList value) {
        this.specailNumberList = value;
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

}
