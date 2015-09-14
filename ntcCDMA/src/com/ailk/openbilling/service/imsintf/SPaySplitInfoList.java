
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sPaySplitInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sPaySplitInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitInfoList_item" type="{http://imsintf.service.openbilling.ailk.com/}sPaySplitInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sPaySplitInfoList", propOrder = {
    "splitInfoListItem"
})
public class SPaySplitInfoList {

    @XmlElement(name = "splitInfoList_item")
    protected List<SPaySplitInfo> splitInfoListItem;

    /**
     * Gets the value of the splitInfoListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitInfoListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitInfoListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPaySplitInfo }
     * 
     * 
     */
    public List<SPaySplitInfo> getSplitInfoListItem() {
        if (splitInfoListItem == null) {
            splitInfoListItem = new ArrayList<SPaySplitInfo>();
        }
        return this.splitInfoListItem;
    }

}
