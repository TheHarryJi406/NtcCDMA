
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification_type" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="related_phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="template_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_lanauge" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="notify_content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify_lang" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="notify_channel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
@XmlType(name = "notificationHistory", propOrder = {
    "phoneId",
    "notificationType",
    "channel",
    "relatedPhoneId",
    "notificationId",
    "templateId",
    "module",
    "service",
    "sender",
    "email",
    "emailAddress",
    "notifyLanauge",
    "notifyContent",
    "notifyTime",
    "createDate",
    "notifyLang",
    "notifyChannel",
    "notificationName",
    "notificationDesc"
})
public class NotificationHistory {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "notification_type")
    protected short notificationType;
    protected Short channel;
    @XmlElement(name = "related_phone_id")
    protected String relatedPhoneId;
    @XmlElement(name = "notification_id")
    protected Long notificationId;
    @XmlElement(name = "template_id")
    protected Long templateId;
    protected String module;
    protected String service;
    protected String sender;
    protected String email;
    @XmlElement(name = "email_address")
    protected String emailAddress;
    @XmlElement(name = "notify_lanauge")
    protected Short notifyLanauge;
    @XmlElement(name = "notify_content")
    protected String notifyContent;
    @XmlElement(name = "notify_time")
    protected String notifyTime;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "notify_lang")
    protected Short notifyLang;
    @XmlElement(name = "notify_channel")
    protected Short notifyChannel;
    @XmlElement(name = "notification_name")
    protected String notificationName;
    @XmlElement(name = "notification_desc")
    protected String notificationDesc;

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
     * Gets the value of the notificationType property.
     * 
     */
    public short getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     */
    public void setNotificationType(short value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChannel(Short value) {
        this.channel = value;
    }

    /**
     * Gets the value of the relatedPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedPhoneId() {
        return relatedPhoneId;
    }

    /**
     * Sets the value of the relatedPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedPhoneId(String value) {
        this.relatedPhoneId = value;
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
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the notifyLanauge property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyLanauge() {
        return notifyLanauge;
    }

    /**
     * Sets the value of the notifyLanauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyLanauge(Short value) {
        this.notifyLanauge = value;
    }

    /**
     * Gets the value of the notifyContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyContent() {
        return notifyContent;
    }

    /**
     * Sets the value of the notifyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyContent(String value) {
        this.notifyContent = value;
    }

    /**
     * Gets the value of the notifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyTime() {
        return notifyTime;
    }

    /**
     * Sets the value of the notifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyTime(String value) {
        this.notifyTime = value;
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
     * Gets the value of the notifyLang property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNotifyLang() {
        return notifyLang;
    }

    /**
     * Sets the value of the notifyLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNotifyLang(Short value) {
        this.notifyLang = value;
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
