package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Eelement_Morethan_Once {

	static void remove(int[] a) {

		HashSet<Integer> hs = new LinkedHashSet<>();

		for (int i = 0; i < a.length; i++) {

			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
				}
			}
			if (count == 1) {
				hs.add(a[i]);
			}
		}
		System.out.println("The Remove Element More Than Once is: " + hs);
	}

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 2, 5, 4 };
		System.out.println(Arrays.toString(a));
		remove(a);

	}

}
