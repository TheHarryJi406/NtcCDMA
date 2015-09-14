
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reguideDtlInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reguideDtlInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reguideDtlInfoList_Item" type="{http://imsintf.service.openbilling.ailk.com/}reguideDtlInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reguideDtlInfoList", propOrder = {
    "reguideDtlInfoListItem"
})
public class ReguideDtlInfoList {

    @XmlElement(name = "reguideDtlInfoList_Item")
    protected List<ReguideDtlInfo> reguideDtlInfoListItem;

    /**
     * Gets the value of the reguideDtlInfoListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reguideDtlInfoListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReguideDtlInfoListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReguideDtlInfo }
     * 
     * 
     */
    public List<ReguideDtlInfo> getReguideDtlInfoListItem() {
        if (reguideDtlInfoListItem == null) {
            reguideDtlInfoListItem = new ArrayList<ReguideDtlInfo>();
        }
        return this.reguideDtlInfoListItem;
    }

}
