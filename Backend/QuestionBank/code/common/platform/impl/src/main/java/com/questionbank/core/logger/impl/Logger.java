package com.questionbank.core.logger.impl;

import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggingEvent;

import com.questionbank.core.context.Context;

public class Logger extends org.apache.log4j.Logger implements
		com.questionbank.core.logger.Logger {

	public Logger(String name) {
		super(name);
	}

	@SuppressWarnings("deprecation")
	public void debug(Context ctx, String message) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(super.getName(), this, Priority.DEBUG,
				message, null, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void debug(Context ctx, String message, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(super.getName(), this, Priority.DEBUG,
				message, t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void info(Context ctx, String message) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.INFO, message, null, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void info(Context ctx, String message, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.INFO, message, t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void warn(Context ctx, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.WARN, "", t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void warn(Context ctx, String message, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.WARN, message, t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void warn(Context ctx, String message) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.WARN, message, null, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void error(Context ctx, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.ERROR, "", t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void error(Context ctx, String message, Throwable t) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.ERROR, message, t, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("deprecation")
	public void error(Context ctx, String message) {
		String userId = "";
		if (ctx != null)
			userId = ctx.getContextId();
		MyEvent event = new MyEvent(this.getClass().getName(), this,
				Priority.ERROR, message, null, userId);
		callSpecificAppenders(event);
	}

	@SuppressWarnings("rawtypes")
	public void callSpecificAppenders(LoggingEvent event) {
		Enumeration logAppenders = null;
		org.apache.log4j.Logger logger = LogManager.getLogger("fxLogger");
		logAppenders = logger.getAllAppenders();
		while (logAppenders.hasMoreElements()) {
			Appender appender = (Appender) logAppenders.nextElement();
			appender.doAppend(event);
		}
	}

}
