package com.company;

import java.util.Scanner;

public class CompareTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //taking input from user
        System.out.println("Enter any 2 numbers" + " ( Press Enter after each number)");
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a==b) {
            System.out.println("True");  // both numbers are equal
        } else {
            System.out.println("False"); // both numbers are unequal

        }


    }
}
