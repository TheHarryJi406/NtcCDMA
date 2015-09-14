
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sNewGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sNewGroupReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupInfo" type="{http://imsintf.service.openbilling.ailk.com/}sGroup" minOccurs="0"/>
 *         &lt;element name="product_order_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sNewGroupReq", propOrder = {
    "groupInfo",
    "productOrderList"
})
public class SNewGroupReq {

    protected SGroup groupInfo;
    @XmlElement(name = "product_order_list")
    protected SProductOrderList productOrderList;

    /**
     * Gets the value of the groupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SGroup }
     *     
     */
    public SGroup getGroupInfo() {
        return groupInfo;
    }

    /**
     * Sets the value of the groupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGroup }
     *     
     */
    public void setGroupInfo(SGroup value) {
        this.groupInfo = value;
    }

    /**
     * Gets the value of the productOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProductOrderList() {
        return productOrderList;
    }

    /**
     * Sets the value of the productOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProductOrderList(SProductOrderList value) {
        this.productOrderList = value;
    }

}
