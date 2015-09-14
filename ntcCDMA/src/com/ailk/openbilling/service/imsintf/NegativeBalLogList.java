
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for negativeBalLogList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="negativeBalLogList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="negativeBalLog_item" type="{http://imsintf.service.openbilling.ailk.com/}negativeBalanceLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "negativeBalLogList", propOrder = {
    "negativeBalLogItem"
})
public class NegativeBalLogList {

    @XmlElement(name = "negativeBalLog_item")
    protected List<NegativeBalanceLog> negativeBalLogItem;

    /**
     * Gets the value of the negativeBalLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negativeBalLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegativeBalLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegativeBalanceLog }
     * 
     * 
     */
    public List<NegativeBalanceLog> getNegativeBalLogItem() {
        if (negativeBalLogItem == null) {
            negativeBalLogItem = new ArrayList<NegativeBalanceLog>();
        }
        return this.negativeBalLogItem;
    }

}
