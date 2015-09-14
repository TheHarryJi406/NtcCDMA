
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailGroupPost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailGroupPost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_mail_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail_group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="post_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receiver_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailGroupPost", propOrder = {
    "outerMailGroupId",
    "mailGroupId",
    "postCode",
    "countryId",
    "receiverName",
    "address1",
    "address2",
    "address3",
    "address4",
    "address5"
})
public class MailGroupPost {

    @XmlElement(name = "outer_mail_group_id")
    protected String outerMailGroupId;
    @XmlElement(name = "mail_group_id")
    protected Long mailGroupId;
    @XmlElement(name = "post_code")
    protected Integer postCode;
    @XmlElement(name = "country_id")
    protected Integer countryId;
    @XmlElement(name = "receiver_name")
    protected String receiverName;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String address4;
    protected String address5;

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
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostCode(Integer value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryId(Integer value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

}
