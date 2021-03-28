package com.company.lecture11;

import java.util.Arrays;
// merge sort is stable sort
// that is least movements of elements occur
// eg{2,0,1,0,4}
//answer={0,0,1,2,4}
// 0 at 0th index was at 1st index in original
//0 at ist index was at 3rd index at original


public class MergeSort {
    public static void main(String args[]) {
        int[] first = {0, 7, 8, 10, 16};
        int[] second = {2, 3, 6, 9, 11};
        int third[] = merge(first, second);
        System.out.println(Arrays.toString(third));

    }
//[0, 2, 3, 6, 7, 8, 9, 10, 11, 16]
    private static int[] merge(int[] first, int[] second) {
        int i = 0, j = 0, k = 0;
        int[] third = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                third[k++] = first[i++];
            } else {
                third[k++] = second[j++];


            }
        }
        while (i < first.length) {
            third[k++] = first[i++];

        }
        while (j < second.length) {
            third[k++] = second[j++];

        }

        return third;

    }




}



