package com.company.lecture14;

import java.util.Scanner;
//this code use BITWISE AND '&' operator to check whether a number is odd or not
//last bit 1 then odd else
// even if last bit last 0

public class Bitwise_check_odd_even {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int n=s.nextInt();
        System.out.println((isOdd(n)));
    }

    private static boolean isOdd(int n){
        return ((n&1)==1);
    }
}
