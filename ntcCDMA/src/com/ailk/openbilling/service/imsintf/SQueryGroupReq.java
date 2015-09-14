
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sQueryGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryGroupReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="query_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="main_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryGroupReq", propOrder = {
    "outerGroupId",
    "groupId",
    "queryType",
    "contactPhone",
    "mainPhone",
    "status"
})
public class SQueryGroupReq {

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "query_type")
    protected Short queryType;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "main_phone")
    protected String mainPhone;
    protected Short status;

    /**
     * Gets the value of the outerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterGroupId() {
        return outerGroupId;
    }

    /**
     * Sets the value of the outerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterGroupId(String value) {
        this.outerGroupId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQueryType(Short value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the mainPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhone() {
        return mainPhone;
    }

    /**
     * Sets the value of the mainPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhone(String value) {
        this.mainPhone = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

}
