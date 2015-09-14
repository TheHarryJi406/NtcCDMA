
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryLostBalanceResponce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryLostBalanceResponce">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="balanceList" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryLostBalanceResponce", propOrder = {
    "balanceList"
})
public class DoQueryLostBalanceResponce
    extends BaseResponse
{

    protected SBalanceList balanceList;

    /**
     * Gets the value of the balanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getBalanceList() {
        return balanceList;
    }

    /**
     * Sets the value of the balanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setBalanceList(SBalanceList value) {
        this.balanceList = value;
    }

}
