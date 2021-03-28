package com.company.lecture10;



import java.util.Scanner;
// this code returns substring of a string  using loop and charAt()  function

public class SubString {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter ");
        String str=s.next();
        subString(str);
    }

    private static void subString(String str){
        for(int i=0;i<str.length();i++){
            int j=i;
            while(j!=str.length()){
                System.out.print("{ ");
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.print(" }");

                System.out.println();
                j++;
            }
        }

    }

}


//            enter
//            abc
//            { a }
//            { ab }
//            { abc }
//            { b }
//            { bc }
//            { c }
