
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autoTopUpRelationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoTopUpRelationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoTopUpRelationList_Item" type="{http://imsintf.service.openbilling.ailk.com/}autoTopUpRelation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoTopUpRelationList", propOrder = {
    "autoTopUpRelationListItem"
})
public class AutoTopUpRelationList {

    @XmlElement(name = "autoTopUpRelationList_Item")
    protected List<AutoTopUpRelation> autoTopUpRelationListItem;

    /**
     * Gets the value of the autoTopUpRelationListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoTopUpRelationListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoTopUpRelationListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoTopUpRelation }
     * 
     * 
     */
    public List<AutoTopUpRelation> getAutoTopUpRelationListItem() {
        if (autoTopUpRelationListItem == null) {
            autoTopUpRelationListItem = new ArrayList<AutoTopUpRelation>();
        }
        return this.autoTopUpRelationListItem;
    }

}
