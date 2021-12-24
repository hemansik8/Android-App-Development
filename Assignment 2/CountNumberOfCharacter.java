package com.company;

import java.util.Scanner;

public class CountNumberOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String a = sc.next();
//        System.out.println(a.length());
        String a = "Whats up?";
        int count = 0;
        for(int i = 0; i < a.length(); i++) {   //counting characters in loop
            if(a.charAt(i) != ' ')
                count++;
        }                                       //end of loop
        System.out.println("The number of characters in above string: " + count);

    }
}
