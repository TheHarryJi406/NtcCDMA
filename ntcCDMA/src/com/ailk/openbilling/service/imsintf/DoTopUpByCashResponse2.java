
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doTopUpByCashResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doTopUpByCashResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="top_Up_Resp" type="{http://imsintf.service.openbilling.ailk.com/}sTopUpResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doTopUpByCashResponse", propOrder = {
    "topUpResp"
})
public class DoTopUpByCashResponse2
    extends BaseResponse
{

    @XmlElement(name = "top_Up_Resp")
    protected STopUpResponse topUpResp;

    /**
     * Gets the value of the topUpResp property.
     * 
     * @return
     *     possible object is
     *     {@link STopUpResponse }
     *     
     */
    public STopUpResponse getTopUpResp() {
        return topUpResp;
    }

    /**
     * Sets the value of the topUpResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STopUpResponse }
     *     
     */
    public void setTopUpResp(STopUpResponse value) {
        this.topUpResp = value;
    }

}
