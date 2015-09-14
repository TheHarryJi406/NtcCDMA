
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doFirstActivationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doFirstActivationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="prod_result_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doFirstActivationResponse", propOrder = {
    "prodResultList"
})
public class DoFirstActivationResponse2
    extends BaseResponse
{

    @XmlElement(name = "prod_result_list")
    protected SProductOrderResultList prodResultList;

    /**
     * Gets the value of the prodResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderResultList }
     *     
     */
    public SProductOrderResultList getProdResultList() {
        return prodResultList;
    }

    /**
     * Sets the value of the prodResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderResultList }
     *     
     */
    public void setProdResultList(SProductOrderResultList value) {
        this.prodResultList = value;
    }

}
