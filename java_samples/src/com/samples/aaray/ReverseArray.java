package com.samples.aaray;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arr1= {1,4,5,33,44,55,78,9,58};
		System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.reverse());
		
		int[] arr2=reverseArray(arr1);
		for(int i=9 ; i>=0;i--)
			System.out.println(arr2);
		
	}

	private static int[] reverseArray(int[] arr1) {
		// TODO Auto-generated method stub
		return null;
	}

}
