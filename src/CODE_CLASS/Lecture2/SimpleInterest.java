package CODE_CLASS.Lecture2;

public class SimpleInterest {
    public static void main(String[] args) {
        int principleAmount = 5000;
        int interestRate = 5;
        int time = 3;

        int simpleInterest = (principleAmount * interestRate * time) /100;

        System.out.println(simpleInterest);

    }
}
