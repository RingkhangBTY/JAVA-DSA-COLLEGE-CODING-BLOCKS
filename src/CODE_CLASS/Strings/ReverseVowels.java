package CODE_CLASS.Strings;

/**
 * @Link <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/"> Leetcode problem link: </a>
 * @Example:  Hello --> Holle
 */
public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));

    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                sb.append(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        int j = 0;
        sb.reverse();
        for (int i = 0; i < s.length() ; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                ans.append(sb.charAt(j));
                j++;
            }else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }


}
