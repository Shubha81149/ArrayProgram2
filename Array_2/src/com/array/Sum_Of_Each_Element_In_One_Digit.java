package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum_Of_Each_Element_In_One_Digit {

	static void sumEach(int[] a) {

		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			
			int sum = 0;
			
			while (a[i] > 0 || sum >= 10) {
				
				if(a[i] == 0) {
					
					a[i] = sum;
					sum = 0;
				}
				int r = a[i] % 10;
				sum += r;
				a[i] /= 10;
			}
			al.add(sum);
		}
		System.out.println("Sum of each element in single digit is: " + al);
	}

	public static void main(String[] args) {

		int[] a = { 23, 55, 564, 34, 5};
		System.out.println(Arrays.toString(a));
		sumEach(a);
	}

}
