
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doQueryInvoiceInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryInvoiceInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acct_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bill_start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bill_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="due_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bill_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryInvoiceInfoResponse", propOrder = {
    "outerAcctId",
    "acctId",
    "acctName",
    "invoiceNo",
    "billStartDate",
    "billEndDate",
    "dueDate",
    "billAmount"
})
public class DoQueryInvoiceInfoResponse2
    extends BaseResponse
{

    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "acct_name")
    protected String acctName;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "bill_start_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billStartDate;
    @XmlElement(name = "bill_end_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billEndDate;
    @XmlElement(name = "due_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "bill_amount")
    protected Long billAmount;

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
     * Gets the value of the acctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Sets the value of the acctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
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
     * Gets the value of the billStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillStartDate() {
        return billStartDate;
    }

    /**
     * Sets the value of the billStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillStartDate(XMLGregorianCalendar value) {
        this.billStartDate = value;
    }

    /**
     * Gets the value of the billEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillEndDate() {
        return billEndDate;
    }

    /**
     * Sets the value of the billEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillEndDate(XMLGregorianCalendar value) {
        this.billEndDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillAmount(Long value) {
        this.billAmount = value;
    }

}
