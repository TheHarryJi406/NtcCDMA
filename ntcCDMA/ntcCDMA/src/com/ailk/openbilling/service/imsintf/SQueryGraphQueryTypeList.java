
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sQueryGraphQueryTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sQueryGraphQueryTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sQueryGraphQueryTypeList", propOrder = {
    "queryType"
})
public class SQueryGraphQueryTypeList {

    protected Short queryType;

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQueryType(Short value) {
        this.queryType = value;
    }

}
