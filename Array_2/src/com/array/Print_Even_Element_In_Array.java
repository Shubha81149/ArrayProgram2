package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Print_Even_Element_In_Array {

	static void even(int[] a) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				hs.add(a[i]);
			}
		}
		System.out.println("Even Elements are: "+hs);
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,2,5,4};
        System.out.println(Arrays.toString(a));
        
        even(a);
	}

}
