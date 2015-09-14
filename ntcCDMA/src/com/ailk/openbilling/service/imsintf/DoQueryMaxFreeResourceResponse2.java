
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryMaxFreeResourceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryMaxFreeResourceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="maxFreeResourceList" type="{http://imsintf.service.openbilling.ailk.com/}maxFreeResourceList" minOccurs="0"/>
 *         &lt;element name="freeResourceList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryMaxFreeResourceResponse", propOrder = {
    "maxFreeResourceList",
    "freeResourceList"
})
public class DoQueryMaxFreeResourceResponse2
    extends BaseResponse
{

    protected MaxFreeResourceList maxFreeResourceList;
    protected FreeResourceList freeResourceList;

    /**
     * Gets the value of the maxFreeResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link MaxFreeResourceList }
     *     
     */
    public MaxFreeResourceList getMaxFreeResourceList() {
        return maxFreeResourceList;
    }

    /**
     * Sets the value of the maxFreeResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxFreeResourceList }
     *     
     */
    public void setMaxFreeResourceList(MaxFreeResourceList value) {
        this.maxFreeResourceList = value;
    }

    /**
     * Gets the value of the freeResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceList }
     *     
     */
    public FreeResourceList getFreeResourceList() {
        return freeResourceList;
    }

    /**
     * Sets the value of the freeResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceList }
     *     
     */
    public void setFreeResourceList(FreeResourceList value) {
        this.freeResourceList = value;
    }

}
