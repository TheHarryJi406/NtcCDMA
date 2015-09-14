
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realTimeCallCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realTimeCallCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="main_promotion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start_date_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_date_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_charge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="callDetailList" type="{http://imsintf.service.openbilling.ailk.com/}callDetailList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realTimeCallCharge", propOrder = {
    "mainPromotion",
    "startDateTime",
    "endDateTime",
    "totalCharge",
    "duration",
    "callDetailList"
})
public class RealTimeCallCharge {

    @XmlElement(name = "main_promotion")
    protected Integer mainPromotion;
    @XmlElement(name = "start_date_time")
    protected String startDateTime;
    @XmlElement(name = "end_date_time")
    protected String endDateTime;
    @XmlElement(name = "total_charge")
    protected Long totalCharge;
    protected Integer duration;
    protected CallDetailList callDetailList;

    /**
     * Gets the value of the mainPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainPromotion() {
        return mainPromotion;
    }

    /**
     * Sets the value of the mainPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainPromotion(Integer value) {
        this.mainPromotion = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCharge(Long value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the callDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link CallDetailList }
     *     
     */
    public CallDetailList getCallDetailList() {
        return callDetailList;
    }

    /**
     * Sets the value of the callDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallDetailList }
     *     
     */
    public void setCallDetailList(CallDetailList value) {
        this.callDetailList = value;
    }

}
