<%@page import="com.ailk.openbilling.service.imsintf.DoCancelPaymentResponse2"%>
<%@page import="com.designco.ntbilling.util.Wsutil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Wsutil wsutil=new Wsutil();
DoCancelPaymentResponse2 doCancelPaymentResponse2=wsutil.doCancel(201212131602268l);

%>

</body>
</html>