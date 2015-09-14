
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_queryRecurringAndOnetimeFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_queryRecurringAndOnetimeFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="queryRecurringFeeReq" type="{http://imsintf.service.openbilling.ailk.com/}sQueryRecurringAndOnetimeFeeReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_queryRecurringAndOnetimeFee", propOrder = {
    "sOper",
    "queryRecurringFeeReq"
})
public class DoQueryRecurringAndOnetimeFee {

    protected SOperInfo sOper;
    protected SQueryRecurringAndOnetimeFeeReq queryRecurringFeeReq;

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
     * Gets the value of the queryRecurringFeeReq property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryRecurringAndOnetimeFeeReq }
     *     
     */
    public SQueryRecurringAndOnetimeFeeReq getQueryRecurringFeeReq() {
        return queryRecurringFeeReq;
    }

    /**
     * Sets the value of the queryRecurringFeeReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryRecurringAndOnetimeFeeReq }
     *     
     */
    public void setQueryRecurringFeeReq(SQueryRecurringAndOnetimeFeeReq value) {
        this.queryRecurringFeeReq = value;
    }

}
