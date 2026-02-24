package CODE_CLASS.Methods;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principalAmount = sc.nextInt();
        System.out.print("Enter interest rate: ");
        int interestRate = sc.nextInt();
        System.out.print("Enter time period: ");
        int timePeriod = sc.nextInt();

        System.out.println("Simple interest: "+simpleInterest(principalAmount,interestRate,timePeriod));

    }

    private static int simpleInterest(int principalAmount, int interestRate, int timePeriod) {
        return (principalAmount*interestRate*timePeriod)/100;
    }

}
