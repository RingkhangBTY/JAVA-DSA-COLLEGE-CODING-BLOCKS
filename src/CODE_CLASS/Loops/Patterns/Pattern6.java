package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
Enter value of N: 5
               *
            *     *
         *     *     *
      *     *     *     *
   *     *     *     *     *
 */

public class Pattern6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }

            for (int j = (i*2)-1; j >0; j--) {
                if (j%2!=0){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
