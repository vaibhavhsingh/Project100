package com.questionbank.core.logger;

import org.apache.log4j.spi.LoggingEvent;

import com.questionbank.core.context.Context;

public interface Logger {

	public void debug(Context ctx, String message);

	public void debug(Context ctx, String message, Throwable t);

	public void info(Context ctx, String message);

	public void info(Context ctx, String message, Throwable t);

	public void warn(Context ctx, Throwable t);

	public void warn(Context ctx, String message, Throwable t);

	public void warn(Context ctx, String message);

	public void error(Context ctx, Throwable t);

	public void error(Context ctx, String message, Throwable t);

	public void error(Context ctx, String message);

	public void callSpecificAppenders(LoggingEvent event);
}
