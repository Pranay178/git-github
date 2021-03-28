package com.company.lecture12;

public class Maze {
    public static void main(String args[]){
        int row=2,col=3;
//        see respective comments
//        1 for 1  line 8 and line 17
//        2 for 2 line 9 and 18
//       (1) if row=1,col=2 then
//       (2) if row=0,col=0 then
        int count=maze(row,col);
        System.out.println(count);
    }

    private static int maze(int row,int col){
        int countWays=0;
        if(row==1||col==1){
//          (1) roww == 0,col==0
//            (2) row==1||col==2
            return 1;
        }

        countWays+=maze(row-1,col);
        countWays+=maze(row,col- 1);
        return countWays;

    }
}
//the above maze is for
//2 by 3 matrix
//and result is 3
//
//
//