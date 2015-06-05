package com.questionbank.core.logger.impl;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;

public class MyPatternLayout extends PatternLayout {

	public MyPatternLayout() {
		super(DEFAULT_CONVERSION_PATTERN);
		System.out.println("My PatternLayout");
	}

	public MyPatternLayout(String pattern) {
		super(pattern);
	}

	public PatternParser createPatternParser(String pattern) {
		PatternParser result;
		if (pattern == null)
			result = new MyPatternParser(DEFAULT_CONVERSION_PATTERN);
		else
			result = new MyPatternParser(pattern);

		return result;
	}
}
