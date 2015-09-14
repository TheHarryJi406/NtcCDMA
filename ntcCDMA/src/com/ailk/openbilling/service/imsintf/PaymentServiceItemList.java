
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentServiceItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentServiceItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentServiceItem" type="{http://imsintf.service.openbilling.ailk.com/}paymentServiceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentServiceItemList", propOrder = {
    "paymentServiceItem"
})
public class PaymentServiceItemList {

    protected List<PaymentServiceItem> paymentServiceItem;

    /**
     * Gets the value of the paymentServiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentServiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentServiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentServiceItem }
     * 
     * 
     */
    public List<PaymentServiceItem> getPaymentServiceItem() {
        if (paymentServiceItem == null) {
            paymentServiceItem = new ArrayList<PaymentServiceItem>();
        }
        return this.paymentServiceItem;
    }

}
