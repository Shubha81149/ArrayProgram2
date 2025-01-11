package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_0_Into_1 {

	// convert 0 into -1 and -1 into 0;
	
	static void convert(int[] a) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == 0) {
				
				a[i]=-1;
				al.add(a[i]);
				
			}else if(a[i] == -1) {
				
				a[i] = 0;
				al.add(a[i]);
			}else {
			   al.add(a[i]);
			}
		}
		System.out.println("The Converted Array is: "+al);
	}
	
	public static void main(String[] args) {
		
		int[] a = {0,2,-1,0,2,-1,3};
		System.out.println(Arrays.toString(a));
		convert(a);

	}

}
