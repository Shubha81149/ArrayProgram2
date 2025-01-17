package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Add_Odd_Number_Array {

	static void sumOdd(int[] a) {

		ArrayList<Integer> arr = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				sum += a[i];
			}
		}
		System.out.println("Sum of Odd elemnet is: " + sum);
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,6,7,9,5,0};
		System.out.println(Arrays.toString(a));
		
		sumOdd(a);

	}

}
