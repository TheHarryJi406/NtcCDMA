
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_dismissReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_dismissReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sDismissReq" type="{http://imsintf.service.openbilling.ailk.com/}sDismissReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_dismissReq", propOrder = {
    "sOper",
    "sDismissReq"
})
public class DoDismissReq {

    protected SOperInfo sOper;
    protected SDismissReq sDismissReq;

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
     * Gets the value of the sDismissReq property.
     * 
     * @return
     *     possible object is
     *     {@link SDismissReq }
     *     
     */
    public SDismissReq getSDismissReq() {
        return sDismissReq;
    }

    /**
     * Sets the value of the sDismissReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDismissReq }
     *     
     */
    public void setSDismissReq(SDismissReq value) {
        this.sDismissReq = value;
    }

}
