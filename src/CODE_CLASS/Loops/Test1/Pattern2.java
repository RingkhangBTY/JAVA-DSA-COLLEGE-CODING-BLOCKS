package CODE_CLASS.Loops.Test1;

import java.util.Scanner;

/*
Enter value of N: 4
* * * * _ * * * *
* * *       * * *
* *           * *
*               *
 */

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
                if (j==n-1) System.out.print("_ ");
            }
            for (int j = 0; j <=i*2; j++) {
                if (i!=0){
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
