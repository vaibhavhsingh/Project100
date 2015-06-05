package com.questionbank.core.logger.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.Document;

import com.questionbank.core.logger.LoggerFactory;

public class DefaultLoggerFactory implements LoggerFactory{
	
	public DefaultLoggerFactory() throws Exception{
		Resource resource = new ClassPathResource("log4j.xml");
		InputStream in = resource.getInputStream();
		init(in);
	}
	
	public void init(InputStream in) throws Exception {
		System.out.println("InputStream : "+in);
		String parsedString  = convertStreamToString(in);
		System.out.println(parsedString);
        DocumentBuilder docBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder() ;
        docBuilder.setEntityResolver(new LoggerEntityResolver());
        ByteArrayInputStream b = new ByteArrayInputStream(parsedString.getBytes());
        Document w3cDoc = docBuilder.parse(b,"http://localhost/log4j.dtd") ;
		DOMConfigurator.configure( w3cDoc.getDocumentElement());
	}

	private String convertStreamToString(InputStream in) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String temp = br.readLine();
		while(temp!=null) {
			sb.append(temp);
			temp = br.readLine();
		}
		
		return sb.toString();
	}
	
	public com.questionbank.core.logger.Logger getLogger(String name) {
		return new com.questionbank.core.logger.impl.Logger(name);
	}
}