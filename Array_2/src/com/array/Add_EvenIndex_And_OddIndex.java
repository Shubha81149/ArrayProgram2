package com.array;

import java.util.Arrays;

public class Add_EvenIndex_And_OddIndex {

	static void sumIndex(int[] a) {

		int sum = 0;
		int add = 0;
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				sum += a[i];
			}
			else{
				add += a[i];
			}
		}
		System.out.println(sum + "(Sum of Even Index)" + add + "(Sum of Odd Index)");
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(a));

		sumIndex(a);
	}

}
