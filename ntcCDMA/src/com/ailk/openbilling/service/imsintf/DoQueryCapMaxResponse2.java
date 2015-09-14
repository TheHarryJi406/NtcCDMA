
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryCapMaxResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryCapMaxResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="capMaxAccumulateList" type="{http://imsintf.service.openbilling.ailk.com/}capMaxAccumulateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryCapMaxResponse", propOrder = {
    "capMaxAccumulateList"
})
public class DoQueryCapMaxResponse2
    extends BaseResponse
{

    protected CapMaxAccumulateList capMaxAccumulateList;

    /**
     * Gets the value of the capMaxAccumulateList property.
     * 
     * @return
     *     possible object is
     *     {@link CapMaxAccumulateList }
     *     
     */
    public CapMaxAccumulateList getCapMaxAccumulateList() {
        return capMaxAccumulateList;
    }

    /**
     * Sets the value of the capMaxAccumulateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapMaxAccumulateList }
     *     
     */
    public void setCapMaxAccumulateList(CapMaxAccumulateList value) {
        this.capMaxAccumulateList = value;
    }

}
