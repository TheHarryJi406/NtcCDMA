
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryCDRResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryCDRResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="callDetailRecordList" type="{http://imsintf.service.openbilling.ailk.com/}callDetailRecordList" minOccurs="0"/>
 *         &lt;element name="sContact" type="{http://imsintf.service.openbilling.ailk.com/}sContact" minOccurs="0"/>
 *         &lt;element name="file_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryCDRResponse", propOrder = {
    "callDetailRecordList",
    "sContact",
    "filePath"
})
public class DoQueryCDRResponse2
    extends BaseResponse
{

    protected CallDetailRecordList callDetailRecordList;
    protected SContact sContact;
    @XmlElement(name = "file_path")
    protected String filePath;

    /**
     * Gets the value of the callDetailRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link CallDetailRecordList }
     *     
     */
    public CallDetailRecordList getCallDetailRecordList() {
        return callDetailRecordList;
    }

    /**
     * Sets the value of the callDetailRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallDetailRecordList }
     *     
     */
    public void setCallDetailRecordList(CallDetailRecordList value) {
        this.callDetailRecordList = value;
    }

    /**
     * Gets the value of the sContact property.
     * 
     * @return
     *     possible object is
     *     {@link SContact }
     *     
     */
    public SContact getSContact() {
        return sContact;
    }

    /**
     * Sets the value of the sContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SContact }
     *     
     */
    public void setSContact(SContact value) {
        this.sContact = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

}
