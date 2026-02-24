package CODE_CLASS.Lecture2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num%2 == 0 ){
            System.out.println("It's a even number");
        }else {
            System.out.println("It's a odd number");
        }
    }
}
