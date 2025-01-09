package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Delete_2nd_Index {

	static void delete(int[] a, int index) {

		HashSet<Integer> hs = new LinkedHashSet<>();

		for (int i = 0; i < a.length; i++) {

			if (i == index)
				continue;
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Index What you want to Delete ?");
		int index = sc.nextInt();

		delete(a, index);
	}

}
