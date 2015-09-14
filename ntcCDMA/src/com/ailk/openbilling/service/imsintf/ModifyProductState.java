
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyProductState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyProductState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="new_state" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="action_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyProductState", propOrder = {
    "phoneId",
    "productId",
    "offerId",
    "newState",
    "actionDate",
    "userId"
})
public class ModifyProductState {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "offer_id")
    protected Long offerId;
    @XmlElement(name = "new_state")
    protected Short newState;
    @XmlElement(name = "action_date")
    protected String actionDate;
    @XmlElement(name = "user_id")
    protected Long userId;

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
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferId(Long value) {
        this.offerId = value;
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

}
