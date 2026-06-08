package CODE_CLASS.StackQueue;

public class QueueNode {
    private Node start , end;
    private int size = 0;

    public void push(int data){
        Node temp = new Node(data);
        if (size == 0){
            start = end = temp;
        }else{
            end.next = temp;
            end = temp;
        }
        size++;
    }

    public void pop(){
        if (size == 0){
            return;
        }

        size --;
        start = start.next;

        if (size == 0){
            end = null;
        }
    }

    public int top(){
        if (start == null){
            throw new IllegalStateException("Queue is empty");
        }
        return start.data;
    }

    public int size(){
        return size;
    }
}
