
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fee_item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unpay_fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discount_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="adjust_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="prim_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billDetail", propOrder = {
    "feeItem",
    "unpayFee",
    "discountFee",
    "adjustFee",
    "primFee",
    "phoneId",
    "measureId"
})
public class BillDetail {

    @XmlElement(name = "fee_item")
    protected Integer feeItem;
    @XmlElement(name = "unpay_fee")
    protected double unpayFee;
    @XmlElement(name = "discount_fee")
    protected Double discountFee;
    @XmlElement(name = "adjust_fee")
    protected Double adjustFee;
    @XmlElement(name = "prim_fee")
    protected Double primFee;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "measure_id")
    protected Integer measureId;

    /**
     * Gets the value of the feeItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeItem() {
        return feeItem;
    }

    /**
     * Sets the value of the feeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeItem(Integer value) {
        this.feeItem = value;
    }

    /**
     * Gets the value of the unpayFee property.
     * 
     */
    public double getUnpayFee() {
        return unpayFee;
    }

    /**
     * Sets the value of the unpayFee property.
     * 
     */
    public void setUnpayFee(double value) {
        this.unpayFee = value;
    }

    /**
     * Gets the value of the discountFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountFee() {
        return discountFee;
    }

    /**
     * Sets the value of the discountFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountFee(Double value) {
        this.discountFee = value;
    }

    /**
     * Gets the value of the adjustFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustFee() {
        return adjustFee;
    }

    /**
     * Sets the value of the adjustFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustFee(Double value) {
        this.adjustFee = value;
    }

    /**
     * Gets the value of the primFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimFee() {
        return primFee;
    }

    /**
     * Sets the value of the primFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimFee(Double value) {
        this.primFee = value;
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
     * Gets the value of the measureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Sets the value of the measureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

}
