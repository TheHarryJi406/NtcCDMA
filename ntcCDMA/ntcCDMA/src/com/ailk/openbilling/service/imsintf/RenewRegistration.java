
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for renewRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="renewRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="change_account" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="change_promotion_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="productList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *         &lt;element name="account" type="{http://imsintf.service.openbilling.ailk.com/}sAccount" minOccurs="0"/>
 *         &lt;element name="contactList" type="{http://imsintf.service.openbilling.ailk.com/}sContactList" minOccurs="0"/>
 *         &lt;element name="balanceList" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renewRegistration", propOrder = {
    "userId",
    "phoneId",
    "changeAccount",
    "changePromotionFlag",
    "productList",
    "account",
    "contactList",
    "balanceList"
})
public class RenewRegistration {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "change_account")
    protected Short changeAccount;
    @XmlElement(name = "change_promotion_flag")
    protected Short changePromotionFlag;
    protected SProductOrderList productList;
    protected SAccount account;
    protected SContactList contactList;
    protected SBalanceList balanceList;

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
     * Gets the value of the changeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChangeAccount() {
        return changeAccount;
    }

    /**
     * Sets the value of the changeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChangeAccount(Short value) {
        this.changeAccount = value;
    }

    /**
     * Gets the value of the changePromotionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChangePromotionFlag() {
        return changePromotionFlag;
    }

    /**
     * Sets the value of the changePromotionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChangePromotionFlag(Short value) {
        this.changePromotionFlag = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProductList(SProductOrderList value) {
        this.productList = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link SAccount }
     *     
     */
    public SAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAccount }
     *     
     */
    public void setAccount(SAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link SContactList }
     *     
     */
    public SContactList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SContactList }
     *     
     */
    public void setContactList(SContactList value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the balanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getBalanceList() {
        return balanceList;
    }

    /**
     * Sets the value of the balanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setBalanceList(SBalanceList value) {
        this.balanceList = value;
    }

}
