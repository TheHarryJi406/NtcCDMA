
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reguideInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reguideInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reguidedMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reguideItemInfoList" type="{http://imsintf.service.openbilling.ailk.com/}reguideItemInfoList" minOccurs="0"/>
 *         &lt;element name="reguideMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reguideAcct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reguideInfo", propOrder = {
    "reguidedMobileNo",
    "reguideItemInfoList",
    "reguideMobileNo",
    "reguideAcct"
})
public class ReguideInfo {

    protected String reguidedMobileNo;
    protected ReguideItemInfoList reguideItemInfoList;
    protected String reguideMobileNo;
    protected Long reguideAcct;

    /**
     * Gets the value of the reguidedMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReguidedMobileNo() {
        return reguidedMobileNo;
    }

    /**
     * Sets the value of the reguidedMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReguidedMobileNo(String value) {
        this.reguidedMobileNo = value;
    }

    /**
     * Gets the value of the reguideItemInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ReguideItemInfoList }
     *     
     */
    public ReguideItemInfoList getReguideItemInfoList() {
        return reguideItemInfoList;
    }

    /**
     * Sets the value of the reguideItemInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReguideItemInfoList }
     *     
     */
    public void setReguideItemInfoList(ReguideItemInfoList value) {
        this.reguideItemInfoList = value;
    }

    /**
     * Gets the value of the reguideMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReguideMobileNo() {
        return reguideMobileNo;
    }

    /**
     * Sets the value of the reguideMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReguideMobileNo(String value) {
        this.reguideMobileNo = value;
    }

    /**
     * Gets the value of the reguideAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReguideAcct() {
        return reguideAcct;
    }

    /**
     * Sets the value of the reguideAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReguideAcct(Long value) {
        this.reguideAcct = value;
    }

}
