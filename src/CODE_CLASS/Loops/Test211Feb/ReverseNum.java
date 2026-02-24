package CODE_CLASS.Loops.Test211Feb;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int newNum = 0;

        while (n>0){
            int rem = n%10;
            newNum = (newNum*10)+rem;
            n /=10;
        }
        System.out.println(newNum);
    }
}
