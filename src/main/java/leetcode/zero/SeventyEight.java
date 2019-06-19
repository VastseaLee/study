package leetcode.zero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 */
public class SeventyEight {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        lists.add(list);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            List<List<Integer>> listList = new ArrayList<>();
            Iterator<List<Integer>> it = lists.iterator();
            while (it.hasNext()){
                list = new ArrayList<>(it.next());
                list.add(nums[i]);
                listList.add(list);
            }
            lists.addAll(listList);
        }
        return lists;
    }
}
