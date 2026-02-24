package CODE_CLASS.Methods;

import java.util.Scanner;

public class SumOfEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int sum = calSumOfEvenNo(n);
        System.out.println("Sum of even N: "+sum);
    }

    private static int calSumOfEvenNo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2==0) sum+=i;
        }
        return sum;
    }
}