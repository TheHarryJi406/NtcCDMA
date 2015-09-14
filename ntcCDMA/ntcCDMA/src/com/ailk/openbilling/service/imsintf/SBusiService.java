
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBusiService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBusiService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="time_segment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="service_status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remaining_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBusiService", propOrder = {
    "serviceId",
    "timeSegment",
    "paymentMode",
    "serviceStatus",
    "threshold",
    "validDate",
    "createDate",
    "expireDate",
    "remainingAmount"
})
public class SBusiService {

    @XmlElement(name = "service_id")
    protected Integer serviceId;
    @XmlElement(name = "time_segment")
    protected Short timeSegment;
    @XmlElement(name = "payment_mode")
    protected Short paymentMode;
    @XmlElement(name = "service_status")
    protected Short serviceStatus;
    protected Double threshold;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "remaining_amount")
    protected Double remainingAmount;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the timeSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTimeSegment() {
        return timeSegment;
    }

    /**
     * Sets the value of the timeSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTimeSegment(Short value) {
        this.timeSegment = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentMode(Short value) {
        this.paymentMode = value;
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
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshold(Double value) {
        this.threshold = value;
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
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
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
     * Gets the value of the remainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingAmount(Double value) {
        this.remainingAmount = value;
    }

}
