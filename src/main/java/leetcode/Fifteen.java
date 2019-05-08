package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class Fifteen {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum2(new int[]{3,0,-2,-1,1,2});
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }


    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        boolean flag = true;
        int left;
        int right;
        int sum;
        int mid;
        int length = nums.length - 1;
        next:
        for (int i = 1; i < length; i++) {
            left = i - 1;
            right = i + 1;
            mid = nums[i];
            sum = mid + nums[left] + nums[right];
            while (sum != 0) {
                if (sum > 0 && left > 0) {
                    left--;
                } else if (sum < 0 && right < length) {
                    right++;
                } else {
                    continue next;
                }
                sum = mid + nums[left] + nums[right];
            }
            if (sum == 0) {
                if (flag && mid == 0 && nums[left] == 0 && nums[right] == 0) {
                    lists.add(Arrays.asList(0, 0, 0));
                    flag = false;
                    continue;
                }
                List<Integer> l = Arrays.asList(mid, nums[left], nums[right]);
                for (List<Integer> list : lists) {
                    if (list.containsAll(l)) {
                        continue next;
                    }
                }
                lists.add(l);
            }
        }
        return lists;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> lists = new LinkedList<>();
        boolean flag = true;
        for (int i = 0; i < length - 2; i++) {
            next:
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (flag && nums[i] == 0 && nums[j] == 0 && nums[k] == 0) {
                            lists.add(Arrays.asList(0, 0, 0));
                            flag = false;
                            continue next;
                        }
                        List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k]);
                        for (List<Integer> list : lists) {
                            if (list.containsAll(l)) {
                                continue next;
                            }
                        }
                        lists.add(l);
                    }
                }
            }
        }
        return lists;
    }
}
