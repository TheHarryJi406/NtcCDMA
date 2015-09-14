<%@page import="com.designco.ntbilling.dao.MenuAccessDao"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.dao.UserAllDao"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="java.sql.Connection"%><script type="text/javascript"
	src="js/jquery.blockUI.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("a.menu").each(function(){
		$(this).click(function(e){
			$("#loadingDiv").show();
		});
	});
});
function hideMsg() {
	$.unblockUI();
}
function processNumber() {
	connNo = $("#connNo").val();
	//if (connNo.length > 0)
		location.href = (page+"connectionNo=" + connNo);
	$.unblockUI();
	return false;
}
var page = "";
function askConnection(pg) {
	page = pg;
	$("#connNo").val('');
	$.blockUI({ message: $('#askNumber') }); 
}

</script>

<div style="width: 200px; padding-right:20px;">
<h3 style="text-align: left; color: #6a53ec">Menu</h3>

<%

MenuAccessDao menuAccessDao1 = (MenuAccessDao) Context.get().getBean("menuAccessDao");
UserAllDao userAllDao1 = (UserAllDao) Context.get().getBean("userAllDao");
String user = session.getAttribute("username").toString();

List<Map> lstMainMenu=menuAccessDao1.getByMainMenu();
for(Map m:lstMainMenu){
// 	System.out.println(m);
 String	menuCode=m.get("MENU_CODE").toString();
 String	description=m.get("DESCRIPTION").toString();
 %>
<ul><span><%=description %></span>
	<%
	List<Map> lstAllMenu =userAllDao1.getForMenu(user,menuCode);
	
	for(Map map:lstAllMenu){
	%>
	<ul>
	<li><a class='menu' href=<%=map.get("MENU_URL")  %>><%=map.get("DESCRIPTION") %></a></li>
	</ul>
	<%
	}
	%>
</ul>
 <%
}
%>

<!-- <li><a href="logout.jsp">Logout</a></li> -->
</div>