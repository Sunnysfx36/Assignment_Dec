package com.hackathon.Test_Hackathon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q_15 {

	public static void main(String[] args) {
		String str = "Quitar is a instrument and piano is a instrument";
		String [] strArr = str.split("\\s+");
		Map <String,String> hmap  = new LinkedHashMap <String,String>();
		for(int i = 0; i < strArr.length; i++) {
			if(!hmap.containsKey(strArr[i])){
				hmap.put(strArr[i],"unique");
				
			}
		}
		
		
		System.out.println(hmap);
				

	}

}
