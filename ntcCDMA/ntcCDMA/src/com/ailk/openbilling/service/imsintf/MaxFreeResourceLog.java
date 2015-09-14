
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for maxFreeResourceLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maxFreeResourceLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_sequence_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resource_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effective_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operation_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="source_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maxFreeResourceLog", propOrder = {
    "phoneId",
    "productSequenceId",
    "resourceId",
    "resourceValue",
    "resourceName",
    "effectiveDate",
    "acctId",
    "validDate",
    "operationDate",
    "sourceSystem",
    "transactionId"
})
public class MaxFreeResourceLog {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "product_sequence_id")
    protected Long productSequenceId;
    @XmlElement(name = "resource_id")
    protected Integer resourceId;
    @XmlElement(name = "resource_value")
    protected Long resourceValue;
    @XmlElement(name = "resource_name")
    protected String resourceName;
    @XmlElement(name = "effective_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "acct_id")
    protected String acctId;
    @XmlElement(name = "valid_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;
    @XmlElement(name = "operation_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "source_system")
    protected String sourceSystem;
    @XmlElement(name = "transaction_id")
    protected String transactionId;

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
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

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
     * Gets the value of the operationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Sets the value of the operationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
