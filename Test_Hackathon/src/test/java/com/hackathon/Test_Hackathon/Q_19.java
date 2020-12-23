package com.hackathon.Test_Hackathon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q_19 {

	public static void main(String[] args) {
		String str = "my name is sunny";
		Map<Character,Integer> cha = new LinkedHashMap<>();
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(cha.containsKey(ch)) {
				cha.put(ch, cha.get(ch)+1);
			}
			else {
				cha.put(ch, 1);
				}
		}
		System.out.println(cha);
	}

}
