package leetcode.zero;

import java.util.Set;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class TwentySix {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1}));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (nums.length == 0) {
            return 0;
        }
        int newLength = 1;
        for (int i = 1; i < length; i++) {
            while (i < length && nums[i - 1] == nums[i]) {
                i++;
            }
            if (i < length) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        return newLength;
    }
}
