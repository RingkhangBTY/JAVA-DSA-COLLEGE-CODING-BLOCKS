package CODE_CLASS.StackQueue;

import CODE_CLASS.Methods.SimpleInterest;

public class StackNode {
    private Node top;
    private int size = 0;

    public void push(int data){
        Node temp = new Node(data);

        temp.next = top;
        top = temp;
        size++;
    }

    public void pop(){
        if (size == 0){
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
        size --;
    }

    public int top(){
        if (size == 0){
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public int size(){
        return size;
    }
}
