package com.questionbank.core.logger.impl;

import org.apache.log4j.helpers.FormattingInfo;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.spi.LoggingEvent;

public class MyPatternParser extends PatternParser {

	private static final char USER_ID = 'u';

	public MyPatternParser(String pattern) {
		super(pattern);
	}

	public void finalizeConverter(char formatChar) {
		PatternConverter pc = null;
		switch (formatChar) {
		case USER_ID:
			pc = new UserPatternConverter(formattingInfo);
			currentLiteral.setLength(0);
			addConverter(pc);
			break;
		default:
			super.finalizeConverter(formatChar);
		}
	}

	private static abstract class MyPatternConverter extends PatternConverter {
		MyPatternConverter(FormattingInfo formattingInfo) {
			super(formattingInfo);
		}

		public String convert(LoggingEvent event) {
			String result = null;
			MyEvent appEvent = null;

			if (event instanceof MyEvent) {
				appEvent = (MyEvent) event;
				result = convert(appEvent);
			}
			return result;
		}

		public abstract String convert(MyEvent event);
	}

	private static class UserPatternConverter extends MyPatternConverter {

		UserPatternConverter(FormattingInfo formattingInfo) {
			super(formattingInfo);
		}

		public String convert(MyEvent event) {
			return event.userId;
		}
	}
}