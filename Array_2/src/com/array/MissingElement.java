package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MissingElement {

	public static void missing(int[] a) {

		HashSet<Integer> hs = new LinkedHashSet<>();

		for (int i = a[0]; i <= a[a.length-1]; i++) {

			boolean flag = false;

			for (int n : a) {

				if (i == n) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				hs.add(i);
			}
		}
		System.out.println(hs);

	}

	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 10, 17 };

		System.out.println(Arrays.toString(a));
		missing(a);

	}

}
