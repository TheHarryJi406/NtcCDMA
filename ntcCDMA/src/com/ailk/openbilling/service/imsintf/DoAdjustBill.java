
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_adjustBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_adjustBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="adjust_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="billInfo" type="{http://imsintf.service.openbilling.ailk.com/}billinfo" minOccurs="0"/>
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
@XmlType(name = "do_adjustBill", propOrder = {
    "sOper",
    "adjustType",
    "billInfo",
    "notificationFlag"
})
public class DoAdjustBill {

    protected SOperInfo sOper;
    @XmlElement(name = "adjust_type")
    protected Short adjustType;
    protected Billinfo billInfo;
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
     * Gets the value of the adjustType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAdjustType() {
        return adjustType;
    }

    /**
     * Sets the value of the adjustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAdjustType(Short value) {
        this.adjustType = value;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Billinfo }
     *     
     */
    public Billinfo getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Billinfo }
     *     
     */
    public void setBillInfo(Billinfo value) {
        this.billInfo = value;
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
