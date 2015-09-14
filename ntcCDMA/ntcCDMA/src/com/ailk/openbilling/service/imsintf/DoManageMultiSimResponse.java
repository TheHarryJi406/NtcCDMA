
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_manageMultiSimResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_manageMultiSimResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://imsintf.service.openbilling.ailk.com/}doOperateMultiSimResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_manageMultiSimResponse", propOrder = {
    "_return"
})
public class DoManageMultiSimResponse {

    @XmlElement(name = "return")
    protected DoOperateMultiSimResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DoOperateMultiSimResponse }
     *     
     */
    public DoOperateMultiSimResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoOperateMultiSimResponse }
     *     
     */
    public void setReturn(DoOperateMultiSimResponse value) {
        this._return = value;
    }

}
