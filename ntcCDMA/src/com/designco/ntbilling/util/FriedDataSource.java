package com.designco.ntbilling.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class FriedDataSource implements FactoryBean {

	private String username;
	private String password;
	private String url;
	private String driverClassName;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Object getObject() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection(url);
		String s = "SELECT user_name u, enc_dec(user_pass,'D') p FROM cbs_app_table";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(s);
		rs.next();
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername(rs.getString("u"));
		ds.setPassword(rs.getString("p"));
		rs.close();
		connection.close();
		
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		
		//System.out.println("NEW: " + ds.getUsername() + " - URL: "+ds.getUrl());
		return ds;
	}

	@Override
	public Class getObjectType() {
		return DriverManagerDataSource.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
