
<%

if(request.getParameter("Save")!=null){
	
	String val[]=request.getParameterValues("supervisor");
	
}


%>

<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.designco.ntbilling.util.Wsutil"%>
<%@page import="com.ailk.openbilling.service.imsintf.DoQueryResponse2"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.designco.ntbilling.dao.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cash Sales</title>
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

<script type="text/javascript">
function access(){
// 	alert("sfsf");
	
var input = "hello222";
var ok = false;

var dob_regex = /^([0-9]){2}(\/){1}([0-9]){2}(\/)([0-9]){4}$/;   // DD/MM/YYYY
var email_regex = /^[a-zA-Z0-9._-]+@([a-zA-Z0-9.-]+\.)+[a-zA-Z0-9.-]{2,4}$/;  // email address
var username_regex = /^[\w.-]+$/;  // allowed characters: any word . -, ( \w ) represents any word character (letters, digits, and the underscore _ ), equivalent to [a-zA-Z0-9_]
var num_regex = /^\d+$/; // numeric digits only
var search_regex = "/hello/"; 
var password_regex = /^[A-Za-z\d]{6,8}$/;  // any upper/lowercase characters and digits, between 6 to 8 characters in total
var phone_regex = /^\(\d{3]\) \d{3}-\d{4}$/;  // (xxx) xxx-xxxx  
var question_regex = /\?$/; // ends with a question mark

	
	 x=document.getElementById("supervisor");
	var x=new Array();
	y=document.getElementsByName("supervisor");
// 	alert(x.value.length);


if ( email_regex.test(y[0].value) ) {
// 	ok = true;	

alert("tttt");
}
// 	if(x.value.length==0){
		
// 		alert("blank");
// 	}
	
// 	var x=document.getElementsByName("supervisor");
// 	alert(x.value());
	
}



$(document).ready(function() {   
    $("#form1").validate({ 
             
      rules: {   
//         supervisor: "required",// simple rule, converted to {required:true}   
//         center: {// compound rule   
//         required: true   
        
//       }
//     ,   
//        operator: {   
//         required: true
                  
//       } , 
//       start: {   
//         required: true,
//        number:true           
//       } , 
//       end: {   
//         required: true,
//         number:true             
//       }  

      }
    }); 

  }); 
</script>
<form id="form1" action="#" method="post">
		<table id="supervisorTable">
			<tr>
				<td>S.no</td>
				<td>Supervisor</td>
				<td>Center</td>
				<td>Operator</td>
				<td>Date</td>
				<td>Start</td>
				<td>End</td>
			</tr>
			
			
			<%
			
// 			for(int x=1; x<=5;x++){
				
			%>
			
			
			<tr>
<%-- 				<td><%=x %></td> --%>
				<td><input type="text" name="supervisor" id="supervisor"  onblur="access()" /></td>
<%-- 				<td><input type="text" name="center" id="center+<%=x%>" --%>
<!-- 					style="width: 120px;" /></td> -->
<%-- 				<td><input type="text" name="operator" id="operator+<%=x%>" --%>
<!-- 					title="Enter Operator" style="width: 120px;" /></td> -->
<%-- 				<td><input type="text" name="start" id="start+<%=x%>" --%>
<!-- 					style="width: 50px;" /></td> -->
<%-- 				<td><input type="text" name="end" id="end+<%=x%>" --%>
<!-- 					style="width: 50px;" /></td> -->
			</tr>
			<% 	
				
// 			}
			
			
			%>
			
			
		</table>
		<br />
		<input type="submit" value="Save" name="Save" /></form>
</body>
</html>
