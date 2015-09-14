
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sQueryFreeTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryFreeTimes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max_free_time" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="used_free_time" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remaining_free_time" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="free_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee_amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="busi_spec_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryFreeTimes", propOrder = {
    "maxFreeTime",
    "usedFreeTime",
    "remainingFreeTime",
    "freeFlag",
    "feeAmount",
    "startDate",
    "endDate",
    "busiSpecId"
})
public class SQueryFreeTimes {

    @XmlElement(name = "max_free_time")
    protected Integer maxFreeTime;
    @XmlElement(name = "used_free_time")
    protected Integer usedFreeTime;
    @XmlElement(name = "remaining_free_time")
    protected Integer remainingFreeTime;
    @XmlElement(name = "free_flag")
    protected String freeFlag;
    @XmlElement(name = "fee_amount")
    protected Integer feeAmount;
    @XmlElement(name = "start_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "busi_spec_id")
    protected Long busiSpecId;

    /**
     * Gets the value of the maxFreeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFreeTime() {
        return maxFreeTime;
    }

    /**
     * Sets the value of the maxFreeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFreeTime(Integer value) {
        this.maxFreeTime = value;
    }

    /**
     * Gets the value of the usedFreeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsedFreeTime() {
        return usedFreeTime;
    }

    /**
     * Sets the value of the usedFreeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsedFreeTime(Integer value) {
        this.usedFreeTime = value;
    }

    /**
     * Gets the value of the remainingFreeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFreeTime() {
        return remainingFreeTime;
    }

    /**
     * Sets the value of the remainingFreeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFreeTime(Integer value) {
        this.remainingFreeTime = value;
    }

    /**
     * Gets the value of the freeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFlag() {
        return freeFlag;
    }

    /**
     * Sets the value of the freeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFlag(String value) {
        this.freeFlag = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeAmount(Integer value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the busiSpecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusiSpecId() {
        return busiSpecId;
    }

    /**
     * Sets the value of the busiSpecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusiSpecId(Long value) {
        this.busiSpecId = value;
    }

}
