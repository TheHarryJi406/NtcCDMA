
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="charge_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="so_onetime_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onetime_seq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "feeItem", propOrder = {
    "orderType",
    "itemCode",
    "costCode",
    "chargeType",
    "amount",
    "billType",
    "soOnetimeId",
    "onetimeSeq",
    "remark",
    "measureId"
})
public class FeeItem {

    @XmlElement(name = "order_type")
    protected Short orderType;
    @XmlElement(name = "item_code")
    protected Long itemCode;
    @XmlElement(name = "cost_code")
    protected Integer costCode;
    @XmlElement(name = "charge_type")
    protected Short chargeType;
    protected Double amount;
    @XmlElement(name = "bill_type")
    protected Integer billType;
    @XmlElement(name = "so_onetime_id")
    protected Long soOnetimeId;
    @XmlElement(name = "onetime_seq")
    protected Long onetimeSeq;
    protected String remark;
    @XmlElement(name = "measure_id")
    protected Integer measureId;

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOrderType(Short value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemCode(Long value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the costCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostCode() {
        return costCode;
    }

    /**
     * Sets the value of the costCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostCode(Integer value) {
        this.costCode = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChargeType(Short value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillType(Integer value) {
        this.billType = value;
    }

    /**
     * Gets the value of the soOnetimeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSoOnetimeId() {
        return soOnetimeId;
    }

    /**
     * Sets the value of the soOnetimeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSoOnetimeId(Long value) {
        this.soOnetimeId = value;
    }

    /**
     * Gets the value of the onetimeSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnetimeSeq() {
        return onetimeSeq;
    }

    /**
     * Sets the value of the onetimeSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnetimeSeq(Long value) {
        this.onetimeSeq = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
