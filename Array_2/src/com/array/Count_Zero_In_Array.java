package com.array;

import java.util.Arrays;

public class Count_Zero_In_Array {
	
	static void count(int[] a) {
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
		
			if(a[i]==0) {
				count++;
			}
		}
		System.out.println("The Zeros are present in an Array is: "+count);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,6,3,0,2,0,7,0,5,0};
		System.out.println(Arrays.toString(a));
		
		count(a);
	}

}
