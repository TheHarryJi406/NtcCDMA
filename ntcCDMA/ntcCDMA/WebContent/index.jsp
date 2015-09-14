
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="checkUser.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom - <%=session.getAttribute("username")%> [<%=session.getAttribute("ccCode")%>]</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery.js"></script>

<!-- <script>
$(document).ready(function(){
	alert("If any customer having complain on current bill, dont accept the payment without verifying with system support. Sorry for inconvience caused.");
});
</script> -->

</head>
<body>
<div id="wraper">
<%@include file="includes/header.jsp"%>

<table width="100%">
	<tr>
		<td valign="top" width="200px"><%@include
			file="includes/leftmenu.jsp"%></td>
		<td valign="top" align="left"><br />
		<br />
		<div align="center">
		<%
			String msg = request.getParameter("msg");
			if (msg != null) {
				out.println(msg);
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