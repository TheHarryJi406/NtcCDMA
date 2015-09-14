
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bill_cycle_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycle_begin_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycle_end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unpay_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discount_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="adjust_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="prim_fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billItemList" type="{http://imsintf.service.openbilling.ailk.com/}billItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billinfo", propOrder = {
    "invoiceNo",
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "outerPayAcctId",
    "payAcctId",
    "userId",
    "phoneId",
    "billCycleNo",
    "cycleBeginDate",
    "cycleEndDate",
    "unpayFee",
    "discountFee",
    "adjustFee",
    "primFee",
    "measureId",
    "billItemList"
})
public class Billinfo {

    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "outer_pay_acct_id")
    protected String outerPayAcctId;
    @XmlElement(name = "pay_acct_id")
    protected Long payAcctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "bill_cycle_no")
    protected String billCycleNo;
    @XmlElement(name = "cycle_begin_date")
    protected String cycleBeginDate;
    @XmlElement(name = "cycle_end_date")
    protected String cycleEndDate;
    @XmlElement(name = "unpay_fee")
    protected Double unpayFee;
    @XmlElement(name = "discount_fee")
    protected Double discountFee;
    @XmlElement(name = "adjust_fee")
    protected Double adjustFee;
    @XmlElement(name = "prim_fee")
    protected Double primFee;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    protected BillItemList billItemList;

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

    /**
     * Gets the value of the outerPayAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterPayAcctId() {
        return outerPayAcctId;
    }

    /**
     * Sets the value of the outerPayAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterPayAcctId(String value) {
        this.outerPayAcctId = value;
    }

    /**
     * Gets the value of the payAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayAcctId() {
        return payAcctId;
    }

    /**
     * Sets the value of the payAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayAcctId(Long value) {
        this.payAcctId = value;
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
     * Gets the value of the billCycleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleNo() {
        return billCycleNo;
    }

    /**
     * Sets the value of the billCycleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleNo(String value) {
        this.billCycleNo = value;
    }

    /**
     * Gets the value of the cycleBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleBeginDate() {
        return cycleBeginDate;
    }

    /**
     * Sets the value of the cycleBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleBeginDate(String value) {
        this.cycleBeginDate = value;
    }

    /**
     * Gets the value of the cycleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleEndDate() {
        return cycleEndDate;
    }

    /**
     * Sets the value of the cycleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleEndDate(String value) {
        this.cycleEndDate = value;
    }

    /**
     * Gets the value of the unpayFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnpayFee() {
        return unpayFee;
    }

    /**
     * Sets the value of the unpayFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnpayFee(Double value) {
        this.unpayFee = value;
    }

    /**
     * Gets the value of the discountFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountFee() {
        return discountFee;
    }

    /**
     * Sets the value of the discountFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountFee(Double value) {
        this.discountFee = value;
    }

    /**
     * Gets the value of the adjustFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustFee() {
        return adjustFee;
    }

    /**
     * Sets the value of the adjustFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustFee(Double value) {
        this.adjustFee = value;
    }

    /**
     * Gets the value of the primFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrimFee() {
        return primFee;
    }

    /**
     * Sets the value of the primFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrimFee(Double value) {
        this.primFee = value;
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
     * Gets the value of the billItemList property.
     * 
     * @return
     *     possible object is
     *     {@link BillItemList }
     *     
     */
    public BillItemList getBillItemList() {
        return billItemList;
    }

    /**
     * Sets the value of the billItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillItemList }
     *     
     */
    public void setBillItemList(BillItemList value) {
        this.billItemList = value;
    }

}
