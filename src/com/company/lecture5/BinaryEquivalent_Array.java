package com.company.lecture5;

import java.util.Scanner;
// code to print binary equivalent of an enter decimal number using array

public class BinaryEquivalent_Array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num");
        int arr[]=new int[100];
        int c=0;
        int n=s.nextInt();
        while(n/2!=0){
            arr[c++]=n%2;
            n=n/2;
        }
        arr[c++]=n%2;
        int i=c-1;
        while(i>=0){
            System.out.print(arr[i]);
            i--;

        }
































    }

}
