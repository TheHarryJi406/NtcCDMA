
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryMaxFreeResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryMaxFreeResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="queryMaxFreeResourceReq" type="{http://imsintf.service.openbilling.ailk.com/}sQueryMaxFreeResourceReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryMaxFreeResource", propOrder = {
    "sOper",
    "queryMaxFreeResourceReq"
})
public class DoQueryMaxFreeResource {

    protected SOperInfo sOper;
    protected SQueryMaxFreeResourceReq queryMaxFreeResourceReq;

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
     * Gets the value of the queryMaxFreeResourceReq property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryMaxFreeResourceReq }
     *     
     */
    public SQueryMaxFreeResourceReq getQueryMaxFreeResourceReq() {
        return queryMaxFreeResourceReq;
    }

    /**
     * Sets the value of the queryMaxFreeResourceReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryMaxFreeResourceReq }
     *     
     */
    public void setQueryMaxFreeResourceReq(SQueryMaxFreeResourceReq value) {
        this.queryMaxFreeResourceReq = value;
    }

}
