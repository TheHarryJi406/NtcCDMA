
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_cancelTopUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_cancelTopUp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="scancelTopUp" type="{http://imsintf.service.openbilling.ailk.com/}sCancelTopUpReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_cancelTopUp", propOrder = {
    "sOper",
    "scancelTopUp"
})
public class DoCancelTopUp {

    protected SOperInfo sOper;
    protected SCancelTopUpReq scancelTopUp;

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
     * Gets the value of the scancelTopUp property.
     * 
     * @return
     *     possible object is
     *     {@link SCancelTopUpReq }
     *     
     */
    public SCancelTopUpReq getScancelTopUp() {
        return scancelTopUp;
    }

    /**
     * Sets the value of the scancelTopUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCancelTopUpReq }
     *     
     */
    public void setScancelTopUp(SCancelTopUpReq value) {
        this.scancelTopUp = value;
    }

}
