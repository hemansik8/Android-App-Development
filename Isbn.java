package com.company;
import java.util.Scanner; //importing Scanner

public class Isbn {
    public static void main(String[] args) {
//ISBN number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: "); //input a number(most likely a 10 digit number)
        long n = input.nextLong();

        int sum = 0;
        long x = n;
        for (int i=1; i<=10; i++){
            sum+=(x%10)*i;
            x=x/10;
        }

        if (sum%11==0){
            System.out.println("Valid ISBN Number.");
        } else  {
            System.out.println("Invalid ISBN Number.");
        }

    }
}