package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Value_In_Index {
	
	static void insert(int[] a,int index, int value) {
		
		int[] b = new int[a.length+1];
		
		for (int i = 0; i < index; i++) {
			
			 b[i] = a[i];
			 
		}
		b[index] = value;
		for(int i=index;i<a.length;i++) {
			b[i+1] = a[i];
		}
		System.out.println(Arrays.toString(b));
		
//		int[] b = new int[a.length + 1];
//
//        for (int i = 0, j = 0; i < b.length; i++) {
//            if (i == index) {
//               
//                b[i] = value;
//            } else {
//               
//                b[i] = a[j];
//                j++;
//            }
//        }
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,6,7};
		System.out.println(Arrays.toString(a));
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a The Index Where you want to insert ?");
		int index = sc.nextInt();
		System.out.println("Enter a The Value What you want to insert ?");
		int value = sc.nextInt();
		insert(a,index,value);
	}

}
