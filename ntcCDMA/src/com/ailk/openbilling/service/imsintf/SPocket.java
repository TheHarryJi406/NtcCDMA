
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sPocket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sPocket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pocket_item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billling_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="so_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resource_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="negative_flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sPocket", propOrder = {
    "assetId",
    "pocketItem",
    "validDate",
    "expireDate",
    "sts",
    "acctId",
    "amount",
    "measureId",
    "billlingType",
    "createDate",
    "soDate",
    "resourceId",
    "negativeFlag",
    "phoneId"
})
public class SPocket {

    @XmlElement(name = "asset_id")
    protected Long assetId;
    @XmlElement(name = "pocket_item")
    protected Integer pocketItem;
    @XmlElement(name = "valid_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;
    @XmlElement(name = "expire_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    protected Integer sts;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    protected Long amount;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    @XmlElement(name = "billling_type")
    protected Integer billlingType;
    @XmlElement(name = "create_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "so_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar soDate;
    @XmlElement(name = "resource_id")
    protected Long resourceId;
    @XmlElement(name = "negative_flag")
    protected Integer negativeFlag;
    @XmlElement(name = "phone_id")
    protected String phoneId;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetId(Long value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the pocketItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocketItem() {
        return pocketItem;
    }

    /**
     * Sets the value of the pocketItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocketItem(Integer value) {
        this.pocketItem = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the measureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Sets the value of the measureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

    /**
     * Gets the value of the billlingType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBilllingType() {
        return billlingType;
    }

    /**
     * Sets the value of the billlingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBilllingType(Integer value) {
        this.billlingType = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the soDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSoDate() {
        return soDate;
    }

    /**
     * Sets the value of the soDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSoDate(XMLGregorianCalendar value) {
        this.soDate = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceId(Long value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the negativeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeFlag() {
        return negativeFlag;
    }

    /**
     * Sets the value of the negativeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeFlag(Integer value) {
        this.negativeFlag = value;
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

}
