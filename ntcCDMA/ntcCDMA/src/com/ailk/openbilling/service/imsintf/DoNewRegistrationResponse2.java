
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doNewRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doNewRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="acct_ids" type="{http://imsintf.service.openbilling.ailk.com/}longList" minOccurs="0"/>
 *         &lt;element name="user_result_list" type="{http://imsintf.service.openbilling.ailk.com/}sUserResultList" minOccurs="0"/>
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
@XmlType(name = "doNewRegistrationResponse", propOrder = {
    "outerCustId",
    "custId",
    "acctIds",
    "userResultList",
    "prodResultList"
})
public class DoNewRegistrationResponse2
    extends BaseResponse
{

    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected long custId;
    @XmlElement(name = "acct_ids")
    protected LongList acctIds;
    @XmlElement(name = "user_result_list")
    protected SUserResultList userResultList;
    @XmlElement(name = "prod_result_list")
    protected SProductOrderResultList prodResultList;

    /**
     * Gets the value of the outerCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterCustId() {
        return outerCustId;
    }

    /**
     * Sets the value of the outerCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterCustId(String value) {
        this.outerCustId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     */
    public long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     */
    public void setCustId(long value) {
        this.custId = value;
    }

    /**
     * Gets the value of the acctIds property.
     * 
     * @return
     *     possible object is
     *     {@link LongList }
     *     
     */
    public LongList getAcctIds() {
        return acctIds;
    }

    /**
     * Sets the value of the acctIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongList }
     *     
     */
    public void setAcctIds(LongList value) {
        this.acctIds = value;
    }

    /**
     * Gets the value of the userResultList property.
     * 
     * @return
     *     possible object is
     *     {@link SUserResultList }
     *     
     */
    public SUserResultList getUserResultList() {
        return userResultList;
    }

    /**
     * Sets the value of the userResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserResultList }
     *     
     */
    public void setUserResultList(SUserResultList value) {
        this.userResultList = value;
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
