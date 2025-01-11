package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Reverse_Array {

	static void reverse(int[] a) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=a.length-1;j>=0;j--) {
				hs.add(a[j]);
			}
		}
		System.out.println("The Reverse Array is: "+hs);
	}
	
	public static void main(String[] args) {
		
		int[] a = {123,4,56,6788};
		System.out.println(Arrays.toString(a));
		reverse(a);
	}

}
