
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sQueryMaxFreeResourceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryMaxFreeResourceReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="product_sequence_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryMaxFreeResourceReq", propOrder = {
    "acctId",
    "productId",
    "productSequenceId",
    "productName"
})
public class SQueryMaxFreeResourceReq {

    @XmlElement(name = "acct_id")
    protected String acctId;
    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "product_sequence_id")
    protected Long productSequenceId;
    @XmlElement(name = "product_name")
    protected String productName;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

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
     * Gets the value of the productSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductSequenceId() {
        return productSequenceId;
    }

    /**
     * Sets the value of the productSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductSequenceId(Long value) {
        this.productSequenceId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
