package com.company.self_learning;

import java.util.Scanner;

public class Knight {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter");
        int n = s.nextInt();
        int arr[][] = new int[n][n];


        int index = 1;
        initialise(arr, n);
        arr[0][0]=0;

        System.out.println(knight(arr, index, 0, 0, n, 0));

        print(arr, n);


    }

    public static void initialise(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }
    }


    public static int[][] knight(int arr[][], int ind, int r, int c, int n, int k) {
        int c1 = 0;
//        int c2=0;
//        int c3=0;
//        int c4=0;
//        int c5=0;
//        int c6=0;
//        int c7=0;
//        int c8=0;


        while (ind <= n * n - 1) {
            if (c1 < 1 && r + 2 <= n - 1 && c + 1 <= n - 1 && arr[r + 2][c + 1] == -1) {
                arr[r + 2][c + 1] = ind++;
                k = 1;
                c1 = 0;
                return knight(arr, ind, r + 2, c + 1, n, k);

            } else if (c1 < 2 && r + 2 <= n - 1 && c - 1 >= 0 && arr[r + 2][c - 1] == -1) {
                arr[r + 2][c - 1] = ind++;
                k = 2;
                c1 = 0;
                return knight(arr, ind, r + 2, c - 1, n, k);

            } else if (c1 < 3 && r - 2 >= 0 && c + 1 <= n - 1 && arr[r - 2][c + 1] == -1) {
                arr[r - 2][c + 1] = ind++;
                k = 3;
                c1 = 0;
                return knight(arr, ind, r - 2, c + 1, n, k);

            } else if (c1 < 4 && r - 2 >= 0 && c - 1 >= 0 && arr[r - 2][c - 1] == -1) {
                arr[r - 2][c - 1] = ind++;
                k = 4;
                c1 = 0;
                return knight(arr, ind, r - 2, c - 1, n, k);
            } else if (c1 < 5 && r + 1 <= n - 1 && c + 2 <= n - 1 && arr[r + 1][c + 2] == -1) {
                arr[r + 1][c + 2] = ind++;
                k = 5;
                c1 = 0;
                return knight(arr, ind, r + 1, c + 2, n, k);

            } else if (c1 < 6 && r - 1 >= 0 && c + 2 <= n - 1 && arr[r - 1][c + 2] == -1) {
                arr[r - 1][c + 2] = ind++;
                k = 6;
                c1 = 0;
                return knight(arr, ind, r - 1, c + 2, n, k);

            } else if (c1 < 7 && r + 1 <= n - 1 && c - 2 >= 0 && arr[r + 1][c - 2] == -1) {
                arr[r + 1][c - 2] = ind++;
                k = 7;
                c1 = 0;
                return knight(arr, ind, r + 1, c - 2, n, k);

            } else if (c1 < 8 && r - 1 >= 0 && c - 2 >= 0 && arr[r - 1][c - 2] == -1) {
                arr[r - 1][c - 2] = ind++;
                k = 8;
                c1 = 0;
                return knight(arr, ind, r - 1, c - 2, n, k);

            } else {
                ind--;

                if (k == 1) {
                    arr[r-2][c-1] = -1;
                    c1 = c1 + 1;
                    return knight(arr, ind, r - 2, c - 1, n, 0);
                } else if (k == 2) {
                    arr[r-2][c+1] = -1;
                    c1 = c1 + 2;
                    return knight(arr, ind, r - 2, c + 1, n, 0);
                } else if (k == 3) {
                    arr[r+2][c-1] = -1;
                    c1 = c1 + 3;
                    return knight(arr, ind, r + 2, c - 1, n, 0);

                } else if (k == 4) {
                    arr[r+2][c+1] = -1;
                    c1 = c1 + 4;
                    return knight(arr, ind, r + 2, c + 1, n, 0);


                } else if (k == 5) {
                    arr[r-1][c-2] = -1;
                    c1 = c1 + 5;
                    return knight(arr, ind, r - 1, c - 2, n, 0);
                } else if (k == 6) {
                    arr[r+1][c-2] = -1;
                    c1 = c1 + 6;
                    return knight(arr, ind, r + 1, c - 2, n, 0);
                } else if (k == 7) {
                    arr[r-1][c+2] = -1;
                    c1 = c1 + 7;
                    return knight(arr, ind, r - 1, c + 2, n, 0);
                } else if (k == 8) {
                    arr[r+1][c+2] = -1;
                    c1 = c1 + 8;
                    return knight(arr, ind, r + 1, c + 2, n, 0);
                }


            }

//            return ind;


        }

        return arr;

    }

//
//    Input :
//    N = 8
//    Output:
//            0  59  38  33  30  17   8  63
//            37  34  31  60   9  62  29  16
//            58   1  36  39  32  27  18   7
//            35  48  41  26  61  10  15  28
//            42  57   2  49  40  23   6  19
//            47  50  45  54  25  20  11  14
//            56  43  52   3  22  13  24   5
//            51  46  55  44  53   4  21  12


        private static void print (int  arr[][], int n){

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }

        }


    }


