
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doSMngQueryDepositResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doSMngQueryDepositResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="pocket_list" type="{http://imsintf.service.openbilling.ailk.com/}sPocketList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doSMngQueryDepositResponse", propOrder = {
    "pocketList"
})
public class DoSMngQueryDepositResponse
    extends BaseResponse
{

    @XmlElement(name = "pocket_list")
    protected SPocketList pocketList;

    /**
     * Gets the value of the pocketList property.
     * 
     * @return
     *     possible object is
     *     {@link SPocketList }
     *     
     */
    public SPocketList getPocketList() {
        return pocketList;
    }

    /**
     * Sets the value of the pocketList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPocketList }
     *     
     */
    public void setPocketList(SPocketList value) {
        this.pocketList = value;
    }

}
