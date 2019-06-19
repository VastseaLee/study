package leetcode.zero;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 */
public class ThirtyThree {

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,1},3));
    }

    public static int search(int[] nums, int target) {
        int lastIndex = nums.length - 1;
        if (lastIndex < 0) {
            return -1;
        }
        int left = 0;
        boolean flag = false;
        if (nums[left] <= nums[lastIndex]) {
            flag = true;
        }
        int right = lastIndex;
        int mid = (left + right) / 2;
        //找到旋转点 时间复杂度O(log n)
        while (left + 1 < right) {
            //说明左边一半是有序的
            if (nums[left] < nums[mid]) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (left + right) / 2;
        }
        //这时候的left和right正好是反转的点
        int dif = lastIndex - left;
        //寻找这个数是否存在 时间复杂度O(log n)
        left = 0;

        while (left <= lastIndex) {
            mid = (left + lastIndex) / 2;
            int midNum = nums[getRealIndex(mid,flag,dif,right)];
            if (midNum < target) {
                left = mid + 1;
            } else if (midNum > target) {
                lastIndex = mid - 1;
            } else {
                return getRealIndex(mid,flag,dif,right);
            }
        }

        return -1;
    }

    /**
     * 根据假想坐标获取实际坐标
     *
     * @param viIndex
     * @return
     */
    static int getRealIndex(int viIndex,boolean flag,int dif,int right) {
        return flag ? viIndex : viIndex < dif ? viIndex + right : viIndex - dif;
    }
}
