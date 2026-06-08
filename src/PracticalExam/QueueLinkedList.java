package PracticalExam;

import java.util.Scanner;

public class QueueLinkedList {
    Node front = null, rear = null;

    public void enqueue(int data){
        Node newNode = new Node(data);

        if (null == rear ){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        if (null == front){
            System.out.println("Queue is empty! ");
        }else{
            System.out.println("Removed element: "+front.data);
            front = front.next;
            if (front == null ) rear = null;
        }
    }

    public void display(){
        Node temp = front;
        if (temp == null) return;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList values = new QueueLinkedList();

        System.out.println("Enter element count: ");
        int count = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < count; i++) {
            values.enqueue(sc.nextInt());
        }
        values.display();

        values.dequeue();
        values.display();
    }
}