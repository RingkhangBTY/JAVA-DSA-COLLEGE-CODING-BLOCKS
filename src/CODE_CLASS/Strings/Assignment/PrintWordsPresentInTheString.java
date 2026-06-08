package CODE_CLASS.Strings.Assignment;

import java.util.Scanner;

/**
 * One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.
 *
 * Input Format
 * A single line contains the string.
 *
 * Constraints
 * |S|<=1000
 *
 * Output Format
 * Print words present in the string, in the order in which it appears in the string.
 *
 * Sample Input
 * IAmACompetitiveProgrammer
 * Sample Output
 * I
 * Am
 * A
 * Competitive
 * Programmer
 * Explanation
 * There are 5 words in the string.
 */

public class PrintWordsPresentInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch) && i!=0){
                System.out.println(sb);
                sb = new StringBuilder();
            }

            sb.append(ch);
        }

        System.out.println(sb);
    }
}