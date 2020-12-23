package com.hackathon.Test_Hackathon;

public class Q_6 {
	void sort (int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n;j++)
				if (arr[j]<arr[min])
					min = j;
			int temp = arr[min];
			 arr[min]=arr[i];
			 arr[i]= temp;
					
		}
			
	}
	void printArray (int arr[]) {
		int n = arr.length;
		for (int i = 0; i<n; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
			
	}

     public static void main(String[] args) {
    	 Q_6 obj = new Q_6();
    	 int arr[]= {34,65,47,689,43};
    	 obj.sort(arr);
    	 System.out.println("The Elements in Assening order are as follows");
    	 obj.printArray(arr);
    	 
		
	}

}
