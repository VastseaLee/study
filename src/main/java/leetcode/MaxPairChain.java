package leetcode;

import java.util.Arrays;

/**
 * 给出 n 个数对。 在每一个数对中，第一个数字总是比第二个数字小。
 * 现在，我们定义一种跟随关系，当且仅当 b < c 时，数对(c, d) 才可以跟在 (a, b) 后面。我们用这种形式来构造一个数对链。
 * 给定一个对数集合，找出能够形成的最长数对链的长度。你不需要用到所有的数对，你可以以任何顺序选择其中的一些数对来构造。
 */
public class MaxPairChain {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,9},{2,3},{4,7},{2,5},{9,10},{9,10},{7,9}};
        System.out.println(findLongestChain(arr));
    }
    public static int findLongestChain(int[][] pairs) {
        int length = pairs.length;

        //将所有数对按第二个数从小到大进行排序
        int max;
        int index;
        int[] temp;
        for (int i = 0; i < length - 1; i++) {
            max = pairs[0][1];
            index = 0;
            for (int j = 1; j < length - i; j++) {
                if (pairs[j][1] > max) {
                    index = j;
                    max = pairs[j][1];
                }
            }
            temp = pairs[index];
            pairs[index] = pairs[length - i - 1];
            pairs[length - i - 1] = temp;
        }

        //取符合的数对，拼凑数对链
        int last = pairs[0][1];
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (pairs[i][0] > last) {
                last = pairs[i][1];
                count++;
                System.out.println(Arrays.toString(pairs[i]));
            }
        }

        return count;
    }
}
