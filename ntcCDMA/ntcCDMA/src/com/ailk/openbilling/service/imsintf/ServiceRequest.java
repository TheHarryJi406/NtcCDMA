
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busi_service_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service_sequence_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="camel_support" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service_status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "busiServiceCode",
    "serviceSequenceId",
    "camelSupport",
    "validDate",
    "expireDate",
    "serviceStatus",
    "description"
})
public class ServiceRequest {

    @XmlElement(name = "busi_service_code")
    protected String busiServiceCode;
    @XmlElement(name = "service_sequence_id")
    protected Integer serviceSequenceId;
    @XmlElement(name = "camel_support")
    protected Short camelSupport;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "service_status")
    protected Short serviceStatus;
    protected String description;

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

    /**
     * Gets the value of the camelSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCamelSupport() {
        return camelSupport;
    }

    /**
     * Sets the value of the camelSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCamelSupport(Short value) {
        this.camelSupport = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setServiceStatus(Short value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
