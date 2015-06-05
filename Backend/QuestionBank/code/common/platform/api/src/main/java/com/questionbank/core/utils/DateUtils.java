package com.questionbank.core.utils;

import java.util.Date;

public class DateUtils {
	public static Date getTodaysDate() {
		Date dt = new Date();
		return dt;
	}

	public static java.sql.Date getSQLDate() {
		return new java.sql.Date(getTodaysDate().getTime());
	}
}
