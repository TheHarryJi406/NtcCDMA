
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sProductOrderResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sProductOrderResultList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sProductOrderResultList_Item" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sProductOrderResultList", propOrder = {
    "sProductOrderResultListItem"
})
public class SProductOrderResultList {

    @XmlElement(name = "sProductOrderResultList_Item")
    protected List<SProductOrderResult> sProductOrderResultListItem;

    /**
     * Gets the value of the sProductOrderResultListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sProductOrderResultListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSProductOrderResultListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SProductOrderResult }
     * 
     * 
     */
    public List<SProductOrderResult> getSProductOrderResultListItem() {
        if (sProductOrderResultListItem == null) {
            sProductOrderResultListItem = new ArrayList<SProductOrderResult>();
        }
        return this.sProductOrderResultListItem;
    }

}
