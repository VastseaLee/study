package leetcode.zero;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 */
public class EightyEight {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m-- + n-- - 1;
        while (m > -1 && n > -1) {
            nums1[last--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n > -1) {
            nums1[last--] = nums2[n--];
        }
    }
}
