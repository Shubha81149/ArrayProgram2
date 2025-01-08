package com.array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DistinctElement_In_Two_Array {

	static void distinct(int[] a, int[] b) {
          
		HashSet<Integer> hs = new LinkedHashSet<>();
		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		for(int num : a) {
			hs1.add(num);
		}
		for(int num : b) {
			hs2.add(num);
		}
		
		HashSet<Integer> rem1 = new HashSet<>(hs1);
		HashSet<Integer> rem2 = new HashSet<>(hs2);
		
		rem1.removeAll(hs2);
		rem2.removeAll(hs1);
		
		rem1.addAll(rem2);
		
		int[] disti = new int[rem1.size()];
		int i =0;
		
		for(int n : rem1) {
			disti[i++] = n;
			
		}
		
		for(int number : disti) {
			hs.add(number);	
		}
		System.out.print(hs);
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 6 };
		int[] b = { 2, 5, 8, 9, 3, 1 };
		distinct(a, b);
	}

}
