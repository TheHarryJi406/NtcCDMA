
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="book_item" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negative_valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negative_expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="max_balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="max_validity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="negative_balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remain_negative_balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="book_item_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="used_main_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="used_negative_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="total_negative_amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="total_negative_remaining" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="asset_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBalance", propOrder = {
    "bookId",
    "bookItem",
    "amount",
    "days",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "validDate",
    "expireDate",
    "negativeValidDate",
    "negativeExpireDate",
    "maxBalance",
    "maxValidity",
    "negativeBalance",
    "remainNegativeBalance",
    "bookItemType",
    "measureId",
    "usedMainAmount",
    "usedNegativeAmount",
    "totalNegativeAmount",
    "totalNegativeRemaining",
    "assetId"
})
public class SBalance {

    @XmlElement(name = "book_id")
    protected Long bookId;
    @XmlElement(name = "book_item")
    protected Long bookItem;
    protected Double amount;
    protected Integer days;
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
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "negative_valid_date")
    protected String negativeValidDate;
    @XmlElement(name = "negative_expire_date")
    protected String negativeExpireDate;
    @XmlElement(name = "max_balance")
    protected Double maxBalance;
    @XmlElement(name = "max_validity")
    protected Long maxValidity;
    @XmlElement(name = "negative_balance")
    protected Double negativeBalance;
    @XmlElement(name = "remain_negative_balance")
    protected Double remainNegativeBalance;
    @XmlElement(name = "book_item_type")
    protected Short bookItemType;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    @XmlElement(name = "used_main_amount")
    protected Long usedMainAmount;
    @XmlElement(name = "used_negative_amount")
    protected Long usedNegativeAmount;
    @XmlElement(name = "total_negative_amount")
    protected Long totalNegativeAmount;
    @XmlElement(name = "total_negative_remaining")
    protected Long totalNegativeRemaining;
    @XmlElement(name = "asset_id")
    protected Long assetId;

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookId(Long value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the bookItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookItem() {
        return bookItem;
    }

    /**
     * Sets the value of the bookItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookItem(Long value) {
        this.bookItem = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDays(Integer value) {
        this.days = value;
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
     * Gets the value of the maxBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxBalance() {
        return maxBalance;
    }

    /**
     * Sets the value of the maxBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxBalance(Double value) {
        this.maxBalance = value;
    }

    /**
     * Gets the value of the maxValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxValidity() {
        return maxValidity;
    }

    /**
     * Sets the value of the maxValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxValidity(Long value) {
        this.maxValidity = value;
    }

    /**
     * Gets the value of the negativeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNegativeBalance() {
        return negativeBalance;
    }

    /**
     * Sets the value of the negativeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNegativeBalance(Double value) {
        this.negativeBalance = value;
    }

    /**
     * Gets the value of the remainNegativeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainNegativeBalance() {
        return remainNegativeBalance;
    }

    /**
     * Sets the value of the remainNegativeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainNegativeBalance(Double value) {
        this.remainNegativeBalance = value;
    }

    /**
     * Gets the value of the bookItemType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBookItemType() {
        return bookItemType;
    }

    /**
     * Sets the value of the bookItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBookItemType(Short value) {
        this.bookItemType = value;
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
     * Gets the value of the usedMainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedMainAmount() {
        return usedMainAmount;
    }

    /**
     * Sets the value of the usedMainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedMainAmount(Long value) {
        this.usedMainAmount = value;
    }

    /**
     * Gets the value of the usedNegativeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedNegativeAmount() {
        return usedNegativeAmount;
    }

    /**
     * Sets the value of the usedNegativeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedNegativeAmount(Long value) {
        this.usedNegativeAmount = value;
    }

    /**
     * Gets the value of the totalNegativeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNegativeAmount() {
        return totalNegativeAmount;
    }

    /**
     * Sets the value of the totalNegativeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNegativeAmount(Long value) {
        this.totalNegativeAmount = value;
    }

    /**
     * Gets the value of the totalNegativeRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNegativeRemaining() {
        return totalNegativeRemaining;
    }

    /**
     * Sets the value of the totalNegativeRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNegativeRemaining(Long value) {
        this.totalNegativeRemaining = value;
    }

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

}
