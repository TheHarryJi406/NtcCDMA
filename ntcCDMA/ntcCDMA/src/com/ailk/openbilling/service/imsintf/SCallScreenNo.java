
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sCallScreenNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sCallScreenNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effect_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expire_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="week_start" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="week_stop" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="route_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ir_route_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="routing_method" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="list_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sCallScreenNo", propOrder = {
    "phoneId",
    "validDate",
    "expireDate",
    "effectTime",
    "expireTime",
    "weekStart",
    "weekStop",
    "routeNumber",
    "irRouteFlag",
    "routingMethod",
    "listType"
})
public class SCallScreenNo {

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "expire_date")
    protected String expireDate;
    @XmlElement(name = "effect_time")
    protected String effectTime;
    @XmlElement(name = "expire_time")
    protected String expireTime;
    @XmlElement(name = "week_start")
    protected Short weekStart;
    @XmlElement(name = "week_stop")
    protected Short weekStop;
    @XmlElement(name = "route_number")
    protected String routeNumber;
    @XmlElement(name = "ir_route_flag")
    protected Short irRouteFlag;
    @XmlElement(name = "routing_method")
    protected Short routingMethod;
    @XmlElement(name = "list_type")
    protected Short listType;

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
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the effectTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectTime() {
        return effectTime;
    }

    /**
     * Sets the value of the effectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectTime(String value) {
        this.effectTime = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

    /**
     * Gets the value of the weekStart property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekStart() {
        return weekStart;
    }

    /**
     * Sets the value of the weekStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekStart(Short value) {
        this.weekStart = value;
    }

    /**
     * Gets the value of the weekStop property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekStop() {
        return weekStop;
    }

    /**
     * Sets the value of the weekStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekStop(Short value) {
        this.weekStop = value;
    }

    /**
     * Gets the value of the routeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNumber() {
        return routeNumber;
    }

    /**
     * Sets the value of the routeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNumber(String value) {
        this.routeNumber = value;
    }

    /**
     * Gets the value of the irRouteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIrRouteFlag() {
        return irRouteFlag;
    }

    /**
     * Sets the value of the irRouteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIrRouteFlag(Short value) {
        this.irRouteFlag = value;
    }

    /**
     * Gets the value of the routingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRoutingMethod() {
        return routingMethod;
    }

    /**
     * Sets the value of the routingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRoutingMethod(Short value) {
        this.routingMethod = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setListType(Short value) {
        this.listType = value;
    }

}
