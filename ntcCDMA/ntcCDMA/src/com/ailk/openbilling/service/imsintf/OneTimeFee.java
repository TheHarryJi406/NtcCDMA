
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oneTimeFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneTimeFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outer_pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="origin_so_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee_list" type="{http://imsintf.service.openbilling.ailk.com/}feeItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneTimeFee", propOrder = {
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "userId",
    "phoneId",
    "outerPayAcctId",
    "payAcctId",
    "originSoNbr",
    "feeList"
})
public class OneTimeFee {

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
    @XmlElement(name = "outer_pay_acct_id")
    protected String outerPayAcctId;
    @XmlElement(name = "pay_acct_id")
    protected Long payAcctId;
    @XmlElement(name = "origin_so_nbr")
    protected String originSoNbr;
    @XmlElement(name = "fee_list")
    protected FeeItemList feeList;

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
     * Gets the value of the originSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginSoNbr() {
        return originSoNbr;
    }

    /**
     * Sets the value of the originSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginSoNbr(String value) {
        this.originSoNbr = value;
    }

    /**
     * Gets the value of the feeList property.
     * 
     * @return
     *     possible object is
     *     {@link FeeItemList }
     *     
     */
    public FeeItemList getFeeList() {
        return feeList;
    }

    /**
     * Sets the value of the feeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeItemList }
     *     
     */
    public void setFeeList(FeeItemList value) {
        this.feeList = value;
    }

}
