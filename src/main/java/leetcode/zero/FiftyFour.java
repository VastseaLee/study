package leetcode.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */
public class FiftyFour {
    public static void main(String[] args) {
        int[][] ints = new int[3][1];
        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                ints[i][j] = ++num;
            }
        }
        spiralOrder(ints);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = -1;
        int floor = matrix.length;
        if (floor == 0) {
            return null;
        }
        int left = -1;
        int right = matrix[0].length;
        int count = floor * right;
        List<Integer> list = new ArrayList<>();
        creep(list, top, floor, left, right, matrix, count);
        return list;
    }

    static void creep(List<Integer> list, int top, int floor, int left, int right, int[][] matrix, int count) {
        if (list.size() == count) {
            return;
        }
        //从左往右
        if (top < floor) {
            top++;
            for (int i = left + 1; i < right; i++) {
                list.add(matrix[top][i]);
            }
        }
        //从上至下
        if (left < right) {
            right--;
            for (int j = top + 1; j < floor; j++) {
                list.add(matrix[j][right]);
            }
        }
        //从右往左
        if (top < floor - 1) {
            floor--;
            for (int k = right - 1; k > left; k--) {
                list.add(matrix[floor][k]);
            }
        }
        //从下至上
        if (left < right - 1) {
            left++;
            for (int l = floor - 1; l > top; l--) {
                list.add(matrix[l][left]);
            }
        }
        creep(list, top, floor, left, right, matrix, count);
    }
}
