
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sDepositOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sDepositOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sDeposit" type="{http://imsintf.service.openbilling.ailk.com/}sDeposit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sDepositOper", propOrder = {
    "operType",
    "sDeposit"
})
public class SDepositOper {

    @XmlElement(name = "oper_type")
    protected Short operType;
    protected SDeposit sDeposit;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperType(Short value) {
        this.operType = value;
    }

    /**
     * Gets the value of the sDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link SDeposit }
     *     
     */
    public SDeposit getSDeposit() {
        return sDeposit;
    }

    /**
     * Sets the value of the sDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDeposit }
     *     
     */
    public void setSDeposit(SDeposit value) {
        this.sDeposit = value;
    }

}
