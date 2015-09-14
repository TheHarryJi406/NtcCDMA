
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeResourceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeResourceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeResourceList_Item" type="{http://imsintf.service.openbilling.ailk.com/}freeResource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeResourceList", propOrder = {
    "freeResourceListItem"
})
public class FreeResourceList {

    @XmlElement(name = "freeResourceList_Item")
    protected List<FreeResource> freeResourceListItem;

    /**
     * Gets the value of the freeResourceListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeResourceListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeResourceListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeResource }
     * 
     * 
     */
    public List<FreeResource> getFreeResourceListItem() {
        if (freeResourceListItem == null) {
            freeResourceListItem = new ArrayList<FreeResource>();
        }
        return this.freeResourceListItem;
    }

}
