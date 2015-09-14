package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import oracle.jdbc.driver.OracleTypes;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class SequenceDaoImpl extends JdbcTemplate implements SequenceDao {

	@Override
	public String saveSequences(String[] supervisors, String[] centers,
			String[] operators, String[] dates, String[] starts, String[] ends,
			HttpSession session) throws SQLException {
		try {
			// UtilityDao utilityDao = (UtilityDao)
			// Context.get().getBean("utilityDao");
			String user = session.getAttribute("username").toString();
			for (int i = 0; i < supervisors.length; i++) {
				String supervisor = supervisors[i];
				String center = centers[i];
				String operator = operators[i];
				String date = dates[i];
				Integer start = Integer.parseInt(starts[i]);
				Integer end = Integer.parseInt(ends[i]);
				saveSequence(supervisor, operator, center, start, end, date,
						user);
			}
			return "Supervisor sequence saved.";
		} catch (Exception ex) {
			ex.printStackTrace();
			return ex.getMessage();
		}

	}

	private void saveSequence(String supervisor, String operator,
			String ccCode, Integer start, Integer end, String transTime,
			String userId) throws SQLException {

		String sql = "insert into m_sequence_tab (sup_cd, seq_val, opr_cd, cc_cd, sup_seq, trans_time, "
				+ "user_id,no_of_seq, sup_end_seq, last_upd_dt, opr_seq, printer_type,report_id) values"
				+ " (?,?,?,?,?,cmmn1.to_ad(?),?,?,?,sysdate,?,?,?)";

		this.update(sql, new Object[] { supervisor, 0, operator, ccCode, start,
				transTime, userId, (end - start) + 1, end,
				// "sysdate",
				getSupervisorSequence(), "dsf", "dsfsd" });

	}

	@Override
	public List getByCollOptTransDate(String operCode, String ccCode) {
		String sql = "select * from m_sequence_tab where opr_cd=? and cc_cd=? and trunc(trans_time)=trunc(sysdate) ";
		return this.queryForList(sql, new Object[] { operCode, ccCode });
	}

	@Override
	public List getByOprSeq(String oprSeq) {
		String sql = "select * from m_sequence_tab where opr_seq=?";
		return this.queryForList(sql, new Object[] { oprSeq });
	}

	@Override
	public Map getSupervisorNo(String colCenCode, String userId) {
		String proc = "get_sup_sequence";
		SimpleJdbcCall call = new SimpleJdbcCall(this);
		call = call.withProcedureName(proc);

		call.addDeclaredParameter(new SqlParameter("iv_coll_cnt_cd",
				OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlParameter("iv_user_id",
				OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlOutParameter("ov_flag",
				OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlOutParameter("on_last_seq",
				OracleTypes.NUMBER));
		call.addDeclaredParameter(new SqlOutParameter("on_sup_seq",
				OracleTypes.NUMBER));
		call.addDeclaredParameter(new SqlOutParameter("on_seq_opr",
				OracleTypes.VARCHAR));
		call.addDeclaredParameter(new SqlOutParameter("on_seq_val",
				OracleTypes.NUMBER));

		Map<String, Object> inp = new HashMap<String, Object>();
		inp.put("iv_coll_cnt_cd", colCenCode);
		inp.put("iv_user_id", userId);

		Map map = call.execute(inp);
		// System.out.println(map.get("on_seq_opr"));
		/*
		 * if (map.get("OV_FLAG").equals("1")){ return null; }
		 */
		return map;

		// System.out.println(map);

	}

	/*
	 * @Override public void save(String supervisor, String operator, String
	 * cc_cd, Integer start, Integer end, String trans_time, HttpSession
	 * session) { UtilityDao utilityDao = (UtilityDao) Context.get()
	 * .getBean("utilityDao"); String getEngDateTrans =
	 * utilityDao.getEnglishDate(trans_time); String user =
	 * session.getAttribute("username").toString(); String sql =
	 * "insert into m_sequence_tab (sup_cd, seq_val, opr_cd, cc_cd, sup_seq, trans_time, "
	 * +
	 * "user_id,no_of_seq, sup_end_seq, last_upd_dt, opr_seq, printer_type,report_id) values"
	 * + " (?,?,?,?,?,trunc(to_date('"+getEngDateTrans+
	 * "','YYYY-MM-DD') ),?,?,?,sysdate,?,?,?)";
	 * 
	 * this.update(sql, new Object[] { supervisor, 0, operator, cc_cd, start, //
	 * transDate, user, (end - start) + 1, end, // "sysdate",
	 * getSupervisorSequence(), "dsf", "dsfsd" });
	 * 
	 * }
	 */

	private String getSupervisorSequence() {
		String sql = "select lpad(sup_seq.nextval,9,0) sss from dual";
		List lst = this.queryForList(sql);
		Map m = (Map) lst.get(0);
		// return Integer.parseInt(m.get("SSS").toString());
		return m.get("SSS").toString();
	}

	@Override
	public void update(int oprSeq) {
		String sql = " update M_SEQUENCE_TAB set seq_val=(seq_val+1), sup_seq=(sup_seq+1) where opr_seq=? ";
		this.update(sql, new Object[] { oprSeq });

	}

}
