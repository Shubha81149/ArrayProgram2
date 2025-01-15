package com.array;

import java.util.Arrays;

public class Minimum_Occur_Element {

	static void min(int[] a) {

		int mincount = Integer.MAX_VALUE;
		int ele = a[0];

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count < mincount) {

				mincount = count;
				ele = a[i];
			}
		}
		System.out.println("Minimum Occured Element is: " + ele + "-" + mincount);
	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));

		min(a);
	}

}
