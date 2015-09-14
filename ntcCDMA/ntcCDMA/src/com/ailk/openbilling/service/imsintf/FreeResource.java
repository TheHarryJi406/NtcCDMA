
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remain_resource" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vaild_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource_after" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_before" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_request" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_adjust" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="capital_flag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="remain_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeResource", propOrder = {
    "productId",
    "offerId",
    "phoneId",
    "resourceId",
    "resourceName",
    "groupName",
    "resourceAmount",
    "remainResource",
    "vaildDate",
    "expireDate",
    "resourceAfter",
    "resourceBefore",
    "resourceRequest",
    "resourceAdjust",
    "capitalFlag",
    "groupId",
    "paymentMode",
    "remainValue",
    "resourceUnit"
})
public class FreeResource {

    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "offer_id")
    protected Long offerId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "resource_id")
    protected Long resourceId;
    @XmlElement(name = "resource_name")
    protected String resourceName;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "resource_amount")
    protected Long resourceAmount;
    @XmlElement(name = "remain_resource")
    protected Double remainResource;
    @XmlElement(name = "vaild_date")
    protected String vaildDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "resource_after")
    protected Long resourceAfter;
    @XmlElement(name = "resource_before")
    protected Long resourceBefore;
    @XmlElement(name = "resource_request")
    protected Long resourceRequest;
    @XmlElement(name = "resource_adjust")
    protected Long resourceAdjust;
    @XmlElement(name = "capital_flag")
    protected Long capitalFlag;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "payment_mode")
    protected Short paymentMode;
    @XmlElement(name = "remain_value")
    protected Long remainValue;
    @XmlElement(name = "resource_unit")
    protected String resourceUnit;

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
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceId(Long value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
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
     * Gets the value of the resourceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceAmount() {
        return resourceAmount;
    }

    /**
     * Sets the value of the resourceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceAmount(Long value) {
        this.resourceAmount = value;
    }

    /**
     * Gets the value of the remainResource property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainResource() {
        return remainResource;
    }

    /**
     * Sets the value of the remainResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainResource(Double value) {
        this.remainResource = value;
    }

    /**
     * Gets the value of the vaildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaildDate() {
        return vaildDate;
    }

    /**
     * Sets the value of the vaildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaildDate(String value) {
        this.vaildDate = value;
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
     * Gets the value of the resourceAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceAfter() {
        return resourceAfter;
    }

    /**
     * Sets the value of the resourceAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceAfter(Long value) {
        this.resourceAfter = value;
    }

    /**
     * Gets the value of the resourceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceBefore() {
        return resourceBefore;
    }

    /**
     * Sets the value of the resourceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceBefore(Long value) {
        this.resourceBefore = value;
    }

    /**
     * Gets the value of the resourceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceRequest() {
        return resourceRequest;
    }

    /**
     * Sets the value of the resourceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceRequest(Long value) {
        this.resourceRequest = value;
    }

    /**
     * Gets the value of the resourceAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceAdjust() {
        return resourceAdjust;
    }

    /**
     * Sets the value of the resourceAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceAdjust(Long value) {
        this.resourceAdjust = value;
    }

    /**
     * Gets the value of the capitalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapitalFlag() {
        return capitalFlag;
    }

    /**
     * Sets the value of the capitalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapitalFlag(Long value) {
        this.capitalFlag = value;
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
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentMode(Short value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the remainValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainValue() {
        return remainValue;
    }

    /**
     * Sets the value of the remainValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainValue(Long value) {
        this.remainValue = value;
    }

    /**
     * Gets the value of the resourceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceUnit() {
        return resourceUnit;
    }

    /**
     * Sets the value of the resourceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceUnit(String value) {
        this.resourceUnit = value;
    }

}
