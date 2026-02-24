package CODE_CLASS.Methods;

import java.util.Scanner;

public class SumOfN_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = calSumOfN_NaturalNo(n);
        System.out.println("Sum of N natual no: "+sum);
    }

    private static int calSumOfN_NaturalNo(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
