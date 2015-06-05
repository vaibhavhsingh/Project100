package com.questionbank.core.utils;

import java.util.StringTokenizer;

import com.eaio.uuid.UUID;

public class UniqueIdentifier {
	public synchronized static String getUUIDStr() {
		UUID u = new UUID();
		String s = u.toString();
		StringTokenizer st = new StringTokenizer(s,"-");
		StringBuffer sb= new StringBuffer();
		while(st.hasMoreTokens()){
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
}
