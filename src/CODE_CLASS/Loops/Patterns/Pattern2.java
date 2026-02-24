package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
BY USING WHILE LOOP:
*  *  *  *  *
   *  *  *  *
      *  *  *
         *  *
            *
 */

public class Pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("BY USING WHILE LOOP:");
        int space = 0;
        int star = n;
        int row=1;

        while (row<=n){
            int i=1;
            while (i<=space){
                System.out.print("   ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("*  ");
                j++;
            }
            System.out.println();

            space++;
            star--;
            row++;
        }

        System.out.println("\nBY USING FOR LOOP:");
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }

    }
}
