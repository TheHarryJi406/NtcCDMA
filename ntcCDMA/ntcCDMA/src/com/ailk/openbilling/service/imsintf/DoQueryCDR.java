
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryCDR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryCDR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sQueryCDRReq" type="{http://imsintf.service.openbilling.ailk.com/}sQueryCDRReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryCDR", propOrder = {
    "sOper",
    "sQueryCDRReq"
})
public class DoQueryCDR {

    protected SOperInfo sOper;
    protected SQueryCDRReq sQueryCDRReq;

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
     * Gets the value of the sQueryCDRReq property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryCDRReq }
     *     
     */
    public SQueryCDRReq getSQueryCDRReq() {
        return sQueryCDRReq;
    }

    /**
     * Sets the value of the sQueryCDRReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryCDRReq }
     *     
     */
    public void setSQueryCDRReq(SQueryCDRReq value) {
        this.sQueryCDRReq = value;
    }

}
