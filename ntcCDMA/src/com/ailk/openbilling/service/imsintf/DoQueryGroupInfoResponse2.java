
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryGroupInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryGroupInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="number_of_sub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="number_of_cug" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productOrderList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *         &lt;element name="groupInfoList" type="{http://imsintf.service.openbilling.ailk.com/}sGroupList" minOccurs="0"/>
 *         &lt;element name="subGroupList" type="{http://imsintf.service.openbilling.ailk.com/}subGroupList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryGroupInfoResponse", propOrder = {
    "numberOfSub",
    "numberOfCug",
    "productOrderList",
    "groupInfoList",
    "subGroupList"
})
public class DoQueryGroupInfoResponse2
    extends BaseResponse
{

    @XmlElement(name = "number_of_sub")
    protected Integer numberOfSub;
    @XmlElement(name = "number_of_cug")
    protected Integer numberOfCug;
    protected SProductOrderList productOrderList;
    protected SGroupList groupInfoList;
    protected SubGroupList subGroupList;

    /**
     * Gets the value of the numberOfSub property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSub() {
        return numberOfSub;
    }

    /**
     * Sets the value of the numberOfSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSub(Integer value) {
        this.numberOfSub = value;
    }

    /**
     * Gets the value of the numberOfCug property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCug() {
        return numberOfCug;
    }

    /**
     * Sets the value of the numberOfCug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCug(Integer value) {
        this.numberOfCug = value;
    }

    /**
     * Gets the value of the productOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProductOrderList() {
        return productOrderList;
    }

    /**
     * Sets the value of the productOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProductOrderList(SProductOrderList value) {
        this.productOrderList = value;
    }

    /**
     * Gets the value of the groupInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link SGroupList }
     *     
     */
    public SGroupList getGroupInfoList() {
        return groupInfoList;
    }

    /**
     * Sets the value of the groupInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGroupList }
     *     
     */
    public void setGroupInfoList(SGroupList value) {
        this.groupInfoList = value;
    }

    /**
     * Gets the value of the subGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupList }
     *     
     */
    public SubGroupList getSubGroupList() {
        return subGroupList;
    }

    /**
     * Sets the value of the subGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupList }
     *     
     */
    public void setSubGroupList(SubGroupList value) {
        this.subGroupList = value;
    }

}
