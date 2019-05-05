package Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序
 * <p>
 * 选择一个数，将比它小的都放在它左边，比它大的都放在它右边
 * 可以从左边找比它大的和右边比它小的交换
 */
public class QuickSort {
    public static void sort(int[] disArr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = disArr[left];
        int start = left;
        int end = right;
        while (left < right) {
            while (left < right && disArr[right] > pivot) {
                right--;
            }
            if (left < right) {
                disArr[left] = disArr[right];
                left++;
            }
            while (left < right && disArr[left] < pivot) {
                left++;
            }
            if (left < right) {
                disArr[right] = disArr[left];
                right--;
            }
        }
        disArr[left] = pivot;
        sort(disArr, start, left - 1);
        sort(disArr, left + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random ran = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = ran.nextInt(10000);
        }
        long start = System.nanoTime();
        sort(arr, 0, arr.length - 1);
        System.out.println(System.nanoTime() - start);
    }
}
