
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productSeqItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productSeqItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resource_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="resource_unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effective_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productSeqItem", propOrder = {
    "productId",
    "resourceId",
    "resourceValue",
    "operType",
    "resourceUnit",
    "effectiveType"
})
public class ProductSeqItem {

    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "resource_id")
    protected Integer resourceId;
    @XmlElement(name = "resource_value")
    protected Long resourceValue;
    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "resource_unit")
    protected String resourceUnit;
    @XmlElement(name = "effective_type")
    protected Short effectiveType;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceId(Integer value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceValue() {
        return resourceValue;
    }

    /**
     * Sets the value of the resourceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceValue(Long value) {
        this.resourceValue = value;
    }

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
     * Gets the value of the resourceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceUnit() {
        return resourceUnit;
    }

    /**
     * Sets the value of the resourceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceUnit(String value) {
        this.resourceUnit = value;
    }

    /**
     * Gets the value of the effectiveType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEffectiveType() {
        return effectiveType;
    }

    /**
     * Sets the value of the effectiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEffectiveType(Short value) {
        this.effectiveType = value;
    }

}
