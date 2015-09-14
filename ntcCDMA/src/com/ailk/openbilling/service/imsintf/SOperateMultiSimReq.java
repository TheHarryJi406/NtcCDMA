
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sOperateMultiSimReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sOperateMultiSimReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="req" type="{http://imsintf.service.openbilling.ailk.com/}simItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sOperateMultiSimReq", propOrder = {
    "req"
})
public class SOperateMultiSimReq {

    protected SimItemList req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link SimItemList }
     *     
     */
    public SimItemList getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimItemList }
     *     
     */
    public void setReq(SimItemList value) {
        this.req = value;
    }

}
