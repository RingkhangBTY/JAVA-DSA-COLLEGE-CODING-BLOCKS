package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
Enter value of N:5
            *
         *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N:");
        int n = sc.nextInt();

        int i =1;
        int star = 1;
        int space = n-1;
        while (i<=n){

            int j=1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }

            int k=1;
            while (k<=star){
                System.out.print("*  ");
                k++;
            }

            System.out.println();
            space --;
            star+=2;
            i++;
        }


        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n-j; k++) {
                System.out.print("   ");
            }
            for (int k = 0; k < (j*2)-1; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
