
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reguideAcctInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reguideAcctInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reguideAcctId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reguideCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reguideAcctInfo", propOrder = {
    "reguideAcctId",
    "reguideCharge"
})
public class ReguideAcctInfo {

    protected Long reguideAcctId;
    protected Long reguideCharge;

    /**
     * Gets the value of the reguideAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReguideAcctId() {
        return reguideAcctId;
    }

    /**
     * Sets the value of the reguideAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReguideAcctId(Long value) {
        this.reguideAcctId = value;
    }

    /**
     * Gets the value of the reguideCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReguideCharge() {
        return reguideCharge;
    }

    /**
     * Sets the value of the reguideCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReguideCharge(Long value) {
        this.reguideCharge = value;
    }

}
