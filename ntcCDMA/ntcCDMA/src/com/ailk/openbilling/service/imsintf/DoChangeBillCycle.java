
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for do_changeBillCycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="do_changeBillCycle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sOper" type="{http://imsintf.service.openbilling.ailk.com/}sOperInfo" minOccurs="0"/>
 *         &lt;element name="sChgBillCycleReq" type="{http://imsintf.service.openbilling.ailk.com/}sChgBillCycleReq" minOccurs="0"/>
 *         &lt;element name="old_bill_cycle" type="{http://imsintf.service.openbilling.ailk.com/}sBillCycle" minOccurs="0"/>
 *         &lt;element name="new_bill_cycle" type="{http://imsintf.service.openbilling.ailk.com/}sBillCycle" minOccurs="0"/>
 *         &lt;element name="oneTimeFee" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "do_changeBillCycle", propOrder = {
    "sOper",
    "sChgBillCycleReq",
    "oldBillCycle",
    "newBillCycle",
    "oneTimeFee"
})
public class DoChangeBillCycle {

    protected SOperInfo sOper;
    protected SChgBillCycleReq sChgBillCycleReq;
    @XmlElement(name = "old_bill_cycle")
    protected SBillCycle oldBillCycle;
    @XmlElement(name = "new_bill_cycle")
    protected SBillCycle newBillCycle;
    protected OneTimeFee oneTimeFee;

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
     * Gets the value of the sChgBillCycleReq property.
     * 
     * @return
     *     possible object is
     *     {@link SChgBillCycleReq }
     *     
     */
    public SChgBillCycleReq getSChgBillCycleReq() {
        return sChgBillCycleReq;
    }

    /**
     * Sets the value of the sChgBillCycleReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SChgBillCycleReq }
     *     
     */
    public void setSChgBillCycleReq(SChgBillCycleReq value) {
        this.sChgBillCycleReq = value;
    }

    /**
     * Gets the value of the oldBillCycle property.
     * 
     * @return
     *     possible object is
     *     {@link SBillCycle }
     *     
     */
    public SBillCycle getOldBillCycle() {
        return oldBillCycle;
    }

    /**
     * Sets the value of the oldBillCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBillCycle }
     *     
     */
    public void setOldBillCycle(SBillCycle value) {
        this.oldBillCycle = value;
    }

    /**
     * Gets the value of the newBillCycle property.
     * 
     * @return
     *     possible object is
     *     {@link SBillCycle }
     *     
     */
    public SBillCycle getNewBillCycle() {
        return newBillCycle;
    }

    /**
     * Sets the value of the newBillCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBillCycle }
     *     
     */
    public void setNewBillCycle(SBillCycle value) {
        this.newBillCycle = value;
    }

    /**
     * Gets the value of the oneTimeFee property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFee }
     *     
     */
    public OneTimeFee getOneTimeFee() {
        return oneTimeFee;
    }

    /**
     * Sets the value of the oneTimeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFee }
     *     
     */
    public void setOneTimeFee(OneTimeFee value) {
        this.oneTimeFee = value;
    }

}
