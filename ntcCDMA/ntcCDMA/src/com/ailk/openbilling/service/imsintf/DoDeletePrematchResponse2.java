
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doDeletePrematchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doDeletePrematchResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="delete_phone_ids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doDeletePrematchResponse", propOrder = {
    "deletePhoneIds"
})
public class DoDeletePrematchResponse2
    extends BaseResponse
{

    @XmlElement(name = "delete_phone_ids")
    protected List<String> deletePhoneIds;

    /**
     * Gets the value of the deletePhoneIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletePhoneIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletePhoneIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeletePhoneIds() {
        if (deletePhoneIds == null) {
            deletePhoneIds = new ArrayList<String>();
        }
        return this.deletePhoneIds;
    }

}
