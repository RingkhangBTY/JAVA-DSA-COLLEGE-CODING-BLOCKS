package CODE_CLASS.Lecture2;

public class FindMaxOfTwoNos {
    public static void main(String[] args) {
        int a = 10, b = 20, c=25;

        if (a>b && a>c){
            System.out.println("Gratest: "+a);
        } else if (b>a && b>c) {
            System.out.println("Gratest: "+b);
        }else {
            System.out.println("Gratest: "+c);
        }
    }
}
