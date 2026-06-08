package MYSELF_LEARN.TEMP;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int []nums = {1,3,4,5};
        reverseArray(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int [] arr){
        int left = 0, right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
