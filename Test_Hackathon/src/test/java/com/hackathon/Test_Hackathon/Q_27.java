package com.hackathon.Test_Hackathon;

import java.util.Arrays;

public class Q_27 {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 1, 6, 4,7};
		System.out.println("arrays before sorting " + Arrays.toString(a));
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("arrays after sorting " + Arrays.toString(a));


	}
}
