package CODE_CLASS.Loops.NumSeriesETC;

import java.util.Scanner;

public class PrintHCF_OfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNo = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNo = sc.nextInt();

//        while (secondNo>0){ // while(true)
//            int rem = firstNo%secondNo;
//            if (rem==0){
//                System.out.println("HCF is: "+secondNo);
//                break;
//            }
//
//            firstNo = secondNo;
//            secondNo = rem;
//        }

        // alternate way
        while (firstNo%secondNo!=0){
            int rem = firstNo%secondNo;
            firstNo = secondNo;
            secondNo = rem;
        }
        System.out.println("HCF is: "+secondNo);

    }
}
