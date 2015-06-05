package com.questionbank.core.logger.impl;

import com.questionbank.core.StaticContextAccessor;

public class LogUtils {

	public static com.questionbank.core.logger.Logger getLogger(String name) {
		return StaticContextAccessor.getBean(DefaultLoggerFactory.class).getLogger(name);
	}
}
