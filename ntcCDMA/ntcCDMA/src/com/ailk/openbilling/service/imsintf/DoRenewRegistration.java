
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_renewRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_renewRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sRenew" type="{http://imsintf.service.openbilling.ailk.com/}renewRegistration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_renewRegistration", propOrder = {
    "sOper",
    "sRenew"
})
public class DoRenewRegistration {

    protected SOperInfo sOper;
    protected RenewRegistration sRenew;

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
     * Gets the value of the sRenew property.
     * 
     * @return
     *     possible object is
     *     {@link RenewRegistration }
     *     
     */
    public RenewRegistration getSRenew() {
        return sRenew;
    }

    /**
     * Sets the value of the sRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewRegistration }
     *     
     */
    public void setSRenew(RenewRegistration value) {
        this.sRenew = value;
    }

}
