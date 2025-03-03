package com.array;

import java.util.Arrays;

public class Count_Each_Element {

	static void count(int[] a) {

		int count = 0;
		boolean[] flag = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {

			if (flag[i]) {
				continue;
			}

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
					flag[j] = true;
				}
			}
			System.out.println("Each Occured Element in Array is: " + a[i] + "-" + count);
            count = 0;
		}
	}

	public static void main(String[] args) {

		int[] a = { 2, 5, 4, 3, 6, 5, 3, 2 };
		System.out.println(Arrays.toString(a));

		count(a);
	}

}
