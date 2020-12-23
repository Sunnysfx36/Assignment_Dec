package com.hackathon.Test_Hackathon;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		String initial,reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		initial = sc.nextLine();
		int length = initial.length();
		for(int i =length - 1;i>=0;i--)
			reverse = reverse + initial.charAt(i);
		sc.close();
		System.out.println("reverse str is " + reverse );
		
				
		

	}

}