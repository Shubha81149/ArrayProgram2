package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Merge_Two_Array {

	static void merge(int[] a,int[] b) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		int[] c = new int[a.length + b.length];
		
		for(int i =0;i<a.length;i++) {
			c[i] = a[i];
		}
		
		for(int j =0;j<b.length;j++) {
			c[a.length+j] = b[j];
		}
		
		for(int n : c) {
			hs.add(n);
		}
		System.out.println("Merged are is: "+hs);
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		merge(a,b);

	}

}
