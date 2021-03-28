package com.company.lecture16;

//in this code we are returning sum of all
//  elements of subarrays of  length k
//1st approach can be using 2 for loop 1 from 0 that is i loop
//other j loop from i to i+k but its complexity will be (n*k)
//for large value of n and k complexity is high
//so we use "SLIDING WINDOW" Approach
//concept is if k=3 then
//sum=a[0]+a[1]+a[2] is sum of first sub array
//then removing first element that is a[0] and
// adding 4th element that is a[3] we get sum of next sub array and so on

public class SumKSubArray {
    public static void main(String args[]){
        int [] nums={9,0,-1,3,-2,8};

//        below size of each subarray
        int k=3;

        sumKsubArray(nums,k);
    }

    private static void sumKsubArray(int [] nums,int k){
        int sum=0;
        int s=0;
//        loop for storing sum of first k elements
//        of array
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int s2=s;

        System.out.println("SubArray1"+" : "+s);

//        variable for declaring which subArray ie; j
        int j=2;

//        variable for adding new element to array
        int h=k;

        for(int i=0;i<nums.length-3;i++){

//            just below storing sum of each subarray
            sum=s+nums[h++]-nums[i];

            System.out.println("SubArray"+(j++)+" : "+sum);

            s=sum;

//            below storing sum of all elements of each subarray
            s2+=sum;
        }
        System.out.println("final sum of all Subarray is of size "+k+" :  "+s2);
    }
}
