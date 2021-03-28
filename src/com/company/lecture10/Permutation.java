package com.company.lecture10;

import java.util.Scanner;

public class Permutation {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("daalo");
        String str=s.next();
        permut("",str);
    }

    public static void permut(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=unproc.charAt(0);
        unproc=unproc.substring(1);



        for(int i=0;i<=proc.length();i++){

            String first=proc.substring(0,i);
            String second=proc.substring(i);
            permut(first+ch+second,unproc);
        }
    }
//
//    daalo
//            abc
//    cba
//            bca
//    bac
//            cab
//    acb
//            abc









}
