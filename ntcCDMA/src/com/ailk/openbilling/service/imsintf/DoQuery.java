
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_query">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="queryTypeList" type="{http://imsintf.service.openbilling.ailk.com/}queryTypeList" minOccurs="0"/>
 *         &lt;element name="queryParam" type="{http://imsintf.service.openbilling.ailk.com/}sQueryParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_query", propOrder = {
    "sOper",
    "queryTypeList",
    "queryParam"
})
public class DoQuery {

    protected SOperInfo sOper;
    protected QueryTypeList queryTypeList;
    protected SQueryParam queryParam;

    /**
     * Gets the value of the sOper property.
     * 
     * @return
     *     possible object is
     *     {@link SOperInfo }
     *     
     */
    public SOperInfo getSOper() {
        return sOper;
    }

    /**
     * Sets the value of the sOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOperInfo }
     *     
     */
    public void setSOper(SOperInfo value) {
        this.sOper = value;
    }

    /**
     * Gets the value of the queryTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTypeList }
     *     
     */
    public QueryTypeList getQueryTypeList() {
        return queryTypeList;
    }

    /**
     * Sets the value of the queryTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTypeList }
     *     
     */
    public void setQueryTypeList(QueryTypeList value) {
        this.queryTypeList = value;
    }

    /**
     * Gets the value of the queryParam property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryParam }
     *     
     */
    public SQueryParam getQueryParam() {
        return queryParam;
    }

    /**
     * Sets the value of the queryParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryParam }
     *     
     */
    public void setQueryParam(SQueryParam value) {
        this.queryParam = value;
    }

}
