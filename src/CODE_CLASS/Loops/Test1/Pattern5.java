package CODE_CLASS.Loops.Test1;

import java.util.Scanner;

/*
Enter value of N: 5
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1

 */

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int star=1, i=1;

        while (i<=n){

            int j=n;
            while (j>0){
                if (j==star){
                    System.out.print("* ");
                }else {
                    System.out.print(j+" ");
                }
                j--;
            }
            System.out.println();
            i++;
            star++;
        }
    }
}
