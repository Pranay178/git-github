package com.company.lecture10;

public class RecurPatten1 {
    public static void main(String[] args){
        int r=0;

        int c=0;
        patt(r,c);

    }

    public static void patt(int  r,int c){
        if(r==5){
            return  ;
        }
        if(r<c){
            System.out.println();
            patt(r+1,0);













//            return ;
        }
        System.out.print("*");
        patt(r,c+1);

    }

}


//        *
//        **
//        ***
//        ****
//        *****
//        ******