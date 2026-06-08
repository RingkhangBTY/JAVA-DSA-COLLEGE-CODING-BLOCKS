package MYSELF_LEARN.TEMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        boolean []row = new boolean[8];
//        row[0] = true;
//        System.out.println(Arrays.toString(row));

//         String str = "";
//
//         String[] arr = str.split("\\s+");
//
//        System.out.println(arr[0]);

//        long startTime = System.currentTimeMillis();
//
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            System.out.println(i);
//        }
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("Time take to complete loop in second : "+(endTime-startTime)/1000);
//        System.out.println("Time take to complete loop in minutes : "+((endTime-startTime)/1000)/60);

        System.out.println("abcd".substring(0,3));

    }

    private static void print(int [] nums, int target){
        Arrays.sort(nums);
        int i = 0 , j = nums.length-1;
        while (i<j){
            int sum = nums[i] + nums[j];

            if (sum == target) System.out.println(nums[i]+" and "+nums[j]);

            if (sum<target){
                i++;
            }else {
                j++;
            }
        }
    }
}
