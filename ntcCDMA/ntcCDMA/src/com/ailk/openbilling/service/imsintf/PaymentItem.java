
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="paymentServiceItemList" type="{http://imsintf.service.openbilling.ailk.com/}paymentServiceItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentItem", propOrder = {
    "invoiceNo",
    "amount",
    "sequence",
    "paymentServiceItemList"
})
public class PaymentItem {

    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    protected Long amount;
    protected Short sequence;
    protected PaymentServiceItemList paymentServiceItemList;

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
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

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSequence(Short value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the paymentServiceItemList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentServiceItemList }
     *     
     */
    public PaymentServiceItemList getPaymentServiceItemList() {
        return paymentServiceItemList;
    }

    /**
     * Sets the value of the paymentServiceItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentServiceItemList }
     *     
     */
    public void setPaymentServiceItemList(PaymentServiceItemList value) {
        this.paymentServiceItemList = value;
    }

}
