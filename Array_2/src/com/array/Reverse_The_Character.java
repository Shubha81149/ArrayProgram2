package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_The_Character {

	static void reverse(char[] ch) {

		ArrayList<Character> arr = new ArrayList<>();

		for (int i = ch.length-1; i >= 0; i--) {

			arr.add(ch[i]);
		}
		System.out.println("Reversed Array is: "+arr);
	}

	public static void main(String[] args) {

		char[] ch = { 'u', 'u', 'p' };
		System.out.println(Arrays.toString(ch));

		reverse(ch);
	}
}
