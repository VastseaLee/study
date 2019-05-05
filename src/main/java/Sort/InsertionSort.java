package Sort;

/**
 * 插入排序
 * <p>
 * 找到前小后大的地方把数字放进去
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] disArray) {
        int length = disArray.length;
        int temp;
        for (int i = 1; i < length; i++) {
            temp = disArray[i];
            int j = i - 1;
            while (j >= 0 && disArray[j] > temp) {
                disArray[j + 1] = disArray[j];
                j--;
            }
            disArray[j + 1] = temp;
        }
        return disArray;
    }
}
