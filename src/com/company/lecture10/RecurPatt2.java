package com.company.lecture10;

public class RecurPatt2 {
    public static void main(String args[]){
        int r=5;
        int c=1;
//        if r=4,c=0
//        then in line 20 c=0 send
        patt2(r,c);


    }

    private static void patt2(int r,int c){
        if(r==0){
            return;
        }
        if(r<c){
            System.out.println();
            patt2(r-1,1);
            return;
            }

             System.out.print("@");
            patt2(r,c+1);
        }
    }


//@@@@@
//@@@@
//@@@
//@@
//@
