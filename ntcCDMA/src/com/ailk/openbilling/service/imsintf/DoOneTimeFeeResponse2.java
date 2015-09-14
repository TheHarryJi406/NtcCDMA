
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doOneTimeFeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doOneTimeFeeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="oneTimeFeeList" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFeeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doOneTimeFeeResponse", propOrder = {
    "oneTimeFeeList"
})
public class DoOneTimeFeeResponse2
    extends BaseResponse
{

    protected OneTimeFeeList oneTimeFeeList;

    /**
     * Gets the value of the oneTimeFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFeeList }
     *     
     */
    public OneTimeFeeList getOneTimeFeeList() {
        return oneTimeFeeList;
    }

    /**
     * Sets the value of the oneTimeFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFeeList }
     *     
     */
    public void setOneTimeFeeList(OneTimeFeeList value) {
        this.oneTimeFeeList = value;
    }

}
