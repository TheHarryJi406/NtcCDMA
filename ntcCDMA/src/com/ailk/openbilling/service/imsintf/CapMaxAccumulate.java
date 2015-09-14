
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capMaxAccumulate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capMaxAccumulate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busi_service_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remain_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thresholdList" type="{http://imsintf.service.openbilling.ailk.com/}thresholdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capMaxAccumulate", propOrder = {
    "busiServiceId",
    "amount",
    "remainValue",
    "action",
    "status",
    "statusDate",
    "thresholdList"
})
public class CapMaxAccumulate {

    @XmlElement(name = "busi_service_id")
    protected Integer busiServiceId;
    protected Long amount;
    @XmlElement(name = "remain_value")
    protected Long remainValue;
    protected String action;
    protected String status;
    @XmlElement(name = "status_date")
    protected String statusDate;
    protected ThresholdList thresholdList;

    /**
     * Gets the value of the busiServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusiServiceId() {
        return busiServiceId;
    }

    /**
     * Sets the value of the busiServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusiServiceId(Integer value) {
        this.busiServiceId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the remainValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainValue() {
        return remainValue;
    }

    /**
     * Sets the value of the remainValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainValue(Long value) {
        this.remainValue = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the thresholdList property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdList }
     *     
     */
    public ThresholdList getThresholdList() {
        return thresholdList;
    }

    /**
     * Sets the value of the thresholdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdList }
     *     
     */
    public void setThresholdList(ThresholdList value) {
        this.thresholdList = value;
    }

}
