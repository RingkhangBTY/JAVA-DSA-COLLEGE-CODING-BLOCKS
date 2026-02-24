package CODE_CLASS.Loops.Patterns;

import java.util.Scanner;

/*
Enter value of N: 5
            *
         *  *
      *  *  *
   *  *  *  *
*  *  *  *  *
 */

public class TrangleWithSpace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

//        int row=1;
//        while (row<=n){
//
//            //Space
//            int space = 1;
//            while (space<= n-row){
//                System.out.print("   ");
//                space++;
//            }
//
//            //star
//            int star = 1;
//            while (star<=row){
//                System.out.print("*  ");
//                star ++;
//            }
//            System.out.println();
//            row++;
//        }

        // alternate way
        int space = n-1;
        int star = 1;
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

            space--;
            star++;
            row++;
        }

        System.out.println("BU USING FOR LOOP:");
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 0; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
