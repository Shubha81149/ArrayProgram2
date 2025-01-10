package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sum_Even_Each_Element {

	static void even(int[] a) {

		HashSet<Integer> hs = new LinkedHashSet<>();
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {

			while (a[i] != 0) {

				int r = a[i]%10;
				
				if (r % 2 == 0) {
					sum += r;
				}
				a[i] /= 10;		
			}
			hs.add(sum);
			sum = 0;
		}
		
		System.out.println(hs);
	}

	public static void main(String[] args) {

		int[] a = { 123, 345, 456, 678 };
		System.out.println(Arrays.toString(a));
		even(a);

	}

}
