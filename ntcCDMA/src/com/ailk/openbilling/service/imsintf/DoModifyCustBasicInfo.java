
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_modifyCustBasicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_modifyCustBasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sCustomer" type="{http://imsintf.service.openbilling.ailk.com/}sCustomer" minOccurs="0"/>
 *         &lt;element name="sContactOperList" type="{http://imsintf.service.openbilling.ailk.com/}sContactOperList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_modifyCustBasicInfo", propOrder = {
    "sOper",
    "sCustomer",
    "sContactOperList"
})
public class DoModifyCustBasicInfo {

    protected SOperInfo sOper;
    protected SCustomer sCustomer;
    protected SContactOperList sContactOperList;

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
     * Gets the value of the sCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link SCustomer }
     *     
     */
    public SCustomer getSCustomer() {
        return sCustomer;
    }

    /**
     * Sets the value of the sCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCustomer }
     *     
     */
    public void setSCustomer(SCustomer value) {
        this.sCustomer = value;
    }

    /**
     * Gets the value of the sContactOperList property.
     * 
     * @return
     *     possible object is
     *     {@link SContactOperList }
     *     
     */
    public SContactOperList getSContactOperList() {
        return sContactOperList;
    }

    /**
     * Sets the value of the sContactOperList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SContactOperList }
     *     
     */
    public void setSContactOperList(SContactOperList value) {
        this.sContactOperList = value;
    }

}
