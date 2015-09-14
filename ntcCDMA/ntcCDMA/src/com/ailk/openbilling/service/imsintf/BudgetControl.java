
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for budgetControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="budgetControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busi_service_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payment_mode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="budget_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remain_budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="temp_budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="thresholdList" type="{http://imsintf.service.openbilling.ailk.com/}thresholdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "budgetControl", propOrder = {
    "busiServiceId",
    "paymentMode",
    "budgetType",
    "budget",
    "remainBudget",
    "tempBudget",
    "action",
    "measureId",
    "thresholdList"
})
public class BudgetControl {

    @XmlElement(name = "busi_service_id")
    protected Long busiServiceId;
    @XmlElement(name = "payment_mode")
    protected Short paymentMode;
    @XmlElement(name = "budget_type")
    protected Short budgetType;
    protected Double budget;
    @XmlElement(name = "remain_budget")
    protected Double remainBudget;
    @XmlElement(name = "temp_budget")
    protected Double tempBudget;
    protected Short action;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    protected ThresholdList thresholdList;

    /**
     * Gets the value of the busiServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusiServiceId() {
        return busiServiceId;
    }

    /**
     * Sets the value of the busiServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusiServiceId(Long value) {
        this.busiServiceId = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentMode(Short value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the budgetType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBudgetType(Short value) {
        this.budgetType = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudget(Double value) {
        this.budget = value;
    }

    /**
     * Gets the value of the remainBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainBudget() {
        return remainBudget;
    }

    /**
     * Sets the value of the remainBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainBudget(Double value) {
        this.remainBudget = value;
    }

    /**
     * Gets the value of the tempBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTempBudget() {
        return tempBudget;
    }

    /**
     * Sets the value of the tempBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTempBudget(Double value) {
        this.tempBudget = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAction(Short value) {
        this.action = value;
    }

    /**
     * Gets the value of the measureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Sets the value of the measureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

    /**
     * Gets the value of the thresholdList property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdList }
     *     
     */
    public ThresholdList getThresholdList() {
        return thresholdList;
    }

    /**
     * Sets the value of the thresholdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdList }
     *     
     */
    public void setThresholdList(ThresholdList value) {
        this.thresholdList = value;
    }

}
