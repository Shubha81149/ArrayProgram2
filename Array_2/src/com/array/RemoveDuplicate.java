package com.array;

import java.util.Arrays;

public class RemoveDuplicate {
    static int[] removeDuplicates(int[] a) {
    	
        int n = a.length;
      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
          
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                    j--; 
                }
         
            }
            System.out.print(a[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 2, 5, 4, 3};
        System.out.println("Original array: " + Arrays.toString(a));

         removeDuplicates(a); 
         

    }
}
