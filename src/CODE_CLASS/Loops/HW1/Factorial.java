package CODE_CLASS.Loops.HW1;

// Calculate the factorial of n

public class Factorial {
    public static void main(String[] args) {
        int n = 10;

        long fact = 1;
        if (n == 0 || n == 0){
            System.out.println("Factorial: "+fact);
        }
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }

        System.out.println("Factorial: "+fact);
    }
}
