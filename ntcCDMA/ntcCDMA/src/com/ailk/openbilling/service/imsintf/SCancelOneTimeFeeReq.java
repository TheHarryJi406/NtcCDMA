
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sCancelOneTimeFeeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sCancelOneTimeFeeReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="original_so_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original_so_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onetime_seq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sCancelOneTimeFeeReq", propOrder = {
    "originalSoNbr",
    "originalSoDate",
    "onetimeSeq",
    "remark"
})
public class SCancelOneTimeFeeReq {

    @XmlElement(name = "original_so_nbr")
    protected String originalSoNbr;
    @XmlElement(name = "original_so_date")
    protected String originalSoDate;
    @XmlElement(name = "onetime_seq")
    protected Long onetimeSeq;
    protected String remark;

    /**
     * Gets the value of the originalSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSoNbr() {
        return originalSoNbr;
    }

    /**
     * Sets the value of the originalSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSoNbr(String value) {
        this.originalSoNbr = value;
    }

    /**
     * Gets the value of the originalSoDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSoDate() {
        return originalSoDate;
    }

    /**
     * Sets the value of the originalSoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSoDate(String value) {
        this.originalSoDate = value;
    }

    /**
     * Gets the value of the onetimeSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnetimeSeq() {
        return onetimeSeq;
    }

    /**
     * Sets the value of the onetimeSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnetimeSeq(Long value) {
        this.onetimeSeq = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
