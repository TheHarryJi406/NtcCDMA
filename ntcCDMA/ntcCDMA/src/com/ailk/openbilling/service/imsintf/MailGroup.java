
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_mail_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail_group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bill_format_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="file_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="summaryBillHandlingCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="summaryBillLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="summaryCurrency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="summaryStyleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailGroup", propOrder = {
    "operType",
    "outerMailGroupId",
    "mailGroupId",
    "name",
    "description",
    "billFormatId",
    "fileType",
    "summaryBillHandlingCode",
    "summaryBillLanguage",
    "summaryCurrency",
    "summaryStyleId",
    "validDate",
    "expireDate"
})
public class MailGroup {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "outer_mail_group_id")
    protected String outerMailGroupId;
    @XmlElement(name = "mail_group_id")
    protected Long mailGroupId;
    protected String name;
    protected String description;
    @XmlElement(name = "bill_format_id")
    protected Short billFormatId;
    @XmlElement(name = "file_type")
    protected Short fileType;
    protected Long summaryBillHandlingCode;
    protected Integer summaryBillLanguage;
    protected Integer summaryCurrency;
    protected Integer summaryStyleId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;

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
     * Gets the value of the outerMailGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterMailGroupId() {
        return outerMailGroupId;
    }

    /**
     * Sets the value of the outerMailGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterMailGroupId(String value) {
        this.outerMailGroupId = value;
    }

    /**
     * Gets the value of the mailGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMailGroupId() {
        return mailGroupId;
    }

    /**
     * Sets the value of the mailGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMailGroupId(Long value) {
        this.mailGroupId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the billFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillFormatId() {
        return billFormatId;
    }

    /**
     * Sets the value of the billFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillFormatId(Short value) {
        this.billFormatId = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFileType(Short value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the summaryBillHandlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSummaryBillHandlingCode() {
        return summaryBillHandlingCode;
    }

    /**
     * Sets the value of the summaryBillHandlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSummaryBillHandlingCode(Long value) {
        this.summaryBillHandlingCode = value;
    }

    /**
     * Gets the value of the summaryBillLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryBillLanguage() {
        return summaryBillLanguage;
    }

    /**
     * Sets the value of the summaryBillLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryBillLanguage(Integer value) {
        this.summaryBillLanguage = value;
    }

    /**
     * Gets the value of the summaryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryCurrency() {
        return summaryCurrency;
    }

    /**
     * Sets the value of the summaryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryCurrency(Integer value) {
        this.summaryCurrency = value;
    }

    /**
     * Gets the value of the summaryStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryStyleId() {
        return summaryStyleId;
    }

    /**
     * Sets the value of the summaryStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryStyleId(Integer value) {
        this.summaryStyleId = value;
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

}
