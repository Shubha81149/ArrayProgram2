package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Square_Of_Each_Element {

	static void square(int[] a) {
		
		ArrayList<Integer> al = new ArrayList<>();
		int mul = 1;
		
		for(int i=0;i<a.length;i++) {
			
			mul = a[i]*a[i];
			al.add(mul);
		}
		System.out.println("Square of Each Element is: "+al);
	}
	
	public static void main(String[] args) {
		
		int[] a = {4,6,2,7,5};
		System.out.println(Arrays.toString(a));
		
		square(a);

	}

}
