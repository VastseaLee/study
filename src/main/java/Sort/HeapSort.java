package Sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        sort(new int[]{6, 5, 14, 7, 8, 1});
    }

    public static void sort(int[] disArr) {
        //初始大顶堆
        int n = disArr.length - 1;

        if (n % 2 != 0 && n > 0) {
            if (disArr[n] > disArr[(n - 1) / 2]) {
                int temp = disArr[n];
                disArr[n] = disArr[(n - 1) / 2];
                disArr[(n - 1) / 2] = temp;
            }
            n--;
        }

        while (n > 0) {
            int r = tm(disArr, n / 2 - 1, n - 1, n);
            //说明有过交换则需要重新看一下该节点的子节点
            while (r != -1) {
                r = tm(disArr, r, 2 * r + 1, 2 * r + 2);
            }
            //处理完后
            n -= 2;
        }

        System.out.println(Arrays.toString(disArr));
    }

    private static int tm(int[] arr, int a, int b, int c) {
        int n = arr.length - 1;
        if (b > n) {
            return -1;
        }
        int an = arr[a];
        int bn = arr[b];
        int temp = arr[a];
        if (c > n) {
            if (an >= bn) {
                return -1;
            } else {
                arr[a] = arr[b];
                arr[b] = temp;
                return b;
            }
        }
        int cn = arr[c];
        //父节点最大
        if (an >= bn && an >= cn) {
            return -1;
        }

        //左子节点最大
        if (bn > cn) {
            arr[a] = arr[b];
            arr[b] = temp;
            return b;
        }
        //右子节点最大
        arr[a] = arr[c];
        arr[c] = temp;
        return c;
    }
}
