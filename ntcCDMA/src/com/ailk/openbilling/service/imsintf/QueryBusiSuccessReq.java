
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryBusiSuccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryBusiSuccessReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="so_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="so_mode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryBusiSuccessReq", propOrder = {
    "soNbr",
    "soMode"
})
public class QueryBusiSuccessReq {

    @XmlElement(name = "so_nbr")
    protected String soNbr;
    @XmlElement(name = "so_mode")
    protected short soMode;

    /**
     * Gets the value of the soNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNbr() {
        return soNbr;
    }

    /**
     * Sets the value of the soNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNbr(String value) {
        this.soNbr = value;
    }

    /**
     * Gets the value of the soMode property.
     * 
     */
    public short getSoMode() {
        return soMode;
    }

    /**
     * Sets the value of the soMode property.
     * 
     */
    public void setSoMode(short value) {
        this.soMode = value;
    }

}
