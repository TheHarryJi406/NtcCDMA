
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryReguideInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryReguideInfoResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="reguideInfoList" type="{http://imsintf.service.openbilling.ailk.com/}reguideInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryReguideInfoResp", propOrder = {
    "reguideInfoList"
})
public class DoQueryReguideInfoResp
    extends BaseResponse
{

    protected ReguideInfoList reguideInfoList;

    /**
     * Gets the value of the reguideInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ReguideInfoList }
     *     
     */
    public ReguideInfoList getReguideInfoList() {
        return reguideInfoList;
    }

    /**
     * Sets the value of the reguideInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReguideInfoList }
     *     
     */
    public void setReguideInfoList(ReguideInfoList value) {
        this.reguideInfoList = value;
    }

}
