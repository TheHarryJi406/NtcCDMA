
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUserPaySplitRelList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUserPaySplitRelList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitRelList_Item" type="{http://imsintf.service.openbilling.ailk.com/}sUserPaySplitRel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUserPaySplitRelList", propOrder = {
    "splitRelListItem"
})
public class SUserPaySplitRelList {

    @XmlElement(name = "splitRelList_Item")
    protected List<SUserPaySplitRel> splitRelListItem;

    /**
     * Gets the value of the splitRelListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRelListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRelListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUserPaySplitRel }
     * 
     * 
     */
    public List<SUserPaySplitRel> getSplitRelListItem() {
        if (splitRelListItem == null) {
            splitRelListItem = new ArrayList<SUserPaySplitRel>();
        }
        return this.splitRelListItem;
    }

}
