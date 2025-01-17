package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime_Number_Print {

	static void prime(int[] a) {

		ArrayList<Integer> arr = new ArrayList<>();

		for(int i=0;i<a.length;i++) {
			
			if(isPrime(a[i])){
				
				arr.add(a[i]);	
			}	
		}
		System.out.println("The Prime Number in given Arrray is: " + arr);
	}

	static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] a = { 2, 1, 4, 5, 3, 6, 7, 8, 11, 10, 12, 15, 17, 21 };
		System.out.println(Arrays.toString(a));

		prime(a);
	}

}
