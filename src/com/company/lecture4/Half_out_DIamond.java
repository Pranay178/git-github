package com.company.lecture4;

import java.util.Scanner;

public class Half_out_DIamond {
    public static void halfDia(int n) {
        int rowmirr = 0;
        int row = 0;
        while (row < 2 * n - 1) {
            int col = 0;
            while (col < n - rowmirr) {
                System.out.print(rowmirr+col+1 +" ");
                col++;
            }
            System.out.println();
            if (row < n - 1) {
                rowmirr++;
            } else {
                rowmirr--;
            }
            row++;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int n=s.nextInt();
        halfDia(n);

    }

}


//4
//        * * * *
//        * * *
//        * *
//        *
//        * *
//        * * *
//        * * * *