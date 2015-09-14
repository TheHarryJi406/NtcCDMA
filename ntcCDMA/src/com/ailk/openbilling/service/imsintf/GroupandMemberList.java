
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupandMemberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupandMemberList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sMemberList" type="{http://imsintf.service.openbilling.ailk.com/}sMemberList" minOccurs="0"/>
 *         &lt;element name="sGroup" type="{http://imsintf.service.openbilling.ailk.com/}sGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupandMemberList", propOrder = {
    "sMemberList",
    "sGroup"
})
public class GroupandMemberList {

    protected SMemberList sMemberList;
    protected SGroup sGroup;

    /**
     * Gets the value of the sMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link SMemberList }
     *     
     */
    public SMemberList getSMemberList() {
        return sMemberList;
    }

    /**
     * Sets the value of the sMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMemberList }
     *     
     */
    public void setSMemberList(SMemberList value) {
        this.sMemberList = value;
    }

    /**
     * Gets the value of the sGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SGroup }
     *     
     */
    public SGroup getSGroup() {
        return sGroup;
    }

    /**
     * Sets the value of the sGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGroup }
     *     
     */
    public void setSGroup(SGroup value) {
        this.sGroup = value;
    }

}
