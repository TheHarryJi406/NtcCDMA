
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sProductOrderOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sProductOrderOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="prod_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sProductOrderOper", propOrder = {
    "operType",
    "prodList"
})
public class SProductOrderOper {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "prod_list")
    protected SProductOrderList prodList;

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
     * Gets the value of the prodList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProdList() {
        return prodList;
    }

    /**
     * Sets the value of the prodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProdList(SProductOrderList value) {
        this.prodList = value;
    }

}
