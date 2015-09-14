
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accumulate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accumulate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accumulate_item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accumulate_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accumulate_amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="accumulate_pay_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accumulate", propOrder = {
    "productId",
    "offerId",
    "accumulateItem",
    "accumulateName",
    "accumulateAmount",
    "accumulatePayMode"
})
public class Accumulate {

    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "offer_id")
    protected Long offerId;
    @XmlElement(name = "accumulate_item")
    protected int accumulateItem;
    @XmlElement(name = "accumulate_name")
    protected String accumulateName;
    @XmlElement(name = "accumulate_amount")
    protected double accumulateAmount;
    @XmlElement(name = "accumulate_pay_mode")
    protected Short accumulatePayMode;

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
     * Gets the value of the accumulateItem property.
     * 
     */
    public int getAccumulateItem() {
        return accumulateItem;
    }

    /**
     * Sets the value of the accumulateItem property.
     * 
     */
    public void setAccumulateItem(int value) {
        this.accumulateItem = value;
    }

    /**
     * Gets the value of the accumulateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulateName() {
        return accumulateName;
    }

    /**
     * Sets the value of the accumulateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulateName(String value) {
        this.accumulateName = value;
    }

    /**
     * Gets the value of the accumulateAmount property.
     * 
     */
    public double getAccumulateAmount() {
        return accumulateAmount;
    }

    /**
     * Sets the value of the accumulateAmount property.
     * 
     */
    public void setAccumulateAmount(double value) {
        this.accumulateAmount = value;
    }

    /**
     * Gets the value of the accumulatePayMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAccumulatePayMode() {
        return accumulatePayMode;
    }

    /**
     * Sets the value of the accumulatePayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAccumulatePayMode(Short value) {
        this.accumulatePayMode = value;
    }

}
