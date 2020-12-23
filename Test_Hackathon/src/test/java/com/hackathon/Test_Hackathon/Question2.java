
package com.hackathon.Test_Hackathon;

import java.util.Scanner;

public class Question2 {
    static int factorial(int n) {
    	
    	int mul = 1;
    	for(int i = 1; i <= n; i++)
  		  mul = mul * i;
    	return mul;
    }
	public static void main(String[] args) {
		  
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter any integer:");
		  int n = s. nextInt();
		  int fact = factorial(n);
		  
		  
		  System. out. println("Factorial of "+ n +" is " +fact);
		  s.close();
		 

	}

}
