
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doCancelOneTimeFeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doCancelOneTimeFeeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "doCancelOneTimeFeeResponse", propOrder = {
    "remark",
    "oneTimeFeeList"
})
public class DoCancelOneTimeFeeResponse2
    extends BaseResponse
{

    protected String remark;
    protected OneTimeFeeList oneTimeFeeList;

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

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
