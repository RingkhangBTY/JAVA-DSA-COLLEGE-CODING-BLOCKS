package CODE_CLASS.StackQueue;

public class QueueArray {
    private int start = -1, end = -1, size = 0;
    private final int [] data;

    public QueueArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException(
                    "Queue size must be positive"
            );
        }
        this.data = new int[size];
    }

    public void push(int value){
        if (size>=data.length){
            System.out.println("Your queue is full");
            return;
        }

        if (size == 0 ){
            start = end = 0;
        }else{
            end = (end + 1) % data.length;
        }

        size++;
        data[end] = value;
    }

    public void pop(){
        if (size == 0 ){
            System.out.println("Queue is empty!");
            return;
        }
        size --;
        if (size == 0){
            start = end = -1;
            return;
        }
        start = (start + 1)% data.length;
    }

    public int top(){
        if (size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        return data[start];
    }

    public int size(){
        return size;
    }
}