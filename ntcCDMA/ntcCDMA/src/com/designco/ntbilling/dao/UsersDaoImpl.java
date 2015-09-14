package com.designco.ntbilling.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.jdbc.driver.OracleTypes;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class UsersDaoImpl extends JdbcTemplate implements UsersDao {
	
	public boolean authenticate(final String user, final String pass) {
		String proc = "auth";
		SimpleJdbcCall call = new SimpleJdbcCall(this);
		call = call.withProcedureName(proc);
		
		call.addDeclaredParameter(new SqlParameter("a", OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlParameter("b", OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlOutParameter("c", OracleTypes.VARCHAR));
		
		Map<String, Object> inp = new HashMap<String, Object>();
		inp.put("a", user);
		inp.put("b", pass);
		
		Map map = call.execute(inp);
		if (map.get("c").equals("success"))
			return true;
		return false;
	}
	
	/*
public ResultSet getSupervisorUserResults(String key, String coll_cd)
			throws SQLException {
		key = key.toUpperCase();
		String s = "SELECT DISTINCT s.user_id, s.user_name, s.cc_cd, b.cc_desc FROM sa_user_tab s, bl_coll_center_tab b WHERE (s.role_code LIKE 'SUP%' OR to_number(usr_level) >= 2) AND s.cc_cd = b.cc_cd AND b.cc_cd = '"
				+ coll_cd
				+ "' AND s.user_id LIKE '%"
				+ key
				+ "%' ORDER BY s.user_name";
		PreparedStatement ps = connection.prepareStatement(s);
		ResultSet rs = ps.executeQuery();

		return rs;
	}

*/
	
}
