package leetcode.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列
 */
public class FortySix {

    public static void main(String[] args) {

        List<List<Integer>> result =  permute(new int[]{1,2,3});
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        getList(new ArrayList<>(),length,result,nums);
        return result;
    }

    static void getList(List<Integer> list,int length,List<List<Integer>> result,int[] nums) {
        if (list.size() == length) {
            result.add(list);
            return;
        }
        int num;
        for (int i = 0; i < length; i++) {
            num = nums[i];
            if (!list.contains(num)) {
                List<Integer> copy = new ArrayList<>(list);
                copy.add(num);
                getList(copy,length,result,nums);
            }
        }
    }
}
