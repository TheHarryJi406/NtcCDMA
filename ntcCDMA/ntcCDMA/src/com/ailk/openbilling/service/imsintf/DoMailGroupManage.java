
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_mailGroupManage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_mailGroupManage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="mailGroupManageReq" type="{http://imsintf.service.openbilling.ailk.com/}sMailGroupManageReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_mailGroupManage", propOrder = {
    "sOper",
    "mailGroupManageReq"
})
public class DoMailGroupManage {

    protected SOperInfo sOper;
    protected SMailGroupManageReq mailGroupManageReq;

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
     * Gets the value of the mailGroupManageReq property.
     * 
     * @return
     *     possible object is
     *     {@link SMailGroupManageReq }
     *     
     */
    public SMailGroupManageReq getMailGroupManageReq() {
        return mailGroupManageReq;
    }

    /**
     * Sets the value of the mailGroupManageReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMailGroupManageReq }
     *     
     */
    public void setMailGroupManageReq(SMailGroupManageReq value) {
        this.mailGroupManageReq = value;
    }

}
