
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hybridBusiService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hybridBusiService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hybrid_rule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sBusiServiceList" type="{http://imsintf.service.openbilling.ailk.com/}sBusiServiceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hybridBusiService", propOrder = {
    "hybridRule",
    "status",
    "sBusiServiceList"
})
public class HybridBusiService {

    @XmlElement(name = "hybrid_rule")
    protected String hybridRule;
    protected String status;
    protected SBusiServiceList sBusiServiceList;

    /**
     * Gets the value of the hybridRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridRule() {
        return hybridRule;
    }

    /**
     * Sets the value of the hybridRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridRule(String value) {
        this.hybridRule = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the sBusiServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBusiServiceList }
     *     
     */
    public SBusiServiceList getSBusiServiceList() {
        return sBusiServiceList;
    }

    /**
     * Sets the value of the sBusiServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBusiServiceList }
     *     
     */
    public void setSBusiServiceList(SBusiServiceList value) {
        this.sBusiServiceList = value;
    }

}
