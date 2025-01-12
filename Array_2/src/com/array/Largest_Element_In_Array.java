package com.array;

import java.util.Arrays;

public class Largest_Element_In_Array {

	static int[] largest(int[] a) {
		
		int large = a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>large) {
				large = a[i];	
			}
		}
		int[] l = {large}; 
		return l;
	}
	
	public static void main(String[] args) {
		
		int[] a = {6,2,4,8,9,1,3,10,5,6,7,3,2};
		System.out.println(Arrays.toString(a));
		
		int[] large = largest(a);
		System.out.println("Largest Element in Array is: "+Arrays.toString(large));
	}

}
