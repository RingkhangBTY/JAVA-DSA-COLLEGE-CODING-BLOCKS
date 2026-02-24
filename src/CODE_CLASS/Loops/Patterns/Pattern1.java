package CODE_CLASS.Loops.Patterns;

/*
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Pattern 1 by using for loop: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 1 by using while loop: ");
        int i =0;
        while (i<5){
            int j = 0;
            while (j<5){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
