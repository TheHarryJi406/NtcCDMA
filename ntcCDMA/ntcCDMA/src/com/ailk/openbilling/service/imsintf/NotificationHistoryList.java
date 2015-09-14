
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationHistoryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationHistoryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationHistory" type="{http://imsintf.service.openbilling.ailk.com/}notificationHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationHistoryList", propOrder = {
    "notificationHistory"
})
public class NotificationHistoryList {

    protected List<NotificationHistory> notificationHistory;

    /**
     * Gets the value of the notificationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationHistory }
     * 
     * 
     */
    public List<NotificationHistory> getNotificationHistory() {
        if (notificationHistory == null) {
            notificationHistory = new ArrayList<NotificationHistory>();
        }
        return this.notificationHistory;
    }

}
