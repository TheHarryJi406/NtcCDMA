
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequestList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequestList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceRequest_Item" type="{http://imsintf.service.openbilling.ailk.com/}serviceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequestList", propOrder = {
    "serviceRequestItem"
})
public class ServiceRequestList {

    @XmlElement(name = "serviceRequest_Item")
    protected List<ServiceRequest> serviceRequestItem;

    /**
     * Gets the value of the serviceRequestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * 
     * 
     */
    public List<ServiceRequest> getServiceRequestItem() {
        if (serviceRequestItem == null) {
            serviceRequestItem = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequestItem;
    }

}
