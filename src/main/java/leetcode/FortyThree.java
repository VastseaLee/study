package leetcode;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 说明：
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 */
public class FortyThree {
    public static void main(String[] args) {
        System.out.println(multiply2("123", "456"));
    }


    public static String multiply2(String num1, String num2) {
        String sZero = "0";
        if (sZero.equals(num1) || sZero.equals(num2)) {
            return sZero;
        }
        int l1 = num1.length();
        int l2 = num2.length();
        int l = l1 + l2;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int[] ints = new int[l];
        char cZero = '0';
        for (int i = 0; i < l1; i++) {
            int n1 = chars1[i] - cZero;
            for (int j = 0; j < l2; j++) {
                int product = n1 * (chars2[j] - cZero);
                int index = i + j;
                ints[index + 1] += product;
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = l - 1; i > -1; i--) {
            int num = ints[i];
            if (num > 9) {
                ints[i - 1] += num / 10;
                num %= 10;
                ints[i] = num;
            }
            sb.insert(0, num);
        }
        if (0 == sb.indexOf("0")) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }


    /**
     * 尴尬的乘法，上面那种开始不知道啊，笔算的时候用的就是下面这样的啊
     */
    public static String multiply(String num1, String num2) {
        String zero = "0";
        if (zero.equals(num1) || zero.equals(num2)) {
            return zero;
        }
        int l1 = num1.length();
        int l2 = num2.length();
        if (l1 < l2) {
            zero = num1;
            num1 = num2;
            num2 = zero;

            int temp = l1;
            l1 = l2;
            l2 = temp;
        }

        StringBuilder[] products = new StringBuilder[l2];
        int index = 0;
        int n1;
        int n2;
        int cb;
        int sum;
        StringBuilder sb;
        char cz = '0';
        //按位相乘，保存结果
        for (int i = l2 - 1; i > -1; i--) {
            n2 = num2.charAt(i) - cz;
            sb = new StringBuilder("");
            cb = 0;
            for (int j = l1 - 1; j > -1; j--) {
                n1 = num1.charAt(j) - cz;
                sum = n2 * n1 + cb;
                sb.insert(0, sum % 10);
                cb = sum / 10;
            }
            //最前面一位还有的话补上
            if (cb > 0) {
                sb.insert(0, cb);
            }
            //补几个零
            for (int k = 0; k < index; k++) {
                sb.append(0);
            }
            products[index++] = sb;
        }

        if (products.length == 1) {
            return products[0].toString();
        }

        //把所有的加起来
        return getSum(products, 0, new StringBuilder("")).toString();
    }

    static StringBuilder getSum(StringBuilder[] products, int index, StringBuilder sum) {
        if (index == products.length) {
            return sum;
        }
        StringBuilder str = products[index];
        int index1 = str.length() - 1;
        int index2 = sum.length() - 1;
        char zero = '0';
        int cb = 0;
        int a;
        StringBuilder sb = new StringBuilder("");
        while (index1 > -1 && index2 > -1) {
            int n1 = str.charAt(index1--) - zero;
            int n2 = sum.charAt(index2--) - zero;
            a = n1 + n2 + cb;
            if (a > 9) {
                a = a % 10;
                cb = 1;
            } else {
                cb = 0;
            }
            sb.insert(0, a);
        }

        while (cb > 0 && index1 > -1) {
            int i = str.charAt(index1--) - zero;
            a = i + cb;
            if (a > 9) {
                a = a % 10;
                cb = 1;
            } else {
                cb = 0;
            }
            sb.insert(0, a);
        }
        if (index1 > -1) {
            sb.insert(0, str.substring(0, index1 + 1));
        }

        while (cb > 0 && index2 > -1) {
            int i = sum.charAt(index1--) - zero;
            a = i + cb;
            if (a > 9) {
                a = a % 10;
                cb = 1;
            } else {
                cb = 0;
            }
            sb.insert(0, a);
        }
        if (index2 > -1) {
            sb.insert(0, sum.substring(0, index2 + 1));
        }
        if (cb > 0) {
            sb.insert(0, 1);
        }
        return getSum(products, ++index, sb);
    }
}
