package com.array;

public class MissingELement_In_Sequencial_Array {

	static void missing(int[] a) {
		
		int n = a.length+1;
		int totalSum = n*(n+1)/2;
		int arrSum = 0;
		
		for(int num : a) {
			
			arrSum+=num;
		}
		int missing = totalSum-arrSum;
		System.out.println(missing);
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,6,7};// 1 to n
		missing(a);
	}

}
