
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeResourceGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeResourceGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeResourceGroup_Item" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeResourceGroupList", propOrder = {
    "freeResourceGroupItem"
})
public class FreeResourceGroupList {

    @XmlElement(name = "freeResourceGroup_Item")
    protected List<FreeResourceGroup> freeResourceGroupItem;

    /**
     * Gets the value of the freeResourceGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeResourceGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeResourceGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeResourceGroup }
     * 
     * 
     */
    public List<FreeResourceGroup> getFreeResourceGroupItem() {
        if (freeResourceGroupItem == null) {
            freeResourceGroupItem = new ArrayList<FreeResourceGroup>();
        }
        return this.freeResourceGroupItem;
    }

}
