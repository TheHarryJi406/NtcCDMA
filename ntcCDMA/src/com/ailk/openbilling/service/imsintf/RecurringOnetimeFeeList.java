
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recurringOnetimeFeeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recurringOnetimeFeeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recurringOnetimeFee_Item" type="{http://imsintf.service.openbilling.ailk.com/}recurringOnetimeFee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurringOnetimeFeeList", propOrder = {
    "recurringOnetimeFeeItem"
})
public class RecurringOnetimeFeeList {

    @XmlElement(name = "recurringOnetimeFee_Item")
    protected List<RecurringOnetimeFee> recurringOnetimeFeeItem;

    /**
     * Gets the value of the recurringOnetimeFeeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringOnetimeFeeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringOnetimeFeeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringOnetimeFee }
     * 
     * 
     */
    public List<RecurringOnetimeFee> getRecurringOnetimeFeeItem() {
        if (recurringOnetimeFeeItem == null) {
            recurringOnetimeFeeItem = new ArrayList<RecurringOnetimeFee>();
        }
        return this.recurringOnetimeFeeItem;
    }

}
