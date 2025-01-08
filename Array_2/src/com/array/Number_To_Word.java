package com.array;

import java.util.Scanner;

public class Number_To_Word {

	static void convert(int n, String s) {
		
		String[] one = {"","One","Two","Three","Four","Five","Six","Seven",
				        "Eight","Nine","Ten","Eleven","Tweleve","Thirteen",
				        "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
				        "Ninteen"};
		String[] two = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
				        "Eighty","Ninty"};
		
		if(n<=19) {
			
			System.out.print(one[n]);
		}else {
			
			System.out.print(two[n/10]+""+one[n%10]);
		}
		if(n!=0)
	    	System.out.print(s);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int n = sc.nextInt();
		convert(n/10000000, "Core");
		convert((n/100000)%100, "Lakh");
		convert((n/1000)%100, "Thousand");
		convert((n/100)%10, "Hundread");
		convert(n%100,"");
		
	}

}

