
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryRecurringfeeOnetimefeeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryRecurringfeeOnetimefeeResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="recurringOnetimeFeeList" type="{http://imsintf.service.openbilling.ailk.com/}recurringOnetimeFeeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryRecurringfeeOnetimefeeResp", propOrder = {
    "recurringOnetimeFeeList"
})
public class DoQueryRecurringfeeOnetimefeeResp
    extends BaseResponse
{

    protected RecurringOnetimeFeeList recurringOnetimeFeeList;

    /**
     * Gets the value of the recurringOnetimeFeeList property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringOnetimeFeeList }
     *     
     */
    public RecurringOnetimeFeeList getRecurringOnetimeFeeList() {
        return recurringOnetimeFeeList;
    }

    /**
     * Sets the value of the recurringOnetimeFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringOnetimeFeeList }
     *     
     */
    public void setRecurringOnetimeFeeList(RecurringOnetimeFeeList value) {
        this.recurringOnetimeFeeList = value;
    }

}
