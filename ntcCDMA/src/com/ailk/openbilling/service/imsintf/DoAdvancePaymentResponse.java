
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_advancePaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_advancePaymentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://imsintf.service.openbilling.ailk.com/}doAdvancePaymentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_advancePaymentResponse", propOrder = {
    "_return"
})
public class DoAdvancePaymentResponse {

    @XmlElement(name = "return")
    protected DoAdvancePaymentResponse2 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DoAdvancePaymentResponse2 }
     *     
     */
    public DoAdvancePaymentResponse2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoAdvancePaymentResponse2 }
     *     
     */
    public void setReturn(DoAdvancePaymentResponse2 value) {
        this._return = value;
    }

}
