
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryGroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sQueryGroupReq" type="{http://imsintf.service.openbilling.ailk.com/}sQueryGroupReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryGroupInfo", propOrder = {
    "sOper",
    "sQueryGroupReq"
})
public class DoQueryGroupInfo {

    protected SOperInfo sOper;
    protected SQueryGroupReq sQueryGroupReq;

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
     * Gets the value of the sQueryGroupReq property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryGroupReq }
     *     
     */
    public SQueryGroupReq getSQueryGroupReq() {
        return sQueryGroupReq;
    }

    /**
     * Sets the value of the sQueryGroupReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryGroupReq }
     *     
     */
    public void setSQueryGroupReq(SQueryGroupReq value) {
        this.sQueryGroupReq = value;
    }

}
