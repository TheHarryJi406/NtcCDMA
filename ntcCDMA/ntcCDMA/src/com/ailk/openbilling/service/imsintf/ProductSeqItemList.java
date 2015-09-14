
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productSeqItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productSeqItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productSeqItem" type="{http://imsintf.service.openbilling.ailk.com/}productSeqItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productSeqItemList", propOrder = {
    "productSeqItem"
})
public class ProductSeqItemList {

    protected List<ProductSeqItem> productSeqItem;

    /**
     * Gets the value of the productSeqItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSeqItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSeqItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSeqItem }
     * 
     * 
     */
    public List<ProductSeqItem> getProductSeqItem() {
        if (productSeqItem == null) {
            productSeqItem = new ArrayList<ProductSeqItem>();
        }
        return this.productSeqItem;
    }

}
