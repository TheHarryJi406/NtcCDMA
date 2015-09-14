
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outer_cust_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cust_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cust_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="cust_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub_cust_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="family_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="prov_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="cust_rank" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="cust_segment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="reg_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reg_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="reg_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issue_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax_exempt_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vat_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="first_address" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="second_address" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="real_name_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="real_name_sts" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="cust_status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="list_ext_param" type="{http://imsintf.service.openbilling.ailk.com/}extendParamList" minOccurs="0"/>
 *         &lt;element name="customer_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reg_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reg_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sCustomer", propOrder = {
    "outerCustId",
    "custId",
    "custType",
    "custTitle",
    "subCustType",
    "familyName",
    "firstName",
    "middleName",
    "countryId",
    "provCode",
    "regionCode",
    "custRank",
    "custSegment",
    "birthday",
    "gender",
    "regName",
    "regType",
    "regNbr",
    "issueDate",
    "language",
    "createDate",
    "validDate",
    "taxExemptCode",
    "vatName",
    "groupId",
    "firstAddress",
    "secondAddress",
    "realNameDate",
    "realNameSts",
    "custStatus",
    "listExtParam",
    "customerName",
    "taxNo",
    "regNo",
    "regDate"
})
public class SCustomer {

    @XmlElement(name = "outer_cust_id")
    protected String outerCustId;
    @XmlElement(name = "cust_id")
    protected Long custId;
    @XmlElement(name = "cust_type")
    protected Short custType;
    @XmlElement(name = "cust_title")
    protected String custTitle;
    @XmlElement(name = "sub_cust_type")
    protected Short subCustType;
    @XmlElement(name = "family_name")
    protected String familyName;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "middle_name")
    protected String middleName;
    @XmlElement(name = "country_id")
    protected Short countryId;
    @XmlElement(name = "prov_code")
    protected Short provCode;
    @XmlElement(name = "region_code")
    protected Short regionCode;
    @XmlElement(name = "cust_rank")
    protected Short custRank;
    @XmlElement(name = "cust_segment")
    protected Short custSegment;
    protected String birthday;
    protected Short gender;
    @XmlElement(name = "reg_name")
    protected String regName;
    @XmlElement(name = "reg_type")
    protected Short regType;
    @XmlElement(name = "reg_nbr")
    protected String regNbr;
    @XmlElement(name = "issue_date")
    protected String issueDate;
    protected Short language;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "valid_date")
    protected String validDate;
    @XmlElement(name = "tax_exempt_code")
    protected String taxExemptCode;
    @XmlElement(name = "vat_name")
    protected String vatName;
    @XmlElement(name = "group_id")
    protected Long groupId;
    @XmlElement(name = "first_address")
    protected Short firstAddress;
    @XmlElement(name = "second_address")
    protected Short secondAddress;
    @XmlElement(name = "real_name_date")
    protected String realNameDate;
    @XmlElement(name = "real_name_sts")
    protected Short realNameSts;
    @XmlElement(name = "cust_status")
    protected Short custStatus;
    @XmlElement(name = "list_ext_param")
    protected ExtendParamList listExtParam;
    @XmlElement(name = "customer_name")
    protected String customerName;
    @XmlElement(name = "tax_no")
    protected String taxNo;
    @XmlElement(name = "reg_no")
    protected String regNo;
    @XmlElement(name = "reg_date")
    protected String regDate;

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
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustType(Short value) {
        this.custType = value;
    }

    /**
     * Gets the value of the custTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * Sets the value of the custTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTitle(String value) {
        this.custTitle = value;
    }

    /**
     * Gets the value of the subCustType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSubCustType() {
        return subCustType;
    }

    /**
     * Sets the value of the subCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSubCustType(Short value) {
        this.subCustType = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCountryId(Short value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the provCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProvCode() {
        return provCode;
    }

    /**
     * Sets the value of the provCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProvCode(Short value) {
        this.provCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegionCode(Short value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the custRank property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustRank() {
        return custRank;
    }

    /**
     * Sets the value of the custRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustRank(Short value) {
        this.custRank = value;
    }

    /**
     * Gets the value of the custSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustSegment() {
        return custSegment;
    }

    /**
     * Sets the value of the custSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustSegment(Short value) {
        this.custSegment = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGender(Short value) {
        this.gender = value;
    }

    /**
     * Gets the value of the regName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegName() {
        return regName;
    }

    /**
     * Sets the value of the regName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegName(String value) {
        this.regName = value;
    }

    /**
     * Gets the value of the regType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRegType(Short value) {
        this.regType = value;
    }

    /**
     * Gets the value of the regNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNbr() {
        return regNbr;
    }

    /**
     * Sets the value of the regNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNbr(String value) {
        this.regNbr = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanguage(Short value) {
        this.language = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the taxExemptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptCode() {
        return taxExemptCode;
    }

    /**
     * Sets the value of the taxExemptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptCode(String value) {
        this.taxExemptCode = value;
    }

    /**
     * Gets the value of the vatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatName() {
        return vatName;
    }

    /**
     * Sets the value of the vatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatName(String value) {
        this.vatName = value;
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
     * Gets the value of the firstAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFirstAddress() {
        return firstAddress;
    }

    /**
     * Sets the value of the firstAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFirstAddress(Short value) {
        this.firstAddress = value;
    }

    /**
     * Gets the value of the secondAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSecondAddress() {
        return secondAddress;
    }

    /**
     * Sets the value of the secondAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSecondAddress(Short value) {
        this.secondAddress = value;
    }

    /**
     * Gets the value of the realNameDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealNameDate() {
        return realNameDate;
    }

    /**
     * Sets the value of the realNameDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealNameDate(String value) {
        this.realNameDate = value;
    }

    /**
     * Gets the value of the realNameSts property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRealNameSts() {
        return realNameSts;
    }

    /**
     * Sets the value of the realNameSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRealNameSts(Short value) {
        this.realNameSts = value;
    }

    /**
     * Gets the value of the custStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustStatus() {
        return custStatus;
    }

    /**
     * Sets the value of the custStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustStatus(Short value) {
        this.custStatus = value;
    }

    /**
     * Gets the value of the listExtParam property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendParamList }
     *     
     */
    public ExtendParamList getListExtParam() {
        return listExtParam;
    }

    /**
     * Sets the value of the listExtParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendParamList }
     *     
     */
    public void setListExtParam(ExtendParamList value) {
        this.listExtParam = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

}
