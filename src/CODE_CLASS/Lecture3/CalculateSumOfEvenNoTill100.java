package CODE_CLASS.Lecture3;

public class CalculateSumOfEvenNoTill100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i%2==0){
                sum+=i;
            }
        }

        System.out.println("Sum of even number from 1 to 100 is: "+sum);
    }
}
