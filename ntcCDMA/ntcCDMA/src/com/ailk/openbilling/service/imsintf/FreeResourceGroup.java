
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for freeResourceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeResourceGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resource_group_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expired_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="freeResourceList_Item" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeResourceGroup", propOrder = {
    "resourceGroupId",
    "name",
    "amount",
    "remaining",
    "unit",
    "mode",
    "validDate",
    "expiredDate",
    "freeResourceListItem"
})
public class FreeResourceGroup {

    @XmlElement(name = "resource_group_id")
    protected Integer resourceGroupId;
    protected String name;
    protected Integer amount;
    protected Integer remaining;
    protected Integer unit;
    protected Integer mode;
    @XmlElement(name = "valid_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;
    @XmlElement(name = "expired_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiredDate;
    @XmlElement(name = "freeResourceList_Item")
    protected FreeResourceList freeResourceListItem;

    /**
     * Gets the value of the resourceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * Sets the value of the resourceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceGroupId(Integer value) {
        this.resourceGroupId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the remaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * Sets the value of the remaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemaining(Integer value) {
        this.remaining = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnit(Integer value) {
        this.unit = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMode(Integer value) {
        this.mode = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the expiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiredDate() {
        return expiredDate;
    }

    /**
     * Sets the value of the expiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiredDate(XMLGregorianCalendar value) {
        this.expiredDate = value;
    }

    /**
     * Gets the value of the freeResourceListItem property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceList }
     *     
     */
    public FreeResourceList getFreeResourceListItem() {
        return freeResourceListItem;
    }

    /**
     * Sets the value of the freeResourceListItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceList }
     *     
     */
    public void setFreeResourceListItem(FreeResourceList value) {
        this.freeResourceListItem = value;
    }

}
