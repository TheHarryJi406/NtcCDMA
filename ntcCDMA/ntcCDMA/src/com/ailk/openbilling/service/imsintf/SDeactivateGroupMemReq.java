
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sDeactivateGroupMemReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sDeactivateGroupMemReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="change_sts" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="sMemStsList" type="{http://imsintf.service.openbilling.ailk.com/}sMemStsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sDeactivateGroupMemReq", propOrder = {
    "outerGroupId",
    "groupId",
    "changeSts",
    "sMemStsList"
})
public class SDeactivateGroupMemReq {

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "change_sts")
    protected Short changeSts;
    protected SMemStsList sMemStsList;

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
     * Gets the value of the changeSts property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChangeSts() {
        return changeSts;
    }

    /**
     * Sets the value of the changeSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChangeSts(Short value) {
        this.changeSts = value;
    }

    /**
     * Gets the value of the sMemStsList property.
     * 
     * @return
     *     possible object is
     *     {@link SMemStsList }
     *     
     */
    public SMemStsList getSMemStsList() {
        return sMemStsList;
    }

    /**
     * Sets the value of the sMemStsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMemStsList }
     *     
     */
    public void setSMemStsList(SMemStsList value) {
        this.sMemStsList = value;
    }

}
