
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryUsersByBssResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryUsersByBssResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="userList" type="{http://imsintf.service.openbilling.ailk.com/}userList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryUsersByBssResponse", propOrder = {
    "userList"
})
public class DoQueryUsersByBssResponse
    extends BaseResponse
{

    protected UserList userList;

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link UserList }
     *     
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserList }
     *     
     */
    public void setUserList(UserList value) {
        this.userList = value;
    }

}
