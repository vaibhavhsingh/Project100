package com.questionbank.core.utils;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class FileUtils {
	public static void uploadFile(File file){
		
	}
	
	public static String getFileExtension(String fileName){
		return FilenameUtils.getExtension(fileName);
	}
	
	public static String getNewFileName(String inputFileName){
		String fileName = UniqueIdentifier.getUUIDStr() + "." + getFileExtension(inputFileName);
		return fileName;
	}
}
