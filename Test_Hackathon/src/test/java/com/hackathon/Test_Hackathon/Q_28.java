package com.hackathon.Test_Hackathon;

import java.util.Scanner;

public class Q_28 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");

		int num = scanner.nextInt();

		int factorial = fact(num);
		System.out.println("Factorial of entered number is: " + factorial);
		scanner.close();
	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}

		output = fact(n - 1) * n;
		return output;
	}
}
