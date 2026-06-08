package MYSELF_LEARN.Leetcode;

import java.util.Arrays;

/**
 * Problem description:
 * {@link <a href="https://leetcode.com/problems/count-the-number-of-special-characters-ii/description/">Click here</a>}
 */
public class CountSpecialCharacters3121 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("AbBCab"));
    }

    public static int numberOfSpecialChars(String word){
        int ans = 0;
        int[] lower = new int[26];
        int[] upper = new int[26];

        Arrays.fill(lower,-1);
        Arrays.fill(upper,-1);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)){
                lower[c-'a'] = i;
            } else if (upper[c-'A'] != -1) {
                upper[c-'A'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (
                    lower[i] != -1
                    && upper[i] != -1
                    && lower[i]<upper[i]
            ){
                ans++;
            }
        }

        return ans;
    }
}
