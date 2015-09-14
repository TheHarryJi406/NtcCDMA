
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callDetailRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callDetailRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date_of_event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_of_event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peak_offpeak" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="called_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charging_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="added_Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grouping_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaid_usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="postpaid_usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pay_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="roam_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="total_charge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pre_discount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callDetailRecord", propOrder = {
    "dateOfEvent",
    "timeOfEvent",
    "peakOffpeak",
    "calledNumber",
    "chargingNumber",
    "operator",
    "origination",
    "destination",
    "addedService",
    "unit",
    "duration",
    "country",
    "groupingName",
    "prepaidUsage",
    "postpaidUsage",
    "payMode",
    "roamType",
    "totalCharge",
    "preDiscount",
    "measureId"
})
public class CallDetailRecord {

    @XmlElement(name = "date_of_event")
    protected String dateOfEvent;
    @XmlElement(name = "time_of_event")
    protected String timeOfEvent;
    @XmlElement(name = "peak_offpeak")
    protected Short peakOffpeak;
    @XmlElement(name = "called_number")
    protected String calledNumber;
    @XmlElement(name = "charging_number")
    protected String chargingNumber;
    protected String operator;
    protected String origination;
    protected String destination;
    @XmlElement(name = "added_Service")
    protected String addedService;
    protected String unit;
    protected String duration;
    protected String country;
    @XmlElement(name = "grouping_name")
    protected String groupingName;
    @XmlElement(name = "prepaid_usage")
    protected Long prepaidUsage;
    @XmlElement(name = "postpaid_usage")
    protected Long postpaidUsage;
    @XmlElement(name = "pay_mode")
    protected Short payMode;
    @XmlElement(name = "roam_type")
    protected Short roamType;
    @XmlElement(name = "total_charge")
    protected Long totalCharge;
    @XmlElement(name = "pre_discount")
    protected Long preDiscount;
    @XmlElement(name = "measure_id")
    protected Integer measureId;

    /**
     * Gets the value of the dateOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfEvent() {
        return dateOfEvent;
    }

    /**
     * Sets the value of the dateOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfEvent(String value) {
        this.dateOfEvent = value;
    }

    /**
     * Gets the value of the timeOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Sets the value of the timeOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfEvent(String value) {
        this.timeOfEvent = value;
    }

    /**
     * Gets the value of the peakOffpeak property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPeakOffpeak() {
        return peakOffpeak;
    }

    /**
     * Sets the value of the peakOffpeak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPeakOffpeak(Short value) {
        this.peakOffpeak = value;
    }

    /**
     * Gets the value of the calledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledNumber() {
        return calledNumber;
    }

    /**
     * Sets the value of the calledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledNumber(String value) {
        this.calledNumber = value;
    }

    /**
     * Gets the value of the chargingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingNumber() {
        return chargingNumber;
    }

    /**
     * Sets the value of the chargingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingNumber(String value) {
        this.chargingNumber = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigination(String value) {
        this.origination = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the addedService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedService() {
        return addedService;
    }

    /**
     * Sets the value of the addedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedService(String value) {
        this.addedService = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the groupingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingName() {
        return groupingName;
    }

    /**
     * Sets the value of the groupingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingName(String value) {
        this.groupingName = value;
    }

    /**
     * Gets the value of the prepaidUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrepaidUsage() {
        return prepaidUsage;
    }

    /**
     * Sets the value of the prepaidUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrepaidUsage(Long value) {
        this.prepaidUsage = value;
    }

    /**
     * Gets the value of the postpaidUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostpaidUsage() {
        return postpaidUsage;
    }

    /**
     * Sets the value of the postpaidUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostpaidUsage(Long value) {
        this.postpaidUsage = value;
    }

    /**
     * Gets the value of the payMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPayMode() {
        return payMode;
    }

    /**
     * Sets the value of the payMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPayMode(Short value) {
        this.payMode = value;
    }

    /**
     * Gets the value of the roamType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRoamType() {
        return roamType;
    }

    /**
     * Sets the value of the roamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRoamType(Short value) {
        this.roamType = value;
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
     * Gets the value of the preDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreDiscount() {
        return preDiscount;
    }

    /**
     * Sets the value of the preDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreDiscount(Long value) {
        this.preDiscount = value;
    }

    /**
     * Gets the value of the measureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Sets the value of the measureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

}
