
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cbsErrorMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cbsErrorMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orig_so_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="so_nbr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="finish_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cbsErrorMsg", propOrder = {
    "origSoNbr",
    "soNbr",
    "finishDate",
    "resultCode",
    "errorMsg",
    "hint"
})
public class CbsErrorMsg {

    @XmlElement(name = "orig_so_nbr")
    protected String origSoNbr;
    @XmlElement(name = "so_nbr")
    protected Long soNbr;
    @XmlElement(name = "finish_date")
    protected String finishDate;
    @XmlElement(name = "result_code")
    protected Long resultCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    protected String hint;

    /**
     * Gets the value of the origSoNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSoNbr() {
        return origSoNbr;
    }

    /**
     * Sets the value of the origSoNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSoNbr(String value) {
        this.origSoNbr = value;
    }

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
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishDate(String value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultCode(Long value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

}
