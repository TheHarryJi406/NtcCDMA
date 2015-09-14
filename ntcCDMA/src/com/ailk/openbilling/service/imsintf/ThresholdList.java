
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thresholdList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thresholdList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thresholdList_Item" type="{http://imsintf.service.openbilling.ailk.com/}threshold" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thresholdList", propOrder = {
    "thresholdListItem"
})
public class ThresholdList {

    @XmlElement(name = "thresholdList_Item")
    protected List<Threshold> thresholdListItem;

    /**
     * Gets the value of the thresholdListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Threshold }
     * 
     * 
     */
    public List<Threshold> getThresholdListItem() {
        if (thresholdListItem == null) {
            thresholdListItem = new ArrayList<Threshold>();
        }
        return this.thresholdListItem;
    }

}
