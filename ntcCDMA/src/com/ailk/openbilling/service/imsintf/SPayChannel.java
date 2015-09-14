
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sPayChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sPayChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payment_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="bank_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_acct_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_issuing_bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sPayChannel", propOrder = {
    "paymentType",
    "bankId",
    "bankAcctNbr",
    "cardNo",
    "cardIssuingBank",
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId"
})
public class SPayChannel {

    @XmlElement(name = "payment_type")
    protected Short paymentType;
    @XmlElement(name = "bank_id")
    protected String bankId;
    @XmlElement(name = "bank_acct_nbr")
    protected String bankAcctNbr;
    @XmlElement(name = "card_no")
    protected String cardNo;
    @XmlElement(name = "card_issuing_bank")
    protected String cardIssuingBank;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentType(Short value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the bankAcctNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    /**
     * Sets the value of the bankAcctNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctNbr(String value) {
        this.bankAcctNbr = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the cardIssuingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuingBank() {
        return cardIssuingBank;
    }

    /**
     * Sets the value of the cardIssuingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuingBank(String value) {
        this.cardIssuingBank = value;
    }

    /**
     * Gets the value of the outerCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterCustId() {
        return outerCustId;
    }

    /**
     * Sets the value of the outerCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterCustId(String value) {
        this.outerCustId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustId(Long value) {
        this.custId = value;
    }

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

}
