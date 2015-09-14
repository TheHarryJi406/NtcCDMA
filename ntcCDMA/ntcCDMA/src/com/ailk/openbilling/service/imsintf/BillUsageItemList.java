
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billUsageItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billUsageItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billUsageItemList_Item" type="{http://imsintf.service.openbilling.ailk.com/}billUsageItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billUsageItemList", propOrder = {
    "billUsageItemListItem"
})
public class BillUsageItemList {

    @XmlElement(name = "billUsageItemList_Item")
    protected List<BillUsageItem> billUsageItemListItem;

    /**
     * Gets the value of the billUsageItemListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billUsageItemListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillUsageItemListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillUsageItem }
     * 
     * 
     */
    public List<BillUsageItem> getBillUsageItemListItem() {
        if (billUsageItemListItem == null) {
            billUsageItemListItem = new ArrayList<BillUsageItem>();
        }
        return this.billUsageItemListItem;
    }

}
