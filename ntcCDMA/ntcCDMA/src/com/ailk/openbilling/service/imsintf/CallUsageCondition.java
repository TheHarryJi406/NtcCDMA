
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callUsageCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callUsageCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="call_duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="network_operator_destination_number" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callUsageCondition", propOrder = {
    "destinationNumber",
    "callDuration",
    "networkOperatorDestinationNumber"
})
public class CallUsageCondition {

    @XmlElement(name = "destination_number")
    protected String destinationNumber;
    @XmlElement(name = "call_duration")
    protected Integer callDuration;
    @XmlElement(name = "network_operator_destination_number")
    protected Short networkOperatorDestinationNumber;

    /**
     * Gets the value of the destinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Sets the value of the destinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationNumber(String value) {
        this.destinationNumber = value;
    }

    /**
     * Gets the value of the callDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallDuration() {
        return callDuration;
    }

    /**
     * Sets the value of the callDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallDuration(Integer value) {
        this.callDuration = value;
    }

    /**
     * Gets the value of the networkOperatorDestinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNetworkOperatorDestinationNumber() {
        return networkOperatorDestinationNumber;
    }

    /**
     * Sets the value of the networkOperatorDestinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNetworkOperatorDestinationNumber(Short value) {
        this.networkOperatorDestinationNumber = value;
    }

}
