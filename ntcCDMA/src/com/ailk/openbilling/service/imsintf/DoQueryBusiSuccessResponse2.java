
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryBusiSuccessResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryBusiSuccessResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="sts" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="done_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="so_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryBusiSuccessResponse", propOrder = {
    "sts",
    "doneCode",
    "soDate"
})
public class DoQueryBusiSuccessResponse2
    extends BaseResponse
{

    protected Short sts;
    @XmlElement(name = "done_code")
    protected String doneCode;
    @XmlElement(name = "so_date")
    protected String soDate;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSts(Short value) {
        this.sts = value;
    }

    /**
     * Gets the value of the doneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoneCode() {
        return doneCode;
    }

    /**
     * Sets the value of the doneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoneCode(String value) {
        this.doneCode = value;
    }

    /**
     * Gets the value of the soDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoDate() {
        return soDate;
    }

    /**
     * Sets the value of the soDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoDate(String value) {
        this.soDate = value;
    }

}
