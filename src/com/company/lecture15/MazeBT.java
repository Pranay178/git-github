package com.company.lecture15;

public class MazeBT {
//    this code returns all paths through which from given initial
//    to target location can be reached
    public static void main(String args[]){

        int n=4;
        int m=3;

        int [][] maze=new int[m][n];

        int fRow=2;
        int fCol=0;

        int cRow=1;
        int cCol=2;

        mazePath(maze,cRow,cCol,fRow,fCol,"");


    }


    public static void mazePath(int [][] maze,int cRow,int cCol,int fRow,int fCol,String s){
        if(cRow<0||cCol<0||cRow>=maze.length||cCol>=maze[0].length){
            return;
        }
//        unvisited location are assign zero value
//        visited ones are assigned 1 by us

        if(maze[cRow][cCol]==1){
            return;
        }
        if(cRow==fRow&&cCol==fCol){
            System.out.println(s);
            return;
        }
//        all above 3 cond'n  are base cases
//         JUST BELOW ON VISITING WE ASSIGN VALUE 1 TO IT
        maze[cRow][cCol]=1;
        mazePath(maze,cRow-1,cCol,fRow,fCol,s+"N");
//        no need to write these lines  of assigning 0 or  1
//        maze[cRow][cCol]=0; if we assign 1in all these comments  also then still
//        no problem in code

//        maze[cRow][cCol]=1;
        mazePath(maze,cRow,cCol+1,fRow,fCol,s+"E");
//        maze[cRow][cCol]=0;

//        maze[cRow][cCol]=1;
        mazePath(maze,cRow+1,cCol,fRow,fCol,s+"S");
//        maze[cRow][cCol]=0;

//        maze[cRow][cCol]=1;
        mazePath(maze,cRow,cCol-1,fRow,fCol,s+"W");
        maze[cRow][cCol]=0;










    }

}
