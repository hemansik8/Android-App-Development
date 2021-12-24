package com.company;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] a = new int[] {12,23,34,45,56,67};  //array (2d)
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)             // largest number
                max = a[i];
        }                              //end of  loop
        System.out.println("Largest element in the Array is "+ max);

    }

}
