
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doAdvancePaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doAdvancePaymentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="so_nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payment_so_nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="advancepay_so_nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doAdvancePaymentResponse", propOrder = {
    "soNbr",
    "paymentSoNbr",
    "advancepaySoNbr"
})
public class DoAdvancePaymentResponse2
    extends BaseResponse
{

    @XmlElement(name = "so_nbr")
    protected Long soNbr;
    @XmlElement(name = "payment_so_nbr")
    protected Long paymentSoNbr;
    @XmlElement(name = "advancepay_so_nbr")
    protected Long advancepaySoNbr;

    /**
     * Gets the value of the soNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSoNbr() {
        return soNbr;
    }

    /**
     * Sets the value of the soNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSoNbr(Long value) {
        this.soNbr = value;
    }

    /**
     * Gets the value of the paymentSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentSoNbr() {
        return paymentSoNbr;
    }

    /**
     * Sets the value of the paymentSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentSoNbr(Long value) {
        this.paymentSoNbr = value;
    }

    /**
     * Gets the value of the advancepaySoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvancepaySoNbr() {
        return advancepaySoNbr;
    }

    /**
     * Sets the value of the advancepaySoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvancepaySoNbr(Long value) {
        this.advancepaySoNbr = value;
    }

}
