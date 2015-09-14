
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sManagerIRPartyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sManagerIRPartyReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="operator_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="operator_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mcc_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnc_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="english_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoicingCoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tap_version" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="tap_release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="network_statement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceRequestOper" type="{http://imsintf.service.openbilling.ailk.com/}serviceRequestOper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sManagerIRPartyReq", propOrder = {
    "operType",
    "operatorCode",
    "operatorType",
    "operatorId",
    "mccCode",
    "mncCode",
    "englishName",
    "invoicingCoID",
    "countryCode",
    "countryName",
    "tapVersion",
    "tapRelease",
    "timeZone",
    "currencyCode",
    "networkStatement",
    "serviceRequestOper"
})
public class SManagerIRPartyReq {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "operator_code")
    protected String operatorCode;
    @XmlElement(name = "operator_type")
    protected Short operatorType;
    @XmlElement(name = "operator_id")
    protected Integer operatorId;
    @XmlElement(name = "mcc_code")
    protected String mccCode;
    @XmlElement(name = "mnc_code")
    protected String mncCode;
    @XmlElement(name = "english_name")
    protected String englishName;
    protected String invoicingCoID;
    @XmlElement(name = "country_code")
    protected Short countryCode;
    @XmlElement(name = "country_name")
    protected String countryName;
    @XmlElement(name = "tap_version")
    protected Short tapVersion;
    @XmlElement(name = "tap_release")
    protected String tapRelease;
    @XmlElement(name = "time_zone")
    protected String timeZone;
    @XmlElement(name = "currency_code")
    protected Integer currencyCode;
    @XmlElement(name = "network_statement")
    protected String networkStatement;
    protected ServiceRequestOper serviceRequestOper;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperType(Short value) {
        this.operType = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the operatorType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperatorType() {
        return operatorType;
    }

    /**
     * Sets the value of the operatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperatorType(Short value) {
        this.operatorType = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperatorId(Integer value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the mccCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMccCode() {
        return mccCode;
    }

    /**
     * Sets the value of the mccCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMccCode(String value) {
        this.mccCode = value;
    }

    /**
     * Gets the value of the mncCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMncCode() {
        return mncCode;
    }

    /**
     * Sets the value of the mncCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMncCode(String value) {
        this.mncCode = value;
    }

    /**
     * Gets the value of the englishName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * Sets the value of the englishName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishName(String value) {
        this.englishName = value;
    }

    /**
     * Gets the value of the invoicingCoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingCoID() {
        return invoicingCoID;
    }

    /**
     * Sets the value of the invoicingCoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingCoID(String value) {
        this.invoicingCoID = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCountryCode(Short value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the tapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTapVersion() {
        return tapVersion;
    }

    /**
     * Sets the value of the tapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTapVersion(Short value) {
        this.tapVersion = value;
    }

    /**
     * Gets the value of the tapRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTapRelease() {
        return tapRelease;
    }

    /**
     * Sets the value of the tapRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTapRelease(String value) {
        this.tapRelease = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyCode(Integer value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the networkStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkStatement() {
        return networkStatement;
    }

    /**
     * Sets the value of the networkStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkStatement(String value) {
        this.networkStatement = value;
    }

    /**
     * Gets the value of the serviceRequestOper property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestOper }
     *     
     */
    public ServiceRequestOper getServiceRequestOper() {
        return serviceRequestOper;
    }

    /**
     * Sets the value of the serviceRequestOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestOper }
     *     
     */
    public void setServiceRequestOper(ServiceRequestOper value) {
        this.serviceRequestOper = value;
    }

}
