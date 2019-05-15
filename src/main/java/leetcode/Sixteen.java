package leetcode;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class Sixteen {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int x = nums[0] + nums[1] + nums[2];
        int minDif = Math.abs(x - target);
        int result = x;
        for (int i = 0; i < length - 2; i++) {
            int first = nums[i];
            if (i == 0 || nums[i - 1] != first) {
                int left = i + 1;
                int right = length - 1;
                int dif = first - target;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    int a = Math.abs(dif + sum);
                    if (a < minDif) {
                        minDif = a;
                        result = sum + first;
                    }
                    if (dif + sum > 0) {
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    } else if (dif + sum < 0) {
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;
                    } else {
                        return target;
                    }
                }
            }
        }
        return result;
    }
}
