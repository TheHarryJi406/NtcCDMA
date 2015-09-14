<%@page import="com.designco.ntbilling.dao.BankDescDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.RoleDao"%>
<%@include file="checkUser.jsp" %>

<%
String pageName = "bank.jsp";
String collCen = session.getAttribute("ccCode").toString();
String userId = session.getAttribute("username").toString();
MenuAccessDao menuAccessDao= (MenuAccessDao) Context.get().getBean("menuAccessDao");

if (menuAccessDao.checkMenuAccessForUser(userId, pageName)==false) {
	response.sendRedirect("index.jsp");
	return;
}

String message="";
BankDescDao bankDescDao=(BankDescDao)Context.get().getBean("bankDescDao");
String mode = request.getParameter("mode");
mode = mode==null ? "" : mode;

String add=request.getParameter("addnew");
if(add!=null){
String desc=request.getParameter("description");
String branch=request.getParameter("branch");
bankDescDao.save(desc.toUpperCase(), branch.toUpperCase(), session);
message="Saved Successfully";

}
if (mode.equals("delete")){
	String code=request.getParameter("code");
	if(code!=null){
	message = bankDescDao.delete(code,session);
	//message="Delete Successfully";
		}
	
}

String editbutton=request.getParameter("editButton");
if (editbutton!=null){
String	code=request.getParameter("code");
String desc=request.getParameter("description");
String branch = request.getParameter("branch");
bankDescDao.update(code, desc.toUpperCase(), branch.toUpperCase(), session);
//System.out.println(branch);

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
<div id="loadingDiv"><img src="images/loading image.gif" alt="" /></div>
<div id="wraper">
<%@include file="includes/header.jsp"%>

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
	$("table.yform tr:odd").addClass("odd");
});

$(document).ready(function() {
	$("#bankForm").validate({

		rules : {
			description : {
				required : true
				
			},
			branch : {// compound rule  
				required : true
				
			}
		}
	});

});
</script>

<table width="100%" class="yform">

<tr>
<td valign="top" width="200px" ><%@include file="includes/leftmenu.jsp" %></td>
<td valign="top" align="left">
<h2>Bank</h2>
<div align="center"><%=message %></div>

<div> <%if (mode.equals("add"))
{
	%> <form action="bank.jsp" method="post" id="bankForm">
	<table>
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value=""></td>
	</tr>
	<tr>
	<td>Branch</td>
	<td><input type="text" name="branch" value=""></td>
	</tr>
	<tr>
	<td><input type="submit" name="addnew" value="Save"></td></tr>
	</table>
	
	
	
	</form>
	<% 
	}

	else if(mode.equals("edit")){
	String code=request.getParameter("code").toString();
	List list=bankDescDao.getByCode(code);
	Map map=(Map)list.get(0);
	
%> 
	<form action="bank.jsp" method="post" id="bankForm">
	<table>
	<tr>
	<td>Code</td>
	<td><input type="text" name="code" value="<%=map.get("CODE") %>" readonly="readonly" class="readonly"></td>
	</tr>
	<tr>
	<td>Description</td>
	<td><input type="text" name="description" value="<%=map.get("DESCRIPTION") %>"></td>
	</tr>
	<tr>
	<td>Branch</td>
	<td><input type="text" name="branch" value="<%=map.get("BRANCH") %>"></td>
	</tr>
	<tr>
	<td><input type="submit" name="editButton" value="Save"></td></tr>
	</table>
	
	
	
	</form> 
	<%
}

 	%> 
	
	  </div>

<div style="text-align: right;"><a href="bank.jsp?mode=add" ><img style="padding-right: 10px;" src="images/add new.png" alt=""><p>Add New</p></a></div><br>
<table width="100%" class="color">
<tr>
<th>S.No.</th>
<th>Code</th>
<th>Description</th>
<th>Action</th>
</tr>

<%
int i=0;
List<Map> lists=bankDescDao.getAll();
for(Map m:lists){
	String code=m.get("CODE").toString();
	i++;
	%>
	<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" style="background-color: #d4e3e5;">	
	<td> <%=i %>   </td>
	<td> <%=m.get("DESCRIPTION") %>   </td>
	<td> <%= m.get("BRANCH") %></td>
	<td id="actionrow"> <a href="bank.jsp?mode=edit&code=<%=code%>">Edit</a>&nbsp;|
	<a href="bank.jsp?mode=delete&code=<%=code%>" class="delete">Delete</a>   </td>
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