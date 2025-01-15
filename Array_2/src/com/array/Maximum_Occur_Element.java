package com.array;

import java.util.Arrays;

public class Maximum_Occur_Element {

	static void max(int[] a) {

		int maxcount = 0;
		int ele = a[0];

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				ele = a[i];
			}
		}
		System.out.println("Maximum Occured Element is: " + ele + "-" + maxcount);
	}

	public static void main(String[] args) {

		int[] a = { 4, 6, 2, 7, 2, 5, 5, 2 };
		System.out.println(Arrays.toString(a));

		max(a);
	}

}
