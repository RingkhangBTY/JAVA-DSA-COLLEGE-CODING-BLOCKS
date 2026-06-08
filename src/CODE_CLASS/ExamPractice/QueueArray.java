package CODE_CLASS.ExamPractice;

public class QueueArray {

    private final int [] queue = new int[5];
    public int front = 0, rear = -1;

    public void enqueue(int data){
        if (rear>queue.length-1){
            System.out.println("Queue full....");
        }else{
            queue[++rear] = data;
        }
    }

    public void dequeue(){
        if (front>rear){
            System.out.println("Queue is empty.....");
        }else{
            System.out.println("Removed element: "+queue[front++]);
        }
    }

    public void display(){
        for (int i= front; i<=rear; i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueArray data = new QueueArray();
        data.enqueue(20);
        data.enqueue(21);
        data.enqueue(22);
        data.enqueue(23);

        data.dequeue();
        data.display();
    }
}
