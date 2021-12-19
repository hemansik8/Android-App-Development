package com.company;

import java.util.Scanner; //importing Scanner

public class Armstrong {

    public static void main(String[] args) {
//Armstrong Number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:"); //input a number
        int n = input.nextInt();
        int n1 = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            n = n / 10;
        }
        if (sum == n1) {
            System.out.println("Number is an armstrong number");
        } else {
            System.out.println("Number is not an armstrong number");
        }

    }
}
