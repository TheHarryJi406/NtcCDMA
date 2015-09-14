package com.designco.ntbilling.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CopyOfRoleDao {
	@Transactional
	public void save(String code, String desc, HttpSession session);

	@Transactional
	public void update(String code, String desc, HttpSession session);

	@Transactional
	public void delete(String code, HttpSession session);

	@Transactional
	public List getByCode(String code);

	@Transactional
	public List getAll();
}
