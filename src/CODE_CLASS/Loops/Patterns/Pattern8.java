package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*

 *                       *
 *  *                 *  *
 *  *  *           *  *  *
 *  *  *  *     *  *  *  *
 *  *  *  *  *  *  *  *  *

 */

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");

        int n = sc.nextInt();
        int star = 1;
        int space = (n*2)-3;

        int i=1;
        while (i<=n){

            //Star
            int j=1;
            while (j<=star){
                System.out.print("*  ");
                j++;
            }

            // space
            int k=1;
            while (k<=space){
                System.out.print("   ");
                k++;
            }

            // star
            if (i==n) star--;
            j=1;
            while (j<=star){
                System.out.print("*  ");
                j++;
            }

            System.out.println();
            space-=2;
            star++;
            i++;
        }
    }
}
