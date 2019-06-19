package leetcode.zero;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * <p>
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class FiftyThree {

    public static void main(String[] args) {
        System.out.println(maxSubArray2(new int[]{-1,-2}));
    }

    public static int maxSubArray2(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        int num;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            sum += num;
            //前面的数加起来还是负的那就不要了
            if (sum <= num) {
                sum = num;
            }
            //加起来已经比原来的最大和大了
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }


    public static int maxSubArray(int[] nums) {
        int index = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = sum;
        int num;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            sum += num;
            //前面的数加起来还是负的那就不要了
            if (sum <= num) {
                left = i;
                right = i;
                sum = num;
                maxSum = num;
            }
            //加起来已经比原来的最大和大了
            if (sum > maxSum) {
                right = i;
                maxSum = sum;
            }
        }
        sum = 0;
        for (;left<=right;left++){
            sum += nums[left];
        }
        return sum;
    }
}
