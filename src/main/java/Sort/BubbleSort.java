package Sort;

/**
 * 冒泡排序
 * <p>
 * 比较相邻的元素
 */
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] disArray) {
        int temp;
        int length = disArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length - i; j++) {
                if (disArray[j] < disArray[j - 1]) {
                    temp = disArray[j];
                    disArray[j] = disArray[j - 1];
                    disArray[j - 1] = temp;
                }
            }
        }
        return disArray;
    }

}
