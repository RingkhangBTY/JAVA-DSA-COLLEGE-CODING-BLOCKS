package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
Enter value of N:5
*  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *
      *  *  *  *  *
         *  *  *
            *
 */

public class Pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N:");
        int n = sc.nextInt();

        System.out.println("BY USING FOR LOOP");
        int i=1;
        int star = (n*2)-1, space=0;
        while (i<=n){
            int j = 1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }
            int k = 1;
            while (k<=star){
                System.out.print("*  ");
                k++;
            }
            System.out.println();

            star -= 2;
            space++;
            i++;
        }

        // (n*2)-1-(j*2)
        System.out.println("BY USING FOR LOOP");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print("   ");
            }
            for (int k = (n-j)*2-1; k >0 ; k--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}


//