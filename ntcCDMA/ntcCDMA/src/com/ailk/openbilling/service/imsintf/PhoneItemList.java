
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneItem" type="{http://imsintf.service.openbilling.ailk.com/}phoneItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneItemList", propOrder = {
    "phoneItem"
})
public class PhoneItemList {

    protected List<PhoneItem> phoneItem;

    /**
     * Gets the value of the phoneItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneItem }
     * 
     * 
     */
    public List<PhoneItem> getPhoneItem() {
        if (phoneItem == null) {
            phoneItem = new ArrayList<PhoneItem>();
        }
        return this.phoneItem;
    }

}
