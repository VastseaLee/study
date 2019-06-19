package leetcode.zero;

/**
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Seven {
    public static void main(String[] args) {
        System.out.println(reverse(-123));

    }

    public static int reverse(int x) {
        boolean flag = x < 0;
        StringBuilder s = new StringBuilder(String.valueOf(x));
        if (flag) {
            s.deleteCharAt(0);
        }
        s.reverse();
        if (flag) {
            s.insert(0, "-");
        }
        try {
            return Integer.valueOf(s.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
