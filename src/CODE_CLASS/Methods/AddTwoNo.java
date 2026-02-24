package CODE_CLASS.Methods;

import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add1(a,b); // void
        System.out.println("Sum: "+add2(a,b)); // return type
    }

    //Void method
    public static void add1(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    //Return type method
    public static int add2(int a, int b){
        return a+b;
    }
}