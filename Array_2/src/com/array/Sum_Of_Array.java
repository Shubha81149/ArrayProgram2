package com.array;

import java.util.Arrays;

public class Sum_Of_Array {

	static void sum(int[] a) {
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
		}
		System.out.println("Sum Of an Array is: "+sum);
	}
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(a));

		sum(a);
	}

}
