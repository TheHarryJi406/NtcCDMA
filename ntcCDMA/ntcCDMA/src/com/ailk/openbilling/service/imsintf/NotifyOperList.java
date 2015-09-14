
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notifyOperList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notifyOperList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifyOperList_item" type="{http://imsintf.service.openbilling.ailk.com/}notifyOper" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifyOperList", propOrder = {
    "notifyOperListItem"
})
public class NotifyOperList {

    @XmlElement(name = "notifyOperList_item")
    protected List<NotifyOper> notifyOperListItem;

    /**
     * Gets the value of the notifyOperListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyOperListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyOperListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyOper }
     * 
     * 
     */
    public List<NotifyOper> getNotifyOperListItem() {
        if (notifyOperListItem == null) {
            notifyOperListItem = new ArrayList<NotifyOper>();
        }
        return this.notifyOperListItem;
    }

}
