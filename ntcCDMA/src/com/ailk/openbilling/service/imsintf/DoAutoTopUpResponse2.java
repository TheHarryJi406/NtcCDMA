
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doAutoTopUpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doAutoTopUpResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="auto_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doAutoTopUpResponse", propOrder = {
    "autoId"
})
public class DoAutoTopUpResponse2
    extends BaseResponse
{

    @XmlElement(name = "auto_id")
    protected String autoId;

    /**
     * Gets the value of the autoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoId() {
        return autoId;
    }

    /**
     * Sets the value of the autoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoId(String value) {
        this.autoId = value;
    }

}
