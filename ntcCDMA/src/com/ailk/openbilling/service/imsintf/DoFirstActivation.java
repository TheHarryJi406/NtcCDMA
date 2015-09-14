
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_firstActivation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_firstActivation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sFristActiveReq" type="{http://imsintf.service.openbilling.ailk.com/}sFristActiveReq" minOccurs="0"/>
 *         &lt;element name="oneTimeFee" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_firstActivation", propOrder = {
    "sOper",
    "sFristActiveReq",
    "oneTimeFee"
})
public class DoFirstActivation {

    protected SOperInfo sOper;
    protected SFristActiveReq sFristActiveReq;
    protected OneTimeFee oneTimeFee;

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
     * Gets the value of the sFristActiveReq property.
     * 
     * @return
     *     possible object is
     *     {@link SFristActiveReq }
     *     
     */
    public SFristActiveReq getSFristActiveReq() {
        return sFristActiveReq;
    }

    /**
     * Sets the value of the sFristActiveReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFristActiveReq }
     *     
     */
    public void setSFristActiveReq(SFristActiveReq value) {
        this.sFristActiveReq = value;
    }

    /**
     * Gets the value of the oneTimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFee }
     *     
     */
    public OneTimeFee getOneTimeFee() {
        return oneTimeFee;
    }

    /**
     * Sets the value of the oneTimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFee }
     *     
     */
    public void setOneTimeFee(OneTimeFee value) {
        this.oneTimeFee = value;
    }

}
