
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUserStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUserStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="new_state" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sub_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="reason_days" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="action_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspend_request_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fraud_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="unbilling_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUserStatus", propOrder = {
    "userId",
    "phoneId",
    "regionCode",
    "newState",
    "subType",
    "reasonDays",
    "actionDate",
    "validDate",
    "expireDate",
    "suspendRequestFlag",
    "fraudFlag",
    "unbillingFlag"
})
public class SUserStatus {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "region_code")
    protected Integer regionCode;
    @XmlElement(name = "new_state")
    protected Short newState;
    @XmlElement(name = "sub_type")
    protected Short subType;
    @XmlElement(name = "reason_days")
    protected Short reasonDays;
    @XmlElement(name = "action_date")
    protected String actionDate;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "suspend_request_flag")
    protected Short suspendRequestFlag;
    @XmlElement(name = "fraud_flag")
    protected Short fraudFlag;
    @XmlElement(name = "unbilling_flag")
    protected Short unbillingFlag;

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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegionCode(Integer value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the newState property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNewState(Short value) {
        this.newState = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSubType(Short value) {
        this.subType = value;
    }

    /**
     * Gets the value of the reasonDays property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReasonDays() {
        return reasonDays;
    }

    /**
     * Sets the value of the reasonDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReasonDays(Short value) {
        this.reasonDays = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDate(String value) {
        this.actionDate = value;
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
     * Gets the value of the suspendRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSuspendRequestFlag() {
        return suspendRequestFlag;
    }

    /**
     * Sets the value of the suspendRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSuspendRequestFlag(Short value) {
        this.suspendRequestFlag = value;
    }

    /**
     * Gets the value of the fraudFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFraudFlag() {
        return fraudFlag;
    }

    /**
     * Sets the value of the fraudFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFraudFlag(Short value) {
        this.fraudFlag = value;
    }

    /**
     * Gets the value of the unbillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnbillingFlag() {
        return unbillingFlag;
    }

    /**
     * Sets the value of the unbillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnbillingFlag(Short value) {
        this.unbillingFlag = value;
    }

}
