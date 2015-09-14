


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.UserAllDao"%>
<%
UserAllDao userAllDao = (UserAllDao) Context.get().getBean("userAllDao");
String date=session.getAttribute("lDate").toString();	
String usercode=session.getAttribute("username").toString();
// SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd : HH/mm/ss");
// Date dt =formatter.parse(date); 
//String lDate=session.getValue(lDate).toString();
// 	System.out.println(date);
userAllDao.logoutSave(usercode, date);
   session.setAttribute("username",null);
   response.sendRedirect("login.jsp");
   %>

