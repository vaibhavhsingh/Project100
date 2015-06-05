package com.questionbank.core.logger.impl;

import org.apache.log4j.Category;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggingEvent;

public class MyEvent extends LoggingEvent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1541744429501740501L;
	public String userId;

	public MyEvent(String fqOfCategoryClass,Category logger, Priority level, Object message, Throwable t,String userId) {
		super(fqOfCategoryClass,logger,level,message,t);
		this.userId = userId!=""?userId:"N/A";
	}
}
