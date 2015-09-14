
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceStateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="service_status" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceStateResult", propOrder = {
    "phoneId",
    "serviceId",
    "serviceStatus"
})
public class ServiceStateResult {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "service_id")
    protected int serviceId;
    @XmlElement(name = "service_status")
    protected short serviceStatus;

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneId(String value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     */
    public short getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     */
    public void setServiceStatus(short value) {
        this.serviceStatus = value;
    }

}
