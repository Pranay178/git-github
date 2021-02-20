package com.company.lecture6;

import java.util.Arrays;
import java.util.Scanner;

//


public class Array {
//    this code is for adding u at last postion

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] alaphabets = new char[5];
//       loop for taking four characters in charcater array
        for (int i = 0; i < alaphabets.length-1; i++) {
            alaphabets[i] =s.next().charAt(0);

        }

        alaphabets[4]='u';
//        intialising u at last position or index
        System.out.println(alaphabets);
        System.out.println(Arrays.toString(alaphabets));

        int [] nums = {1 ,2,3 ,4 ,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(alaphabets[i]);

        }

    }



















}
