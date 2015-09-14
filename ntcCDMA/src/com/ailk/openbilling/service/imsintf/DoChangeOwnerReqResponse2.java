
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doChangeOwnerReqResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doChangeOwnerReqResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="prod_result_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *         &lt;element name="oldBalance_list" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doChangeOwnerReqResponse", propOrder = {
    "prodResultList",
    "oldBalanceList"
})
public class DoChangeOwnerReqResponse2
    extends BaseResponse
{

    @XmlElement(name = "prod_result_list")
    protected SProductOrderResultList prodResultList;
    @XmlElement(name = "oldBalance_list")
    protected SBalanceList oldBalanceList;

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

    /**
     * Gets the value of the oldBalanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getOldBalanceList() {
        return oldBalanceList;
    }

    /**
     * Sets the value of the oldBalanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setOldBalanceList(SBalanceList value) {
        this.oldBalanceList = value;
    }

}
