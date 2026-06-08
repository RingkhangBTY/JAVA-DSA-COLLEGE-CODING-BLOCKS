package CODE_CLASS.ExamPractice;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(rev("Ringkhang"));
    }

    public static String rev(String str){
        StringBuilder sb = new StringBuilder(str);

        int start = 0, end = sb.length()-1;
        while (start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,temp);

            start++;
            end--;
        }

        return sb.toString();
    }
}
