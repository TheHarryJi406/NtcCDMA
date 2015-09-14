
package com.ailk.openbilling.service.imsintf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doQueryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doQueryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imsintf.service.openbilling.ailk.com/}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://imsintf.service.openbilling.ailk.com/}sUser" minOccurs="0"/>
 *         &lt;element name="userAuth" type="{http://imsintf.service.openbilling.ailk.com/}sUserAuth" minOccurs="0"/>
 *         &lt;element name="account" type="{http://imsintf.service.openbilling.ailk.com/}sAccount" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://imsintf.service.openbilling.ailk.com/}sCustomer" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://imsintf.service.openbilling.ailk.com/}sBalanceList" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://imsintf.service.openbilling.ailk.com/}budgetList" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://imsintf.service.openbilling.ailk.com/}creditLimitList" minOccurs="0"/>
 *         &lt;element name="freeResourceGroupList" type="{http://imsintf.service.openbilling.ailk.com/}freeResourceGroupList" minOccurs="0"/>
 *         &lt;element name="accumulation" type="{http://imsintf.service.openbilling.ailk.com/}accumulateList" minOccurs="0"/>
 *         &lt;element name="billInfo" type="{http://imsintf.service.openbilling.ailk.com/}billinfoList" minOccurs="0"/>
 *         &lt;element name="hybridRule" type="{http://imsintf.service.openbilling.ailk.com/}sBusiServiceList" minOccurs="0"/>
 *         &lt;element name="oneTimeCharge" type="{http://imsintf.service.openbilling.ailk.com/}oneTimeFeeList" minOccurs="0"/>
 *         &lt;element name="point" type="{http://imsintf.service.openbilling.ailk.com/}spoints" minOccurs="0"/>
 *         &lt;element name="prodOrderList" type="{http://imsintf.service.openbilling.ailk.com/}sProductOrderList" minOccurs="0"/>
 *         &lt;element name="busiServiceList" type="{http://imsintf.service.openbilling.ailk.com/}sBusiServiceList" minOccurs="0"/>
 *         &lt;element name="realtimeCharge" type="{http://imsintf.service.openbilling.ailk.com/}realTimeCallChargeList" minOccurs="0"/>
 *         &lt;element name="hybridBusiServiceList" type="{http://imsintf.service.openbilling.ailk.com/}hybridBusiServiceList" minOccurs="0"/>
 *         &lt;element name="sNegativeBalanceList" type="{http://imsintf.service.openbilling.ailk.com/}sNegativeBalanceList" minOccurs="0"/>
 *         &lt;element name="capMaxControlList" type="{http://imsintf.service.openbilling.ailk.com/}capMaxControlList" minOccurs="0"/>
 *         &lt;element name="queryFreeTimes" type="{http://imsintf.service.openbilling.ailk.com/}sQueryFreeTimes" minOccurs="0"/>
 *         &lt;element name="billUsage" type="{http://imsintf.service.openbilling.ailk.com/}billUsage" minOccurs="0"/>
 *         &lt;element name="actualUsageList" type="{http://imsintf.service.openbilling.ailk.com/}actualUsageList" minOccurs="0"/>
 *         &lt;element name="sContactList" type="{http://imsintf.service.openbilling.ailk.com/}sContact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doQueryResponse", propOrder = {
    "user",
    "userAuth",
    "account",
    "customer",
    "balance",
    "budget",
    "credit",
    "freeResourceGroupList",
    "accumulation",
    "billInfo",
    "hybridRule",
    "oneTimeCharge",
    "point",
    "prodOrderList",
    "busiServiceList",
    "realtimeCharge",
    "hybridBusiServiceList",
    "sNegativeBalanceList",
    "capMaxControlList",
    "queryFreeTimes",
    "billUsage",
    "actualUsageList",
    "sContactList"
})
public class DoQueryResponse2
    extends BaseResponse
{

    protected SUser user;
    protected SUserAuth userAuth;
    protected SAccount account;
    protected SCustomer customer;
    protected SBalanceList balance;
    protected BudgetList budget;
    protected CreditLimitList credit;
    protected FreeResourceGroupList freeResourceGroupList;
    protected AccumulateList accumulation;
    protected BillinfoList billInfo;
    protected SBusiServiceList hybridRule;
    protected OneTimeFeeList oneTimeCharge;
    protected Spoints point;
    protected SProductOrderList prodOrderList;
    protected SBusiServiceList busiServiceList;
    protected RealTimeCallChargeList realtimeCharge;
    protected HybridBusiServiceList hybridBusiServiceList;
    protected SNegativeBalanceList sNegativeBalanceList;
    protected CapMaxControlList capMaxControlList;
    protected SQueryFreeTimes queryFreeTimes;
    protected BillUsage billUsage;
    protected ActualUsageList actualUsageList;
    protected List<SContact> sContactList;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link SUser }
     *     
     */
    public SUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUser }
     *     
     */
    public void setUser(SUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the userAuth property.
     * 
     * @return
     *     possible object is
     *     {@link SUserAuth }
     *     
     */
    public SUserAuth getUserAuth() {
        return userAuth;
    }

    /**
     * Sets the value of the userAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUserAuth }
     *     
     */
    public void setUserAuth(SUserAuth value) {
        this.userAuth = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link SAccount }
     *     
     */
    public SAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAccount }
     *     
     */
    public void setAccount(SAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link SCustomer }
     *     
     */
    public SCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCustomer }
     *     
     */
    public void setCustomer(SCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link SBalanceList }
     *     
     */
    public SBalanceList getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBalanceList }
     *     
     */
    public void setBalance(SBalanceList value) {
        this.balance = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetList }
     *     
     */
    public BudgetList getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetList }
     *     
     */
    public void setBudget(BudgetList value) {
        this.budget = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitList }
     *     
     */
    public CreditLimitList getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitList }
     *     
     */
    public void setCredit(CreditLimitList value) {
        this.credit = value;
    }

    /**
     * Gets the value of the freeResourceGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public FreeResourceGroupList getFreeResourceGroupList() {
        return freeResourceGroupList;
    }

    /**
     * Sets the value of the freeResourceGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeResourceGroupList }
     *     
     */
    public void setFreeResourceGroupList(FreeResourceGroupList value) {
        this.freeResourceGroupList = value;
    }

    /**
     * Gets the value of the accumulation property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulateList }
     *     
     */
    public AccumulateList getAccumulation() {
        return accumulation;
    }

    /**
     * Sets the value of the accumulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulateList }
     *     
     */
    public void setAccumulation(AccumulateList value) {
        this.accumulation = value;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillinfoList }
     *     
     */
    public BillinfoList getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillinfoList }
     *     
     */
    public void setBillInfo(BillinfoList value) {
        this.billInfo = value;
    }

    /**
     * Gets the value of the hybridRule property.
     * 
     * @return
     *     possible object is
     *     {@link SBusiServiceList }
     *     
     */
    public SBusiServiceList getHybridRule() {
        return hybridRule;
    }

    /**
     * Sets the value of the hybridRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBusiServiceList }
     *     
     */
    public void setHybridRule(SBusiServiceList value) {
        this.hybridRule = value;
    }

    /**
     * Gets the value of the oneTimeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeFeeList }
     *     
     */
    public OneTimeFeeList getOneTimeCharge() {
        return oneTimeCharge;
    }

    /**
     * Sets the value of the oneTimeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeFeeList }
     *     
     */
    public void setOneTimeCharge(OneTimeFeeList value) {
        this.oneTimeCharge = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Spoints }
     *     
     */
    public Spoints getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spoints }
     *     
     */
    public void setPoint(Spoints value) {
        this.point = value;
    }

    /**
     * Gets the value of the prodOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link SProductOrderList }
     *     
     */
    public SProductOrderList getProdOrderList() {
        return prodOrderList;
    }

    /**
     * Sets the value of the prodOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SProductOrderList }
     *     
     */
    public void setProdOrderList(SProductOrderList value) {
        this.prodOrderList = value;
    }

    /**
     * Gets the value of the busiServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link SBusiServiceList }
     *     
     */
    public SBusiServiceList getBusiServiceList() {
        return busiServiceList;
    }

    /**
     * Sets the value of the busiServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBusiServiceList }
     *     
     */
    public void setBusiServiceList(SBusiServiceList value) {
        this.busiServiceList = value;
    }

    /**
     * Gets the value of the realtimeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeCallChargeList }
     *     
     */
    public RealTimeCallChargeList getRealtimeCharge() {
        return realtimeCharge;
    }

    /**
     * Sets the value of the realtimeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeCallChargeList }
     *     
     */
    public void setRealtimeCharge(RealTimeCallChargeList value) {
        this.realtimeCharge = value;
    }

    /**
     * Gets the value of the hybridBusiServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link HybridBusiServiceList }
     *     
     */
    public HybridBusiServiceList getHybridBusiServiceList() {
        return hybridBusiServiceList;
    }

    /**
     * Sets the value of the hybridBusiServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HybridBusiServiceList }
     *     
     */
    public void setHybridBusiServiceList(HybridBusiServiceList value) {
        this.hybridBusiServiceList = value;
    }

    /**
     * Gets the value of the sNegativeBalanceList property.
     * 
     * @return
     *     possible object is
     *     {@link SNegativeBalanceList }
     *     
     */
    public SNegativeBalanceList getSNegativeBalanceList() {
        return sNegativeBalanceList;
    }

    /**
     * Sets the value of the sNegativeBalanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNegativeBalanceList }
     *     
     */
    public void setSNegativeBalanceList(SNegativeBalanceList value) {
        this.sNegativeBalanceList = value;
    }

    /**
     * Gets the value of the capMaxControlList property.
     * 
     * @return
     *     possible object is
     *     {@link CapMaxControlList }
     *     
     */
    public CapMaxControlList getCapMaxControlList() {
        return capMaxControlList;
    }

    /**
     * Sets the value of the capMaxControlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapMaxControlList }
     *     
     */
    public void setCapMaxControlList(CapMaxControlList value) {
        this.capMaxControlList = value;
    }

    /**
     * Gets the value of the queryFreeTimes property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryFreeTimes }
     *     
     */
    public SQueryFreeTimes getQueryFreeTimes() {
        return queryFreeTimes;
    }

    /**
     * Sets the value of the queryFreeTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryFreeTimes }
     *     
     */
    public void setQueryFreeTimes(SQueryFreeTimes value) {
        this.queryFreeTimes = value;
    }

    /**
     * Gets the value of the billUsage property.
     * 
     * @return
     *     possible object is
     *     {@link BillUsage }
     *     
     */
    public BillUsage getBillUsage() {
        return billUsage;
    }

    /**
     * Sets the value of the billUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillUsage }
     *     
     */
    public void setBillUsage(BillUsage value) {
        this.billUsage = value;
    }

    /**
     * Gets the value of the actualUsageList property.
     * 
     * @return
     *     possible object is
     *     {@link ActualUsageList }
     *     
     */
    public ActualUsageList getActualUsageList() {
        return actualUsageList;
    }

    /**
     * Sets the value of the actualUsageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualUsageList }
     *     
     */
    public void setActualUsageList(ActualUsageList value) {
        this.actualUsageList = value;
    }

    /**
     * Gets the value of the sContactList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sContactList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSContactList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SContact }
     * 
     * 
     */
    public List<SContact> getSContactList() {
        if (sContactList == null) {
            sContactList = new ArrayList<SContact>();
        }
        return this.sContactList;
    }

}
