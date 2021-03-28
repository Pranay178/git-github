package com.company.lecture19;

import com.company.lecture19.CustomStack;

public class Main {
    public static void main (String args[]){
        CustomStack stack=new CustomStack();
        stack.push(56);
        stack.push(23);
        System.out.println(stack.pop());
        stack.push(83);
        stack.push(71);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        DynamicStack dy=new DynamicStack();
        for(int i=0;i<20;i++){
            dy.push(i);
        }

        System.out.println(dy.peek());


    }

}
