
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doVPNGroupRelationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doVPNGroupRelationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sProdResultList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doVPNGroupRelationResponse", propOrder = {
    "sProdResultList"
})
public class DoVPNGroupRelationResponse2
    extends BaseResponse
{

    protected SProductOrderResultList sProdResultList;

    /**
     * Gets the value of the sProdResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderResultList }
     *     
     */
    public SProductOrderResultList getSProdResultList() {
        return sProdResultList;
    }

    /**
     * Sets the value of the sProdResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderResultList }
     *     
     */
    public void setSProdResultList(SProductOrderResultList value) {
        this.sProdResultList = value;
    }

}
