
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for irResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="irResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operator_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busi_service_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service_sequence_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "irResponse", propOrder = {
    "operatorId",
    "operatorCode",
    "busiServiceCode",
    "serviceSequenceId"
})
public class IrResponse {

    @XmlElement(name = "operator_id")
    protected Integer operatorId;
    @XmlElement(name = "operator_code")
    protected String operatorCode;
    @XmlElement(name = "busi_service_code")
    protected String busiServiceCode;
    @XmlElement(name = "service_sequence_id")
    protected Integer serviceSequenceId;

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperatorId(Integer value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the busiServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiServiceCode() {
        return busiServiceCode;
    }

    /**
     * Sets the value of the busiServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiServiceCode(String value) {
        this.busiServiceCode = value;
    }

    /**
     * Gets the value of the serviceSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceSequenceId() {
        return serviceSequenceId;
    }

    /**
     * Sets the value of the serviceSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceSequenceId(Integer value) {
        this.serviceSequenceId = value;
    }

}
