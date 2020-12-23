package com.hackathon.Test_Hackathon;

public class Q_17And20 {

	public static void main(String[] args) {
		String str = "the@Fhsk&9djfi";
		int upper = 0,lower=0,number=0,special=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
					if(ch >='A' && ch <='Z')
					upper ++;
					else if(ch >='a' && ch <='z')
					lower ++;
					else if(ch >= '0' && ch <= '9')
					number++;
					else
						special++;
			
		}
		System.out.println("the upper case is : "+upper);
		System.out.println("the lower case is : "+lower);
		System.out.println("the number counted are : "+number);
		System.out.println("the special char are : "+special);
	}

}
