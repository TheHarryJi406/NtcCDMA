<%@page import="com.ailk.openbilling.service.imsintf.CbsErrorMsg"%>
<%@page import="com.designco.ntbilling.dao.BankDescDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@include file="checkUser.jsp" %>

<%
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom </title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<table width="100%">

<tr>
<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<br/><br/>
<h1>ERROR</h1>
<br><br>
<%
Exception ex = (Exception) session.getAttribute("ex");
session.setAttribute("ex", null);
if (ex != null) {
%>
<h2><%= ex.getMessage() %></h2>
<br><br>
<%
	for (StackTraceElement ste : ex.getStackTrace()) {
		out.write(ste.toString() + "<br>");
	}
}

CbsErrorMsg err = (CbsErrorMsg) session.getAttribute("err");
session.setAttribute("err", null);
if (err != null) {
%>
<h2><%= err.getErrorMsg() %></h2>
<%
}
%>
</td>
</tr>
</table>
<%@include file="includes/footer.jsp"%>
</div>
</body>
</html>