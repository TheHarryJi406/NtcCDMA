<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page import="com.designco.ntbilling.dao.*"%>
<%@ page import="java.sql.*"%>
<%
	String message = "";
	if (request.getParameter("Submit") != null) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String result = formatter.format(date); 
		
		UsersDao usersDao = (UsersDao) Context.get().getBean("usersDao");
		UserAllDao userAllDao = (UserAllDao) Context.get().getBean("userAllDao");
		
		if (usersDao.authenticate(username.trim(), password.trim())) {
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			List list=userAllDao.getByCode(username);
			Map map = (Map) list.get(0);

			String collCenterCode = map.get("CC_CODE").toString();
			String userLevel=map.get("USER_LEVEL").toString();
			
			session.setAttribute("userLevel",userLevel);
			session.setAttribute("ccCode",collCenterCode);
			session.setAttribute("lDate",result);
			userAllDao.loginSave(username, date);
			response.sendRedirect("index.jsp");
			return;
		} else {
			message = "Username or Password invalid. Please try again.";
		}
	}
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.springframework.context.ApplicationContext"%>
<%@page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="org.springframework.jdbc.core.ConnectionCallback"%>
<%@page import="org.springframework.dao.DataAccessException"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nepal Telecom - Login</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style-ntc.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/check.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>

</head>
<body>
<div id="wraper">
<%@include file="includes/header.jsp"%>
	<%
		if (message.length() > 0) {
			out.write(message);
		}
	%>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<script>
		function submitForm() {
			a = document.getElementById("username");

			a.value = a.value.toUpperCase();

		}
		$(document).ready(function() {
			$("#form1").validate({

				rules : {
					username : "required",// simple rule, converted to {required:true}   
					password : {// compound rule   
						required : true

					}

				}
			});

		});
	</script>
	<form id="form1" action="login.jsp" method="post"
		onsubmit=" submitForm();">
		<table width="100%">
			<tr>
				<td align="center">
					<table border="0" style="border: 1px solid; padding: 3px;">
						<tr>
							<td>Username</td>
							<td><input type="text" name="username" id="username"
								class="username" title="Enter username"/>
							</td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="password" id="password"
								class="password" title="Enter Password" />
							</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" name="Submit" value="Login" />
							</td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
	<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>