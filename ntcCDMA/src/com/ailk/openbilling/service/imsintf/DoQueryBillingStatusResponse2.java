
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryBillingStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryBillingStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="billing_status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="status_start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryBillingStatusResponse", propOrder = {
    "billingStatus",
    "statusStartDate"
})
public class DoQueryBillingStatusResponse2
    extends BaseResponse
{

    @XmlElement(name = "billing_status")
    protected Short billingStatus;
    @XmlElement(name = "status_start_date")
    protected String statusStartDate;

    /**
     * Gets the value of the billingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillingStatus() {
        return billingStatus;
    }

    /**
     * Sets the value of the billingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillingStatus(Short value) {
        this.billingStatus = value;
    }

    /**
     * Gets the value of the statusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusStartDate() {
        return statusStartDate;
    }

    /**
     * Sets the value of the statusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusStartDate(String value) {
        this.statusStartDate = value;
    }

}
