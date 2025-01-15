package com.array;

import java.util.Arrays;

public class Print_LastIndex_Element {

	static void last(int[] a) {
		
		int k = a.length-1;
		
		System.out.println("The Last Element of Array is: "+a[k]);
	}
	
	public static void main(String[] args) {
		
		int[] a = { 2, 5, 4, 3, 6, 5, 3, 1};
		System.out.println(Arrays.toString(a));

		last(a);

	}

}
