package com.company.lecture19;

public class DynamicStack extends CustomStack {

//    CustomStack o=new CustomStack();

    public void push(int value){
        if(isFull()){
            Integer[] temp=new Integer[this.data.length*2];
            for (int i=0;i<data.length;i++){
                this.data=temp;
            }
            super.push(value);

        }
    }
}
