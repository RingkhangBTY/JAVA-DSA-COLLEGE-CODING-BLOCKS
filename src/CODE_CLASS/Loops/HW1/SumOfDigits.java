package CODE_CLASS.Loops.HW1;

// Sum of digit of an integer.

public class SumOfDigits {
    public static void main(String[] args) {
        int digit = 99;
        int sum = 0;
        while (digit>0){
            int rem = digit%10;
            sum+=rem;
            digit/=10;
        }

        System.out.println(sum);
    }
}
