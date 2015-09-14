
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doAdjustBalanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doAdjustBalanceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sBalanceAdjustResponse" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceAdjustResponse" minOccurs="0"/>
 *         &lt;element name="freeResourceListAdjustResponse" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doAdjustBalanceResponse", propOrder = {
    "sBalanceAdjustResponse",
    "freeResourceListAdjustResponse"
})
public class DoAdjustBalanceResponse2
    extends BaseResponse
{

    protected SBalanceAdjustResponse sBalanceAdjustResponse;
    protected FreeResourceList freeResourceListAdjustResponse;

    /**
     * Gets the value of the sBalanceAdjustResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceAdjustResponse }
     *     
     */
    public SBalanceAdjustResponse getSBalanceAdjustResponse() {
        return sBalanceAdjustResponse;
    }

    /**
     * Sets the value of the sBalanceAdjustResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceAdjustResponse }
     *     
     */
    public void setSBalanceAdjustResponse(SBalanceAdjustResponse value) {
        this.sBalanceAdjustResponse = value;
    }

    /**
     * Gets the value of the freeResourceListAdjustResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceList }
     *     
     */
    public FreeResourceList getFreeResourceListAdjustResponse() {
        return freeResourceListAdjustResponse;
    }

    /**
     * Sets the value of the freeResourceListAdjustResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceList }
     *     
     */
    public void setFreeResourceListAdjustResponse(FreeResourceList value) {
        this.freeResourceListAdjustResponse = value;
    }

}
