package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Add_Element_Two_Array {

	static void add(int[] a, int[] b) {

		HashSet<Integer> hs = new LinkedHashSet<>();

		int sum = 0;

		int length = a.length < b.length ? a.length : b.length;
		
		for(int i=0;i<length;i++) {
			
			sum = a[i]+b[i];
			hs.add(sum);
		}
		System.out.println("Addition of two array is: "+hs);
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		
//		int[] a = { 1, 2, 3, 4 };
//		int[] b = { 6, 7, 8, 9, 10 };
//		
//		int[] a = { 1, 2, 3, 4, 5 };
//		int[] b = { 6, 7, 8, 9};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		add(a, b);
	}

}
