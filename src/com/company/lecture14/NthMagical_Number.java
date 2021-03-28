package com.company.lecture14;

import java.util.Scanner;
//Nth Magical number is a number which is either power of 5
// or sum of power of 5 (excluding 5^0=1)
//

public class NthMagical_Number {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int n=s.nextInt();
        System.out.println(magic(n));

    }

    private static int magic(int n){
        int place=5,res=0;
        while(n>0){
            if((n&1)==1){
                res=res+place;
            }
            place*=5;
            n=n>>>1;
        }
        return res;
    }
}
