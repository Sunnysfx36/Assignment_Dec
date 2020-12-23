package com.hackathon.Test_Hackathon;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		int size, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Number of Elements");
	    size = sc.nextInt();
		int array[] = new int [size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
				
		}
		for(int i=0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]= temp;
					
				}
			}
		}
		sc.close();
		System.out.println("Elements Entered after Sorting Are :");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+",");
		}
		}
	}


