
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chgGroupProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chgGroupProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prod_order_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderOperList" minOccurs="0"/>
 *         &lt;element name="specialNumberOperList" type="{http://imsintf.service.openbilling.ailk.com/}specialNumberOperList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chgGroupProduct", propOrder = {
    "outerGroupId",
    "groupId",
    "prodOrderList",
    "specialNumberOperList"
})
public class ChgGroupProduct {

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "prod_order_list")
    protected SProductOrderOperList prodOrderList;
    protected SpecialNumberOperList specialNumberOperList;

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
     * Gets the value of the prodOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderOperList }
     *     
     */
    public SProductOrderOperList getProdOrderList() {
        return prodOrderList;
    }

    /**
     * Sets the value of the prodOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderOperList }
     *     
     */
    public void setProdOrderList(SProductOrderOperList value) {
        this.prodOrderList = value;
    }

    /**
     * Gets the value of the specialNumberOperList property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNumberOperList }
     *     
     */
    public SpecialNumberOperList getSpecialNumberOperList() {
        return specialNumberOperList;
    }

    /**
     * Sets the value of the specialNumberOperList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNumberOperList }
     *     
     */
    public void setSpecialNumberOperList(SpecialNumberOperList value) {
        this.specialNumberOperList = value;
    }

}
