
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subCA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="outer_parent_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_parent_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outer_acct_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="title_role_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user_list" type="{http://imsintf.service.openbilling.ailk.com/}sAddSubscriberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subCA", propOrder = {
    "operType",
    "outerParentCustId",
    "parentCustId",
    "outerParentAcctId",
    "parentAcctId",
    "outerCustId",
    "custId",
    "outerAcctId",
    "acctId",
    "titleRoleId",
    "userList"
})
public class SubCA {

    @XmlElement(name = "oper_type")
    protected Short operType;
    @XmlElement(name = "outer_parent_cust_id")
    protected String outerParentCustId;
    @XmlElement(name = "parent_cust_id")
    protected Long parentCustId;
    @XmlElement(name = "outer_parent_acct_id")
    protected String outerParentAcctId;
    @XmlElement(name = "parent_acct_id")
    protected Long parentAcctId;
    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "outer_acct_id")
    protected String outerAcctId;
    @XmlElement(name = "acct_id")
    protected Long acctId;
    @XmlElement(name = "title_role_id")
    protected Integer titleRoleId;
    @XmlElement(name = "user_list")
    protected SAddSubscriberList userList;

    /**
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperType(Short value) {
        this.operType = value;
    }

    /**
     * Gets the value of the outerParentCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterParentCustId() {
        return outerParentCustId;
    }

    /**
     * Sets the value of the outerParentCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterParentCustId(String value) {
        this.outerParentCustId = value;
    }

    /**
     * Gets the value of the parentCustId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCustId() {
        return parentCustId;
    }

    /**
     * Sets the value of the parentCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCustId(Long value) {
        this.parentCustId = value;
    }

    /**
     * Gets the value of the outerParentAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterParentAcctId() {
        return outerParentAcctId;
    }

    /**
     * Sets the value of the outerParentAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterParentAcctId(String value) {
        this.outerParentAcctId = value;
    }

    /**
     * Gets the value of the parentAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentAcctId() {
        return parentAcctId;
    }

    /**
     * Sets the value of the parentAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentAcctId(Long value) {
        this.parentAcctId = value;
    }

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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustId(Long value) {
        this.custId = value;
    }

    /**
     * Gets the value of the outerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterAcctId() {
        return outerAcctId;
    }

    /**
     * Sets the value of the outerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterAcctId(String value) {
        this.outerAcctId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the titleRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitleRoleId() {
        return titleRoleId;
    }

    /**
     * Sets the value of the titleRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitleRoleId(Integer value) {
        this.titleRoleId = value;
    }

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link SAddSubscriberList }
     *     
     */
    public SAddSubscriberList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAddSubscriberList }
     *     
     */
    public void setUserList(SAddSubscriberList value) {
        this.userList = value;
    }

}
