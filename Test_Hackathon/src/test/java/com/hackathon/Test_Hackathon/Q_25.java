package com.hackathon.Test_Hackathon;

public class Q_25 {
	int binarysearch (int arr[],int l,int r,int x) {
		
	if (r>=l) {	
		int mid = l+(r-1)/2;
		if (arr[mid]==x) 
		return mid;
		if(arr[mid]>x)
		return binarysearch (arr,l,mid-1,x);
		return binarysearch (arr,mid+1,r,x);
				
		}
	return -1;
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		Q_25 ob = new Q_25();
		int arr[] = {23,45,76,78,45};
		int n = arr.length;
		int x = 78;
		int result = ob.binarysearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result);
	}


}
