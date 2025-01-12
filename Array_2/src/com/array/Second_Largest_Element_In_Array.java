package com.array;

import java.util.Arrays;

public class Second_Largest_Element_In_Array {

  static int[] smallest(int[] a) {
		
		
		int large = a[0];
		int secondlarge = a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>large) {
				large = a[i];
			}
			
		}	
		for(int i=0;i<a.length;i++) {
				
			if(a[i]<large && a[i]>secondlarge) {
				secondlarge = a[i];
			}	
		}
		int[] result = {secondlarge};
		return result;
	}
	
	public static void main(String[] args) {

		int[] a = {4,5,2,3,6,4,2,8,2,3,4};
		System.out.println(Arrays.toString(a));
		
		int[] large = smallest(a);
		System.out.println("Second Largest Element in Array is: "+Arrays.toString(large));
	}


}
