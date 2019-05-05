package advalg;

import java.util.Arrays;

public class deep {

    private static int count = 0;
    private static int[] arr = new int[5];
    private static int[][] dArr = new int[][]{{0, 1, 1, -1, 1}, {1, 0, -1, 1, -1}, {1, -1, 0, -1, 1}, {-1, 1, -1, 0, -1}, {1, -1, 1, -1, 0}};

    public static void main(String[] args) {
        walk(3);
    }

    public static void walk(int point) {
        if (count == 5) {
            return;
        }
        System.out.println("走到了点" + (point + 1));
        arr[point] = 1;
        for (int i = 0; i < 5; i++) {
            if (dArr[point][i] == 1 && arr[i] == 0) {
                walk(i);
            }
        }
    }
}
