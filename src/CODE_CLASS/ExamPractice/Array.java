package CODE_CLASS.ExamPractice;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [][] jaggedArr = new int[3][];

        for (int i = 1; i <= jaggedArr.length; i++) {
            jaggedArr[i-1] = new int[i*2];
        }

        for (int []arr : jaggedArr){
            System.out.println(Arrays.toString(arr));
        }
    }
}