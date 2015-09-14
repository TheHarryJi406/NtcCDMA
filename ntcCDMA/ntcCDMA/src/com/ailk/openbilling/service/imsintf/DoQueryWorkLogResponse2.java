
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryWorkLogResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryWorkLogResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="recharge_log_list" type="{http://imsintf.service.openbilling.ailk.com/}rechargeLogList" minOccurs="0"/>
 *         &lt;element name="adjust_log_list" type="{http://imsintf.service.openbilling.ailk.com/}adjustLogList" minOccurs="0"/>
 *         &lt;element name="transfer_log_list" type="{http://imsintf.service.openbilling.ailk.com/}transferLogList" minOccurs="0"/>
 *         &lt;element name="payment_log_list" type="{http://imsintf.service.openbilling.ailk.com/}paymentLogList" minOccurs="0"/>
 *         &lt;element name="negativebal_log_list" type="{http://imsintf.service.openbilling.ailk.com/}negativeBalLogList" minOccurs="0"/>
 *         &lt;element name="max_freesource_log_list" type="{http://imsintf.service.openbilling.ailk.com/}maxFreeResourceLogList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryWorkLogResponse", propOrder = {
    "rechargeLogList",
    "adjustLogList",
    "transferLogList",
    "paymentLogList",
    "negativebalLogList",
    "maxFreesourceLogList"
})
public class DoQueryWorkLogResponse2
    extends BaseResponse
{

    @XmlElement(name = "recharge_log_list")
    protected RechargeLogList rechargeLogList;
    @XmlElement(name = "adjust_log_list")
    protected AdjustLogList adjustLogList;
    @XmlElement(name = "transfer_log_list")
    protected TransferLogList transferLogList;
    @XmlElement(name = "payment_log_list")
    protected PaymentLogList paymentLogList;
    @XmlElement(name = "negativebal_log_list")
    protected NegativeBalLogList negativebalLogList;
    @XmlElement(name = "max_freesource_log_list")
    protected MaxFreeResourceLogList maxFreesourceLogList;

    /**
     * Gets the value of the rechargeLogList property.
     * 
     * @return
     *     possible object is
     *     {@link RechargeLogList }
     *     
     */
    public RechargeLogList getRechargeLogList() {
        return rechargeLogList;
    }

    /**
     * Sets the value of the rechargeLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeLogList }
     *     
     */
    public void setRechargeLogList(RechargeLogList value) {
        this.rechargeLogList = value;
    }

    /**
     * Gets the value of the adjustLogList property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustLogList }
     *     
     */
    public AdjustLogList getAdjustLogList() {
        return adjustLogList;
    }

    /**
     * Sets the value of the adjustLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustLogList }
     *     
     */
    public void setAdjustLogList(AdjustLogList value) {
        this.adjustLogList = value;
    }

    /**
     * Gets the value of the transferLogList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferLogList }
     *     
     */
    public TransferLogList getTransferLogList() {
        return transferLogList;
    }

    /**
     * Sets the value of the transferLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferLogList }
     *     
     */
    public void setTransferLogList(TransferLogList value) {
        this.transferLogList = value;
    }

    /**
     * Gets the value of the paymentLogList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentLogList }
     *     
     */
    public PaymentLogList getPaymentLogList() {
        return paymentLogList;
    }

    /**
     * Sets the value of the paymentLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentLogList }
     *     
     */
    public void setPaymentLogList(PaymentLogList value) {
        this.paymentLogList = value;
    }

    /**
     * Gets the value of the negativebalLogList property.
     * 
     * @return
     *     possible object is
     *     {@link NegativeBalLogList }
     *     
     */
    public NegativeBalLogList getNegativebalLogList() {
        return negativebalLogList;
    }

    /**
     * Sets the value of the negativebalLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegativeBalLogList }
     *     
     */
    public void setNegativebalLogList(NegativeBalLogList value) {
        this.negativebalLogList = value;
    }

    /**
     * Gets the value of the maxFreesourceLogList property.
     * 
     * @return
     *     possible object is
     *     {@link MaxFreeResourceLogList }
     *     
     */
    public MaxFreeResourceLogList getMaxFreesourceLogList() {
        return maxFreesourceLogList;
    }

    /**
     * Sets the value of the maxFreesourceLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxFreeResourceLogList }
     *     
     */
    public void setMaxFreesourceLogList(MaxFreeResourceLogList value) {
        this.maxFreesourceLogList = value;
    }

}
