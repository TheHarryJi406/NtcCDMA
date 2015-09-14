
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryCDRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryCDRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query_cdr_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryCDRType", propOrder = {
    "queryCdrType"
})
public class QueryCDRType {

    @XmlElement(name = "query_cdr_type")
    protected Short queryCdrType;

    /**
     * Gets the value of the queryCdrType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQueryCdrType() {
        return queryCdrType;
    }

    /**
     * Sets the value of the queryCdrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQueryCdrType(Short value) {
        this.queryCdrType = value;
    }

}
