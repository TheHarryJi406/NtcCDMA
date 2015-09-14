
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryCallScreen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryCallScreen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="queryCallScreenReq" type="{http://imsintf.service.openbilling.ailk.com/}queryCallScreenReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryCallScreen", propOrder = {
    "sOper",
    "queryCallScreenReq"
})
public class DoQueryCallScreen {

    protected SOperInfo sOper;
    protected QueryCallScreenReq queryCallScreenReq;

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
     * Gets the value of the queryCallScreenReq property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCallScreenReq }
     *     
     */
    public QueryCallScreenReq getQueryCallScreenReq() {
        return queryCallScreenReq;
    }

    /**
     * Sets the value of the queryCallScreenReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCallScreenReq }
     *     
     */
    public void setQueryCallScreenReq(QueryCallScreenReq value) {
        this.queryCallScreenReq = value;
    }

}
