
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advancePaymentReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advancePaymentReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgSoNbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentChannel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="paymentInfo" type="{http://imsintf.service.openbilling.ailk.com/}paymentInfo" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancePaymentReq", propOrder = {
    "orgSoNbr",
    "actionType",
    "paymentDate",
    "createDate",
    "paymentChannel",
    "paymentType",
    "paymentInfo",
    "bankCode"
})
public class AdvancePaymentReq {

    protected Long orgSoNbr;
    protected Short actionType;
    protected String paymentDate;
    protected String createDate;
    protected Short paymentChannel;
    protected Short paymentType;
    protected PaymentInfo paymentInfo;
    protected String bankCode;

    /**
     * Gets the value of the orgSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgSoNbr() {
        return orgSoNbr;
    }

    /**
     * Sets the value of the orgSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgSoNbr(Long value) {
        this.orgSoNbr = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setActionType(Short value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
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
     * Gets the value of the paymentChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * Sets the value of the paymentChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentChannel(Short value) {
        this.paymentChannel = value;
    }

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
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

}
