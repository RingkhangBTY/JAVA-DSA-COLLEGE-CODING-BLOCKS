package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
Enter value of N: 5
BY USING WHILE LOOP:
*  *  *  *  *
      *  *  *  *
            *  *  *
                  *  *
                        *
 */

public class Pattern3 {
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

            space+=2; // the only difference
            star--;
            row++;
        }
    }
}
