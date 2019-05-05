package Sort;

/**
 * 希尔排序（缩小增量排序）
 *
 * 和插入排序类似 但是一次不是往前进一，慢慢变成一（感觉就是减少了数据复制移动，前几次让数列先大致有序，让最后一趟变得轻松）
 */
public class ShellSort implements Sort {
    @Override
    public int[] sort(int[] disArray) {
        int length = disArray.length;
        int temp, j;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                j = i;
                temp = disArray[i];
                while (j - gap >= 0 && temp < disArray[j - gap]) {
                    disArray[j] = disArray[j - gap];
                    j -= gap;
                }
                disArray[j] = temp;
            }
        }
        return disArray;
    }
}
