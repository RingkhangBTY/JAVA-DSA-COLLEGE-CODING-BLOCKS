package CODE_CLASS.Loops.Test1;

import java.util.Scanner;

/*
Enter value of N: 5
* * * * *
    * * * *
        * * *
            * *
                *
            * *
        * * *
    * * * *
* * * * *
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int i=1,space=0,star=n;

        while (i<=(n*2)-1){
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            while (k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();

            if (i<n){
                star--;
                space+=2;
            }else {
                star++;
                space-=2;
            }

//            if (star==1){
//                star = 2;
//                space = (n-2)*2;
//                i++;
//                continue;
//            }
//
//            if (i>n){
//                star++;
//                space -=2;
//            }else{
//                star --;
//                space +=2;
//            }
            i++;
        }
    }
}