
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_manageDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_manageDeposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="req" type="{http://imsintf.service.openbilling.ailk.com/}sMngDepositReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_manageDeposit", propOrder = {
    "oper",
    "req"
})
public class DoManageDeposit {

    protected SOperInfo oper;
    protected SMngDepositReq req;

    /**
     * Gets the value of the oper property.
     * 
     * @return
     *     possible object is
     *     {@link SOperInfo }
     *     
     */
    public SOperInfo getOper() {
        return oper;
    }

    /**
     * Sets the value of the oper property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOperInfo }
     *     
     */
    public void setOper(SOperInfo value) {
        this.oper = value;
    }

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link SMngDepositReq }
     *     
     */
    public SMngDepositReq getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMngDepositReq }
     *     
     */
    public void setReq(SMngDepositReq value) {
        this.req = value;
    }

}
