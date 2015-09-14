
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bill_item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unpay_fee" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="discount_fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adjust_fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prim_fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billDetaillist" type="{http://imsintf.service.openbilling.ailk.com/}billDetailList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billItem", propOrder = {
    "billItem",
    "unpayFee",
    "discountFee",
    "adjustFee",
    "primFee",
    "billDetaillist"
})
public class BillItem {

    @XmlElement(name = "bill_item")
    protected Integer billItem;
    @XmlElement(name = "unpay_fee")
    protected long unpayFee;
    @XmlElement(name = "discount_fee")
    protected Long discountFee;
    @XmlElement(name = "adjust_fee")
    protected Long adjustFee;
    @XmlElement(name = "prim_fee")
    protected Long primFee;
    protected BillDetailList billDetaillist;

    /**
     * Gets the value of the billItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillItem() {
        return billItem;
    }

    /**
     * Sets the value of the billItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillItem(Integer value) {
        this.billItem = value;
    }

    /**
     * Gets the value of the unpayFee property.
     * 
     */
    public long getUnpayFee() {
        return unpayFee;
    }

    /**
     * Sets the value of the unpayFee property.
     * 
     */
    public void setUnpayFee(long value) {
        this.unpayFee = value;
    }

    /**
     * Gets the value of the discountFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountFee() {
        return discountFee;
    }

    /**
     * Sets the value of the discountFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountFee(Long value) {
        this.discountFee = value;
    }

    /**
     * Gets the value of the adjustFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustFee() {
        return adjustFee;
    }

    /**
     * Sets the value of the adjustFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustFee(Long value) {
        this.adjustFee = value;
    }

    /**
     * Gets the value of the primFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimFee() {
        return primFee;
    }

    /**
     * Sets the value of the primFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimFee(Long value) {
        this.primFee = value;
    }

    /**
     * Gets the value of the billDetaillist property.
     * 
     * @return
     *     possible object is
     *     {@link BillDetailList }
     *     
     */
    public BillDetailList getBillDetaillist() {
        return billDetaillist;
    }

    /**
     * Sets the value of the billDetaillist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillDetailList }
     *     
     */
    public void setBillDetaillist(BillDetailList value) {
        this.billDetaillist = value;
    }

}
