
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callDetailRecordList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callDetailRecordList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callDetailRecord" type="{http://imsintf.service.openbilling.ailk.com/}callDetailRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sContact" type="{http://imsintf.service.openbilling.ailk.com/}sContact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callDetailRecordList", propOrder = {
    "callDetailRecord",
    "sContact"
})
public class CallDetailRecordList {

    protected List<CallDetailRecord> callDetailRecord;
    protected SContact sContact;

    /**
     * Gets the value of the callDetailRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callDetailRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallDetailRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallDetailRecord }
     * 
     * 
     */
    public List<CallDetailRecord> getCallDetailRecord() {
        if (callDetailRecord == null) {
            callDetailRecord = new ArrayList<CallDetailRecord>();
        }
        return this.callDetailRecord;
    }

    /**
     * Gets the value of the sContact property.
     * 
     * @return
     *     possible object is
     *     {@link SContact }
     *     
     */
    public SContact getSContact() {
        return sContact;
    }

    /**
     * Sets the value of the sContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SContact }
     *     
     */
    public void setSContact(SContact value) {
        this.sContact = value;
    }

}
