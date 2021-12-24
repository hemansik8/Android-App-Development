package com.company;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=100; ++i) {
            sum = sum + i;
        }                                //end of  loop
        System.out.println("The sum of first 100 natural numbers is "+sum);


    }
}
