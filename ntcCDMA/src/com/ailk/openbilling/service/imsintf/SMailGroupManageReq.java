
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sMailGroupManageReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sMailGroupManageReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mailGroup" type="{http://imsintf.service.openbilling.ailk.com/}mailGroup" minOccurs="0"/>
 *         &lt;element name="mailGroupMemberList" type="{http://imsintf.service.openbilling.ailk.com/}mailGroupMemberList" minOccurs="0"/>
 *         &lt;element name="mailGroupPost" type="{http://imsintf.service.openbilling.ailk.com/}mailGroupPost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sMailGroupManageReq", propOrder = {
    "mailGroup",
    "mailGroupMemberList",
    "mailGroupPost"
})
public class SMailGroupManageReq {

    protected MailGroup mailGroup;
    protected MailGroupMemberList mailGroupMemberList;
    protected MailGroupPost mailGroupPost;

    /**
     * Gets the value of the mailGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MailGroup }
     *     
     */
    public MailGroup getMailGroup() {
        return mailGroup;
    }

    /**
     * Sets the value of the mailGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailGroup }
     *     
     */
    public void setMailGroup(MailGroup value) {
        this.mailGroup = value;
    }

    /**
     * Gets the value of the mailGroupMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link MailGroupMemberList }
     *     
     */
    public MailGroupMemberList getMailGroupMemberList() {
        return mailGroupMemberList;
    }

    /**
     * Sets the value of the mailGroupMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailGroupMemberList }
     *     
     */
    public void setMailGroupMemberList(MailGroupMemberList value) {
        this.mailGroupMemberList = value;
    }

    /**
     * Gets the value of the mailGroupPost property.
     * 
     * @return
     *     possible object is
     *     {@link MailGroupPost }
     *     
     */
    public MailGroupPost getMailGroupPost() {
        return mailGroupPost;
    }

    /**
     * Sets the value of the mailGroupPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailGroupPost }
     *     
     */
    public void setMailGroupPost(MailGroupPost value) {
        this.mailGroupPost = value;
    }

}
