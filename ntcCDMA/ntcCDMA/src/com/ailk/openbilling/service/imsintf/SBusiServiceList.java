
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sBusiServiceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sBusiServiceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busiServiceList" type="{http://imsintf.service.openbilling.ailk.com/}sBusiService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sBusiServiceList", propOrder = {
    "busiServiceList"
})
public class SBusiServiceList {

    protected List<SBusiService> busiServiceList;

    /**
     * Gets the value of the busiServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busiServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusiServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBusiService }
     * 
     * 
     */
    public List<SBusiService> getBusiServiceList() {
        if (busiServiceList == null) {
            busiServiceList = new ArrayList<SBusiService>();
        }
        return this.busiServiceList;
    }

}
