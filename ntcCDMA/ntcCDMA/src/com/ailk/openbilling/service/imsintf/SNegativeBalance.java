
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sNegativeBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sNegativeBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negative_balance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remain_negative_balance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="negative_valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negative_expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="book_item_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sNegativeBalance", propOrder = {
    "bookItem",
    "acctId",
    "userId",
    "phoneId",
    "negativeBalance",
    "remainNegativeBalance",
    "negativeValidDate",
    "negativeExpireDate",
    "bookItemType"
})
public class SNegativeBalance {

    @XmlElement(name = "book_item")
    protected Integer bookItem;
    @XmlElement(name = "acct_id")
    protected String acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "negative_balance")
    protected Long negativeBalance;
    @XmlElement(name = "remain_negative_balance")
    protected Long remainNegativeBalance;
    @XmlElement(name = "negative_valid_date")
    protected String negativeValidDate;
    @XmlElement(name = "negative_expire_date")
    protected String negativeExpireDate;
    @XmlElement(name = "book_item_type")
    protected String bookItemType;

    /**
     * Gets the value of the bookItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookItem() {
        return bookItem;
    }

    /**
     * Sets the value of the bookItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookItem(Integer value) {
        this.bookItem = value;
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
     * Gets the value of the negativeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNegativeBalance() {
        return negativeBalance;
    }

    /**
     * Sets the value of the negativeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNegativeBalance(Long value) {
        this.negativeBalance = value;
    }

    /**
     * Gets the value of the remainNegativeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainNegativeBalance() {
        return remainNegativeBalance;
    }

    /**
     * Sets the value of the remainNegativeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainNegativeBalance(Long value) {
        this.remainNegativeBalance = value;
    }

    /**
     * Gets the value of the negativeValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeValidDate() {
        return negativeValidDate;
    }

    /**
     * Sets the value of the negativeValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeValidDate(String value) {
        this.negativeValidDate = value;
    }

    /**
     * Gets the value of the negativeExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeExpireDate() {
        return negativeExpireDate;
    }

    /**
     * Sets the value of the negativeExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeExpireDate(String value) {
        this.negativeExpireDate = value;
    }

    /**
     * Gets the value of the bookItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookItemType() {
        return bookItemType;
    }

    /**
     * Sets the value of the bookItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookItemType(String value) {
        this.bookItemType = value;
    }

}
