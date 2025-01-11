package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Reverse_Each_Element {

	static void reverse(int[] a) {

		HashSet<Integer> hs = new LinkedHashSet<>();
		int rev = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			while (a[i] != 0) {
				int r = a[i] % 10;
				rev = (rev*10) + r;
				a[i] /= 10;
			}
			hs.add(rev);
            rev = 0;
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {

		int[] a = { 123, 34, 567, 78};
		System.out.println(Arrays.toString(a));
		reverse(a);

	}

}
