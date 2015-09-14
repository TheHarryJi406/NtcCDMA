
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for irResponseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="irResponseList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iRResponse_Item" type="{http://imsintf.service.openbilling.ailk.com/}irResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "irResponseList", propOrder = {
    "irResponseItem"
})
public class IrResponseList {

    @XmlElement(name = "iRResponse_Item")
    protected List<IrResponse> irResponseItem;

    /**
     * Gets the value of the irResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIRResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrResponse }
     * 
     * 
     */
    public List<IrResponse> getIRResponseItem() {
        if (irResponseItem == null) {
            irResponseItem = new ArrayList<IrResponse>();
        }
        return this.irResponseItem;
    }

}
