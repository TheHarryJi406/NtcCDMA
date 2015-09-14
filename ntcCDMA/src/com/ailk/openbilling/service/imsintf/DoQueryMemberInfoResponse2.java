
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryMemberInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryMemberInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="groupandMemberList" type="{http://imsintf.service.openbilling.ailk.com/}groupandMemberList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryMemberInfoResponse", propOrder = {
    "groupandMemberList"
})
public class DoQueryMemberInfoResponse2
    extends BaseResponse
{

    protected List<GroupandMemberList> groupandMemberList;

    /**
     * Gets the value of the groupandMemberList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupandMemberList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupandMemberList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupandMemberList }
     * 
     * 
     */
    public List<GroupandMemberList> getGroupandMemberList() {
        if (groupandMemberList == null) {
            groupandMemberList = new ArrayList<GroupandMemberList>();
        }
        return this.groupandMemberList;
    }

}
