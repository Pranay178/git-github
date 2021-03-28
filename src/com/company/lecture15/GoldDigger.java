package com.company.lecture15;

//this is a leet code problem
//almost same concept as in MazeBT

public class GoldDigger {

    public static void main(String args[]){


        int [][] maze={{0,6,0},
                       {5,8,7},
//                        {0,0,0},
                       {0,9,0}};

//        int fRow=2;
//        int fCol=0; NO NEED THIS

        int cRow=0;
        int cCol=0;
        int total=0;

        int out=mazePath(maze,cRow,cCol,0);
        System.out.println(out);


    }


    public static int mazePath(int [][] maze,int cRow,int cCol,int t) {
        if (cRow < 0 || cCol < 0 || cRow >= maze.length-1 || cCol >= maze[0].length-1) {
            return t;
        }
//        unvisited location are assign zero value
//        visited ones are assigned 1 by us

        if (maze[cRow][cCol] == 0) {
            return t;
        }

//        we dont need to go a particular point
//        so we dont need just below base condition

//        if(cRow==fRow&&cCol==fCol){
//            System.out.println(s);
//            return;
//        }
        int value=maze[cRow][cCol];

//         JUST BELOW ON VISITING WE ASSIGN VALUE 1 TO IT
//        int value = maze[cRow][cCol];

        maze[cRow][cCol]=0;
        int top = mazePath(maze, cRow - 1, cCol, t + value);


        int right = mazePath(maze, cRow, cCol + 1, t + value);


        int bott = mazePath(maze, cRow + 1, cCol, t + value);


        int left = mazePath(maze, cRow, cCol - 1, t + value);
        maze[cRow][cCol] = value;

        System.out.println(top);


        return Math.max(Math.max(top,bott),Math.max(left,right));











    }

}
