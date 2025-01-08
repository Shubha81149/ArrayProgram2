package com.array;

public class MissingElement_In_Unoreder_Array {

	static void missing(int[] a) {

		int n = a.length + 1;

		int x = 0;
		for (int i = 1; i <= n; i++) {

			x ^= i;
		}
		int y = 0;
		for (int num : a) {

			y ^= num;
		}
		int result = x^y;
		System.out.println(result);
	}

	public static void main(String[] args) {

		int[] a = { 4, 7, 2, 8, 5, 1, 3 };// The Array should be Started at 1 to n
		missing(a);
	}

}
