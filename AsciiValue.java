package com.company;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //taking input from user
        System.out.println("Enter a character");
        char chr = sc.next().charAt(0);
        System.out.println("ASCII value of " +chr+ " is: "+ (int)chr);



//      int s = 'a';
//      int t = 'C';
//      System.out.println("The ASCII value of a is: " + s);
//      System.out.println("The ASCII value of C is: " + t);
    }
}
