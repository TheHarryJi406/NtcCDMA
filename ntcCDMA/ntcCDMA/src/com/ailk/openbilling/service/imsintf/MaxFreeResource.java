
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maxFreeResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maxFreeResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freeResourceList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maxFreeResource", propOrder = {
    "phoneId",
    "freeResourceList"
})
public class MaxFreeResource {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    protected FreeResourceList freeResourceList;

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
     * Gets the value of the freeResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceList }
     *     
     */
    public FreeResourceList getFreeResourceList() {
        return freeResourceList;
    }

    /**
     * Sets the value of the freeResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceList }
     *     
     */
    public void setFreeResourceList(FreeResourceList value) {
        this.freeResourceList = value;
    }

}
