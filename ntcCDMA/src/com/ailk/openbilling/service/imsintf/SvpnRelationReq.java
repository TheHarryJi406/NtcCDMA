
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for svpnRelationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="svpnRelationReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_orgin_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgin_group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="subGroupList" type="{http://imsintf.service.openbilling.ailk.com/}subGroupList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "svpnRelationReq", propOrder = {
    "outerOrginGroupId",
    "orginGroupId",
    "subGroupList"
})
public class SvpnRelationReq {

    @XmlElement(name = "outer_orgin_group_id")
    protected String outerOrginGroupId;
    @XmlElement(name = "orgin_group_id")
    protected Long orginGroupId;
    protected SubGroupList subGroupList;

    /**
     * Gets the value of the outerOrginGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterOrginGroupId() {
        return outerOrginGroupId;
    }

    /**
     * Sets the value of the outerOrginGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterOrginGroupId(String value) {
        this.outerOrginGroupId = value;
    }

    /**
     * Gets the value of the orginGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrginGroupId() {
        return orginGroupId;
    }

    /**
     * Sets the value of the orginGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrginGroupId(Long value) {
        this.orginGroupId = value;
    }

    /**
     * Gets the value of the subGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupList }
     *     
     */
    public SubGroupList getSubGroupList() {
        return subGroupList;
    }

    /**
     * Sets the value of the subGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupList }
     *     
     */
    public void setSubGroupList(SubGroupList value) {
        this.subGroupList = value;
    }

}
