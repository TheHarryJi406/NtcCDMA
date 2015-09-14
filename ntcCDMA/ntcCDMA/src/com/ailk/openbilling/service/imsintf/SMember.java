
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clip_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="display_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="espace_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="crossGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specOutgoingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupOutgingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outGroupIncomingCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sMember", propOrder = {
    "phoneId",
    "shortPhoneId",
    "role",
    "validDate",
    "expireDate",
    "numberType",
    "clipFlag",
    "displayNumber",
    "espaceFlag",
    "status",
    "inGroupOutgoingCall",
    "inGroupIncomingCall",
    "crossGroupOutgoingCall",
    "crossGroupIncomingCall",
    "specOutgoingCall",
    "specIncomingCall",
    "outGroupOutgingCall",
    "outGroupIncomingCall",
    "groupId"
})
public class SMember {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "short_phone_id")
    protected String shortPhoneId;
    protected Integer role;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "number_type")
    protected Integer numberType;
    @XmlElement(name = "clip_flag")
    protected Integer clipFlag;
    @XmlElement(name = "display_number")
    protected String displayNumber;
    @XmlElement(name = "espace_flag")
    protected Integer espaceFlag;
    protected Integer status;
    protected Integer inGroupOutgoingCall;
    protected Integer inGroupIncomingCall;
    protected Integer crossGroupOutgoingCall;
    protected Integer crossGroupIncomingCall;
    protected Integer specOutgoingCall;
    protected Integer specIncomingCall;
    protected Integer outGroupOutgingCall;
    protected Integer outGroupIncomingCall;
    @XmlElement(name = "group_id")
    protected Long groupId;

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
     * Gets the value of the shortPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortPhoneId() {
        return shortPhoneId;
    }

    /**
     * Sets the value of the shortPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortPhoneId(String value) {
        this.shortPhoneId = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRole(Integer value) {
        this.role = value;
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
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberType(Integer value) {
        this.numberType = value;
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
     * Gets the value of the displayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNumber() {
        return displayNumber;
    }

    /**
     * Sets the value of the displayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNumber(String value) {
        this.displayNumber = value;
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

}
