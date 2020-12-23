package com.hackathon.Test_Hackathon;

public class Q_18 {

	public static void main(String[] args) {
		String str = "snowden";
		int cnt =0;
		char[] ch = str.toCharArray();
		System.out.println("duplicate characters are: ");
		for(int i=0;i<str.length();i++) {
			for(int j=i +1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
				System.out.print(ch[j]);
				cnt ++;
				break;
			}
		}

	}

}

}