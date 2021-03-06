package leetcode.zero;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 */
public class One {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int dif = target - num;
            if(map.containsKey(dif)){
                arr[0] = map.get(dif);
                arr[1] = i;
                break;
            }
            map.put(num,i);
        }
        return arr;
    }
}
