package com.company.self_learning;

public class Rough {
    public static void main(String args[]){
        int a[]={9,0,-1,3,-2,8};
        int sum=a[0]+a[1]+a[2];
        int s=sum;
        int j=3;
        for(int i=0;i<a.length-3;i++){
            sum=sum-a[i]+a[j++];
            s+=sum;
        }
        System.out.println(s);
    }
}
