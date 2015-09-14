
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sProductOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sProductOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="so_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_param_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductParamList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sProductOrderResult", propOrder = {
    "productId",
    "offerId",
    "soId",
    "validDate",
    "expireDate",
    "productParamList"
})
public class SProductOrderResult {

    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "offer_id")
    protected Long offerId;
    @XmlElement(name = "so_id")
    protected String soId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "product_param_list")
    protected SProductParamList productParamList;

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
     * Gets the value of the soId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoId() {
        return soId;
    }

    /**
     * Sets the value of the soId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoId(String value) {
        this.soId = value;
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
     * Gets the value of the productParamList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductParamList }
     *     
     */
    public SProductParamList getProductParamList() {
        return productParamList;
    }

    /**
     * Sets the value of the productParamList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductParamList }
     *     
     */
    public void setProductParamList(SProductParamList value) {
        this.productParamList = value;
    }

}
