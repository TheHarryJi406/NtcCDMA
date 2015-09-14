
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capMaxControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capMaxControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cap_max_service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remain_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thresholdList" type="{http://imsintf.service.openbilling.ailk.com/}thresholdList" minOccurs="0"/>
 *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capMaxControl", propOrder = {
    "capMaxService",
    "amount",
    "remainValue",
    "action",
    "thresholdList",
    "itemName",
    "itemCode"
})
public class CapMaxControl {

    @XmlElement(name = "cap_max_service")
    protected String capMaxService;
    protected Long amount;
    @XmlElement(name = "remain_value")
    protected Long remainValue;
    protected String action;
    protected ThresholdList thresholdList;
    @XmlElement(name = "item_name")
    protected String itemName;
    @XmlElement(name = "item_code")
    protected Integer itemCode;

    /**
     * Gets the value of the capMaxService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapMaxService() {
        return capMaxService;
    }

    /**
     * Sets the value of the capMaxService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapMaxService(String value) {
        this.capMaxService = value;
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

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCode(Integer value) {
        this.itemCode = value;
    }

}
