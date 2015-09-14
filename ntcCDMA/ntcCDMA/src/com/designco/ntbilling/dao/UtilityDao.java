package com.designco.ntbilling.dao;


public interface UtilityDao {
	public String getDateTime() ;
	public String getTime() ;
	public String formatToOracle(String englishDate);
	public String getTodaysDate();
	public String getTimeForWs();
	public String getSoDate();
	public String getTodaysDateNepali();
	public String getNepaliDate(String date);
	public String getEnglishDate(String nepaliDate);
	public String getDateAndTime() ;
	public String getDateAndTime200();
	public String getNepaliMonth();
	public String getNepaliYear();
	public String getYear();
	public String getMonth();
	public String inWord(String amt);
}
