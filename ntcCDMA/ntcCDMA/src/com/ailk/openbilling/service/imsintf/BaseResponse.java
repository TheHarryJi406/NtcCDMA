
package com.ailk.openbilling.service.imsintf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMsg" type="{http://imsintf.service.openbilling.ailk.com/}cbsErrorMsg" minOccurs="0"/>
 *         &lt;element name="sPage" type="{http://imsintf.service.openbilling.ailk.com/}sPage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseResponse", propOrder = {
    "errorMsg",
    "sPage"
})
@XmlSeeAlso({
    DoQueryGroupMembersResponse2 .class,
    DoTopUpByCashResponse2 .class,
    DoModifyAccountStateResponse2 .class,
    DoSMngDepositResponse.class,
    DoMgntGroupMemberResponse2 .class,
    DoQueryMemberInfoResponse2 .class,
    DoChangeOwnerReqResponse2 .class,
    DoAdvancePaymentResponse2 .class,
    DoQueryGraphResponse2 .class,
    DoDeactivateGroupMemResponse2 .class,
    DoOperateMultiSimResponse.class,
    DoModifyProductStateResponse2 .class,
    DoQueryFNResponse2 .class,
    DoAdjustBillResponse2 .class,
    DoOneTimeFeeResponse2 .class,
    DoQueryGroupInfoResponse2 .class,
    DoChangeGroupInfoResponse2 .class,
    DoSetNegativeBalanceResponse2 .class,
    DoQueryMaxFreeResourceResponse2 .class,
    DoSplitResponse2 .class,
    DoChangeUserLanguageResponse2 .class,
    DoAutoTopUpResponse2 .class,
    DoQueryLostBalanceResponce.class,
    DoBankConfigurationResponse2 .class,
    DoQueryServiceStateResponse2 .class,
    ChgGroupProductResp.class,
    DoMgntScpProfileResponse2 .class,
    DoQueryScpProfileResponse2 .class,
    DoQueryProdStateResponse2 .class,
    DoQueryWorkLogResponse2 .class,
    DoTransferResponse2 .class,
    DoManageUserFriendsNumsResponse2 .class,
    DoChangePaymentModeResponse2 .class,
    DoDeductPointsResponse2 .class,
    DoQueryInvoiceInfoResponse2 .class,
    DoNewRegistrationResponse2 .class,
    DoDeactivateGroupResponse2 .class,
    DoManageIRPartyResponse2 .class,
    DoCancelPaymentResponse2 .class,
    DoModifyAccountBasicInfoResponse2 .class,
    DoQueryBusiSuccessResponse2 .class,
    DoRenewRegistrationResponse2 .class,
    DoCancelTopUpResponse2 .class,
    DoAuthParentResponse2 .class,
    DoSMngQueryDepositResponse.class,
    DoCancelOneTimeFeeResponse2 .class,
    DoModifyCustBasicInfoResponse2 .class,
    DoMailGroupManageResponse2 .class,
    DoQuerySharingPromotionResponse2 .class,
    DoEtopupResponse2 .class,
    DoQueryReguideInfoResp.class,
    DoMgntCallScreenResponse2 .class,
    DoCaRelationUserResponse2 .class,
    DoSetCreditLimitResponse2 .class,
    DoDeletePrematchResponse2 .class,
    DoMgntCRMBlackListResponse2 .class,
    DoChangeMsisdnAndSimResponse2 .class,
    DoDismissReqResponse2 .class,
    DoQueryNotifyHisResponse2 .class,
    DoSetNotificationFlagResponse2 .class,
    DoSetBudgetResponse2 .class,
    DoDeleteGroupResponse2 .class,
    DoChangeProductResponse2 .class,
    DoRemoveUserResponse2 .class,
    DoChangeBillCycleResponse2 .class,
    DoAdjustBalanceResponse2 .class,
    DoQueryRecurringfeeOnetimefeeResp.class,
    DoNewGroupReqResponse2 .class,
    DoCancelOrderResponse2 .class,
    DoQueryBillingStatusResponse2 .class,
    DoSetMaxFreeResourceResponse2 .class,
    DoQueryUsersByBssResponse.class,
    DoQueryCallScreenResponse2 .class,
    DoHotBillResponse2 .class,
    DoQueryCapMaxResponse2 .class,
    DoModifyUserBasicInfoResponse2 .class,
    DoVPNGroupRelationResponse2 .class,
    DoCaRelationResponse2 .class,
    DoFirstActivationResponse2 .class,
    DoGsmTopUpResponse2 .class,
    DoReguideMgntResponse.class,
    DoPaymentAndBillAdjustResponse2 .class,
    DoSetExemptCreditLimitResponse2 .class,
    DoQuerySuppressNotificationResponse2 .class,
    DoQueryResponse2 .class,
    DoQueryCDRResponse2 .class,
    DoCancelGsmTopUpResponse2 .class,
    DoLifeCycleMgntResponse2 .class,
    DoChangeGroupResponse2 .class,
    DoResetNegativeValueResponse2 .class
})
public class BaseResponse {

    protected CbsErrorMsg errorMsg;
    protected SPage sPage;

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CbsErrorMsg }
     *     
     */
    public CbsErrorMsg getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsErrorMsg }
     *     
     */
    public void setErrorMsg(CbsErrorMsg value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the sPage property.
     * 
     * @return
     *     possible object is
     *     {@link SPage }
     *     
     */
    public SPage getSPage() {
        return sPage;
    }

    /**
     * Sets the value of the sPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPage }
     *     
     */
    public void setSPage(SPage value) {
        this.sPage = value;
    }

}
