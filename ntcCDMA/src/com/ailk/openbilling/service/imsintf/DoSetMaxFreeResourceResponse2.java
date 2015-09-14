
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doSetMaxFreeResourceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doSetMaxFreeResourceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="phone_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_sequence_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resource_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resource_value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="effective_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doSetMaxFreeResourceResponse", propOrder = {
    "phoneId",
    "productSequenceId",
    "resourceId",
    "resourceValue",
    "effectiveDate"
})
public class DoSetMaxFreeResourceResponse2
    extends BaseResponse
{

    @XmlElement(name = "phone_id")
    protected String phoneId;
    @XmlElement(name = "product_sequence_id")
    protected Long productSequenceId;
    @XmlElement(name = "resource_id")
    protected Integer resourceId;
    @XmlElement(name = "resource_value")
    protected Long resourceValue;
    @XmlElement(name = "effective_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;

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
     * Gets the value of the productSequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductSequenceId() {
        return productSequenceId;
    }

    /**
     * Sets the value of the productSequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductSequenceId(Long value) {
        this.productSequenceId = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceId(Integer value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceValue() {
        return resourceValue;
    }

    /**
     * Sets the value of the resourceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceValue(Long value) {
        this.resourceValue = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

}
