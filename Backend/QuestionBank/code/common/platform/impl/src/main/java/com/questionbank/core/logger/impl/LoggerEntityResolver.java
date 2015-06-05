package com.questionbank.core.logger.impl;

import java.io.IOException;
import java.net.URL;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class LoggerEntityResolver implements EntityResolver{

	public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
		
		URL url = this.getClass().getResource("/log4j.dtd");
		System.out.println("log4j.dtd URL:"+url);
		if(url!=null) {
			try {
				InputSource inputSource = new InputSource(url.toExternalForm());
				return inputSource;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
