package com.company.lecture19;

public class CustomStack {
    Integer[] data;
    int top;
    static final int DEFAULT_SIZE=10;

    public CustomStack(){
        this.data= new Integer  [DEFAULT_SIZE];
        this.top=-1;

    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow ! !");
            return;
        }
        this.data[++top]=value;
    }

    public boolean isFull(){
        return (this.top==data.length-1);

    }


    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack Empty ! !");
            return null;
        }

        return this.data[top--];

    }

    private boolean isEmpty(){
        return (top==-1);
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow ! !");
        }
        return this.data[top];
    }

}




