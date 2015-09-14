
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doNewGroupReqResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doNewGroupReqResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="outer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prod_result_list" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doNewGroupReqResponse", propOrder = {
    "outerGroupId",
    "groupId",
    "prodResultList"
})
public class DoNewGroupReqResponse2
    extends BaseResponse
{

    @XmlElement(name = "outer_group_id")
    protected String outerGroupId;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "prod_result_list")
    protected SProductOrderResultList prodResultList;

    /**
     * Gets the value of the outerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterGroupId() {
        return outerGroupId;
    }

    /**
     * Sets the value of the outerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterGroupId(String value) {
        this.outerGroupId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the prodResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderResultList }
     *     
     */
    public SProductOrderResultList getProdResultList() {
        return prodResultList;
    }

    /**
     * Sets the value of the prodResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderResultList }
     *     
     */
    public void setProdResultList(SProductOrderResultList value) {
        this.prodResultList = value;
    }

}
