package CODE_CLASS.ExamPractice;

public class QueueLinkedList {
    Node front = null, rear = null;

    public void enqueue(int data){
        Node newNode = new Node(data);

        if (rear == null ){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        if (front == null ){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Deleted element: "+front.data);
            front = front.next;

            if (null == front ) rear = null;
        }
    }

    void display(){
        Node temp = front;

        while (temp != null){
            System.out.print(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public static void main(String[] args) {
        QueueLinkedList data = new QueueLinkedList();

        data.enqueue(21);
        data.enqueue(22);
        data.dequeue();
        data.display();
    }
}
