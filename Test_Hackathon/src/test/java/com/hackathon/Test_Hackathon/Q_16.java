package com.hackathon.Test_Hackathon;

public class Q_16 {
	private static String replaceChar (String str,char c) {
		if(str == null) {
			return null;
		}
		return str.replace(Character.toString(c),"");
	}

	public static void main(String[] args) {
		String str = "big boss";
		System.out.println(str);
		 str = replaceChar(str,'i');
		System.out.println(str);		 
		
	}

}
