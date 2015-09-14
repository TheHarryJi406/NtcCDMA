
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_oneTimeFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_oneTimeFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="oneTimeFeeList" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFeeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_oneTimeFee", propOrder = {
    "sOper",
    "oneTimeFeeList"
})
public class DoOneTimeFee {

    protected SOperInfo sOper;
    protected OneTimeFeeList oneTimeFeeList;

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
     * Gets the value of the oneTimeFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFeeList }
     *     
     */
    public OneTimeFeeList getOneTimeFeeList() {
        return oneTimeFeeList;
    }

    /**
     * Sets the value of the oneTimeFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFeeList }
     *     
     */
    public void setOneTimeFeeList(OneTimeFeeList value) {
        this.oneTimeFeeList = value;
    }

}
