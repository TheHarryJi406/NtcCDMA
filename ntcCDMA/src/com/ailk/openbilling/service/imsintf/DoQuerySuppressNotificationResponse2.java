
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQuerySuppressNotificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQuerySuppressNotificationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="acctNotifyList" type="{http://imsintf.service.openbilling.ailk.com/}acctNotify" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phoneNotifyList" type="{http://imsintf.service.openbilling.ailk.com/}phoneNotify" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQuerySuppressNotificationResponse", propOrder = {
    "acctNotifyList",
    "phoneNotifyList"
})
public class DoQuerySuppressNotificationResponse2
    extends BaseResponse
{

    protected List<AcctNotify> acctNotifyList;
    protected List<PhoneNotify> phoneNotifyList;

    /**
     * Gets the value of the acctNotifyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctNotifyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctNotifyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctNotify }
     * 
     * 
     */
    public List<AcctNotify> getAcctNotifyList() {
        if (acctNotifyList == null) {
            acctNotifyList = new ArrayList<AcctNotify>();
        }
        return this.acctNotifyList;
    }

    /**
     * Gets the value of the phoneNotifyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNotifyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNotifyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNotify }
     * 
     * 
     */
    public List<PhoneNotify> getPhoneNotifyList() {
        if (phoneNotifyList == null) {
            phoneNotifyList = new ArrayList<PhoneNotify>();
        }
        return this.phoneNotifyList;
    }

}
