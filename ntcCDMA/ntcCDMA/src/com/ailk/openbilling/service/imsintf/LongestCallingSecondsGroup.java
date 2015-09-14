
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for longestCallingSecondsGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="longestCallingSecondsGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationNumberList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "longestCallingSecondsGroup", propOrder = {
    "destinationNumberList",
    "seconds"
})
public class LongestCallingSecondsGroup {

    protected List<String> destinationNumberList;
    protected Long seconds;

    /**
     * Gets the value of the destinationNumberList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationNumberList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationNumberList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDestinationNumberList() {
        if (destinationNumberList == null) {
            destinationNumberList = new ArrayList<String>();
        }
        return this.destinationNumberList;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeconds(Long value) {
        this.seconds = value;
    }

}
