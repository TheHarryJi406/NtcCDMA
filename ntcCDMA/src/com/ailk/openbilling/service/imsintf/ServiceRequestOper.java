
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequestOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequestOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service_oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="serviceRequestList" type="{http://imsintf.service.openbilling.ailk.com/}serviceRequestList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequestOper", propOrder = {
    "serviceOperType",
    "serviceRequestList"
})
public class ServiceRequestOper {

    @XmlElement(name = "service_oper_type")
    protected Short serviceOperType;
    protected ServiceRequestList serviceRequestList;

    /**
     * Gets the value of the serviceOperType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getServiceOperType() {
        return serviceOperType;
    }

    /**
     * Sets the value of the serviceOperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setServiceOperType(Short value) {
        this.serviceOperType = value;
    }

    /**
     * Gets the value of the serviceRequestList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestList }
     *     
     */
    public ServiceRequestList getServiceRequestList() {
        return serviceRequestList;
    }

    /**
     * Sets the value of the serviceRequestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestList }
     *     
     */
    public void setServiceRequestList(ServiceRequestList value) {
        this.serviceRequestList = value;
    }

}
