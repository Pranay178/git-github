package com.company.lecture2;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class second {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int year=s.nextInt();
        if(year%4==0) {
            System.out.printf("leap year");
        }
        else{
            System.out.printf("not a leap year");
        }

    }



}
