package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Odd_Value_Array {

	static boolean insert(int n) {
		return n%2!=0;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter the value >>>>");
			int n = sc.nextInt();
			
			if(n==-1) {
				break;
			}
			
			if(insert(n)) {
				
				arr.add(n);
				System.out.println("Added in Array..");
			}else {
				System.out.println("Not added in Array bcz it is a even number..");
			}
			insert(n);
		}
		System.out.println("The Inserted Odd Array is: "+arr);
	}

}
