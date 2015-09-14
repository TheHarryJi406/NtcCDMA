
<%@page import="com.designco.ntbilling.dao.CollCenterDao"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@page import="com.designco.ntbilling.dao.UserAllDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.TempDao"%>
<%@include file="checkUser.jsp"%>

<%
String pageName = "user.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

UserAllDao userAllDao = (UserAllDao) Context.get().getBean("userAllDao");
RoleDao roleDao = (RoleDao) Context.get().getBean("roleDao");
CollCenterDao collCenDao = (CollCenterDao) Context.get().getBean("collCenterDao");
String message = "";
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

 String addNew = request.getParameter("addNew");
if (addNew != null) {
	String desc = request.getParameter("desc");
	String code = request.getParameter("code");
	String password = request.getParameter("password");
	String role = request.getParameter("role");
	String userLevel = request.getParameter("userLevel");
	Integer empNo = null;
	if (request.getParameter("empNo").toString().length() > 0)
		empNo = Integer.parseInt(request.getParameter("empNo"));
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
	userAllDao.save(code, password, role, userLevel, startTime, endTime, collCenter, finalUserstatus,desc,empNo, session);
	
	message = "Successfully saved.";
}

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
	
	String desc = request.getParameter("desc");
	Integer empNo = null;
	if (request.getParameter("empNo").toString().length() > 0)
		empNo = Integer.parseInt(request.getParameter("empNo"));
	
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
	userAllDao.update(code , role, userLevel, startTime, endTime, collCenter, finalUserstatus, desc, empNo, session);
	message = "Successfully updated.";
}


if (mode.equals("delete")) {
	String code = request.getParameter("code");
	
	if (code != null) {
		userAllDao.delete(code, session);
		message = "Successfully deleted.";
	}
} 
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
// $(document).ready(function(){
// 	$("#form1").submit(function() {
// 		var password = $("#password").val();
// 		var confirmPassword = $("#confirmPassword").val();
// 		if(password==confirmPassword){
// 			return true;
// 		}
// 		else{
// 			alert("Enter same password in Password and Confrm Password");
// 			return false;
// 		}

// 	}
// });

$(document).ready(function() {
	$("#form1").validate({

		rules : {
			code : "required",// simple rule, converted to {required:true}   
			password : {// compound rule   
				required : true},
				
				role : {// compound rule   
					required : true

				},
				confirmPassword:{
					required : true,
					equalTo : "#password"
				},
			  	userLevel : {// compound rule   
					required : true

				},

				
		startTime : {// compound rule   
			required : true

				},
	endTime : {// compound rule   
		required : true

				},
	collCenter : {// compound rule   
		required : true

			}
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
		<br />
		<div align="center">
		<%=message%>
		</div>
		<div>
		<%
		if (mode.equals("add"))
		{
			
			
		%>
		<form id="form1" action="user.jsp" method="post">
		<table>
		
			<tr>
				<td>User Code</td>
				<td><input type="text" name="code"  id="code" class="code" title="Enter Code"/></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password" class="password" title="Enter Password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmPassword" id="confirmPassword" class="confirmPassword" title="Retype Password" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="desc"  id="desc" class="desc" title="Enter User Description"/></td>
			</tr>
			<tr>
				<td>Employee No.</td>
				<td><input type="text" name="empNo" id="empNo" class="empNo" title="Enter Employee Number"/></td>
			</tr>
			<tr>
				<td>Role Code</td>
				<%
					List<Map> lst=roleDao.getAll(); 
					
				%>
				<td><select name="role" class="role" id="role" title="Select Role"> 
						<option value="">Select</option>
						<% 
							for(Map m:lst){
								%>
								<option value=<%=m.get("ROLE_CODE") %>><%=m.get("DESCRIPTION") %></option>
								<%			
							}
						%>
					
					</select>
				</td>
			</tr>
			<tr>
				<td>User Level</td>
				<td><select   name="userLevel" id="userLevel" class="userLevel" title="Select User Level"> 
						<option value="">Select</option>
						<option value="5">Admin-5</option>
						<option value="4">Staff-4</option>
						<option value="3">Others-3</option>
						<option value="2">Others-2</option>
						<option value="1">Others-1</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Start Time</td>
				<td><input type="text" name="startTime" id="startTime" class="startTime" title="Enter Start Time"/></td>
			</tr>
			<tr>
				<td>End Time</td>
				<td><input type="text" name="endTime" id="endTime" class="endTime" title="Enter End Time"/></td>
			</tr>
			
			<tr>
				<td>CC Code</td>
				<%
				List<Map> lst1=collCenDao.getAll();
				
				%>
				<td><select name="collCenter" id="collCenter" class="collCenter" title="Select Coll Center"> 
						<option value="">Select</option>
						<%for(Map m:lst1){
							
						
							%>
								<option value=<%=m.get("CC_CODE") %>><%=m.get("DESCRIPTION") %></option>	
							<%
						}
						%>
						
				
					</select>
				</td>
			</tr>
			<tr>
				<td>User Status</td>
				<td><input type="checkbox" name="userStatus" id="userStatus" class="userStatus" title="Select User Status"  /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="addNew" value="Save" /></td>
			</tr>
		</table>
		</form>
		<%
		} else if (mode.equals("edit")) {
			 String code = request.getParameter("code");
			List list = userAllDao.getByCode(code);
			Map map = (Map) list.get(0);
			
			//String description = map.get("DESCRIPTION").toString();
		%>
		<form id="form1"action="user.jsp" method="post">
		  <table>
		  
			<tr>
				<td>User Code</td>
				<td><input type="text" name="code" id="code" class="code" title="Enter Code" value=<%=code%> readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="desc"  id="desc" value="<%=map.get("USER_DESC") %>" class="desc" title="Enter User Description"/></td>
			</tr>
		  <tr>
				<td>Employee No.</td>
				<td><input type="text" name="empNo" id="empNo" class="empNo" value="<%=map.get("EMPNO") %>" title="Enter Employee Number"/></td>
			</tr>
			<%-- <tr>
				<td>Password</td>
				<td><input type="password" name="password" value=<%=map.get("PASSWORD") %>/></td>
			</tr> --%>
			<tr>
				<td>Role Code</td>
				<%
					List<Map> lst=roleDao.getAll(); 
					
				%>
				<td><select name="role" id="role" class="role" title="Select Role"> 
						<option value="">Select</option>
						<% 
							for(Map m:lst){
								%>
								<option value=<%=m.get("ROLE_CODE") %> <%if(map.get("ROLE_CODE").equals(m.get("ROLE_CODE"))){out.write("selected");} %> ><%=m.get("DESCRIPTION") %></option>
								<%			
							}
						%>
					
					</select>
				</td>
			</tr>
			
			<tr>
				<td>User Level</td>
				<td><select   name="userLevel" id="userLevel" class="userLevel" title="Enter User Level"> 
						<option value="">Select</option>
						<option value="5" <%if (map.get("USER_LEVEL").toString().equals("5")){out.write("selected");} %> >Admin-5</option>
						<option value="4" <%if(map.get("USER_LEVEL").toString().equals("4")){out.write("selected");} %>>Staff-4</option>
						<option value="3" <%if(map.get("USER_LEVEL").toString().equals("3")){out.write("selected");} %>>Others-3</option>
						<option value="2" <%if(map.get("USER_LEVEL").toString().equals("2")){out.write("selected");} %>>Others-2</option>
						<option value="1" <%if(map.get("USER_LEVEL").toString().equals("1")){out.write("selected");} %>>Others-1</option>
				
					</select>
				</td>
			</tr>
			<tr>
				<td>Start Time</td>
				<td><input type="text" name="startTime" id="startTime" class="startTime" title="Enter Start Time" value=<%=map.get("START_TIME")  %> /></td>
			</tr>
			<tr>
				<td>End Time</td>
				<td><input type="text" name="endTime"  id="endTime" class="endTime" title="Enter End Time" value=<%=map.get("END_TIME") %> /></td>
			</tr>
			<tr>
				<td>CC Code</td>
				<%
				List<Map> lst1=collCenDao.getAll();
				
				%>
				<td><select name="collCenter" id="collCenter" class="collCenter" title="collCenter"> 
						<option value="">Select</option>
						<%for(Map m:lst1){
							
						
							%>
								<option value=<%=m.get("CC_CODE") %>  <%if(map.get("CC_CODE").equals(m.get("CC_CODE"))){out.write("selected");} %> ><%=m.get("DESCRIPTION") %></option>	
							<%
						}
						%>
						
				
					</select>
				</td>
			</tr>
			<tr>
				<td>User Status</td>
				<td><input type="checkbox" name="userStatus"  id="userStatusCheck" /></td>
				<script type="text/javascript">
								var x=document.getElementById("userStatusCheck");
								<%if(map.get("USER_STATUS").equals("A")){
							   		%>
							   		x.checked=true;
							   	<%
							   	}
							   	else{
							   		%>
							   		x.checked=false;
							   		<%
							   	}
							   	%>
								
								</script>
				
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="editButton" value="Save" /></td>
			</tr>
		</table>
		</form>		<%
		}
		%>
			<div style="text-align:right;">
				<a href="user.jsp?mode=add">Add New</a>
			</div>
			<div>
			<table width="98%" class="color">
				<tr>
					<th>S.No.</th>
					<th>User Description</th>
					<th>User Code</th>
					<th>Role Code</th>
					<th>User Role</th>
					<th>Employees Number</th>
					<th>Start Time</th>
					<th>End Time</th>
					<th>CC Code</th>
					<th>User Status</th>
					<th>Action</th>
				</tr>
				<%
				int i = 0;
				List<Map> lists = userAllDao.getAll();
				for (Map m : lists)
				{
					String code = m.get("USER_CODE").toString();
					i++;
				%>
	<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">
					<td><%=i %></td>
					<td><%=m.get("USER_DESC") %></td>
					<td><%=code %></td>
					<td><%=m.get("ROLE_CODE") %></td>
					<td><%=m.get("USER_LEVEL") %></td>
					<td><%=m.get("EMPNO") %></td>
					<td><%=m.get("START_TIME") %></td>
					<td><%=m.get("END_TIME") %></td>
					<td><%=m.get("CC_CODE") %></td>
					<td><%=m.get("USER_STATUS") %></td>
					<td>
					<a href="user.jsp?mode=edit&code=<%=code%>">Edit</a> |
					<a href="user.jsp?mode=delete&code=<%=code%>" class="delete">Delete</a> 
					</td>
				</tr>
				<%
				}
				%>
			</table>
			</div>
		</div>
		</td>
	</tr>
</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>