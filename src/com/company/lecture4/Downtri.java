package com.company.lecture4;

import java.util.Scanner;

public class Downtri {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int n=s.nextInt();
        int row=0;
        while(row<n){
            int col=0;
            while(col<n-row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;

        }

    }
}


//4
//        * * * *
//        * * *
//        * *
//        *