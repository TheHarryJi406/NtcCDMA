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
	
	String pageName = "deposit.jsp";
	String collCen = session.getAttribute("ccCode").toString();
	String userId = session.getAttribute("username").toString();
	MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
	
	if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
		response.sendRedirect("index.jsp");
		return;
	}
	
SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
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


if (request.getParameter("save") != null && request.getParameter("depositAmount") != null) {
	
	String transType = "DEPS";
	
 	String	srvNo=request.getParameter("srvNo");
	String	srvName=request.getParameter("srvName");
	String	srvAcNo=request.getParameter("srvAcNo");
	String lineStatus=request.getParameter("lineStatus")==null ? "" : request.getParameter("lineStatus");
	
	String chequeNo= "";
	String chequeAcNo= "";
	String chequeDt = "";
	String bankName="";
	String bankBranch= "";
	
	
	
	String paymentMode = request.getParameter("type");
 	int resourceType = Integer.parseInt(request.getParameter("rtype"));
	System.out.println(resourceType);
// 	if(resourceType=="SkyPhone  "){
// 		resourceType="2";
// 		System.out.println("skyphone"+resourceType);
// 	}
// 	else{
// 		resourceType="1";
// 		System.out.println("cphone"+resourceType);
// 	}
	
	String id_payment_dt = utilityDao.getTodaysDate();		
	
	BigDecimal depositAmount = new BigDecimal(request.getParameter("depositAmount"));
	BigDecimal tenderAmt = new BigDecimal(request.getParameter("tender"));
	BigDecimal rAmount = new BigDecimal(request.getParameter("change"));
	
	Map seqsMap = sequenceDao.getSupervisorNo(collCen, userId);
	Integer	supSeq =Integer.parseInt(seqsMap.get("on_sup_seq").toString()) ;
	Integer	seqOpr = Integer.parseInt(seqsMap.get("on_seq_opr").toString());
		if (seqsMap.get("ov_flag").equals("2")) {
			
			out.println("Supervisor sequence is already Finished.");
			return;
		} 
	

	String soNbr=	utilityDao.getTimeForWs();
// 	System.out.println(soNbr);
		
	    DoSMngDepositResponse resp=wsUtil.doDeposit(srvNo, (depositAmount.doubleValue())*100,resourceType);
	    
	    if (resp.getErrorMsg().getResultCode() == 0  ) {
	    	
	    	String receiptNo=paymentCollectionDao.getReceiptSequence();
	    	String transNo=paymentCollectionDao.getTransSequence();
	    	
	    	if (paymentMode.equals("CHQ")) {

	    		bankName= request.getParameter("bname");
	    		bankBranch = request.getParameter("desc");
	    		chequeDt = request.getParameter("checkDt"); 
	    		chequeNo = request.getParameter("checkNo");
	    		chequeAcNo= request.getParameter("AccountNo");
	    		
	    		String bank = bankDescDao.verify(bankName, bankBranch);
	    		String sessio="abc";
	    		System.out.println(bank);

	    		if(bank == "N"){
	    			bankDescDao.save(bankName.toUpperCase(), bankBranch.toUpperCase(), session);
	    		}

	    	}
			try{
				
				if (paymentMode.equals("CHQ")) {
					
					bankName= request.getParameter("bname");
					bankBranch = request.getParameter("desc");
					chequeDt = request.getParameter("checkDt"); 
					chequeNo = request.getParameter("checkNo");
					chequeAcNo= request.getParameter("AccountNo");
					
					String bank = bankDescDao.verify(bankName, bankBranch);
					if(bank == "N"){
						bankDescDao.save(bankName.toUpperCase(), bankBranch.toUpperCase(), session);
					}
				}	
			
				billingDao.receiptOrDeposit(transNo,transType, srvNo, srvName, srvAcNo, null, receiptNo, paymentMode, resourceType ,null, depositAmount,
		    			null, null,depositAmount , tenderAmt, rAmount, seqOpr, session, chequeNo, chequeDt, chequeAcNo, bankName, bankBranch,soNbr, lineStatus,
		    			resp.getErrorMsg().getResultCode(), resp.getErrorMsg().getErrorMsg());

				}
				catch(Exception e){
					String error= e.getCause().toString();
					
					billingDao.insertPaymentErrorLog(srvNo, transType, null, null, null, null, depositAmount, collCen, userId, soNbr,
							lineStatus, resp.getErrorMsg().getResultCode(),error,
							srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
							);		
		
					session.setAttribute("ex", error);
					response.sendRedirect("error.jsp");
					return;
					
				}
					    	
	    	
	    	
	    	if(chequeNo!=""){
				chequeNo="&chequeNo="+chequeNo;
			}
			else{
				chequeNo="";
			}
	    	
	    	String printDate = utilityDao.getTodaysDateNepali() + " : " +utilityDao.getTodaysDate();
	  	    			String url="repPrint.jsp?receiptNo="+receiptNo+"&telNo="+srvNo+"&payMode="+paymentMode+"&receivedBy="+userId+"&name="+srvName+"&billAmt="+depositAmount+"&subAmt="
	    				    +tenderAmt+"&retAmt="+rAmount+"&collType=Deposit Collection"+"&trNo="+ transNo+chequeNo+"&totalAmt="+
	    				    		depositAmount+"&amtInWords="+utilityDao.inWord(depositAmount.toString())+"&ccCenter="+ mappp.get("DESCRIPTION")+"&printTimes=1"+
	    				    				"&currentDate="+printDate+"&time="+utilityDao.getTime();
	    	
	    	String msg = "Successfully paid Rs. " + depositAmount + " by " + srvNo;
	    	url = URLEncoder.encode(url);
	    	response.sendRedirect("deposit.jsp?msg="+msg+"&url="+url);
	    	return;
	    }
	    
	    else if (resp.getErrorMsg().getResultCode() != 0 || resp.getErrorMsg().getResultCode()==null  ) {
			billingDao.insertPaymentErrorLog(srvNo, transType, null, null, null, null, depositAmount, collCen, userId, soNbr,
					lineStatus, resp.getErrorMsg().getResultCode(), resp.getErrorMsg().getErrorMsg(),
					srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
					);			
			
			session.setAttribute("err", resp.getErrorMsg());
			response.sendRedirect("error.jsp");
			return;
		}


					} 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
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
String pop = request.getParameter("url");
if(msg != null)	{
	pop = URLDecoder.decode(pop);
%>
<h2><%=msg %></h2>
<script>
window.open("<%=pop%>");
</script>
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
	
	if (formSubmitted){
// 		alert("Already submitted.");
		return;
	}
	
	calcTotal();

	var formSubmitted = false;
	
	$("#form1").submit(function() {
		
		var paidAmount = Number($("#depositAmount").val());
		var tender = Number($("#tender").val());
		
		var type = $("#type").val();
		var bname = $("#bname").val();
		var desc = $("#desc").val();
		var checkDt = $("#checkDt").val();
		var checkNo = $("#checkNo").val();
		var AccountNo = $("#AccountNo").val();
	
		
		 if(type=="CHQ" && (bname.trim().length==0 || desc.trim().length==0|| checkDt.trim().length==0|| checkNo.trim().length==0|| AccountNo.trim().length==0)){
				alert("Any field related to cheque cannot be empty.");
				return false;
			} 
		
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
		
		formSubmitted = true;
		setTimeout(function() {
            $('input').attr('disabled', 'disabled');
            $('a').attr('disabled', 'disabled');
        }, 50);
		
		
		
		return true;
	});
});


$(document).ready(function() {
	$("table.xform tr:odd").addClass("odd");
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
<table width="100%" class="xform">
	
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Deposit Collection</h2>
		<br>
		<%
		
			Map map=sequenceDao.getSupervisorNo(collCen, userId);	
				Integer in_sup_seq = null;
				Integer in_seq_opr = null;
		
				if (map.get("ov_flag").equals("1")) {
					
					out.println("Supervisor sequence not found.");
				} 
				
				else	if (map.get("ov_flag").equals("2")) {
					
					out.println("Supervisor sequence is already Finished.");
				}
				
				else {
					in_sup_seq =Integer.parseInt(map.get("on_sup_seq").toString()) ;
					in_seq_opr = Integer.parseInt(map.get("on_seq_opr").toString());
		%>

		<form id="form1" action="deposit.jsp" method="post">
		<table width="100%" class="xform">
			<tr>
				<td>Sequence No</td>
				<td><%=in_sup_seq%></td>
				<td><input type="hidden" name="todayDate" class="todayDate"
					id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><%=utilityDao.getTodaysDateNepali()%></td>
			</tr>
			<tr>
				<td width="150px">Service No.</td>
				<td><input type="text" name="srvNo" id="srvNo" value="<%=tempsrvNo %>" onchange="document.getElementById('loadingDiv').style.display='block';this.form.submit();" /></td>
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
				
				
			%>	
			<tr>
				<td>Name</td>
				
				<td><input type="text" name="srvName" id="srvName" value="<%=tempName %>" readonly="readonly" tabindex="-1" style="width:250px;" class="readonly" /></td>
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
				<td>Payment Type</td>
				<td><select name="type" id="type" class="type"
					onchange="changeEntry()" STYLE="width: 155px">
					<option value="CSH">Cash</option>
					<option value="CHQ">Cheque</option>

				</select></td><td>
	<div id="cashSaleDiv" style="border: 1px solid; display: none; padding:5px;">
	<table><tr>
	<td>Bank</td><td><input type="text" name="bname" id="bname" onKeyDown="changeKeyCode()" style="width:150px;" /></td></tr>
	<tr><td>Branch : </td><td><input type="text" name="desc" id="desc" style="width: 150px" onKeyDown="changeKeyCode()" /></td></tr>
	<tr><td>Check Date: </td><td><input type="text" name="checkDt" id="checkDt" style="width: 80px" value="<%=utilityDao.getTodaysDateNepali()%>" onKeyDown="changeKeyCode()" /></td></tr>
	<tr><td>Check No:</td><td><input type="text" name="checkNo" id="checkNo" style="width: 150px" onKeyDown="changeKeyCode()" /></td> </tr>
	<tr><td>Account No:</td><td><input type="text" name="AccountNo" id="AccountNo" style="width: 150px" onKeyDown="changeKeyCode()" /></td></tr>
	</table>
					</div>
	</td>
			</tr>
			<tr>
				<td>Resource Type</td>
				<td><%=rtype %>
				<input type="hidden" value=<%=rcode %> name="rtype" />
				</td>
			</tr>
			
			<tr>
				<td>Deposit Amount</td>
				<td><input type="text" id="depositAmount" name="depositAmount"  onblur="set();" value="0" onchange="" /></td>
			</tr>
			<tr>
				<td>Tender</td>
				<td><input type="text" name="tender" id="tender" class="tender"
					onchange="calcChange();" /></td>
			</tr>
			<tr>
				<td>Change</td>
				<td><input id="change" name="change" class="change" readonly="readonly" value="0" class="readonly"/></td>
			</tr>
			<%	
			}
			%>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="save" id="submitbtn" />
<!-- 				<input type="reset" value="Reset" onclick="location.href='deposit.jsp'" /></td> -->
				
				
			</tr>
			
				</table>
		</form>
		<%
			}

		%>
		</td>
	</tr>
	
</table>
<%
	}

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