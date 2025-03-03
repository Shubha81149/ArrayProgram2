package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Second_Smallest_Element_In_Array {

	static void smallest(int[] a) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		
		int small = a[0];
		int secondsmall = a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<small) {
				small = a[i];
			}
			
		}	
		for(int i=0;i<a.length;i++) {
				
			if(a[i]>small && a[i]<secondsmall) {
				secondsmall = a[i];
				hs.add(secondsmall);
			}	
		}	
		System.out.println("Second Smallest Element in Array is: "+hs);
	}
	
	public static void main(String[] args) {

		int[] a = {4,5,2,3,4,2,8,2,3,4};
		System.out.println(Arrays.toString(a));
		
		smallest(a);

	}

}
