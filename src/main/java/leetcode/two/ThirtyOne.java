package leetcode.two;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class ThirtyOne {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741825));
    }
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1))  == 0;
    }
}
