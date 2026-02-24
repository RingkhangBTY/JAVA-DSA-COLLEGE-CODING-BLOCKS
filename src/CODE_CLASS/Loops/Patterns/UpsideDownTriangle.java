package CODE_CLASS.Loops.Patterns;

/*
By using for loop:
*  *  *  *  *
*  *  *  *
*  *  *
*  *
*
 */

public class UpsideDownTriangle {
    public static void main(String[] args) {

        System.out.println("By using for loop: ");
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("\nBy using while loop: ");
        int i=5;
        while (i>0){
            int j=0;
            while (j<i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}