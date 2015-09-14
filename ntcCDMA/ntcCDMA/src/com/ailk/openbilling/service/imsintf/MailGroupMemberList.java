
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailGroupMemberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailGroupMemberList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailGroupMember_Item" type="{http://imsintf.service.openbilling.ailk.com/}mailGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailGroupMemberList", propOrder = {
    "mailGroupMemberItem"
})
public class MailGroupMemberList {

    @XmlElement(name = "mailGroupMember_Item")
    protected List<MailGroupMember> mailGroupMemberItem;

    /**
     * Gets the value of the mailGroupMemberItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailGroupMemberItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailGroupMemberItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailGroupMember }
     * 
     * 
     */
    public List<MailGroupMember> getMailGroupMemberItem() {
        if (mailGroupMemberItem == null) {
            mailGroupMemberItem = new ArrayList<MailGroupMember>();
        }
        return this.mailGroupMemberItem;
    }

}
