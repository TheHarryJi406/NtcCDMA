
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for recurringOnetimeFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recurringOnetimeFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_sequence_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="product_offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charge_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recurring_fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fee_item_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurringOnetimeFee", propOrder = {
    "productSequenceId",
    "productOfferId",
    "productName",
    "chargeDate",
    "recurringFee",
    "feeItemDescription",
    "amount"
})
public class RecurringOnetimeFee {

    @XmlElement(name = "product_sequence_id")
    protected Long productSequenceId;
    @XmlElement(name = "product_offer_id")
    protected Long productOfferId;
    @XmlElement(name = "product_name")
    protected String productName;
    @XmlElement(name = "charge_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargeDate;
    @XmlElement(name = "recurring_fee")
    protected Long recurringFee;
    @XmlElement(name = "fee_item_description")
    protected String feeItemDescription;
    protected Long amount;

    /**
     * Gets the value of the productSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductSequenceId() {
        return productSequenceId;
    }

    /**
     * Sets the value of the productSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductSequenceId(Long value) {
        this.productSequenceId = value;
    }

    /**
     * Gets the value of the productOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductOfferId() {
        return productOfferId;
    }

    /**
     * Sets the value of the productOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductOfferId(Long value) {
        this.productOfferId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the chargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeDate() {
        return chargeDate;
    }

    /**
     * Sets the value of the chargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeDate(XMLGregorianCalendar value) {
        this.chargeDate = value;
    }

    /**
     * Gets the value of the recurringFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringFee() {
        return recurringFee;
    }

    /**
     * Sets the value of the recurringFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringFee(Long value) {
        this.recurringFee = value;
    }

    /**
     * Gets the value of the feeItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeItemDescription() {
        return feeItemDescription;
    }

    /**
     * Sets the value of the feeItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeItemDescription(String value) {
        this.feeItemDescription = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

}
