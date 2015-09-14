package com.designco.ntbilling.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public interface SequenceDao {
	//public void save(String supervisor, String operator, String cc_cd,Integer start, Integer end, String trans_time,HttpSession session);
//	public void save();
	public String saveSequences(String[] supervisors, String[] centers, String[] operators,
			String[] dates, String[] starts, String[] ends,HttpSession session) throws SQLException ;
	public List getByCollOptTransDate(String operCode,String ccCode);
	public List getByOprSeq(String oprSeq);

	public Map getSupervisorNo(String colCenCode, String userId);
	public void update(int oprSeq);
}
