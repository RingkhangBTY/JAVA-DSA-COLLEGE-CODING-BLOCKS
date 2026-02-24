package CODE_CLASS.Methods;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();

        System.out.println(reversNo(n));
    }

    private static int reversNo(int n) {
        int reverseNo = 0;
        while (n>0){
            int rem =  n%10;
            reverseNo = (reverseNo*10)+rem;
            n/=10;
        }
        return reverseNo;
    }

}
