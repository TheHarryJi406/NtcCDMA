
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceStateResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceStateResultList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceState" type="{http://imsintf.service.openbilling.ailk.com/}serviceStateResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceStateResultList", propOrder = {
    "serviceState"
})
public class ServiceStateResultList {

    protected List<ServiceStateResult> serviceState;

    /**
     * Gets the value of the serviceState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceStateResult }
     * 
     * 
     */
    public List<ServiceStateResult> getServiceState() {
        if (serviceState == null) {
            serviceState = new ArrayList<ServiceStateResult>();
        }
        return this.serviceState;
    }

}
