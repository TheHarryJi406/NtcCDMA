<%@page import="java.io.FileWriter"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoPaymentAndBillAdjustResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.Billinfo"%>
<%@page import="com.designco.ntbilling.util.Wsutil"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.SQueryParam"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryType"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryTypeList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SOperInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.IInfoMgntService"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map" %>
<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List" %>
<%
try{
			String pageName = "receipt.jsp";
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
		
		String tempsrvNo="";
		
		String msg = "";
		String popupUrl = "";
		if (request.getParameter("srvNo") != null) {
		
		tempsrvNo= request.getParameter("srvNo");
		}

		if (request.getParameter("save") != null && request.getParameter("paidAmount") != null) {
			
			String transType = "PMTB";
			
			
			String	srvNo=request.getParameter("srvNo");
			String	srvName=request.getParameter("srvName");
			String	srvAcNo=request.getParameter("srvAcNo");
			String osAmt=request.getParameter("total");
			String lineStatus=request.getParameter("lineStatus")==null ? "" : request.getParameter("lineStatus");
			
			String chequeNo= "";
			String chequeAcNo= "";
			String chequeDt = "";
			String bankName="";
			String bankBranch= "";
			String cheNo=null;
			
			
			String paymentMode = request.getParameter("type");
// 			int resourceType=Integer.parseInt(request.getParameter("rtype"));

			BigDecimal vatAmt = BigDecimal.ZERO;
			BigDecimal tscAmt = BigDecimal.ZERO;
			String id_payment_dt = utilityDao.getTodaysDate();

			BigDecimal tempbillAmount = new BigDecimal(request.getParameter("billAmountSpan"));
			BigDecimal totalTsc= new BigDecimal(request.getParameter("tscSpan"));
			BigDecimal totalVat= new BigDecimal(request.getParameter("vatSpan"));
			BigDecimal totalAmt= new BigDecimal(request.getParameter("paidAmount"));
			BigDecimal tenderAmt = new BigDecimal(request.getParameter("tender"));
			BigDecimal rAmount = new BigDecimal(request.getParameter("change"));
		
			BigDecimal os=new BigDecimal(osAmt);
			String soNbr=	utilityDao.getTimeForWs();

			Map seqsMap = sequenceDao.getSupervisorNo(collCen, userId);
			Integer	supSeq =Integer.parseInt(seqsMap.get("on_sup_seq").toString()) ;
			Integer	seqOpr = Integer.parseInt(seqsMap.get("on_seq_opr").toString());
				if (seqsMap.get("ov_flag").equals("2")) {
					
					out.println("Supervisor sequence is already Finished.");
					return;
				}  
			
		
				List list = collCenterDao.getByCode(collCen);
				Map mappp = (Map) list.get(0);

		BigDecimal temp = totalVat.add(totalTsc).add(tempbillAmount);
		if (temp.compareTo(totalAmt) != 0) {
			session.setAttribute("ex", new RuntimeException("Submitted amounts does not match. Please try again!"));
			response.sendRedirect("error.jsp");
			return;
		}
		
			
			DoPaymentAndBillAdjustResponse2 resp=wsUtil.doPayment(srvNo, null, totalAmt,soNbr);
					
			if (resp.getErrorMsg().getResultCode() == 0  ) {
	
				String receiptNo=paymentCollectionDao.getReceiptSequence();
				String transNo=paymentCollectionDao.getTransSequence();

				
			
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
								
									billingDao.receiptOrDeposit(transNo,transType, srvNo, srvName, srvAcNo, null, receiptNo, paymentMode,null, os, tempbillAmount,
											totalTsc, totalVat,totalAmt , tenderAmt, rAmount, seqOpr, session, chequeNo, chequeDt, chequeAcNo, bankName, bankBranch,soNbr, lineStatus,
											resp.getErrorMsg().getResultCode(),resp.getErrorMsg().getErrorMsg());
				
// 									billingDao.receiptOrDeposit(transNo,transType, srvNo, srvName, srvAcNo, null, receiptNo, paymentMode,null, os, tempbillAmount,
// 											totalTsc, totalVat,totalAmt , tenderAmt, rAmount, seqOpr, session, chequeNo, chequeDt, chequeAcNo, bankName, bankBranch,soNbr, lineStatus,
// 											9999l,"sflsjflsj");
					}
					catch(Exception e){
						String error= e.getCause().toString();
							 billingDao.insertPaymentErrorLog(srvNo, transType, os, tempbillAmount, totalTsc, totalVat, totalAmt, collCen, userId, soNbr,
								lineStatus, resp.getErrorMsg().getResultCode(), error,
								srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
								);	
								
// 						billingDao.insertPaymentErrorLog(srvNo, transType, os, tempbillAmount, totalTsc, totalVat, totalAmt, collCen, userId, soNbr,
// 								lineStatus, 999l, error,
// 								srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
// 								);	
								
						session.setAttribute("ex", error);
						response.sendRedirect("error.jsp");
						return;
						
					}
				
				
				
			
				if(request.getParameter("lineStatus").equals("Suspend Debt(Terminate)")){
					billingDao.updateTerminateNo(srvNo, receiptNo, session);
				}
				
				if(chequeNo!=""){
					chequeNo="&chequeNo="+chequeNo;
				}
				else{
					chequeNo="";
				}
				
				
				String printDate = utilityDao.getTodaysDateNepali() + " : " +utilityDao.getTodaysDate();
				
				popupUrl="repPrint.jsp?"
						+"receiptNo="+receiptNo+"&telNo="+srvNo+"&payMode="+paymentMode+"&receivedBy="+userId+"&name="+srvName+"&billAmt="+tempbillAmount+"&tsc="
						+totalTsc+"&vat="+totalVat+"&subAmt="+tenderAmt+"&retAmt="+rAmount+"&collType=Payment Collection"+"&trNo="+transNo+"&totalAmt="+totalAmt+
						"&printTimes=1"+"&amtInWords="+utilityDao.inWord(totalAmt.toString())+"&ccCenter="+ mappp.get("DESCRIPTION")+chequeNo+
						"&currentDate="+printDate+"&time="+utilityDao.getTime();
				msg = "Successfully paid Rs. " + totalAmt + " by " + srvNo;
				popupUrl = URLEncoder.encode(popupUrl);
				response.sendRedirect("receipt.jsp?msg="+msg+"&url="+popupUrl);
				return;
				}
	
				else if (resp.getErrorMsg().getResultCode() != 0 || resp.getErrorMsg().getResultCode()==null  ) {
					
						
					 billingDao.insertPaymentErrorLog(srvNo, transType, os, tempbillAmount, totalTsc, totalVat, totalAmt, collCen, userId, soNbr,
							lineStatus, resp.getErrorMsg().getResultCode(), resp.getErrorMsg().getErrorMsg(),
							srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
							);	
					
// 							billingDao.insertPaymentErrorLog(srvNo, transType, os, tempbillAmount, totalTsc, totalVat, totalAmt, collCen, userId, soNbr,
// 									lineStatus, 999l, "sfsdf",
// 									srvName,tenderAmt,rAmount,bankName,bankBranch,chequeDt,chequeNo,paymentMode
// 									);	
					
	
					session.setAttribute("err", resp.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
			
	
		} 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Payment</title>
<link href="css/jquery.autocomplete.css" rel="stylesheet"
	type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />
	
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<link rel="stylesheet" href="print.css" type="text/css" media="print" />
<script type="text/javascript" src="js/jquery.autocomplete.js"></script>
<script src="js/check.js"></script>

</head>
<body>


			<script>
			
			
			 $(document).ready( function() {
				textboxes = $("input");
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
		
			
			
			function set(){
				
				x=document.getElementById("tender");
				y=document.getElementById("change");
				x.value=0;
				y.value=0;
			}
			
			</script>
			
			<script type="text/javascript">
			
			
		     $(document).ready(function() { 
		         
		         


		       }); 
			
			
			
			
			
			
			
			</script>
			
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%
msg = request.getParameter("msg");
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
// 		{
		%>
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
				$("#paidAmount").focus();
			});
			
			$(document).ready(function() {
				$("table.xform tr:odd").addClass("odd");
			});
			
			
			</script>

		<script type="text/javascript">
			function calcTotal() {
				
				
				var x = 0;
				$("input.paidAmount").each(function(){
				 x = Number($(this).val());
				
				});
				var billAmount = x / 1.243;
				var tsc = billAmount * 0.1;
			// 	var vat = billAmount * 0.143;
				
				billAmount=billAmount.toFixed(2);
				tsc = tsc.toFixed(2);
				vat=x-billAmount-tsc;
			// 	vat = vat.toFixed(2) ;
				
				
				$("#billAmountSpan").val(billAmount);
				$("#tscSpan").val(tsc);
				$("#vatSpan").val(vat.toFixed(2));
				
				
			}   

			function calcChange(){
				var billAmt = Number(document.getElementById("paidAmount").value);
				var tender= Number(document.getElementById("tender").value);
				var change = tender - billAmt;
				change = change.toFixed(2);
				$("#change").val(change);
			}
			
			function checkDecimal(val) {
// 			 	var val = document.getElementById("charge");
			 	 	
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

		var formSubmitted = false;
		$(document).ready(function(){
			
			if (formSubmitted){
				//alert("Already submitted.");
				return ;
			}
			calcTotal();
			
			$("#form1").submit(function() {
			
			var paidAmount = Number($("#paidAmount").val());
			var tender = Number($("#tender").val());
			var total = Number($("#total").val());
			
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
			
			if(paidAmount < total){
				alert("Cannot pay amount less than the bill amount.");
				return false;
			}
			
			if (paidAmount <= 0) {
			alert('Paid amount cannot be zero or less.');
			$("#paidAmount").focus();
			return false;
			}
			if (tender <= 0) {
			alert('Tender amount cannot be zero or less.');
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
// 			document.getElementById("submitbtn").disabled=true;

			
			return true;
			});
		});

</script>

<%
// try {
%>
<table width="100%" >
	
	<tr>
	<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
	<td valign="top" align="left">
	<h2>Bill Collection</h2>
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

	<form id="form1" action="receipt.jsp" method="post">
	<table class="xform" width="100%">
	<tr>
	<td width="150px">Sequence No</td>
	<td><%=in_sup_seq%>
	<input type="hidden" name="todayDate" class="todayDate"
	id="todayDate" value="<%=utilityDao.getTodaysDateNepali()%>" /></td>
	</tr>
	<tr>
	<td>Date</td>
	<td><%=utilityDao.getTodaysDateNepali()%></td>
	</tr>
	<tr>
	<td>Service No.</td>
	<td><input type="text" name="srvNo" id="srvNo" value="<%=tempsrvNo %>" onchange="document.getElementById('loadingDiv').style.display='block'; this.form.submit()"this.form.submit()" /></td>
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
// 	short stat = first.getUser().getStatus();
	String lineStatus=Wsutil.getCustomerStatusByJptCode(first.getUser().getStatus()) ;
	 if (lineStatus.equals("Suspend Debt")){
		 if(billingDao.getTerminatedNumber(tempsrvNo)==true){
		 lineStatus=lineStatus+"(Terminate)";
		 }
		 
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
	<td><input type="text" name="lineStatus" value="<%=lineStatus%>" readonly="readonly" tabindex="-1" class="readonly"/></td>
	</tr>
<!-- 	<tr> -->
<!-- 	<td colspan="2" > -->
<!-- 	<table width="100%" > -->
	<% 
	DoQueryResponse2 second = wsUtil.getBillInfo(tempsrvNo);
	if (second.getErrorMsg().getResultCode() != 0) {
	session.setAttribute("err", second.getErrorMsg());
	response.sendRedirect("error.jsp");
	return;
	}
	
	
	int count = 0;
	BigDecimal total=BigDecimal.ZERO;
	if (second.getBillInfo() != null) {
		for (Billinfo bi : second.getBillInfo().getBillinfoListItem()) {
			BigDecimal unPaid =new BigDecimal(bi.getUnpayFee()/100f);
			total=total.add(unPaid);
		}
		total = total.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	%>
<!-- 	</table> -->
<!-- 	</td> -->
<!-- 	</tr> -->
	
	<tr>
	<td>Balance</td>
	<td><input type="text"  name="total" id="total" value="<%=total%>" readonly="readonly" tabindex="-1" class="readonly"/></td>
	</tr>
	<tr>
	<td>Type</td>
	<td><select name="type" id="type" class="type"
	onchange="changeEntry()" STYLE="width: 155px">
	<option value="CSH">Cash</option>
	<option value="CHQ">Cheque</option>

	</select></td>
	<td>
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
	<td>Paid Amount</td>
	<td><input type="text" id="paidAmount" name="paidAmount" class="paidAmount" value="<%=total %>" onchange="calcTotal(); calcChange(); set(); checkDecimal(this);"/></td>
	</tr>
	<tr>
	<td>Bill Amount</td>
	<td><input type="text" name="billAmountSpan" readonly="readonly" tabindex="-1" id="billAmountSpan" class="readonly"/></td>
	</tr>
	<tr>
	<td>TSC</td>
	<td><input type="text" name="tscSpan" readonly="readonly" tabindex="-1" id="tscSpan" class="readonly"/></td>
	</tr>
	<tr>
	<td>VAT</td>
	<td><input type="text" name="vatSpan" id="vatSpan" tabindex="-1" readonly="readonly" class="readonly" /></td>
	</tr>
	<tr>
	<td>Tender</td>
	<td><input type="text" name="tender" id="tender" class="tender"
	onchange="calcChange();checkDecimal(this);" /></td>
	</tr>
	<tr>
	<td>Change</td>
	<td><input id="change" name="change" id="change" readonly="readonly" tabindex="-1" class="change" value="0" class="readonly" /></td>
	</tr><%	
	}
	%>
	<tr>
	<td></td>
	<td><input type="submit" value="Submit" name="save" id="submitbtn" /> 
<!-- 	<input	type="reset" value="Reset" /></td> -->
	</tr>
	
	
	
	</table>
	</form>
	<%
	}

	%>
	</td>
	</tr>
	<tr>
	<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>
<%
} catch (Exception ex) {
	session.setAttribute("ex", ex);
	response.sendRedirect("error.jsp");
	return;
}
%>
<%
// 	}
%>
</div>

</body>
</html>