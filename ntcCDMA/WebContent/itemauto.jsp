
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.designco.ntbilling.util.Context"%>
<%@page import="com.designco.ntbilling.dao.ItemRateDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.math.BigDecimal"%>
<%
	String key = request.getParameter("q");
//   String key = "r";
  
	if (key != null && key.length() > 0) {
		
		ItemRateDao itemRateDao= (ItemRateDao) Context.get().getBean("itemRateDao");
		
		
		List<Map> lst = new ArrayList();
	
		lst=itemRateDao.getAll();
		
		 if (key.trim().length() == 0)
		 {
			lst = itemRateDao.getAll();
		 }
		else
		{
			lst = itemRateDao.getByDesc(key);
		}
		 
		 System.out.println(lst);
		 
		 
		for(Map m:lst){
			String code = m.get("ITEM_CODE").toString();  
			String desc = m.get("DESCRIPTION").toString();
			String remarkRequired=m.get("IS_REQUIRED").toString();
			BigDecimal rate =new BigDecimal(m.get("CHARGE").toString()) ;
			BigDecimal vat = new BigDecimal(m.get("VAT").toString()) ;
			BigDecimal tsc = new BigDecimal(m.get("TSC").toString()) ;
			if (rate == null)
				rate = BigDecimal.ZERO;
			if (vat == null)
				vat = BigDecimal.ZERO;
			if (tsc == null)
				tsc = BigDecimal.ZERO;
			// format - code<span>desc**rate%%</span>
			out.println(desc+ "<span style='display:none;'>" + code
					+ "**" + rate + "**" + tsc + "**"
					+ vat + "**"+ remarkRequired+"**</span>");
			
			
		}
		
  
	}
%>