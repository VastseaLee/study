package leetcode.zero;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 */
public class FiftyNine {

    public int[][] generateMatrix(int n) {
        int[][] ints = new int[n][n];
        fill(n, 0, ints, 1);
        return ints;
    }

    void fill(int n, int i, int[][] ints, int num) {
        if (n < 1) {
            return;
        }
        int j = i;
        int k = i;
        int length = n + i;

        //→
        while (j < length) {
            ints[i][j++] = num++;
        }
        j--;
        i++;

        //↓
        while (i < length) {
            ints[i++][j] = num++;
        }
        i--;
        j--;

        //←
        while (j >= k) {
            ints[i][j--] = num++;
        }
        j++;
        i--;

        //↑
        while (i > k) {
            ints[i--][j] = num++;
        }
        fill(n - 2, k + 1, ints, num);
    }
}
