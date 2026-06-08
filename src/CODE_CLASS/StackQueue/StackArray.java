package CODE_CLASS.StackQueue;

import java.util.EmptyStackException;

public class StackArray {
    private int top = -1;
    private final int [] arr ;

    public StackArray(int size) {
        this.arr = new int[size];
    }

    public void push(int data){
        top ++;
        if (top < arr.length){
            arr[top] = data;
        }else {
            throw new StackOverflowError("Your stack array is full");
        }
    }

    public void pop(){
        if (top == -1){
            System.out.println("Your stack is empty");
        }else{
            top--;
        }
    }

    public int top(){
        if (top == -1){
//            System.out.println("Your stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    public int size(){
        return top+1;
    }

}
