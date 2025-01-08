package com.array;

public class MissingElement_In_Two_Array {

	static void missing(int[] a, int[] b) {

		int result = 0;
		for (int num : a) {

			result ^= num;
		}
		for (int num : b) {
			result ^= num;
		}
		System.out.println(result);

	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 6, 7 };
		int[] b = { 2, 3, 6, 7 };

		missing(a, b);

	}

}
