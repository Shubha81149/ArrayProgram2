package com.array;

import java.util.Arrays;

public class Print_Second_Last_Element {

	static void secondLast(int[] a) {

		int second = a[a.length-2];
		System.out.println("The Second element is: "+second);
		
	}

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 0, 5, 6, 7, 4 };
		System.out.println(Arrays.toString(a));

		secondLast(a);
	}

}
