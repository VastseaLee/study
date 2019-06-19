package leetcode.zero;

/**
 * 一个机器人位于一个 m x n 网格的左上角
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角
 * 问总共有多少条不同的路径？
 */
public class SixtyTwo {

    static int count = 1;

    public static void main(String[] args) {
        System.out.println(uniquePaths2(51, 9));
    }

    public static int uniquePaths2(int m, int n) {
        m++;
        n++;
        int[][] ints = new int[n][m];
        ints[0][1] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                ints[i][j] = ints[i - 1][j] + ints[i][j - 1];
            }
        }
        return ints[n - 1][m - 1];
    }

    public static int uniquePaths(int m, int n) {
        if (m < 2 || n < 2) {
            return 1;
        }
        walk(1, 1, m, n);
        return count;
    }

    public static void walk(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return;
        }
        count++;
        walk(i + 1, j, m, n);
        walk(i, j + 1, m, n);
    }
}
