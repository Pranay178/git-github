package com.company.lecture10;

public class RecursionSortCheck {
    public static void main(String args[]){
        int nums[]={1,2,3,5,4,6};
        boolean k=check(nums,0);
        System.out.println(k);

    }

    private static boolean check(int nums[],int ind){
        if(ind==nums.length-1){
            return true;
        }
        if(nums[ind]>nums[ind+1]){
            return false;
        }

        return check(nums,ind+1);
        
    }
}
