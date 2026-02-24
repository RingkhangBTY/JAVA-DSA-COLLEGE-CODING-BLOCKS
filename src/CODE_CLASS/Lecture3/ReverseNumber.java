package CODE_CLASS.Lecture3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int revNum=0 ,rem;

        while (num>0){
            rem = num%10;
            revNum = (revNum*10)+rem;
            num /= 10;
        }

        System.out.println("Reverse number: "+revNum);
    }
}
