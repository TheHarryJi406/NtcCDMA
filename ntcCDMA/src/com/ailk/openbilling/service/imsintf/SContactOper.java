
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sContactOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sContactOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contact_list" type="{http://imsintf.service.openbilling.ailk.com/}sContactList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sContactOper", propOrder = {
    "operType",
    "contactList"
})
public class SContactOper {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "contact_list")
    protected SContactList contactList;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperType(Short value) {
        this.operType = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link SContactList }
     *     
     */
    public SContactList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SContactList }
     *     
     */
    public void setContactList(SContactList value) {
        this.contactList = value;
    }

}
