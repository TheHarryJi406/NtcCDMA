<%@page import="com.ailk.openbilling.service.imsintf.PaymentItemList"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoPaymentAndBillAdjustResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.PaymentItem"%>
<%@page import="com.ailk.openbilling.service.imsintf.PaymentInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.SPaymentReq"%>
<%@page import="com.ailk.openbilling.service.imsintf.Billinfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.BillinfoList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SBalance"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryType"%>
<%@page import="com.ailk.openbilling.service.imsintf.SQueryParam"%>
<%@page import="com.ailk.openbilling.service.imsintf.QueryTypeList"%>
<%@page import="com.ailk.openbilling.service.imsintf.SOperInfo"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="com.ailk.openbilling.service.imsintf.IInfoMgntService"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map"%>
<%@include file="checkUser.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Query</title>
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

<div id="wraper">
<h5 align="right"><%@include file="includes/user.jsp"%></h5>
<%
String pageName = "billquery.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}


	SequenceDao sequenceDao = (SequenceDao) Context.get().getBean("sequenceDao");
	UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");
	
	String phoneNo = "";
	
	if (request.getParameter("phoneNo") != null) {
		phoneNo = request.getParameter("phoneNo");
	}
%>
<script>
$(document).ready(function() {
	$("#form1").submit(function() {
		$("#loadingDiv").show();
	});
});
</script>
<table width="100%">
	<tr>
		<td colspan="2"><%@include file="includes/header.jsp"%></td>
	</tr>
	<tr>
		<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Bill Query</h2>
		
		<br>
		<form id="form1" action="" method="post">
		<table width="100%" class="xform">
			<tr>
				<td width="150px">Phone No.</td>
				<td><input type="text" name="phoneNo" value="<%=phoneNo %>" /></td>
			</tr>
			<%
			if (!phoneNo.isEmpty())
			{
			%>
			<tr>
			<td colspan="2">
			<table width="100%">
			<tr>
			<th>S.No.</th>
			<th>Item</th>
			<th>Amount</th>
			</tr>
			<%	
			try {
				IInfoMgntService info = new IInfoMgntService();
				SOperInfo oper = new SOperInfo();
				
				oper.setSoNbr(utilityDao.getTimeForWs());
				oper.setBusiCode(6023);
				oper.setSoMode((short) 1);
				oper.setChargeFlag((short) 1);
				oper.setRemark("");

				QueryTypeList qtl = new QueryTypeList();
				QueryType qt = new QueryType();
				qt.setQueryType((short)1);
				qtl.getQueryTypeItem().add(qt);

				SQueryParam qp = new SQueryParam();
				qp.setPhoneId(phoneNo);
				
				DoQueryResponse2 first = info.getIInfoMgntService().doQuery(oper, qtl, qp);
				
				if (first.getErrorMsg().getResultCode() != 0) {
					session.setAttribute("err", first.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
				//System.out.println("FIRST DONE - " + first.getAccount());
				// -------------------------------------------------------------
				
				oper.setSoNbr(utilityDao.getTimeForWs());
				
				qtl.getQueryTypeItem().remove(qt);
				qt = new QueryType();
				qt.setQueryType((short)26);
				qtl.getQueryTypeItem().add(qt);
				
				
				DoQueryResponse2 second = info.getIInfoMgntService().doQuery(oper, qtl, qp);
				
				if (second.getErrorMsg().getResultCode() != 0) {
					session.setAttribute("err", second.getErrorMsg());
					response.sendRedirect("error.jsp");
					return;
				}
				
				if (second.getBillInfo() == null) {
				%>
				<tr>
					<td colspan="3">No bill information.</td>
				</tr>
				<%
				}
				else {
					int count = 0;
					for (Billinfo bi : second.getBillInfo().getBillinfoListItem()) {
						BigDecimal unpaid = new BigDecimal(bi.getUnpayFee() / 100);
						unpaid = unpaid.setScale(2, BigDecimal.ROUND_HALF_UP);
						%>
						<tr>
						<td><%= ++count %></td>
						<td><%= bi.getInvoiceNo() %></td>
						<td><%= unpaid %>
						</tr>
						<%
					}
				}
			} catch (Exception ex) {
				session.setAttribute("ex", ex);
				response.sendRedirect("error.jsp");
				return;
			}
			%>
			</table>
			</td>
			</tr>
			<%
			}
			%>
			<tr>
				<td></td>
				<td><input type="submit" value="Query" name="billQuery" /></td>
			</tr>
		</table>
		</form>

		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>

</div>
</body>
</html>