package CODE_CLASS.ExamPractice;

public class StackLinkedList {
    Node top = null;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if (top == null ){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Removed element: "+ top.data);
            top = top.next;
        }
    }

    public void display(){
        Node temp = top;

        while (temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackLinkedList nums = new StackLinkedList();
        nums.push(20);
        nums.push(21);

        nums.display();
        nums.pop();
        nums.display();
    }
}
