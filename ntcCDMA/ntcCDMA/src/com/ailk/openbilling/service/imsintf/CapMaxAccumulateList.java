
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capMaxAccumulateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capMaxAccumulateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capMaxAccumulateList" type="{http://imsintf.service.openbilling.ailk.com/}capMaxAccumulate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capMaxAccumulateList", propOrder = {
    "capMaxAccumulateList"
})
public class CapMaxAccumulateList {

    protected List<CapMaxAccumulate> capMaxAccumulateList;

    /**
     * Gets the value of the capMaxAccumulateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capMaxAccumulateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapMaxAccumulateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapMaxAccumulate }
     * 
     * 
     */
    public List<CapMaxAccumulate> getCapMaxAccumulateList() {
        if (capMaxAccumulateList == null) {
            capMaxAccumulateList = new ArrayList<CapMaxAccumulate>();
        }
        return this.capMaxAccumulateList;
    }

}
