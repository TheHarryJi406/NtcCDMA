
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryServiceStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryServiceStateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="service_state_list" type="{http://imsintf.service.openbilling.ailk.com/}serviceStateResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryServiceStateResponse", propOrder = {
    "serviceStateList"
})
public class DoQueryServiceStateResponse2
    extends BaseResponse
{

    @XmlElement(name = "service_state_list")
    protected ServiceStateResultList serviceStateList;

    /**
     * Gets the value of the serviceStateList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStateResultList }
     *     
     */
    public ServiceStateResultList getServiceStateList() {
        return serviceStateList;
    }

    /**
     * Sets the value of the serviceStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStateResultList }
     *     
     */
    public void setServiceStateList(ServiceStateResultList value) {
        this.serviceStateList = value;
    }

}
