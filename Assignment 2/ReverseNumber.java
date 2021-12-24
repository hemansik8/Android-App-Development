package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //taking input from user
        System.out.println("Enter a number");
        int b = sc.nextInt(), reverse = 0;
        while (b !=0) {
            int x = b % 10; // remainder or the last digit
            reverse = (reverse * 10) + x;  //reversed number
            b = b / 10;
                   }                         //end of loop
        System.out.println("Reversed number is " + reverse);

    }
}