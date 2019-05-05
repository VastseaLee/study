package Sort;

/**
 * 选择排序
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] disArray) {
        int max;
        int index;
        int length = disArray.length;
        for (int i = 0; i < length - 1; i++) {
            max = disArray[0];
            index = 0;
            for (int j = 1; j < length - i; j++) {
                if (disArray[j] > max) {
                    max = disArray[j];
                    index = j;
                }
            }
            disArray[index] = disArray[length - 1 - i];
            disArray[length - 1 - i] = max;
        }
        return disArray;
    }

}
