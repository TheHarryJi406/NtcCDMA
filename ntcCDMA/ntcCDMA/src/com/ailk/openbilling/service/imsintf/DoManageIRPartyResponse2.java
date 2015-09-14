
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doManageIRPartyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doManageIRPartyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="iRResponseList" type="{http://imsintf.service.openbilling.ailk.com/}irResponseList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doManageIRPartyResponse", propOrder = {
    "irResponseList"
})
public class DoManageIRPartyResponse2
    extends BaseResponse
{

    @XmlElement(name = "iRResponseList")
    protected IrResponseList irResponseList;

    /**
     * Gets the value of the irResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link IrResponseList }
     *     
     */
    public IrResponseList getIRResponseList() {
        return irResponseList;
    }

    /**
     * Sets the value of the irResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrResponseList }
     *     
     */
    public void setIRResponseList(IrResponseList value) {
        this.irResponseList = value;
    }

}
