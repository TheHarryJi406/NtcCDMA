
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sProductOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sProductOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offer_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="so_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parent_serv_product" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billable_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billing_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="prod_state" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextcycle_start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bill_cycle" type="{http://imsintf.service.openbilling.ailk.com/}sBillCycle" minOccurs="0"/>
 *         &lt;element name="reguid_price_param" type="{http://imsintf.service.openbilling.ailk.com/}extendParamList" minOccurs="0"/>
 *         &lt;element name="param_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductParamList" minOccurs="0"/>
 *         &lt;element name="price_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaid_recurring_fee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="last_bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sProductOrder", propOrder = {
    "productId",
    "offerId",
    "soId",
    "productType",
    "parentServProduct",
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "outerBillableAcctId",
    "billableAcctId",
    "billingType",
    "prodState",
    "createDate",
    "validType",
    "validDate",
    "expireDate",
    "nextcycleStartDate",
    "billCycle",
    "reguidPriceParam",
    "paramList",
    "priceDescription",
    "prepaidRecurringFee",
    "lastBillDate"
})
public class SProductOrder {

    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "offer_id")
    protected Long offerId;
    @XmlElement(name = "so_id")
    protected String soId;
    @XmlElement(name = "product_type")
    protected Integer productType;
    @XmlElement(name = "parent_serv_product")
    protected Long parentServProduct;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "outer_billable_acct_id")
    protected String outerBillableAcctId;
    @XmlElement(name = "billable_acct_id")
    protected Long billableAcctId;
    @XmlElement(name = "billing_type")
    protected Short billingType;
    @XmlElement(name = "prod_state")
    protected Short prodState;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "valid_type")
    protected Short validType;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "nextcycle_start_date")
    protected String nextcycleStartDate;
    @XmlElement(name = "bill_cycle")
    protected SBillCycle billCycle;
    @XmlElement(name = "reguid_price_param")
    protected ExtendParamList reguidPriceParam;
    @XmlElement(name = "param_list")
    protected SProductParamList paramList;
    @XmlElement(name = "price_description")
    protected String priceDescription;
    @XmlElement(name = "prepaid_recurring_fee")
    protected Long prepaidRecurringFee;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferId(Long value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the soId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoId() {
        return soId;
    }

    /**
     * Sets the value of the soId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoId(String value) {
        this.soId = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductType(Integer value) {
        this.productType = value;
    }

    /**
     * Gets the value of the parentServProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentServProduct() {
        return parentServProduct;
    }

    /**
     * Sets the value of the parentServProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentServProduct(Long value) {
        this.parentServProduct = value;
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
     * Gets the value of the outerBillableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterBillableAcctId() {
        return outerBillableAcctId;
    }

    /**
     * Sets the value of the outerBillableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterBillableAcctId(String value) {
        this.outerBillableAcctId = value;
    }

    /**
     * Gets the value of the billableAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillableAcctId() {
        return billableAcctId;
    }

    /**
     * Sets the value of the billableAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillableAcctId(Long value) {
        this.billableAcctId = value;
    }

    /**
     * Gets the value of the billingType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillingType() {
        return billingType;
    }

    /**
     * Sets the value of the billingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillingType(Short value) {
        this.billingType = value;
    }

    /**
     * Gets the value of the prodState property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProdState() {
        return prodState;
    }

    /**
     * Sets the value of the prodState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProdState(Short value) {
        this.prodState = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the validType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getValidType() {
        return validType;
    }

    /**
     * Sets the value of the validType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setValidType(Short value) {
        this.validType = value;
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
     * Gets the value of the nextcycleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextcycleStartDate() {
        return nextcycleStartDate;
    }

    /**
     * Sets the value of the nextcycleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextcycleStartDate(String value) {
        this.nextcycleStartDate = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link SBillCycle }
     *     
     */
    public SBillCycle getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBillCycle }
     *     
     */
    public void setBillCycle(SBillCycle value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the reguidPriceParam property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendParamList }
     *     
     */
    public ExtendParamList getReguidPriceParam() {
        return reguidPriceParam;
    }

    /**
     * Sets the value of the reguidPriceParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendParamList }
     *     
     */
    public void setReguidPriceParam(ExtendParamList value) {
        this.reguidPriceParam = value;
    }

    /**
     * Gets the value of the paramList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductParamList }
     *     
     */
    public SProductParamList getParamList() {
        return paramList;
    }

    /**
     * Sets the value of the paramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductParamList }
     *     
     */
    public void setParamList(SProductParamList value) {
        this.paramList = value;
    }

    /**
     * Gets the value of the priceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDescription() {
        return priceDescription;
    }

    /**
     * Sets the value of the priceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDescription(String value) {
        this.priceDescription = value;
    }

    /**
     * Gets the value of the prepaidRecurringFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrepaidRecurringFee() {
        return prepaidRecurringFee;
    }

    /**
     * Sets the value of the prepaidRecurringFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrepaidRecurringFee(Long value) {
        this.prepaidRecurringFee = value;
    }

    /**
     * Gets the value of the lastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillDate() {
        return lastBillDate;
    }

    /**
     * Sets the value of the lastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

}
