
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://imsintf.service.openbilling.ailk.com/}sCustomer" minOccurs="0"/>
 *         &lt;element name="accountList" type="{http://imsintf.service.openbilling.ailk.com/}sAccountList" minOccurs="0"/>
 *         &lt;element name="userList" type="{http://imsintf.service.openbilling.ailk.com/}sUserList" minOccurs="0"/>
 *         &lt;element name="productOrderList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *         &lt;element name="contactList" type="{http://imsintf.service.openbilling.ailk.com/}sContactList" minOccurs="0"/>
 *         &lt;element name="userAuthList" type="{http://imsintf.service.openbilling.ailk.com/}sUserAuthList" minOccurs="0"/>
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
@XmlType(name = "newRegistration", propOrder = {
    "customer",
    "accountList",
    "userList",
    "productOrderList",
    "contactList",
    "userAuthList",
    "balanceList"
})
public class NewRegistration {

    protected SCustomer customer;
    protected SAccountList accountList;
    protected SUserList userList;
    protected SProductOrderList productOrderList;
    protected SContactList contactList;
    protected SUserAuthList userAuthList;
    protected SBalanceList balanceList;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link SCustomer }
     *     
     */
    public SCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCustomer }
     *     
     */
    public void setCustomer(SCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the accountList property.
     * 
     * @return
     *     possible object is
     *     {@link SAccountList }
     *     
     */
    public SAccountList getAccountList() {
        return accountList;
    }

    /**
     * Sets the value of the accountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAccountList }
     *     
     */
    public void setAccountList(SAccountList value) {
        this.accountList = value;
    }

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link SUserList }
     *     
     */
    public SUserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserList }
     *     
     */
    public void setUserList(SUserList value) {
        this.userList = value;
    }

    /**
     * Gets the value of the productOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProductOrderList() {
        return productOrderList;
    }

    /**
     * Sets the value of the productOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProductOrderList(SProductOrderList value) {
        this.productOrderList = value;
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
     * Gets the value of the userAuthList property.
     * 
     * @return
     *     possible object is
     *     {@link SUserAuthList }
     *     
     */
    public SUserAuthList getUserAuthList() {
        return userAuthList;
    }

    /**
     * Sets the value of the userAuthList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserAuthList }
     *     
     */
    public void setUserAuthList(SUserAuthList value) {
        this.userAuthList = value;
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
