package com.company.lecture14;



import java.util.Scanner;
//this code return number of set bits in binary equivalent of entered number
//using ">>" operator

public class Set_Bits_Count {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER");
        int n=s.nextInt();
        System.out.println(isSet(n));

    }
    private static int isSet(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1)
                cnt++;
                n=n >> 1;



        }

        return cnt;
    }
}
