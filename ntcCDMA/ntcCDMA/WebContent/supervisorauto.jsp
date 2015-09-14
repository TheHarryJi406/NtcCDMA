
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.UserAllDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.sql.ResultSet"%>
<%
	String key = request.getParameter("q");

	if (key != null && key.length()>0) {
		String ccCode = session.getAttribute("ccCode").toString();
		UserAllDao userAllDao= (UserAllDao) Context.get().getBean("userAllDao");
		List<Map> lst=userAllDao.getSupervisorUserResults(key, ccCode);
		for(Map m:lst){
			String code =m.get("USER_CODE").toString();
			String cc_cd =m.get("CC_CODE").toString(); 
			out.println(code + "<span style='display:none;'>" + cc_cd
					+ "**</span>");
		}
	}
%>