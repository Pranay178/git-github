package com.company.lecture3;

public class FnExample {
    public static void main(String[] args){
        FnExample obj=new FnExample();
        obj.good();
        FnExample.happy();

    }
    public static void happy(){
        System.out.println(" I AM VERY HAPPY");
    }
    public void good(){
        System.out.println("I AM GOOD");
    }

}
