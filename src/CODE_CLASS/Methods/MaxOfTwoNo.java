package CODE_CLASS.Methods;

import java.util.Scanner;

public class MaxOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = sc.nextInt();
        System.out.print("Enter second no: ");
        int b = sc.nextInt();

        findMaxOfTwoNo1(a,b);
        System.out.println("Max: "+findMaxOfTwoNo2(a,b));
    }

    //without returning value
    public static void findMaxOfTwoNo1(int a, int b){
        if (a>b) System.out.println("Max: "+a);
        System.out.println("Max: "+b);
    }

    public static int findMaxOfTwoNo2(int a, int b){
        if (a>b){
            return a;
        }
        return b;
    }
}