
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sNegativeBalanceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sNegativeBalanceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sNegativeBalance_Item" type="{http://imsintf.service.openbilling.ailk.com/}sNegativeBalance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sNegativeBalanceList", propOrder = {
    "sNegativeBalanceItem"
})
public class SNegativeBalanceList {

    @XmlElement(name = "sNegativeBalance_Item")
    protected List<SNegativeBalance> sNegativeBalanceItem;

    /**
     * Gets the value of the sNegativeBalanceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sNegativeBalanceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSNegativeBalanceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SNegativeBalance }
     * 
     * 
     */
    public List<SNegativeBalance> getSNegativeBalanceItem() {
        if (sNegativeBalanceItem == null) {
            sNegativeBalanceItem = new ArrayList<SNegativeBalance>();
        }
        return this.sNegativeBalanceItem;
    }

}
