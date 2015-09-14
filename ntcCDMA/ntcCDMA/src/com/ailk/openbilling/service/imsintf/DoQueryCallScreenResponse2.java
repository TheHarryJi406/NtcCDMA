
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryCallScreenResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryCallScreenResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="cLIR_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="call_screen_no_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="routing_method" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="iCSSendSMSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callscreen_list" type="{http://imsintf.service.openbilling.ailk.com/}sCallScreenNoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryCallScreenResponse", propOrder = {
    "clirFlag",
    "callScreenNoType",
    "productId",
    "routingMethod",
    "icsSendSMSFlag",
    "callscreenList"
})
public class DoQueryCallScreenResponse2
    extends BaseResponse
{

    @XmlElement(name = "cLIR_flag")
    protected Short clirFlag;
    @XmlElement(name = "call_screen_no_type")
    protected Short callScreenNoType;
    @XmlElement(name = "product_id")
    protected Long productId;
    @XmlElement(name = "routing_method")
    protected Short routingMethod;
    @XmlElement(name = "iCSSendSMSFlag")
    protected String icsSendSMSFlag;
    @XmlElement(name = "callscreen_list")
    protected SCallScreenNoList callscreenList;

    /**
     * Gets the value of the clirFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCLIRFlag() {
        return clirFlag;
    }

    /**
     * Sets the value of the clirFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCLIRFlag(Short value) {
        this.clirFlag = value;
    }

    /**
     * Gets the value of the callScreenNoType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCallScreenNoType() {
        return callScreenNoType;
    }

    /**
     * Sets the value of the callScreenNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCallScreenNoType(Short value) {
        this.callScreenNoType = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the routingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRoutingMethod() {
        return routingMethod;
    }

    /**
     * Sets the value of the routingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRoutingMethod(Short value) {
        this.routingMethod = value;
    }

    /**
     * Gets the value of the icsSendSMSFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICSSendSMSFlag() {
        return icsSendSMSFlag;
    }

    /**
     * Sets the value of the icsSendSMSFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICSSendSMSFlag(String value) {
        this.icsSendSMSFlag = value;
    }

    /**
     * Gets the value of the callscreenList property.
     * 
     * @return
     *     possible object is
     *     {@link SCallScreenNoList }
     *     
     */
    public SCallScreenNoList getCallscreenList() {
        return callscreenList;
    }

    /**
     * Sets the value of the callscreenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCallScreenNoList }
     *     
     */
    public void setCallscreenList(SCallScreenNoList value) {
        this.callscreenList = value;
    }

}
