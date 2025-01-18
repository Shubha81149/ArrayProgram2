package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_Odd_Index_Value {

	static void oddIndex(int[] a) {

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			if (i % 2 != 0) {

				arr.add(a[i]);
			}
		}
		System.out.println("Even Elements are: " + arr);
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(a));

		oddIndex(a);
	}

}
