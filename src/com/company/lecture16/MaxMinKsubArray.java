package com.company.lecture16;

import java.util.ArrayList;
//this code print maximum and minimum of
//each subarray of k size
// of given array
//we use 2 arraylist 1 is maxInd and 2nd is minInd
//these arraylist stores index of maximum and minimum element
//in each subarray

public class MaxMinKsubArray {
    public static  void main (String args[]){
        int [] nums={2,5,-1,7,-3,-1,-2};
        int k=4;
        maxMinSubArrayK(nums,k);

    }

    private static void maxMinSubArrayK(int [] nums,int k){

//for storing index of maximum elements
        ArrayList<Integer> maxInd=new ArrayList<>();

//for storing index of minimum elements
        ArrayList<Integer> minInd=new ArrayList<>();

//just below loop removes the elment not present in
// current subarray or sliding window
        for(int i=0;i<k;i++) {

            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {
                maxInd.remove(0);
            }

            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {
                minInd.remove(0);
            }

            maxInd.add(i);
            minInd.add(i);
        }

        for(int i=k;i<nums.length;i++) {
            System.out.println("Max:" + nums[maxInd.get(0)] + "Min:" +
                    nums[minInd.get(0)]);
            if (!maxInd.isEmpty() && maxInd.get(0) <= i - k) {
                maxInd.remove(0);

            }


            if (!minInd.isEmpty() && minInd.get(0) >= i - k) {
                minInd.remove(0);

            }


            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {
                maxInd.remove(0);
            }

            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {
                minInd.remove(0);
            }

            maxInd.add(i);
            minInd.add(i);
        }

        System.out.println("Max:" + nums[maxInd.get(0)] + "Min:" +
                nums[minInd.get(0)]);






            }

        }














