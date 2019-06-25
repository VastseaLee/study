package leetcode.three;

public class FortyFour {
    public static void main(String[] args) {
        reverseString2(new char[]{'h','e','l','l','o'});
    }
    public void reverseString(char[] s) {
        int length = s.length;
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }

    public static void reverseString2(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
