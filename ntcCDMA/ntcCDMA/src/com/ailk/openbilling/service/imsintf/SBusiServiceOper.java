
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBusiServiceOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBusiServiceOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="busiService" type="{http://imsintf.service.openbilling.ailk.com/}sBusiService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBusiServiceOper", propOrder = {
    "operType",
    "busiService"
})
public class SBusiServiceOper {

    @XmlElement(name = "oper_type")
    protected Short operType;
    protected SBusiService busiService;

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
     * Gets the value of the busiService property.
     * 
     * @return
     *     possible object is
     *     {@link SBusiService }
     *     
     */
    public SBusiService getBusiService() {
        return busiService;
    }

    /**
     * Sets the value of the busiService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBusiService }
     *     
     */
    public void setBusiService(SBusiService value) {
        this.busiService = value;
    }

}
