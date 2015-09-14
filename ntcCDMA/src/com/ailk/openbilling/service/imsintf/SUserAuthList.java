
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUserAuthList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUserAuthList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sUserAuthList_Item" type="{http://imsintf.service.openbilling.ailk.com/}sUserAuth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUserAuthList", propOrder = {
    "sUserAuthListItem"
})
public class SUserAuthList {

    @XmlElement(name = "sUserAuthList_Item")
    protected List<SUserAuth> sUserAuthListItem;

    /**
     * Gets the value of the sUserAuthListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sUserAuthListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUserAuthListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUserAuth }
     * 
     * 
     */
    public List<SUserAuth> getSUserAuthListItem() {
        if (sUserAuthListItem == null) {
            sUserAuthListItem = new ArrayList<SUserAuth>();
        }
        return this.sUserAuthListItem;
    }

}
