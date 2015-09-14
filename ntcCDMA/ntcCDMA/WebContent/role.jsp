

<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@include file="checkUser.jsp" %>

<%
String pageName = "role.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

String message="";
RoleDao roleDao=(RoleDao)Context.get().getBean("roleDao");
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String add=request.getParameter("addnew");
if(add!=null){
String code=request.getParameter("code");
String desc=request.getParameter("description");
message = roleDao.save(code,desc,session);
//message="Saved Successfully";

}
if (mode.equals("delete")){
	String code=request.getParameter("code");
	if(code!=null){
	roleDao.delete(code,session);
	message="Delete Successfully";
		}
	
}

String editbutton=request.getParameter("editButton");
if (editbutton!=null){
String	code=request.getParameter("code");
String desc=request.getParameter("description");
roleDao.update(code,desc,session);

message="Successfully Updated";


}
	
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
	$("a.delete").click(function(e){
		if (confirm("Are you sure you want to delete?")) {
			return true;
		}
		return false;
	});
});

$(document).ready(function() {
	$("#roleForm").validate({

		rules : {
			code : "required",// simple rule, converted to {required:true}   
			description : {// compound rule   
				required : true

			},
		}

	});

});
</script>


<table width="100%">

<tr>
<td valign="top" width="200px"><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<h2>Role</h2>
<div align="center"><%=message %></div>

<div> <%if (mode.equals("add"))
{
	%> <form action="role.jsp" method="post" id="roleForm">
	<table>
	<tr>
	<td>Code</td>
	<td><input type="text" name="code" value=""></td>
	</tr>
	
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value=""></td>
	</tr>
	<tr>
	<td><input type="submit" name="addnew" value="Save"></td></tr>
	</table>
	
	</form>
	<% 
	}

else if(mode.equals("edit")){
	String code=request.getParameter("code").toString();
	List lists=roleDao.getByCode(code);
	Map map=(Map)lists.get(0);
	
	%>
	<form action="role.jsp" method="post" id="roleForm">
	<table>
	<tr>
	<td>Code</td>
	<td><input type="text" name="code" value="<%=map.get("ROLE_CODE") %>" readonly="readonly"></td>
	</tr>
	
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value="<%=map.get("DESCRIPTION") %>"></td>
	</tr>
	<tr>
	<td><input type="submit" name="editButton" value="Save"></td></tr>
	</table>
	
	
	
	</form>
	<%
}

	%>
	
	
	  </div>

<div style="text-align: right;"><a href="role.jsp?mode=add" >Add new</a></div>
<table width="98%" class="color">
<tr>
<th>S.No.</th>
<th>Code</th>
<th>Description</th>
<th>Action</th>
</tr>

<%
int i=0;
List<Map> lists=roleDao.getAll();
for(Map m:lists){
	String code=m.get("ROLE_CODE").toString();
	i++;
	%>
	<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">
	<td> <%=i %>   </td>
	<td> <%=code %>   </td>
	<td> <%=m.get("DESCRIPTION") %>   </td>
	<td> <a href="role.jsp?mode=edit&code=<%=code%>">Edit</a>|
	<a href="role.jsp?mode=delete&code=<%=code%>" class="delete">Delete</a>   </td>
	</tr>
	
	<%
}
%>


</table>


</td>
</tr>


</table>
<%@include file="includes/footer.jsp"%>
</div>

</body>
</html>