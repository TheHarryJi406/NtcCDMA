
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBalanceAdjustResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBalanceAdjustResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_item" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amount_after" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="days_request" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="days_adjust" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiredate_after" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiredate_before" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount_before" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount_request" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount_adjust" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBalanceAdjustResponse", propOrder = {
    "bookItem",
    "amountAfter",
    "daysRequest",
    "daysAdjust",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "validDate",
    "expiredateAfter",
    "expiredateBefore",
    "amountBefore",
    "amountRequest",
    "amountAdjust"
})
public class SBalanceAdjustResponse {

    @XmlElement(name = "book_item")
    protected Integer bookItem;
    @XmlElement(name = "amount_after")
    protected Long amountAfter;
    @XmlElement(name = "days_request")
    protected Long daysRequest;
    @XmlElement(name = "days_adjust")
    protected Long daysAdjust;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expiredate_after")
    protected String expiredateAfter;
    @XmlElement(name = "expiredate_before")
    protected String expiredateBefore;
    @XmlElement(name = "amount_before")
    protected Long amountBefore;
    @XmlElement(name = "amount_request")
    protected Long amountRequest;
    @XmlElement(name = "amount_adjust")
    protected Long amountAdjust;

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
     * Gets the value of the amountAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountAfter() {
        return amountAfter;
    }

    /**
     * Sets the value of the amountAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountAfter(Long value) {
        this.amountAfter = value;
    }

    /**
     * Gets the value of the daysRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysRequest() {
        return daysRequest;
    }

    /**
     * Sets the value of the daysRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysRequest(Long value) {
        this.daysRequest = value;
    }

    /**
     * Gets the value of the daysAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysAdjust() {
        return daysAdjust;
    }

    /**
     * Sets the value of the daysAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysAdjust(Long value) {
        this.daysAdjust = value;
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
     * Gets the value of the expiredateAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredateAfter() {
        return expiredateAfter;
    }

    /**
     * Sets the value of the expiredateAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredateAfter(String value) {
        this.expiredateAfter = value;
    }

    /**
     * Gets the value of the expiredateBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredateBefore() {
        return expiredateBefore;
    }

    /**
     * Sets the value of the expiredateBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredateBefore(String value) {
        this.expiredateBefore = value;
    }

    /**
     * Gets the value of the amountBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountBefore() {
        return amountBefore;
    }

    /**
     * Sets the value of the amountBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountBefore(Long value) {
        this.amountBefore = value;
    }

    /**
     * Gets the value of the amountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountRequest() {
        return amountRequest;
    }

    /**
     * Sets the value of the amountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountRequest(Long value) {
        this.amountRequest = value;
    }

    /**
     * Gets the value of the amountAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountAdjust() {
        return amountAdjust;
    }

    /**
     * Sets the value of the amountAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountAdjust(Long value) {
        this.amountAdjust = value;
    }

}
