package com.hackathon.Test_Hackathon;

public class Q_22 {

	public static void main(String[] args) {
		int inum = 111;
		String str = String.valueOf(inum);
		System.out.println(str);
		//output is: 555111 because the str is a string 
		//and the + would concatenate the 555 and str
		System.out.println(555+str);

	}

}
