package com.company.lecture10;



import java.util.Scanner;

public class Subsequence {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("enter");


        String str=s.next();


        sub("",str);

    }
    public static void sub(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println("{"+proc+"}");
            return;
        }
        char ch=unproc.charAt(0);
        unproc=unproc.substring(1);

        sub(proc,unproc);
        sub(proc+ch,unproc);
    }


}


//       enter
//        abc
//        {}
//        {c}
//        {b}
//        {bc}
//        {a}
//        {ac}
//        {ab}
//        {abc}


