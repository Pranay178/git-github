package com.company.lecture13;

//print permutation of an entered string in alphabetical order

public class LexographicPermut {
    public static void main(String[] args){

        String str="aab";
        int [] freq=freqMatrix(str);

        lexoPermut("",freqMatrix(str),str.length());



    }

    private static int[] freqMatrix(String str){
        int[] freq=new int [26];
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            freq[index]++;

        }

        return freq;










    }





    private static void lexoPermut(String proc,int [] freqMatrix,int length ){

        if(length==0){
            System.out.println(proc);
            return;
        }

        for(int i=0;i<freqMatrix.length;i++){

            if(freqMatrix[i]>0){

                freqMatrix[i]--;

                lexoPermut(proc+(char)(i+'a'),freqMatrix,length-1);

                freqMatrix[i]++;


            }



        }



    }




}
