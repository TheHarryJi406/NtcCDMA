
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sPocketList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sPocketList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sPocketList" type="{http://imsintf.service.openbilling.ailk.com/}sPocket" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sPocketList", propOrder = {
    "sPocketList"
})
public class SPocketList {

    protected List<SPocket> sPocketList;

    /**
     * Gets the value of the sPocketList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sPocketList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPocketList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SPocket }
     * 
     * 
     */
    public List<SPocket> getSPocketList() {
        if (sPocketList == null) {
            sPocketList = new ArrayList<SPocket>();
        }
        return this.sPocketList;
    }

}
