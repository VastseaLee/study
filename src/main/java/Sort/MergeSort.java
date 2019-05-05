package Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序
 * <p>
 * 把数列不断拆分各自排序（是一种分治法）
 * 因为合并的两个数组各自有序因此合并方法还算简便（就是需要额外空间）
 */
public class MergeSort {

    public int[] sort(int left, int right, int[] disArray) {
        if (left == right) {
            return new int[]{disArray[left]};
        }
        int mid = (left + right) / 2;
        int[] l = sort(left, mid, disArray);
        int[] r = sort(mid + 1, right, disArray);
        return merge(l, r);
    }

    /**
     * 合并两个有序数组
     *
     * @param l
     * @param r
     * @return
     */
    private int[] merge(int[] l, int[] r) {
        int le = l.length;
        int re = r.length;
        int[] narr = new int[le + re];
        int i = 0, j = 0, k = 0;
        while (i < le && j < re) {
            narr[k++] = l[i] < r[j] ? l[i++] : r[j++];
        }
        while (i < le) {
            narr[k++] = l[i++];
        }
        while (j < re) {
            narr[k++] = r[j++];
        }
        return narr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random ran = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = ran.nextInt(10000);
        }
//        int[] arr = new int[]{1,9,1,3,5,4,2,7,9,1,0,5,44,3,2};
        MergeSort m = new MergeSort();
        long start = System.nanoTime();
        arr = m.sort(0, arr.length - 1, arr);
        System.out.println(System.nanoTime() - start);
//        System.out.println(Arrays.toString(arr));
    }
}
