
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sUserAuth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sUserAuth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hPLMN" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nationalRoaming" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="internationalRoaming" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="roamingAuthority" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="iRSMSAuthority" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="interIntraAuthority" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="interIntraflag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="iRPromptflag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fraudState" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fraudTimes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sUserAuth", propOrder = {
    "userId",
    "phoneId",
    "hplmn",
    "nationalRoaming",
    "internationalRoaming",
    "roamingAuthority",
    "irsmsAuthority",
    "interIntraAuthority",
    "interIntraflag",
    "irPromptflag",
    "fraudState",
    "fraudTimes"
})
public class SUserAuth {

    @XmlElement(name = "user_id")
    protected Long userId;
    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "hPLMN")
    protected Short hplmn;
    protected Short nationalRoaming;
    protected Short internationalRoaming;
    protected Short roamingAuthority;
    @XmlElement(name = "iRSMSAuthority")
    protected Short irsmsAuthority;
    protected Short interIntraAuthority;
    protected Short interIntraflag;
    @XmlElement(name = "iRPromptflag")
    protected Short irPromptflag;
    protected Short fraudState;
    protected Short fraudTimes;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

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
     * Gets the value of the hplmn property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHPLMN() {
        return hplmn;
    }

    /**
     * Sets the value of the hplmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHPLMN(Short value) {
        this.hplmn = value;
    }

    /**
     * Gets the value of the nationalRoaming property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNationalRoaming() {
        return nationalRoaming;
    }

    /**
     * Sets the value of the nationalRoaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNationalRoaming(Short value) {
        this.nationalRoaming = value;
    }

    /**
     * Gets the value of the internationalRoaming property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInternationalRoaming() {
        return internationalRoaming;
    }

    /**
     * Sets the value of the internationalRoaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInternationalRoaming(Short value) {
        this.internationalRoaming = value;
    }

    /**
     * Gets the value of the roamingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRoamingAuthority() {
        return roamingAuthority;
    }

    /**
     * Sets the value of the roamingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRoamingAuthority(Short value) {
        this.roamingAuthority = value;
    }

    /**
     * Gets the value of the irsmsAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIRSMSAuthority() {
        return irsmsAuthority;
    }

    /**
     * Sets the value of the irsmsAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIRSMSAuthority(Short value) {
        this.irsmsAuthority = value;
    }

    /**
     * Gets the value of the interIntraAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInterIntraAuthority() {
        return interIntraAuthority;
    }

    /**
     * Sets the value of the interIntraAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInterIntraAuthority(Short value) {
        this.interIntraAuthority = value;
    }

    /**
     * Gets the value of the interIntraflag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInterIntraflag() {
        return interIntraflag;
    }

    /**
     * Sets the value of the interIntraflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInterIntraflag(Short value) {
        this.interIntraflag = value;
    }

    /**
     * Gets the value of the irPromptflag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIRPromptflag() {
        return irPromptflag;
    }

    /**
     * Sets the value of the irPromptflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIRPromptflag(Short value) {
        this.irPromptflag = value;
    }

    /**
     * Gets the value of the fraudState property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFraudState() {
        return fraudState;
    }

    /**
     * Sets the value of the fraudState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFraudState(Short value) {
        this.fraudState = value;
    }

    /**
     * Gets the value of the fraudTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFraudTimes() {
        return fraudTimes;
    }

    /**
     * Sets the value of the fraudTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFraudTimes(Short value) {
        this.fraudTimes = value;
    }

}
