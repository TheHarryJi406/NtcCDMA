
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notify complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notify_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="notify_channel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="notification_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notification_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notify", propOrder = {
    "notifyType",
    "notifyChannel",
    "serviceId",
    "notificationId",
    "notificationName",
    "notificationDesc"
})
public class Notify {

    @XmlElement(name = "notify_type")
    protected Short notifyType;
    @XmlElement(name = "notify_channel")
    protected Short notifyChannel;
    @XmlElement(name = "service_id")
    protected Integer serviceId;
    @XmlElement(name = "notification_id")
    protected Long notificationId;
    @XmlElement(name = "notification_name")
    protected String notificationName;
    @XmlElement(name = "notification_desc")
    protected String notificationDesc;

    /**
     * Gets the value of the notifyType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyType() {
        return notifyType;
    }

    /**
     * Sets the value of the notifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyType(Short value) {
        this.notifyType = value;
    }

    /**
     * Gets the value of the notifyChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyChannel() {
        return notifyChannel;
    }

    /**
     * Sets the value of the notifyChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyChannel(Short value) {
        this.notifyChannel = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the notificationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotificationId(Long value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the notificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationName() {
        return notificationName;
    }

    /**
     * Sets the value of the notificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationName(String value) {
        this.notificationName = value;
    }

    /**
     * Gets the value of the notificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDesc() {
        return notificationDesc;
    }

    /**
     * Sets the value of the notificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDesc(String value) {
        this.notificationDesc = value;
    }

}
