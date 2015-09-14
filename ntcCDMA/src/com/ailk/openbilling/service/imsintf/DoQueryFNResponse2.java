
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryFNResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryFNResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="fn_list" type="{http://imsintf.service.openbilling.ailk.com/}productFNList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryFNResponse", propOrder = {
    "fnList"
})
public class DoQueryFNResponse2
    extends BaseResponse
{

    @XmlElement(name = "fn_list")
    protected ProductFNList fnList;

    /**
     * Gets the value of the fnList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFNList }
     *     
     */
    public ProductFNList getFnList() {
        return fnList;
    }

    /**
     * Sets the value of the fnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFNList }
     *     
     */
    public void setFnList(ProductFNList value) {
        this.fnList = value;
    }

}
