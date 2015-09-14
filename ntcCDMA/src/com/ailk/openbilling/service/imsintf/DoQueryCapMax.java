
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryCapMax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryCapMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sQueryCapMaxReq" type="{http://imsintf.service.openbilling.ailk.com/}sQueryCapMaxReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryCapMax", propOrder = {
    "sOper",
    "sQueryCapMaxReq"
})
public class DoQueryCapMax {

    protected SOperInfo sOper;
    protected SQueryCapMaxReq sQueryCapMaxReq;

    /**
     * Gets the value of the sOper property.
     * 
     * @return
     *     possible object is
     *     {@link SOperInfo }
     *     
     */
    public SOperInfo getSOper() {
        return sOper;
    }

    /**
     * Sets the value of the sOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOperInfo }
     *     
     */
    public void setSOper(SOperInfo value) {
        this.sOper = value;
    }

    /**
     * Gets the value of the sQueryCapMaxReq property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryCapMaxReq }
     *     
     */
    public SQueryCapMaxReq getSQueryCapMaxReq() {
        return sQueryCapMaxReq;
    }

    /**
     * Sets the value of the sQueryCapMaxReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryCapMaxReq }
     *     
     */
    public void setSQueryCapMaxReq(SQueryCapMaxReq value) {
        this.sQueryCapMaxReq = value;
    }

}
