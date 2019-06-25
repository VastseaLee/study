package leetcode.two;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 */
public class ThirtyEight {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int i = 1;
        for (int j = 0; j < length; j++) {
            result[j] = i;
            i *= nums[j];
        }
        i = 1;
        for (int j = length - 1; j > -1; j--) {
            result[j] *= i;
            i*=nums[j];
        }
        return result;
    }
}
