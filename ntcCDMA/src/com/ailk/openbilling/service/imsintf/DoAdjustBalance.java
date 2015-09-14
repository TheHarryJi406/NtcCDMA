
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_adjustBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_adjustBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="adjustReq" type="{http://imsintf.service.openbilling.ailk.com/}adjustBalanceReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_adjustBalance", propOrder = {
    "sOper",
    "adjustReq"
})
public class DoAdjustBalance {

    protected SOperInfo sOper;
    protected AdjustBalanceReq adjustReq;

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
     * Gets the value of the adjustReq property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustBalanceReq }
     *     
     */
    public AdjustBalanceReq getAdjustReq() {
        return adjustReq;
    }

    /**
     * Sets the value of the adjustReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustBalanceReq }
     *     
     */
    public void setAdjustReq(AdjustBalanceReq value) {
        this.adjustReq = value;
    }

}
