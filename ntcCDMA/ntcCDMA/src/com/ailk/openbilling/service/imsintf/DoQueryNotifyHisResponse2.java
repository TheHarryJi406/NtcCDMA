
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryNotifyHisResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryNotifyHisResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="notify_his_list" type="{http://imsintf.service.openbilling.ailk.com/}notificationHistoryList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryNotifyHisResponse", propOrder = {
    "notifyHisList"
})
public class DoQueryNotifyHisResponse2
    extends BaseResponse
{

    @XmlElement(name = "notify_his_list")
    protected NotificationHistoryList notifyHisList;

    /**
     * Gets the value of the notifyHisList property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationHistoryList }
     *     
     */
    public NotificationHistoryList getNotifyHisList() {
        return notifyHisList;
    }

    /**
     * Sets the value of the notifyHisList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationHistoryList }
     *     
     */
    public void setNotifyHisList(NotificationHistoryList value) {
        this.notifyHisList = value;
    }

}
