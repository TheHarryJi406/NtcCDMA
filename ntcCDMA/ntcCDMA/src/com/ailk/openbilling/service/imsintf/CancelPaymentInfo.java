
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelPaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orign_so_nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cancel_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelPaymentInfo", propOrder = {
    "orignSoNbr",
    "cancelDate",
    "remark",
    "notification"
})
public class CancelPaymentInfo {

    @XmlElement(name = "orign_so_nbr")
    protected Long orignSoNbr;
    @XmlElement(name = "cancel_date")
    protected String cancelDate;
    protected String remark;
    protected Short notification;

    /**
     * Gets the value of the orignSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrignSoNbr() {
        return orignSoNbr;
    }

    /**
     * Sets the value of the orignSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrignSoNbr(Long value) {
        this.orignSoNbr = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotification(Short value) {
        this.notification = value;
    }

}
