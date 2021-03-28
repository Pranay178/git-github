package com.company.lecture14;

//in this code there are 2 number whose frequency is 2 and rest
// of them frequency is 1
//so output is 7 and 9

public class Unique2 {
    public static void main(String args[]){
        int[] nums={2,9,4,7,2,4};
        unique2(nums);
    }

    private static void unique2(int [] nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        int xor=res,pos=0;
        while((xor&1)!=1){
//  finding right most set bit that is whose value is 1
//            in above case 7^9=1110(in binary)
//            so pos=1
            pos++;
            xor=xor>>1;
        }
//        just below line "ONLY" creating a mask of only 1 bit at pos=1 and other bits 0

        int mask=1<<pos;
        int first =0;
        int second;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask)>=1){
                first=first^nums[i];

            }
        }
        second=res^first;
        System.out.println(first+":"+second);
    }

}
