package CODE_CLASS.ExamPractice;

public class StackArray<T> {
    private int top = -1;
    private final Object [] stack = new Object[5];

    public void push(T data){
        if (top>stack.length-1){
            System.out.println("Stack overflow!!..");
        }else {
            stack[++top] = data;
        }
    }

    public void pop(){
        if (top == -1 ){
            System.out.println("Stack underflow!!..");
        } else {
            System.out.println("Element deleted: "+stack[top]);
            top --;
        }
    }

    public void display(){
        for (int i = top; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackArray<String> names = new StackArray<>();
//        names.push(32);
        names.push("Raju");
        names.push("Ringkhang");
        names.display();
        names.pop();
        names.display();
    }
}
