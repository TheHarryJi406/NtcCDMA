
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_manageUserFriendsNums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_manageUserFriendsNums">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sMangeUserFNs" type="{http://imsintf.service.openbilling.ailk.com/}manageUserFriendsNum" minOccurs="0"/>
 *         &lt;element name="oneTimeFee" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_manageUserFriendsNums", propOrder = {
    "sOper",
    "sMangeUserFNs",
    "oneTimeFee"
})
public class DoManageUserFriendsNums {

    protected SOperInfo sOper;
    protected ManageUserFriendsNum sMangeUserFNs;
    protected OneTimeFee oneTimeFee;

    /**
     * Gets the value of the sOper property.
     * 
     * @return
     *     possible object is
     *     {@link SOperInfo }
     *     
     */
    public SOperInfo getSOper() {
        return sOper;
    }

    /**
     * Sets the value of the sOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOperInfo }
     *     
     */
    public void setSOper(SOperInfo value) {
        this.sOper = value;
    }

    /**
     * Gets the value of the sMangeUserFNs property.
     * 
     * @return
     *     possible object is
     *     {@link ManageUserFriendsNum }
     *     
     */
    public ManageUserFriendsNum getSMangeUserFNs() {
        return sMangeUserFNs;
    }

    /**
     * Sets the value of the sMangeUserFNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageUserFriendsNum }
     *     
     */
    public void setSMangeUserFNs(ManageUserFriendsNum value) {
        this.sMangeUserFNs = value;
    }

    /**
     * Gets the value of the oneTimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFee }
     *     
     */
    public OneTimeFee getOneTimeFee() {
        return oneTimeFee;
    }

    /**
     * Sets the value of the oneTimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFee }
     *     
     */
    public void setOneTimeFee(OneTimeFee value) {
        this.oneTimeFee = value;
    }

}
