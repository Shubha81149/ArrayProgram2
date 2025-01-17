package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Consonant {

	static void consonant(char[] ch) {

		ArrayList<Character> arr = new ArrayList<>();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && 
				ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A' &&
				ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' &&
				ch[i] != 'U') 
			{
				if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
					arr.add(ch[i]);
				}
			}
		}
		System.out.println("The Vowels are: " + arr);
	}

	public static void main(String[] args) {

		char[] ch = { 'd', 'a', 'e', 's', 'r', 'i', '@', 'A' , 'S'};
		System.out.println(Arrays.toString(ch));

		consonant(ch);
	}

}
