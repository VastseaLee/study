package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Nine {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1874994781));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int a = x;
        int b = 0;
        while (x > 0) {
            b = b * 10 + x % 10;
            x /= 10;
        }
        return a == b;
    }
}
