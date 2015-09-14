
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryWorkLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryWorkLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="queryWorkLogReq" type="{http://imsintf.service.openbilling.ailk.com/}queryWorkLogReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryWorkLog", propOrder = {
    "sOper",
    "queryWorkLogReq"
})
public class DoQueryWorkLog {

    protected SOperInfo sOper;
    protected QueryWorkLogReq queryWorkLogReq;

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
     * Gets the value of the queryWorkLogReq property.
     * 
     * @return
     *     possible object is
     *     {@link QueryWorkLogReq }
     *     
     */
    public QueryWorkLogReq getQueryWorkLogReq() {
        return queryWorkLogReq;
    }

    /**
     * Sets the value of the queryWorkLogReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryWorkLogReq }
     *     
     */
    public void setQueryWorkLogReq(QueryWorkLogReq value) {
        this.queryWorkLogReq = value;
    }

}
