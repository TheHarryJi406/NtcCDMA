
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_modifyAccountBasicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_modifyAccountBasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sAccount" type="{http://imsintf.service.openbilling.ailk.com/}sAccount" minOccurs="0"/>
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
@XmlType(name = "do_modifyAccountBasicInfo", propOrder = {
    "sOper",
    "sAccount",
    "sContactOperList"
})
public class DoModifyAccountBasicInfo {

    protected SOperInfo sOper;
    protected SAccount sAccount;
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
     * Gets the value of the sAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SAccount }
     *     
     */
    public SAccount getSAccount() {
        return sAccount;
    }

    /**
     * Sets the value of the sAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAccount }
     *     
     */
    public void setSAccount(SAccount value) {
        this.sAccount = value;
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
