
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryScpProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryScpProfileResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fph_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ussd_callback_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="icfFlag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="icfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icfNumberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sUserAuth" type="{http://imsintf.service.openbilling.ailk.com/}sUserAuth" minOccurs="0"/>
 *         &lt;element name="flh_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="posContinue_flag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="brand_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryScpProfileResponse", propOrder = {
    "phoneId",
    "fphFlag",
    "ussdCallbackFlag",
    "icfFlag",
    "icfNumber",
    "icfNumberStatus",
    "sUserAuth",
    "flhFlag",
    "posContinueFlag",
    "brandId"
})
public class DoQueryScpProfileResponse2
    extends BaseResponse
{

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "fph_flag")
    protected Short fphFlag;
    @XmlElement(name = "ussd_callback_flag")
    protected Short ussdCallbackFlag;
    protected Short icfFlag;
    protected String icfNumber;
    protected String icfNumberStatus;
    protected SUserAuth sUserAuth;
    @XmlElement(name = "flh_flag")
    protected Short flhFlag;
    @XmlElement(name = "posContinue_flag")
    protected Short posContinueFlag;
    @XmlElement(name = "brand_id")
    protected Short brandId;

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneId(String value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the fphFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFphFlag() {
        return fphFlag;
    }

    /**
     * Sets the value of the fphFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFphFlag(Short value) {
        this.fphFlag = value;
    }

    /**
     * Gets the value of the ussdCallbackFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUssdCallbackFlag() {
        return ussdCallbackFlag;
    }

    /**
     * Sets the value of the ussdCallbackFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUssdCallbackFlag(Short value) {
        this.ussdCallbackFlag = value;
    }

    /**
     * Gets the value of the icfFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIcfFlag() {
        return icfFlag;
    }

    /**
     * Sets the value of the icfFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIcfFlag(Short value) {
        this.icfFlag = value;
    }

    /**
     * Gets the value of the icfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcfNumber() {
        return icfNumber;
    }

    /**
     * Sets the value of the icfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcfNumber(String value) {
        this.icfNumber = value;
    }

    /**
     * Gets the value of the icfNumberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcfNumberStatus() {
        return icfNumberStatus;
    }

    /**
     * Sets the value of the icfNumberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcfNumberStatus(String value) {
        this.icfNumberStatus = value;
    }

    /**
     * Gets the value of the sUserAuth property.
     * 
     * @return
     *     possible object is
     *     {@link SUserAuth }
     *     
     */
    public SUserAuth getSUserAuth() {
        return sUserAuth;
    }

    /**
     * Sets the value of the sUserAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserAuth }
     *     
     */
    public void setSUserAuth(SUserAuth value) {
        this.sUserAuth = value;
    }

    /**
     * Gets the value of the flhFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFlhFlag() {
        return flhFlag;
    }

    /**
     * Sets the value of the flhFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFlhFlag(Short value) {
        this.flhFlag = value;
    }

    /**
     * Gets the value of the posContinueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPosContinueFlag() {
        return posContinueFlag;
    }

    /**
     * Sets the value of the posContinueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPosContinueFlag(Short value) {
        this.posContinueFlag = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBrandId(Short value) {
        this.brandId = value;
    }

}
