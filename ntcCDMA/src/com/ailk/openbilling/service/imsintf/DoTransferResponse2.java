
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doTransferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doTransferResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sBalanceList" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
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
@XmlType(name = "doTransferResponse", propOrder = {
    "sBalanceList",
    "freeResourceList"
})
public class DoTransferResponse2
    extends BaseResponse
{

    protected SBalanceList sBalanceList;
    protected FreeResourceList freeResourceList;

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
