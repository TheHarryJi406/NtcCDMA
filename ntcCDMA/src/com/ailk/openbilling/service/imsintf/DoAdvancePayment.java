
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_advancePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_advancePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="advancePaymentReq" type="{http://imsintf.service.openbilling.ailk.com/}advancePaymentReq" minOccurs="0"/>
 *         &lt;element name="notification_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_advancePayment", propOrder = {
    "sOper",
    "advancePaymentReq",
    "notificationFlag"
})
public class DoAdvancePayment {

    protected SOperInfo sOper;
    protected AdvancePaymentReq advancePaymentReq;
    @XmlElement(name = "notification_flag")
    protected Short notificationFlag;

    /**
     * Gets the value of the sOper property.
     * 
     * @return
     *     possible object is
     *     {@link SOperInfo }
     *     
     */
    public SOperInfo getSOper() {
        return sOper;
    }

    /**
     * Sets the value of the sOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOperInfo }
     *     
     */
    public void setSOper(SOperInfo value) {
        this.sOper = value;
    }

    /**
     * Gets the value of the advancePaymentReq property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancePaymentReq }
     *     
     */
    public AdvancePaymentReq getAdvancePaymentReq() {
        return advancePaymentReq;
    }

    /**
     * Sets the value of the advancePaymentReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancePaymentReq }
     *     
     */
    public void setAdvancePaymentReq(AdvancePaymentReq value) {
        this.advancePaymentReq = value;
    }

    /**
     * Gets the value of the notificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotificationFlag() {
        return notificationFlag;
    }

    /**
     * Sets the value of the notificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotificationFlag(Short value) {
        this.notificationFlag = value;
    }

}
