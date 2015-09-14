
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_caRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_caRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sCARelationReq" type="{http://imsintf.service.openbilling.ailk.com/}scaRelateReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_caRelation", propOrder = {
    "sOper",
    "scaRelationReq"
})
public class DoCaRelation {

    protected SOperInfo sOper;
    @XmlElement(name = "sCARelationReq")
    protected ScaRelateReq scaRelationReq;

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
     * Gets the value of the scaRelationReq property.
     * 
     * @return
     *     possible object is
     *     {@link ScaRelateReq }
     *     
     */
    public ScaRelateReq getSCARelationReq() {
        return scaRelationReq;
    }

    /**
     * Sets the value of the scaRelationReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaRelateReq }
     *     
     */
    public void setSCARelationReq(ScaRelateReq value) {
        this.scaRelationReq = value;
    }

}
