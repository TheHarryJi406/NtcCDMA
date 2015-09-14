
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productFN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productFN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productOrder" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrder" minOccurs="0"/>
 *         &lt;element name="fNList" type="{http://imsintf.service.openbilling.ailk.com/}fnList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFN", propOrder = {
    "productOrder",
    "fnList"
})
public class ProductFN {

    protected SProductOrder productOrder;
    @XmlElement(name = "fNList")
    protected FnList fnList;

    /**
     * Gets the value of the productOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrder }
     *     
     */
    public SProductOrder getProductOrder() {
        return productOrder;
    }

    /**
     * Sets the value of the productOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrder }
     *     
     */
    public void setProductOrder(SProductOrder value) {
        this.productOrder = value;
    }

    /**
     * Gets the value of the fnList property.
     * 
     * @return
     *     possible object is
     *     {@link FnList }
     *     
     */
    public FnList getFNList() {
        return fnList;
    }

    /**
     * Sets the value of the fnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FnList }
     *     
     */
    public void setFNList(FnList value) {
        this.fnList = value;
    }

}
