package leetcode.two;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class Fifteen {
    public static void main(String[] args) {
        findKthLargest(new int[]{5,2,4,1,3,6,0}, 4);
    }

    public static int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        int index = 0;
        int num = 0;
        for (int i = 0; i < k; i++) {
            num = nums[0];
            index = 0;
            for (int j = 1; j < length - i; j++) {
                if (nums[j] > num) {
                    num = nums[j];
                    index = j;
                }
            }
            int temp = nums[length - i-1];
            nums[length - i-1] = nums[index];
            nums[index] = temp;
        }
        return num;
    }
}
