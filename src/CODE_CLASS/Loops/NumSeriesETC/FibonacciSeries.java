package CODE_CLASS.Loops.NumSeriesETC;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int first = 0 , second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
