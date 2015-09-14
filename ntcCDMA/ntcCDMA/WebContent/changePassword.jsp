
<%@page import="com.designco.ntbilling.dao.UsersDao"%>
<%@page import="com.designco.ntbilling.dao.CollCenterDao"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@page import="com.designco.ntbilling.dao.UserAllDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>
<%

UsersDao usersDao = (UsersDao) Context.get().getBean("usersDao");
UserAllDao userAllDao = (UserAllDao) Context.get().getBean("userAllDao");


String message = "";
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

  String changeButton = request.getParameter("ok");
if (changeButton != null) {
	String userName = request.getParameter("userName");
	String oldPassword = request.getParameter("oldPassword");
	
	String newPassword = request.getParameter("newPassword");
	
	if (userAllDao.changePassword(userName, oldPassword, newPassword)) {
		message = "Password Changed Successfully";
		
	} else {
		message = " Password invalid. Please try again.";
	}
		
	
}

/*

String editButton = request.getParameter("editButton");
if (editButton != null) {
	String code = request.getParameter("code");
	//String password = request.getParameter("password").toString();
	String role = request.getParameter("role");
	String userLevel = request.getParameter("userLevel");
	String startTime = request.getParameter("startTime");
	String endTime = request.getParameter("endTime");
	String collCenter = request.getParameter("collCenter");
	String userStatus="";
	if(request.getParameter("userStatus")!=null){
		 userStatus =request.getParameter("userStatus");	
	}
	
	String finalUserstatus="";
	if(userStatus.equals("on")  ){
			finalUserstatus="A";		
	}
	else {
		finalUserstatus="N";
		}
	//System.out.println(finalUserstatus);
	userAllDao.update(code , role, userLevel, startTime, endTime, collCenter, finalUserstatus, session);
	message = "Successfully updated.";
}


if (mode.equals("delete")) {
	String code = request.getParameter("code");
	
	if (code != null) {
		userAllDao.delete(code, session);
		message = "Successfully deleted.";
	}
} 
 */
 %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom - <%=session.getAttribute("username")%> [<%=session.getAttribute("ccCode")%>]</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/check.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>

</head>
<body>
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
	$("#form1").validate({

		rules : {
			userName : "required",// simple rule, converted to {required:true}   
			oldPassword : {// compound rule   
				required : true},
				
				newPassword : {// compound rule   
					required : true

				},
				confirmPassword:{
					required : true,
					equalTo : "#newPassword"
				},
			}
	});

});


$(document).ready(function() {
	$("a.delete").click(function(e){
		if (confirm("Are you sure you want to delete?")) {
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
		<div align="center">
		<%=message%>
		</div>
		<div>
			<form id="form1" action="" method="post">
				<table>
					<tr>
				
						<td>User Name</td>
						<td><input type="text" name="userName"  value=<%=session.getAttribute("username") %> id="userName"  class="userName" title="Enter User Name " readonly="readonly"></td>
					</tr>
		
					<tr>
						<td>Old Password</td>
						<td><input type="password" name="oldPassword" id="oldPassword" class="oldPassword" title="Enter Old Password "></td>
					</tr>
		
					<tr>
						<td>New Password</td>
						<td><input type="password" name="newPassword" id="newPassword" class="newPassword" title="Enter New Password "></td>
					</tr>
					<tr>
						<td>Confirm Password</td>
						<td><input type="password" name="confirmPassword" id="confirmPassword" class="confirmPassword" title="Retype New Password "></td>
					</tr>
					
					<tr>
						<td><input type="submit" value="Ok" name="ok"></td>
					</tr>
			
				</table>
			</form>
		</div>
		
		</td>
	</tr>
	<tr>
		<td colspan="2"><%@include file="includes/footer.jsp"%></td>
	</tr>
</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>