
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bank_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bank_abbreviate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_desc_thai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_desc_eng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankInfo", propOrder = {
    "bankCode",
    "bankAbbreviate",
    "bankDescThai",
    "bankDescEng"
})
public class BankInfo {

    @XmlElement(name = "bank_code")
    protected Integer bankCode;
    @XmlElement(name = "bank_abbreviate")
    protected String bankAbbreviate;
    @XmlElement(name = "bank_desc_thai")
    protected String bankDescThai;
    @XmlElement(name = "bank_desc_eng")
    protected String bankDescEng;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankCode(Integer value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankAbbreviate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAbbreviate() {
        return bankAbbreviate;
    }

    /**
     * Sets the value of the bankAbbreviate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAbbreviate(String value) {
        this.bankAbbreviate = value;
    }

    /**
     * Gets the value of the bankDescThai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankDescThai() {
        return bankDescThai;
    }

    /**
     * Sets the value of the bankDescThai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankDescThai(String value) {
        this.bankDescThai = value;
    }

    /**
     * Gets the value of the bankDescEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankDescEng() {
        return bankDescEng;
    }

    /**
     * Sets the value of the bankDescEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankDescEng(String value) {
        this.bankDescEng = value;
    }

}
