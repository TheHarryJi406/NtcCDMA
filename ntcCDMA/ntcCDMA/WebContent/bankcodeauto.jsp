
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.BankDescDao"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.sql.ResultSet"%>
<%
	String key = request.getParameter("q");
	if (key != null && key.length() > 0) {
	
		BankDescDao bankDescDao= (BankDescDao) Context.get().getBean("bankDescDao");
		List<Map> lst =bankDescDao.getByDesc(key.toUpperCase());

		for(Map m:lst){
			String desc=m.get("DESCRIPTION").toString();
			String branch=m.get("BRANCH").toString();
			out.println(desc + "<span >" + branch + "</span>");
		}

				
// 		ResultSet rs = billing.getBankResults(key);
// 		while (rs.next()) {
// 			String code = rs.getString("BANK_NAME");
// 			String desc = rs.getString("BANK_CODE");
// 			out.println(code + "<span >" + desc + "</span>");
// 		}
// 		rs.close();
	}
%>