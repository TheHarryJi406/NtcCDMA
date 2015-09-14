
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doMailGroupManageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doMailGroupManageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="accountMail" type="{http://imsintf.service.openbilling.ailk.com/}accountMail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doMailGroupManageResponse", propOrder = {
    "accountMail"
})
public class DoMailGroupManageResponse2
    extends BaseResponse
{

    protected List<AccountMail> accountMail;

    /**
     * Gets the value of the accountMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountMail }
     * 
     * 
     */
    public List<AccountMail> getAccountMail() {
        if (accountMail == null) {
            accountMail = new ArrayList<AccountMail>();
        }
        return this.accountMail;
    }

}
