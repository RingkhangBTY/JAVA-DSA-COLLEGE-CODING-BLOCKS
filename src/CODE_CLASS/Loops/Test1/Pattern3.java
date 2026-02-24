package CODE_CLASS.Loops.Test1;

import java.util.Scanner;

/*
Enter value of N: 5
            *
         *     *
      *     *     *
   *     *     *     *
*     *     *     *     *
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int space = n-1, i=1;
        while (i<=n){
            //space
            int j=1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }

            // stars
            int k = 1;
            while (k<=(i*2)-1){
                if (k%2 != 0) System.out.print("* ");
                System.out.print("  ");
                k++;
            }
            System.out.println();

            space--;
            i++;
        }
    }
}