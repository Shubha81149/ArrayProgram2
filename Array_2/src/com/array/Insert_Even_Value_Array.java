package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Even_Value_Array {

	static boolean insert(int n) {

		return n % 2 == 0; 
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
		    
			System.out.println("Enter The Value >>>>>");
		    int n = sc.nextInt();
		  
		    if(n == -1) {
				break;
			}
		    if (insert(n)) {

				arr.add(n);
				System.out.println("The Value Will be Added The Array is");
			} else {
				System.out.println("Put The Even Number to Add Array it is a Odd Number SO it will not added..");
			}
	     insert(n);
		}
		System.out.println("The Even Array is: "+arr);
	}

}
