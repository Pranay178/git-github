package com.company.self_learning;

import java.util.Scanner;

public class DFghj {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;


        int row = 1;
         int rowmirr =n/2;
        while (row <= 2*n-1) {
            if(row<rowmirr){
                c=row;
            }
            else{
                c=rowmirr;
                rowmirr--;
            }

            int col = 0;
            while (col < n) {
                if(c<=n){
                    System.out.print(c++ + " ");
                }
                else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}