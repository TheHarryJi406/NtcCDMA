
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryGroupMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryGroupMembersResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="member_list" type="{http://imsintf.service.openbilling.ailk.com/}sMemberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryGroupMembersResponse", propOrder = {
    "memberList"
})
public class DoQueryGroupMembersResponse2
    extends BaseResponse
{

    @XmlElement(name = "member_list")
    protected SMemberList memberList;

    /**
     * Gets the value of the memberList property.
     * 
     * @return
     *     possible object is
     *     {@link SMemberList }
     *     
     */
    public SMemberList getMemberList() {
        return memberList;
    }

    /**
     * Sets the value of the memberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMemberList }
     *     
     */
    public void setMemberList(SMemberList value) {
        this.memberList = value;
    }

}
