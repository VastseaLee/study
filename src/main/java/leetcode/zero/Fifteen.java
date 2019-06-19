package leetcode.zero;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class Fifteen {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{1,1,1});
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        long start = System.currentTimeMillis();
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        int last = nums.length - 1;
        int left, ln, right, rn, sum;
        for (int i = 0; i < last - 1; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                left = i + 1;
                right = last;
                sum = -nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] > sum) {
                        while (left<right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        while (left<right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;
                    } else {
                        lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        return lists;
    }
}
