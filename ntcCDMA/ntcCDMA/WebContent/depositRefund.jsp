<%@page import="com.ailk.openbilling.service.imsintf.SPocket"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoSMngQueryDepositResponse"%>
<%@page import="com.ailk.openbilling.service.imsintf.SMngQueryDepositReq"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoSMngDepositResponse"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoPaymentAndBillAdjustResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.Billinfo"%>
<%@page import="com.designco.ntbilling.util.Wsutil" %>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.SQueryParam"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryType"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryTypeList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SOperInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.IInfoMgntService"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map"%>
<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%

try {
	
	String pageName = "depositRefund.jsp";
	String collCen = session.getAttribute("ccCode").toString();
	String userId = session.getAttribute("username").toString();
	MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
// 	int resourceType= 2;
	
	if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
		response.sendRedirect("index.jsp");
		return;
	}
	
// SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
BillingDao billingDao = (BillingDao) Context.get().getBean("billingDao");
PaymentCollectionDao paymentCollectionDao = (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
CollCenterDao collCenterDao = (CollCenterDao) Context.get().getBean("collCenterDao");
BankDescDao bankDescDao = (BankDescDao) Context.get().getBean("bankDescDao");

Wsutil wsUtil=new Wsutil();
List list = collCenterDao.getByCode(collCen);
Map mappp = (Map) list.get(0);


String tempsrvNo="";

if (request.getParameter("srvNo") != null) {
	
	tempsrvNo= request.getParameter("srvNo");
}


if (request.getParameter("save") != null && request.getParameter("refundAmount") != null) {
	
	String transType = "DEPS";
	
 	String	srvNo=request.getParameter("srvNo");
	String	srvName=request.getParameter("srvName");
	String	srvAcNo=request.getParameter("srvAcNo");
	String lineStatus=request.getParameter("lineStatus")==null ? "" : request.getParameter("lineStatus");
	
	BigDecimal depBal=new BigDecimal(request.getParameter("deposit"));
 	int resourceType = Integer.parseInt(request.getParameter("rtype"));
System.out.println(resourceType);
	
	String id_payment_dt = utilityDao.getTodaysDate();		
	
	BigDecimal refundAmount = new BigDecimal(request.getParameter("refundAmount"));
	refundAmount = refundAmount.negate();
	
// 	Map seqsMap = sequenceDao.getSupervisorNo(collCen, userId);
// 	Integer	supSeq =Integer.parseInt(seqsMap.get("on_sup_seq").toString()) ;
// 	Integer	seqOpr = Integer.parseInt(seqsMap.get("on_seq_opr").toString());
// 		if (seqsMap.get("ov_flag").equals("2")) {
			
// 			out.println("Supervisor sequence is already Finished.");
// 			return;
// 		} 
	

	String soNbr=	utilityDao.getTimeForWs();
// 	System.out.println(soNbr);

    DoSMngDepositResponse resp=wsUtil.doDeposit(srvNo, (refundAmount.doubleValue())*100,resourceType);
    if (resp.getErrorMsg().getResultCode() == 0) {
//     	System.out.println("trial");
    
    	
//     	String receiptNo=paymentCollectionDao.getReceiptSequence();
    	String transNo=paymentCollectionDao.getRefundSequence();
    	
    	billingDao.depositRefund(transNo, srvNo, srvName, srvAcNo, depBal, refundAmount, collCen, userId, soNbr, resourceType); 
//     	(transNo, srvNo, srvName,srvAcNo, depBal, refundAmount, collCen, userId, soNbr, resourceType, session);
    	
//     	billingDao.receiptOrDeposit(transNo,transType, srvNo, srvName, srvAcNo, null, receiptNo, "CSH", resourceType ,null, refundAmount,
//     			null, null,refundAmount , BigDecimal.ZERO, BigDecimal.ZERO, seqOpr, session, "", "", "", "", "",soNbr);

    	String url="";
    	String msg = "Successfully paid Rs. " + refundAmount + " by " + srvNo;
    	response.sendRedirect("depositRefund.jsp?msg="+msg);
    	System.out.println(msg);
    	return;
    }
	
    else {
		session.setAttribute("err", resp.getErrorMsg());
		response.sendRedirect("error.jsp");
		return;
	}

					} 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit Refund</title>
<link href="css/jquery.autocomplete.css" rel="stylesheet"
	type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<link rel="stylesheet" href="print.css" type="text/css" media="print" />
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script src="js/check.js"></script>

</head>
<body>
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<script>
$(document).ready( function() {
	// get only input tags with class data-entry
	textboxes = $("input");
	//alert(textboxes.length);
	// now we check to see which browser is being used
	if ($.browser.mozilla) {
	$(textboxes).keypress (checkForEnter);
	} else {
	$(textboxes).keydown (checkForEnter);
	}
	});
	function checkForEnter (event) {
		if (event.keyCode == 13) {
		currentBoxNumber = textboxes.index(this);
		if (textboxes[currentBoxNumber + 1] != null) {
			nextBox = textboxes[currentBoxNumber + 1]
			//console.log(nextBox.getAttribute("type"));
			if (nextBox.getAttribute("type") != "reset") {
				nextBox.focus();
				nextBox.select();
				event.preventDefault();
				return false;
			}
		}
		}
	}
</script>

<div id="wraper">
<%@include file="includes/header.jsp"%>

<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%
String msg = request.getParameter("msg");
if(msg != null)	{
%>
<h2><%=msg %></h2>
<%
}

%>
<%

	
				
		 {
%>
<script type="text/javascript">
function calcTotal() {
	var total = 0;
	$("input.paidAmount").each(function(){
		var x = Number($(this).val());
		total += x;
	});
	$("#paidAmountSpan").val(total);
	
	var billAmount = total / 1.243;
	var tsc = billAmount * 0.1;
	var vat = billAmount * 0.143;
	
	billAmount=billAmount.toFixed(2);
	tsc = tsc.toFixed(2);
	vat = vat.toFixed(2) ;
	
	
	$("#billAmountSpan").val(billAmount);
	$("#tscSpan").val(tsc);
	$("#vatSpan").val(vat);
	
	
}   

function calcChange(){
	
	
	var billAmt=document.getElementById("depositAmount");
	var tender=document.getElementById("tender");
	$("#change").val(Number(tender.value)-Number(billAmt.value));
	
}

function checkDecimal(val) {
 	var val = document.getElementById("charge");
 	 	
 	var rgexp = /^[0-9]+(\.[0-9]{1,2})?$/;
 	
 	if(rgexp.test(val.value)==false)
 	{
 		val.value=Number(val.value).toFixed(2);
 		val.focus();
 	}
}

function changeEntry()
{
    var type=document.getElementById("type").value;
    if(type=="CSH")
    {
        document.getElementById('cashSaleDiv').style.display = 'none';  
    }
    else if(type=="CHQ")
    {document.getElementById('cashSaleDiv').style.display = 'block';}
}

$(document).ready(function(){
	$(".xform tr:odd").addClass("odd");
	calcTotal();
	
	$("#form1").submit(function() {
		var paidAmount = Number($("#depositAmount").val());
		var tender = Number($("#tender").val());
		
		if (tender < paidAmount) {
			alert("Tender cannot be less than the paid amount.");
			return false;
			}
			
		
		if (paidAmount <= 0) {
			alert('Deposit amount cannot be zero or less.')
			$("#depositAmount").focus();
			return false;
		}
		if (tender <= 0) {
			alert('Tender amount cannot be zero or less.')
			$("#tender").focus();
			return false;
		}
		
		$("#loadingDiv").show();
		$("#submitbtn").hide();
		return true;
	});
});

</script>

	

<script type="text/javascript">

$(document).ready(function() {
	$("#bname").autocomplete("bankcodeauto.jsp", {width:400,
		formatItem: function(data, i, total) {
                d = data[0]+"";
                desc = d.substring(0,d.indexOf("<"));
                        d = d.substring(d.indexOf(">")+1);
                        branch =d.substring(0, d.indexOf("<"));
                        return desc + " - " + branch;
	}});

	$("#bname").result(function(event, data, formatted) {
		if (data)
			{
			d = data+"";
			code = d.substring(0,d.indexOf("<"));
			d = d.substring(d.indexOf(">")+1);
			desc =d.substring(0, d.indexOf("<"));
			
			$(this).val(code);
			
			$("#bname").val(code);
			$("#desc").val(desc);
			
			
			}
	});
	
});

function set(){
	
		x=document.getElementById("tender");
		y=document.getElementById("change");
		x.value=0;
		y.value=0;
	}



</script>

<%
// try {
%>
<table width="100%">
	
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Deposit Refund</h2>
		<br>
		<%
		
// 			Map map=sequenceDao.getSupervisorNo(collCen, userId);	
// 				Integer in_sup_seq = null;
// 				Integer in_seq_opr = null;
		
// 				if (map.get("ov_flag").equals("1")) {
					
// 					out.println("Supervisor sequence not found.");
// 				} 
				
// 				else	if (map.get("ov_flag").equals("2")) {
					
// 					out.println("Supervisor sequence is already Finished.");
// 				}
				
// 				else {
// 					in_sup_seq =Integer.parseInt(map.get("on_sup_seq").toString()) ;
// 					in_seq_opr = Integer.parseInt(map.get("on_seq_opr").toString());
		%>

		<form id="form1" action="depositRefund.jsp" method="post">
		<table width="100%" class="xform">
			<tr>
<!-- 				<td>Sequence No</td> -->
<%-- 				<td><%=in_sup_seq%></td> --%>
				<td><input type="hidden" name="todayDate" class="todayDate"
					id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><%=utilityDao.getTodaysDateNepali()%></td>
			</tr>
			<tr>
				<td width="150px">Service No.</td>
				<td><input type="text" name="srvNo" id="srvNo" value="<%=tempsrvNo %>" onchange="document.getElementById('loadingDiv').style.display='block'; this.form.submit();" /></td>
			</tr>
			
 			<%
			if(!tempsrvNo.isEmpty()){
				if (tempsrvNo.length() == 10) {
					if (!tempsrvNo.startsWith("975")){
						session.setAttribute("ex", new RuntimeException("This is not a post paid number."));
						response.sendRedirect("error.jsp");
						return;
					}
				}

				BigDecimal remainingDeposit = BigDecimal.ZERO;
				
				DoQueryResponse2 first = wsUtil.getCustomerInfo(tempsrvNo);
				
				if (first.getErrorMsg().getResultCode() != 0) {
					session.setAttribute("err", first.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}

				String tempName=first.getAccount().getAcctName();
				Long tempAccountNo=first.getAccount().getAcctId();
				String rtype="";
				Integer rcode = 2;
				if(tempsrvNo.length()==10 && Integer.parseInt(tempsrvNo.substring(0, 2))==97){
					rtype = "SkyPhone";
					rcode=2;
				}
				else{
					rtype = "C-Phone";
					rcode=1;
				}

				IInfoMgntService info = new IInfoMgntService();
				SOperInfo oper = new SOperInfo();
				
				oper.setSoNbr(utilityDao.getTimeForWs());
				oper.setBusiCode(6023);
				oper.setSoMode((short) 1);
				oper.setChargeFlag((short) 1);
				oper.setRemark("");
				
				QueryTypeList qtl = new QueryTypeList();
				QueryType qt = new QueryType();
				qt.setQueryType((short)26);
				qtl.getQueryTypeItem().add(qt);
				
				SQueryParam qp = new SQueryParam();
				qp.setPhoneId(tempsrvNo);				
				
				DoQueryResponse2 second = info.getIInfoMgntService().doQuery(oper, qtl, qp);
				if (second.getErrorMsg().getResultCode() != 0) {
					session.setAttribute("err", second.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
				
				BigDecimal outstanding = BigDecimal.ZERO;
				if (second.getBillInfo() != null) {
					for (Billinfo bi : second.getBillInfo().getBillinfoListItem()) {
						outstanding = outstanding.add(new BigDecimal(bi.getUnpayFee()/100));
					}
				}
				outstanding = outstanding.setScale(2, BigDecimal.ROUND_HALF_UP);
				{
					oper = new SOperInfo();
					
					oper.setSoNbr(utilityDao.getTimeForWs());
					oper.setBusiCode(1069);
					oper.setSoMode((short) 1);
					oper.setChargeFlag((short) 1);
					oper.setRemark("");
					
					SMngQueryDepositReq req = new SMngQueryDepositReq();
					req.setValidDate(utilityDao.getSoDate());
					req.setExpireDate(utilityDao.getSoDate());
					req.setPhoneId(tempsrvNo);
					
					DoSMngQueryDepositResponse resp = info.getIInfoMgntService().doQueryDeposit(oper, req);
// 					String tempName=first.getAccount().getAcctName();
// 					Long tempAccountNo=first.getAccount().getAcctId();
					
					
					if (resp.getErrorMsg().getResultCode() != 0) {
						session.setAttribute("err", resp.getErrorMsg());
						response.sendRedirect("error.jsp");
						return;
					}
					try {
						
						
						/* for (SPocket sp : resp.getPocketList().getSPocketList()) {
							if (sp.getPhoneId().equals(tempsrvNo)){
							Long l = sp.getAmount();
							remainingDeposit = remainingDeposit.add(new BigDecimal(l/100));
							}
						} */
						
						
						int counter=0;
						for (SPocket sp : resp.getPocketList().getSPocketList()) {
							if (sp.getPhoneId().equals(tempsrvNo)) {
								
								if (resp.getPocketList().getSPocketList().get(counter).getPocketItem()==302000000){
									
									Long l = resp.getPocketList().getSPocketList().get(counter).getAmount();
									remainingDeposit = remainingDeposit.add(new BigDecimal(l/100));
									
								}
								counter++;
							}
						}
						
						
						
					} catch (ArrayIndexOutOfBoundsException ae) { System.out.println("array index outofbounds.");}
					 catch (IndexOutOfBoundsException ie) { System.out.println("index outofbounds.");}
				}
				
			%>	
			<tr>
				<td>Name</td>
				
				<td><input type="text" name="srvName" id="srvName" value="<%=tempName %>" readonly="readonly" tabindex="-1" style="width:250px;" class="readonly"/></td>
			</tr>
			
			<tr>
				<td >Account No.</td>
				<td ><input type="text" name="srvAcNo" value="<%=tempAccountNo %>" id="srvAcNo" readonly="readonly" tabindex="-1" class="readonly"/></td>
			</tr>
			<tr>
				<td >Status</td>
				<td><input type="text" name="lineStatus" value="<%=Wsutil.getCustomerStatusByJptCode(first.getUser().getStatus()) %>" readonly="readonly" tabindex="-1" class="readonly"/></td>
			</tr>
			<tr>
				<td>Resource Type</td>
				<td><%=rtype %>
				<input type="hidden" value=<%=rcode %> name="rtype" />
				</td>
			</tr>
			<tr>
				<td >Outstanding</td>
				<td ><%=outstanding %></td>
			</tr>
			<tr>
				<td >Remaining Deposit</td>
				<td ><input type="text" value="<%=remainingDeposit %>" name="deposit" readonly="readonly" class="readonly"> </td>
			</tr>
			<%
			BigDecimal becauseOfEffingStupidBug = BigDecimal.ZERO;
			becauseOfEffingStupidBug = becauseOfEffingStupidBug.setScale(2, BigDecimal.ROUND_HALF_UP);
			//System.out.println(outstanding.equals(becauseOfEffingStupidBug) + " - " + remainingDeposit.compareTo(BigDecimal.ZERO));
			if (outstanding.equals(becauseOfEffingStupidBug) && remainingDeposit.compareTo(BigDecimal.ZERO) != 0){
			%>
			<tr>
				<td>Refund Amount</td>
				<td><input id="refundAmount" name="refundAmount" class="" value="0" /></td>
			</tr>
			<%
			} else {
			%>
			<tr>
				<td>Refund Amount</td>
				<td>Please clear the outstanding amount first.</td>
			</tr>
			<%	
			}
			}
			}
			%>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="save" id="submitbtn" /></td>
			</tr>
			
			
				</table>
		</form>
		<%
// 			}

		%>
		</td>
	</tr>
	
</table>
<%

}
catch (Exception ex) {
	session.setAttribute("ex", ex);
	response.sendRedirect("error.jsp");
	return;
}
%>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>