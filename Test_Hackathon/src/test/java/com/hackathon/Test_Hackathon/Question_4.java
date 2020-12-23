package com.hackathon.Test_Hackathon;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		String original,reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string/num to check if palindrome");
		original = sc.nextLine();
		int length = original.length();
		for(int i = length - 1;i>=0;i--)
		reverse = reverse+original.charAt(i);
		sc.close();
		if(original.contentEquals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		
		else
			System.out.println("Entered string/number is not a palindrome.");
	}

}
