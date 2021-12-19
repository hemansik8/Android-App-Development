package com.company;
import java.util.Scanner; //importing Scanner

public class NeonNumber {
    public static void main(String[] args) {
//Neon Number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: "); //input a number
        int n = input.nextInt();
        int square = n*n;
        int sum = 0;


        while(square > 0) {
            int rem = square % 10;
            sum = sum + rem;
            square /= 10;
        }

        if(n == sum) {
            System.out.println("Number is neon number");
        }
        else {
            System.out.println("Number is not neon number");
        }

    }
}
