
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subActualUsageList" type="{http://imsintf.service.openbilling.ailk.com/}subActualUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualUsage", propOrder = {
    "groupName",
    "subActualUsageList"
})
public class ActualUsage {

    @XmlElement(name = "group_name")
    protected String groupName;
    protected List<SubActualUsage> subActualUsageList;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the subActualUsageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subActualUsageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubActualUsageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubActualUsage }
     * 
     * 
     */
    public List<SubActualUsage> getSubActualUsageList() {
        if (subActualUsageList == null) {
            subActualUsageList = new ArrayList<SubActualUsage>();
        }
        return this.subActualUsageList;
    }

}
