
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doAdjustBillResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doAdjustBillResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="bill_Info" type="{http://imsintf.service.openbilling.ailk.com/}billinfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doAdjustBillResponse", propOrder = {
    "billInfo"
})
public class DoAdjustBillResponse2
    extends BaseResponse
{

    @XmlElement(name = "bill_Info")
    protected Billinfo billInfo;

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Billinfo }
     *     
     */
    public Billinfo getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Billinfo }
     *     
     */
    public void setBillInfo(Billinfo value) {
        this.billInfo = value;
    }

}
