
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUserLifecycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUserLifecycle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="os_sts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fraud_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rerating_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unbilling_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user_request_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUserLifecycle", propOrder = {
    "userId",
    "sts",
    "osSts",
    "fraudFlag",
    "reratingFlag",
    "unbillingFlag",
    "userRequestFlag",
    "validDate",
    "expireDate",
    "createDate"
})
public class SUserLifecycle {

    @XmlElement(name = "user_id")
    protected Long userId;
    protected Integer sts;
    @XmlElement(name = "os_sts")
    protected Integer osSts;
    @XmlElement(name = "fraud_flag")
    protected Integer fraudFlag;
    @XmlElement(name = "rerating_flag")
    protected Integer reratingFlag;
    @XmlElement(name = "unbilling_flag")
    protected Integer unbillingFlag;
    @XmlElement(name = "user_request_flag")
    protected Integer userRequestFlag;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "create_date")
    protected String createDate;

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
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSts(Integer value) {
        this.sts = value;
    }

    /**
     * Gets the value of the osSts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOsSts() {
        return osSts;
    }

    /**
     * Sets the value of the osSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOsSts(Integer value) {
        this.osSts = value;
    }

    /**
     * Gets the value of the fraudFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFraudFlag() {
        return fraudFlag;
    }

    /**
     * Sets the value of the fraudFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFraudFlag(Integer value) {
        this.fraudFlag = value;
    }

    /**
     * Gets the value of the reratingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReratingFlag() {
        return reratingFlag;
    }

    /**
     * Sets the value of the reratingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReratingFlag(Integer value) {
        this.reratingFlag = value;
    }

    /**
     * Gets the value of the unbillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnbillingFlag() {
        return unbillingFlag;
    }

    /**
     * Sets the value of the unbillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnbillingFlag(Integer value) {
        this.unbillingFlag = value;
    }

    /**
     * Gets the value of the userRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserRequestFlag() {
        return userRequestFlag;
    }

    /**
     * Sets the value of the userRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserRequestFlag(Integer value) {
        this.userRequestFlag = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

}
