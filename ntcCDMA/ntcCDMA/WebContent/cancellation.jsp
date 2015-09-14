
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.IOException"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoSMngDepositResponse"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoCancelPaymentResponse2"%>
<%@page import="com.designco.ntbilling.util.Wsutil"%>
<%@page import="com.designco.ntbilling.dao.PaymentCollectionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%

try {
	
	
	
	String pageName = "cancellation.jsp";
	String collCen = session.getAttribute("ccCode").toString();
	String userId = session.getAttribute("username").toString();
	MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
	
	if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
		response.sendRedirect("index.jsp");
		return;
	}

	PaymentCollectionDao paymentCollectionDao= (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
	Wsutil wsutil=new Wsutil();
	String message = "";

	String transNo = request.getParameter("transNo");
		
	if (transNo != null) {
		List transactions = paymentCollectionDao.getTransactionByTransNO(transNo);
		
		if (transactions.size() == 0) {
			session.setAttribute("ex", new Exception("No row with given TRANS_NO : " + transNo));
			response.sendRedirect("error.jsp");
			return;
		} else {
			Map trans = (Map) transactions.get(0);
			String transType = trans.get("TRANS_TYPE").toString();
			String receiptNo = trans.get("RECEIPT_NO").toString();
			
			if (transType.equals("PMTB")) {
				if (request.getParameter("mode") != null) {
					String cancelSoNumber = trans.get("SO_NUMBER").toString();
					DoCancelPaymentResponse2  resp=wsutil.doCancel( Long.valueOf(cancelSoNumber).longValue()  );
					
					if (resp.getErrorMsg().getResultCode() == 0){
							paymentCollectionDao.updateForCancellation(receiptNo, cancelSoNumber, session);
							message="Cancelled Successfully.";
					}
					else {
							session.setAttribute("err", resp.getErrorMsg());
							response.sendRedirect("error.jsp");
							return;
					}
				}
			} else if (transType.equals("DEPS")){
				String srvNo = trans.get("SRV_NO").toString();
				int resourceType = Integer.parseInt(trans.get("RESOURCE_TYPE").toString());
				BigDecimal refundAmount = new BigDecimal(trans.get("BILL_AMT").toString());
				refundAmount = refundAmount.negate();
				
				DoSMngDepositResponse resp = wsutil.doDeposit(srvNo, (refundAmount.doubleValue())*100, resourceType);
				String cancelSoNumber = trans.get("SO_NUMBER").toString();
				if (resp.getErrorMsg().getResultCode() == 0){
					paymentCollectionDao.updateForCancellation(receiptNo, cancelSoNumber, session);
					message="Cancelled Successfully.";
				}
				else {
					session.setAttribute("err", resp.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
				
			} else if (transType.equals("CSIA")) {
				paymentCollectionDao.updateForCancellation(receiptNo, "", session);
				message="Receipt cancelled successfully.";
			}
		}
	}	

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cancellation</title>
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
	nextBox.focus();
	nextBox.select();
	event.preventDefault();
	return false;
	}
	}
	}
</script>

<div id="wraper">
<%@include file="includes/header.jsp"%>

<script>
$(document).ready(function() {
// 	document.getElementById("check1").checked=true
// val recpNo=$("#tdid").text();
	$("a.cancel").click(function(e){
		if (confirm("Are you sure you want to cancel?")) {
			return true;
		}
		return false;
	});
	
	$("#form1").submit(function(){
		$("#loadingDiv").show();
	});
});
</script>
<table width="100%">
	
	<tr>
		<td valign="top" width="200px"><%@include
			file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left"><br />
		<h2>Cancellation</h2>
		<br />
		<div align="center" style="font-size:16px;">
		<%=message%>
		</div>
		<div>
			<%
			String tempSrvNo= request.getParameter("tempSrvNo");
			tempSrvNo = tempSrvNo==null ? "" : tempSrvNo;
			%>		
			<table class="xform">
			<tr><td>
				<form id="form1" action="cancellation.jsp" method="post">
				Service No. <input  type="text" value="<%=tempSrvNo%>" name="tempSrvNo">
							<input type="submit" name="btn" value=Query  > 
			</form>
			</td></tr>
			</table>
			
			 Transaction
			 
			<table width="100%" class="color xform">
				<tr>
					<th>S.No.</th>
<!-- 					<th>Service No</th> -->
					<th>Customer Name</th>
					<th>Trans Type</th>
					<th>Date</th>
					<th>Receipt No.</th>
					<th width="3px" >Pay Mode</th>
					<th>Bill Amt</th>
					<th>TSC</th>
					<th>VAT</th>
					<th >Total Amt</th>
<!--00 					<th > Post Flag</th> -->
					<th> &nbsp;</th>
				</tr>
				<%
				int i = 0;
				List<Map> lists=new ArrayList();
				if(session.getAttribute("userLevel").equals("5")){

					lists=paymentCollectionDao.getTransactionByServiceNoWithoutCancelled(tempSrvNo);	
					
				}
				else{
					
					lists=paymentCollectionDao.getTransactionByServiceNoWithoutCancelledTodaysOnly(tempSrvNo,collCen);	
				}
				
// 				List<Map> lists = paymentCollectionDao.getTransactionByServiceNoWithoutCancelledTodaysOnly(tempSrvNo,collCen);
// 				System.out.println(lists);

				DecimalFormat df = new DecimalFormat("#,###,##0.00");
				for (Map m : lists)
				{
// 					String code = m.get("REGION_CODE").toString();
					String receipt_no = m.get("RECEIPT_NO").toString();
					i++;
				%>
				
					<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
					<td><%=i %></td>
<%-- 					<td><%=m.get("SRV_NO") %></td> --%>
					<td><%=m.get("CUST_NAME") %></td>
					<td width="10px" ><%=m.get("TRANS_TYPE") %></td>
					<td><%=m.get("TRANS_DT") %></td>
					<td ><%=m.get("RECEIPT_NO") %></td>
					<td width="3px" ><%=m.get("PAY_MODE") %></td>
					<td><%=df.format(m.get("BILL_AMT")) %></td>
					<td><% if(m.get("TSC_AMT")==null){ out.write( df.format(0));}else{%><%= df.format(m.get("TSC_AMT")) %><%}%></td>
<%-- 					<%	System.out.println(m.get("TSC_AMT")); %> --%>
					<td><% if(m.get("VAT_AMT")==null){out.write( df.format(0));}else{%><%= df.format(m.get("VAT_AMT"))%><%}%></td>
					<td><%=df.format(m.get("TOTAL_AMT")) %></td>
<%-- 					<td><%= m.get("POST_FLAG") %> --%>
					<td id="cancelationbtn"><a  href="cancellation.jsp?mode=cancel&transNo=<%=m.get("TRANS_NO")%>" class="cancel">
					<img src="images/cancel.png" alt="" width="15" height="15" />Cancel</a></td>
				</tr>
				<%
				}
				%>
			</table>
			</div>
		<%
}catch (Exception ex) {
	session.setAttribute("ex", ex);
	response.sendRedirect("error.jsp");
	return;
}
		%>
		</div>
		</td>
	</tr>
</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>