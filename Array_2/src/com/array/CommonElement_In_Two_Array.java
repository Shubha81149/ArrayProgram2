package com.array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CommonElement_In_Two_Array {

	static void common(int[] a,int[] b) {
		
		HashSet<Integer> hs = new LinkedHashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		for(int m : a) {
			hs1.add(m);
		}
		for(int n : b) {
			hs2.add(n);
		}
		
		HashSet<Integer> commEle = new HashSet<>(hs1);
		commEle.retainAll(hs2);
		
		hs.addAll(commEle);
		System.out.println(hs);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		int[] b = {4,5,6,7,8,9};
		
		common(a,b);

	}

}

//         HashSet<Integer> rem1 = new HashSet<>(hs1);
//         rem1.removeAll(hs2);
//         hs.add(rem1);
//         
//         HashSet<Integer> rem1 = new HashSet<>(hs2);
//         rem1.removeAll(hs1);
//         hs.add(rem2);