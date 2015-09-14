

<%

String collType=request.getParameter("collType");
collType = collType==null ? "" : collType;

String receiptNo=request.getParameter("receiptNo");
receiptNo= receiptNo==null ? "" : receiptNo;

String printTimes=request.getParameter("printTimes");
printTimes= printTimes==null ? "" : printTimes;

String collCenter=request.getParameter("ccCenter");
collCenter= collCenter==null ? "" : collCenter;

String trNo=request.getParameter("trNo");
trNo= trNo==null ? "" : trNo;

String currentDate=request.getParameter("currentDate");
currentDate= currentDate==null ? "" : currentDate;

String adDate=request.getParameter("adDate");
adDate= adDate==null ? "" : adDate;

String time=request.getParameter("time");
time= time==null ? "" : time;

String telNo=request.getParameter("telNo");
telNo= telNo==null ? "" : telNo;

String name=request.getParameter("name");
name= name==null ? "" : name;

String billAmt=request.getParameter("billAmt");
billAmt= billAmt==null ? "" : billAmt;

String payMode=request.getParameter("payMode");
payMode= payMode==null ? "" : payMode;

String chequeNo=request.getParameter("chequeNo");
chequeNo= chequeNo==null ? "" : chequeNo;

String receivedBy=request.getParameter("receivedBy");
receivedBy= receivedBy==null ? "" : receivedBy;

String subAmt=request.getParameter("subAmt");
subAmt= subAmt==null ? "" : subAmt;

String AmtInWords=request.getParameter("amtInWords");
AmtInWords= AmtInWords==null ? "" : AmtInWords;

String retAmt=request.getParameter("retAmt");
retAmt= retAmt==null ? "" : retAmt;

String tsc=request.getParameter("tsc");
tsc= tsc==null ? "" : tsc;

String vat=request.getParameter("vat");
vat= vat==null ? "" : vat;

String fine=request.getParameter("fine");
fine = fine==null ? "" : fine;

String totalAmt=request.getParameter("totalAmt");
totalAmt= totalAmt==null ? "" : totalAmt;

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>


<style>
*{
font-family: Verdana;
font-size: 11px;
}
td {
height:17px;
}
</style>
<table width="800px" >
	<!-- <tr>
		<td colspan="4" height="12px"></td>
	</tr> -->
	<tr>
		<td width="90px"></td>
		<td width="200px"><%=collType %></td>
		<td width="220px"></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;No. of Times: <%=printTimes %></td>
	</tr>
	<tr>
		<td ></td>
	
		<td><%=receiptNo %></td>
		<td></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=collCenter %></td>
	</tr>
	<tr>
		<td colspan="4" height="10px"></td>
	</tr>
	<tr>
		<td></td>
		<td><%=trNo %></td>
		<td><%=currentDate%></td>
		
		
		
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=time %></td>
	</tr>
	<tr>
			<td></td>
		<td><%=telNo %></td>
		<td colspan="2"><%=name %></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td><%=billAmt %></td>
	</tr>
	<tr>
		<td></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;<%=payMode %></td>
		<td></td>
		<td><%=tsc %></td>
	</tr>
	<tr>
		<td></td>
		<td><%=chequeNo %></td>
		<td></td>
		<td><%=vat %></td>
	</tr>
	<tr>
		<td></td>
		<td>&nbsp;&nbsp;<%=receivedBy %></td>
		<td></td>
		<td><%=fine %></td>
	</tr>
	<tr>
		<td></td>
		<td><%=subAmt %></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=retAmt %></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=totalAmt %></td>
	</tr>
	<tr>
		<td></td>
		<td colspan="3"> <%=AmtInWords %></td>
		
	</tr>
	
</table>
<script>
window.print();
window.close();
</script>
</body>
</html>