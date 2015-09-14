
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctNotify complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctNotify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifyList_item" type="{http://imsintf.service.openbilling.ailk.com/}notify" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accnt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctNotify", propOrder = {
    "notifyListItem",
    "accntId"
})
public class AcctNotify {

    @XmlElement(name = "notifyList_item")
    protected List<Notify> notifyListItem;
    @XmlElement(name = "accnt_id")
    protected String accntId;

    /**
     * Gets the value of the notifyListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notify }
     * 
     * 
     */
    public List<Notify> getNotifyListItem() {
        if (notifyListItem == null) {
            notifyListItem = new ArrayList<Notify>();
        }
        return this.notifyListItem;
    }

    /**
     * Gets the value of the accntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntId() {
        return accntId;
    }

    /**
     * Sets the value of the accntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntId(String value) {
        this.accntId = value;
    }

}
