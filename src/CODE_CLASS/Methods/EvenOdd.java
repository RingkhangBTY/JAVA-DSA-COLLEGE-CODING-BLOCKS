package CODE_CLASS.Methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = sc.nextInt();

        isEvenOrOdd1(a);
        System.out.println(isEvenOrOdd2(a));
    }

    private static String isEvenOrOdd2(int a) {
        if (a%2==0) return "Even";
        return "Odd";
    }

    private static void isEvenOrOdd1(int a) {
        if (a%2==0) System.out.println("Even");
        System.out.println("Odd");
    }
}
