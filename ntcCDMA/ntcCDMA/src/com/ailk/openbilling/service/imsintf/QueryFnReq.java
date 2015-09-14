
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryFnReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryFnReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prod_offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryFnReq", propOrder = {
    "userId",
    "phoneId",
    "prodOfferId",
    "productId",
    "acctId"
})
public class QueryFnReq {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "prod_offer_id")
    protected Long prodOfferId;
    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "acct_id")
    protected Long acctId;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneId(String value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the prodOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProdOfferId() {
        return prodOfferId;
    }

    /**
     * Sets the value of the prodOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProdOfferId(Long value) {
        this.prodOfferId = value;
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
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
    }

}
