package leetcode;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串
 */
public class Five {
    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }

    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int fLeft = 0;
        int fRight = 0;
        int left;
        int right;
        int max = 0;

        for (int i = 0; i < length; i++) {
            left = i;
            right = i + 1;
            //看接下来的数字有几个和自己相同的
            while (right < length && chars[left] == chars[right]) {
                right++;
            }
            //没有左右相同之后分别向两边延伸看看有几个相同的字符
            while (left > 0 && right < length) {
                if (chars[--left] != chars[right++]) {
                    --right;
                    ++left;
                    break;
                }
            }

            --right;
            if (right - left > max) {
                max = right - left;
                fLeft = left;
                fRight = right;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (; fLeft <= fRight; fLeft++) {
            sb.append(chars[fLeft]);
        }
        return sb.toString();
    }
}
