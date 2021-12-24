package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      //taking input from user
        System.out.println(" Enter a number:");
        int a = sc.nextInt();
        int b = a;
        int sum = 0;
        while (a > 0){
            int digit = a % 10;
            int cube = digit * digit * digit;    //cube of each digit
            sum += cube;
            a /= 10;
        }                            //end of  loop
        if(sum == b) {
            System.out.println("Number is an Armstrong Number");
        } else {
            System.out.println("Number not armstrong");
        }
    }
}
