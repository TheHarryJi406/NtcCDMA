
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechargeLogList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechargeLogList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rechargeLogList_Item" type="{http://imsintf.service.openbilling.ailk.com/}rechargeLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargeLogList", propOrder = {
    "rechargeLogListItem"
})
public class RechargeLogList {

    @XmlElement(name = "rechargeLogList_Item")
    protected List<RechargeLog> rechargeLogListItem;

    /**
     * Gets the value of the rechargeLogListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechargeLogListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechargeLogListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechargeLog }
     * 
     * 
     */
    public List<RechargeLog> getRechargeLogListItem() {
        if (rechargeLogListItem == null) {
            rechargeLogListItem = new ArrayList<RechargeLog>();
        }
        return this.rechargeLogListItem;
    }

}
