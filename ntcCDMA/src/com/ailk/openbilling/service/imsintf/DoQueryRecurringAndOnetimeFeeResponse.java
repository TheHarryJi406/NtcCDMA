
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryRecurringAndOnetimeFeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryRecurringAndOnetimeFeeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://imsintf.service.openbilling.ailk.com/}doQueryRecurringfeeOnetimefeeResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryRecurringAndOnetimeFeeResponse", propOrder = {
    "_return"
})
public class DoQueryRecurringAndOnetimeFeeResponse {

    @XmlElement(name = "return")
    protected DoQueryRecurringfeeOnetimefeeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DoQueryRecurringfeeOnetimefeeResp }
     *     
     */
    public DoQueryRecurringfeeOnetimefeeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoQueryRecurringfeeOnetimefeeResp }
     *     
     */
    public void setReturn(DoQueryRecurringfeeOnetimefeeResp value) {
        this._return = value;
    }

}
