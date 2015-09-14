
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sTopUpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sTopUpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_balance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="new_active_stop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validity_period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extra_validity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prod_order_result_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *         &lt;element name="recharge_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="date_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="freeResourceGroupList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceGroupList" minOccurs="0"/>
 *         &lt;element name="reward_balance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="topup_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sTopUpResponse", propOrder = {
    "userId",
    "phoneId",
    "accountBalance",
    "newActiveStop",
    "validityPeriod",
    "extraValidity",
    "prodOrderResultList",
    "rechargeTime",
    "dateTime",
    "freeResourceGroupList",
    "rewardBalance",
    "topupAmount"
})
public class STopUpResponse {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "account_balance")
    protected Long accountBalance;
    @XmlElement(name = "new_active_stop")
    protected String newActiveStop;
    @XmlElement(name = "validity_period")
    protected Integer validityPeriod;
    @XmlElement(name = "extra_validity")
    protected Integer extraValidity;
    @XmlElement(name = "prod_order_result_list")
    protected SProductOrderResultList prodOrderResultList;
    @XmlElement(name = "recharge_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rechargeTime;
    @XmlElement(name = "date_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected FreeResourceGroupList freeResourceGroupList;
    @XmlElement(name = "reward_balance")
    protected Long rewardBalance;
    @XmlElement(name = "topup_amount")
    protected Long topupAmount;

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
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountBalance(Long value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the newActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewActiveStop() {
        return newActiveStop;
    }

    /**
     * Sets the value of the newActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewActiveStop(String value) {
        this.newActiveStop = value;
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
     * Gets the value of the prodOrderResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderResultList }
     *     
     */
    public SProductOrderResultList getProdOrderResultList() {
        return prodOrderResultList;
    }

    /**
     * Sets the value of the prodOrderResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderResultList }
     *     
     */
    public void setProdOrderResultList(SProductOrderResultList value) {
        this.prodOrderResultList = value;
    }

    /**
     * Gets the value of the rechargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRechargeTime() {
        return rechargeTime;
    }

    /**
     * Sets the value of the rechargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRechargeTime(XMLGregorianCalendar value) {
        this.rechargeTime = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the freeResourceGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public FreeResourceGroupList getFreeResourceGroupList() {
        return freeResourceGroupList;
    }

    /**
     * Sets the value of the freeResourceGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public void setFreeResourceGroupList(FreeResourceGroupList value) {
        this.freeResourceGroupList = value;
    }

    /**
     * Gets the value of the rewardBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRewardBalance() {
        return rewardBalance;
    }

    /**
     * Sets the value of the rewardBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRewardBalance(Long value) {
        this.rewardBalance = value;
    }

    /**
     * Gets the value of the topupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTopupAmount() {
        return topupAmount;
    }

    /**
     * Sets the value of the topupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTopupAmount(Long value) {
        this.topupAmount = value;
    }

}
