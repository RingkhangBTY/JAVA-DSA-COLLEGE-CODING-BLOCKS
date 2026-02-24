package CODE_CLASS.Lecture3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();

        if (sideA == sideB && sideA == sideC){
            System.out.println("Equilateral");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");
        }
    }
}