
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doRemoveUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doRemoveUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sBalanceList" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doRemoveUserResponse", propOrder = {
    "sBalanceList"
})
public class DoRemoveUserResponse2
    extends BaseResponse
{

    protected SBalanceList sBalanceList;

    /**
     * Gets the value of the sBalanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getSBalanceList() {
        return sBalanceList;
    }

    /**
     * Sets the value of the sBalanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setSBalanceList(SBalanceList value) {
        this.sBalanceList = value;
    }

}
