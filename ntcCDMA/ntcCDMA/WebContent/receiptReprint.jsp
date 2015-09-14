<%@page import="com.designco.ntbilling.dao.UtilityDao"%>
<%@page import="com.designco.ntbilling.dao.CollCenterDao"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.designco.ntbilling.dao.PaymentCollectionDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%
String pageName = "receiptReprint.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");
UtilityDao utilityDao = (UtilityDao) Context.get().getBean("utilityDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

 PaymentCollectionDao paymentCollectionDao= (PaymentCollectionDao) Context.get().getBean("paymentCollectionDao");
CollCenterDao collCenterDao = (CollCenterDao) Context.get().getBean("collCenterDao");

//RoleDao roleDao = (RoleDao) Context.get().getBean("roleDao");
String message = "";
String fine, chequeNo, tsc, vat;
String collType;

List list = collCenterDao.getByCode(collCen);
Map mappp = (Map) list.get(0);

DecimalFormat df = new DecimalFormat("#,###,##0.00");

// String mode = request.getParameter("mode");
// mode = mode==null ? "" : mode;

// System.out.println(request.getParameter("cancel"));
if (request.getParameter("mode") != null) {
// 		paymentCollectionDao.getTransactionByReceiptNO(Integer.parseInt(request.getParameter("recpNo")));
		String user = session.getAttribute("username").toString();
		String receiptNo=request.getParameter("recpNo");
		paymentCollectionDao.updatePrintCount(receiptNo);
		List<Map> list1 =paymentCollectionDao.getTransactionByReceiptNO(receiptNo);
		//System.out.println(list);
		for (Map mp : list1)
		{
			if(mp.get("TSC_AMT")==null){
				tsc ="";
			}
			
			else{
				tsc="&tsc="+mp.get("TSC_AMT");
			}
			if(mp.get("VAT_AMT")==null){
				vat ="";
			}
			
			else{
				vat="&vat="+mp.get("VAT_AMT");
			}
			if(mp.get("PENALTY")==null){
				fine ="";
			}
			
				else{
					fine="&fine="+mp.get("PENALTY");
				}
			if(mp.get("CHEQUE_NO")==null){
				chequeNo ="";
			}
			
				else{
					chequeNo="&chequeNo="+mp.get("CHEQUE_NO");
				}
			//System.out.println(mp.get("AMT_WORD"));
		String payMode=mp.get("TRANS_TYPE").toString();
		if(payMode=="CSIA"){
			collType="&collType=Cash Sale Items";
		}
		else if(payMode=="DEPS"){
			collType="&collType=Deposit Collection";
		}
		else{
			collType="&collType=Payments-Bills";
		}
		
		/*String url="../WebViewerExample/frameset?__report=cdmaReport/receipt.rptdesign&receiptNO="+mp.get("RECEIPT_NO")+"&trNo="+mp.get("TRANS_NO")+"&telNo="+mp.get("SRV_NO")+"&payMode="+mp.get("PAY_MODE")+"&receivedBy="
		+user+"&name="+ mp.get("CUST_NAME")+"&billAmt="+ mp.get("BILL_AMT")+tsc+vat+fine+collType+"&subAmt="+mp.get("TENDER_AMT")+chequeNo+"&amtInWords="+mp.get("AMT_WORD")+"&retAmt="+mp.get("RETURN_AMT")+
		"&totalAmt="+mp.get("TOTAL_AMT")+"&printTimes="+mp.get("PRINT_COUNT")+"&ccCenter="+ mappp.get("DESCRIPTION");*/
		String printDate = mp.get("TRANS_DT").toString() + " : " + mp.get("TRANS_DT_ENG").toString();
		String url="repPrint.jsp?receiptNo="+mp.get("RECEIPT_NO")+"&trNo="+mp.get("TRANS_NO")+"&telNo="+mp.get("SRV_NO")+"&payMode="+mp.get("PAY_MODE")+"&receivedBy="
				+user+"&name="+ mp.get("CUST_NAME")+"&billAmt="+ mp.get("BILL_AMT")+tsc+vat+fine+collType+"&subAmt="+mp.get("TENDER_AMT")+chequeNo+"&amtInWords="+utilityDao.inWord(mp.get("TOTAL_AMT").toString())+"&retAmt="+mp.get("RETURN_AMT")+
				"&totalAmt="+mp.get("TOTAL_AMT")+"&printTimes="+mp.get("PRINT_COUNT")+"&ccCenter="+ mappp.get("DESCRIPTION")+"&currentDate="+printDate+"&time="+utilityDao.getTime();
		url = URLEncoder.encode(url);
		response.sendRedirect("receiptReprint.jsp?&url="+url);
		return;	}
}
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receipt Reprint</title>
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
<%
String pop = request.getParameter("url");
		if(pop != null)	{
			pop = URLDecoder.decode(pop);
		%>
		
		<script>
		window.open("<%=pop%>");
		</script>
		<%
		}
// 		{
		%>


<script>
$(document).ready(function() {
// 	document.getElementById("check1").checked=true
	$("a.cancel").click(function(e){
		if (confirm("Are you sure you want to cancel?")) {
			return true;
		}
		return false;
	});
});
</script>
<table width="100%">
	
	<tr>
		<td valign="top" width="200px"><%@include
			file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left">
		<h2>Receipt Reprint</h2>
		<br />
		<div align="center">
		<%=message%>
		</div>
		<div>
			<%
			String tempSrvNo= request.getParameter("tempSrvNo");
			tempSrvNo = tempSrvNo==null ? "" : tempSrvNo;
			%>		
			<table class="xform">
			<tr><td>
				<form action="receiptReprint.jsp" method="post">
				Service No. <input  type="text" value="<%=tempSrvNo%>" name="tempSrvNo" >
							<input type="submit" name="btn" value=Query > 
			</form></td></tr>
			</table>
			
			 
			<table width="100%" class="color xform">
				<tr>
					<th>S.No.</th>
<!-- 					<th>Service No</th> -->
<!-- 					<th>Product ID</th> -->
					<th>Trans Type</th>
					<th>Date</th>
					<th>Receipt No.</th>
					<th>Pay Mode</th>
					<th>Bill Amt</th>
					<th>TSC</th>
					<th>VAT</th>
					<th >Total Amt</th>
					<th> &nbsp;</th>
				</tr>
				<%
				int i = 0;
				List<Map> lists = paymentCollectionDao.getTransactionByServiceNoWithoutCancelled(tempSrvNo);
				for (Map m : lists)
				{
// 					String code = m.get("REGION_CODE").toString();
					String receipt_no = m.get("RECEIPT_NO").toString();
					i++;
				%>
				
					<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
					<td><%=i %></td>
<%-- 					<td><%=m.get("SRV_NO") %></td> --%>
<%-- 					<td><%=m.get("PRODUCT_ID") %></td> --%>
					<td><%=m.get("TRANS_TYPE") %></td>
					<td><%=m.get("TRANS_DT") %></td>
					<td><%=m.get("RECEIPT_NO") %></td>
					<td><%=m.get("PAY_MODE") %></td>
					<td><%=df.format(m.get("BILL_AMT")) %></td>					
					<td><% if(m.get("TSC_AMT")==null){ out.write( df.format(0));}else{%><%= df.format(m.get("TSC_AMT")) %><%}%></td>
					<td><% if(m.get("VAT_AMT")==null){ out.write( df.format(0));}else{%><%= df.format(m.get("VAT_AMT"))%><%}%></td>
					<td><%=df.format(m.get("TOTAL_AMT")) %></td>
					<td><a href="receiptReprint.jsp?mode=reprint&recpNo=<%=m.get("RECEIPT_NO")%>" class="reprint">Reprint</a></td>
				</tr>
				<%
				}
				%>
			</table>
			</form>
			</div>
		
		</div>
		</td>
	</tr>

</table>
<%@include file="includes/footer.jsp"%>
</div>


</body>
</html>