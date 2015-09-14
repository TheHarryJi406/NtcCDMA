
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chgGroupProductResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chgGroupProductResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sProductOrderResultList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chgGroupProductResp", propOrder = {
    "sProductOrderResultList"
})
public class ChgGroupProductResp
    extends BaseResponse
{

    protected SProductOrderResultList sProductOrderResultList;

    /**
     * Gets the value of the sProductOrderResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderResultList }
     *     
     */
    public SProductOrderResultList getSProductOrderResultList() {
        return sProductOrderResultList;
    }

    /**
     * Sets the value of the sProductOrderResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderResultList }
     *     
     */
    public void setSProductOrderResultList(SProductOrderResultList value) {
        this.sProductOrderResultList = value;
    }

}
