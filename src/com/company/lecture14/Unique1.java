package com.company.lecture14;

//this code returns that single element in given array whose ferquency is one
//while rest elements frequency is exactly 2
//result in below case is 9

public class Unique1 {
    public static void main(String args[]){
        int[] nums={2,7,3,9,2,3,7};
        System.out.println(unique1(nums));
     }

     private static int unique1(int [] nums){
        int ans=0;for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];

         }
         return ans;

    }
}
