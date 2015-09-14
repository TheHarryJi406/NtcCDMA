
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sQueryParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="query_level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="new_main_promotion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="busi_spec_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycle_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryParam", propOrder = {
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "productId",
    "invoiceNo",
    "startDate",
    "endDate",
    "ownerType",
    "queryLevel",
    "newMainPromotion",
    "busiSpecId",
    "channel",
    "cycleFlag"
})
public class SQueryParam {

    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "owner_type")
    protected Integer ownerType;
    @XmlElement(name = "query_level")
    protected Long queryLevel;
    @XmlElement(name = "new_main_promotion")
    protected Long newMainPromotion;
    @XmlElement(name = "busi_spec_id")
    protected Long busiSpecId;
    protected String channel;
    @XmlElement(name = "cycle_flag")
    protected Integer cycleFlag;

    /**
     * Gets the value of the outerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterAcctId() {
        return outerAcctId;
    }

    /**
     * Sets the value of the outerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterAcctId(String value) {
        this.outerAcctId = value;
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
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerType(Integer value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the queryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueryLevel() {
        return queryLevel;
    }

    /**
     * Sets the value of the queryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueryLevel(Long value) {
        this.queryLevel = value;
    }

    /**
     * Gets the value of the newMainPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewMainPromotion() {
        return newMainPromotion;
    }

    /**
     * Sets the value of the newMainPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewMainPromotion(Long value) {
        this.newMainPromotion = value;
    }

    /**
     * Gets the value of the busiSpecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusiSpecId() {
        return busiSpecId;
    }

    /**
     * Sets the value of the busiSpecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusiSpecId(Long value) {
        this.busiSpecId = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the cycleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleFlag() {
        return cycleFlag;
    }

    /**
     * Sets the value of the cycleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleFlag(Integer value) {
        this.cycleFlag = value;
    }

}
