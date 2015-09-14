
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_modifyAccountState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_modifyAccountState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sModifyAcctReq" type="{http://imsintf.service.openbilling.ailk.com/}modifyAcctReq" minOccurs="0"/>
 *         &lt;element name="sOneTimeFee" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_modifyAccountState", propOrder = {
    "sOper",
    "sModifyAcctReq",
    "sOneTimeFee"
})
public class DoModifyAccountState {

    protected SOperInfo sOper;
    protected ModifyAcctReq sModifyAcctReq;
    protected OneTimeFee sOneTimeFee;

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
     * Gets the value of the sModifyAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyAcctReq }
     *     
     */
    public ModifyAcctReq getSModifyAcctReq() {
        return sModifyAcctReq;
    }

    /**
     * Sets the value of the sModifyAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyAcctReq }
     *     
     */
    public void setSModifyAcctReq(ModifyAcctReq value) {
        this.sModifyAcctReq = value;
    }

    /**
     * Gets the value of the sOneTimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFee }
     *     
     */
    public OneTimeFee getSOneTimeFee() {
        return sOneTimeFee;
    }

    /**
     * Sets the value of the sOneTimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFee }
     *     
     */
    public void setSOneTimeFee(OneTimeFee value) {
        this.sOneTimeFee = value;
    }

}
