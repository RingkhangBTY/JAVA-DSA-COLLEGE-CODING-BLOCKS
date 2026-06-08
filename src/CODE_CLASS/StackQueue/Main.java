package CODE_CLASS.StackQueue;

public class Main {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(3);
        stackArray.pop();
        stackArray.push(2);
        stackArray.push(4);
        stackArray.push(5);
        System.out.println(stackArray.top());
        System.out.println(stackArray.size());

        stackArray.pop();
        stackArray.pop();
        System.out.println(stackArray.top());

        System.out.println(stackArray.top());
        stackArray.pop();
        System.out.println(stackArray.top());

        stackArray.pop();
//        stackArray.push(6);
    }
}
