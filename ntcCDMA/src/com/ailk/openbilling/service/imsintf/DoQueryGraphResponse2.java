
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryGraphResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryGraphResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="highestTransactionGroupList" type="{http://imsintf.service.openbilling.ailk.com/}highestTransactionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longestCallingSecondsGroupList" type="{http://imsintf.service.openbilling.ailk.com/}longestCallingSecondsGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryGraphResponse", propOrder = {
    "highestTransactionGroupList",
    "longestCallingSecondsGroupList"
})
public class DoQueryGraphResponse2
    extends BaseResponse
{

    protected List<HighestTransactionGroup> highestTransactionGroupList;
    protected List<LongestCallingSecondsGroup> longestCallingSecondsGroupList;

    /**
     * Gets the value of the highestTransactionGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the highestTransactionGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHighestTransactionGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HighestTransactionGroup }
     * 
     * 
     */
    public List<HighestTransactionGroup> getHighestTransactionGroupList() {
        if (highestTransactionGroupList == null) {
            highestTransactionGroupList = new ArrayList<HighestTransactionGroup>();
        }
        return this.highestTransactionGroupList;
    }

    /**
     * Gets the value of the longestCallingSecondsGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longestCallingSecondsGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongestCallingSecondsGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongestCallingSecondsGroup }
     * 
     * 
     */
    public List<LongestCallingSecondsGroup> getLongestCallingSecondsGroupList() {
        if (longestCallingSecondsGroupList == null) {
            longestCallingSecondsGroupList = new ArrayList<LongestCallingSecondsGroup>();
        }
        return this.longestCallingSecondsGroupList;
    }

}
