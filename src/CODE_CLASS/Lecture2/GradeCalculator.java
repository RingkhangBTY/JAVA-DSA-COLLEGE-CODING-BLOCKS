package CODE_CLASS.Lecture2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        if (marks>=90){
            System.out.println("Your grade: O");
        } else if (marks>=80) {
            System.out.println("Your grade: A");
        } else if (marks>=70) {
            System.out.println("Your grade: B");
        } else if (marks>=60) {
            System.out.println("Your grade: C");
        }else if (marks>=50){
            System.out.println("Your grade: D");
        }else {
            System.out.println("You fail the test! ");
        }
    }
}
