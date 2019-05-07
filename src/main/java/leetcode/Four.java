package leetcode;

/**
 *给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class Four {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 > l2) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int t = l1;
            l1 = l2;
            l2 = t;
        }
        int iMin = 0;
        int iMax = l1;
        int num = (l1 + l2 + 1) / 2;
        int i;
        int j;
        while (iMin <= iMax) {
            i = (iMin + iMax) / 2;
            j = num - i;
            //i太小了
            if (i < iMax && nums1[i] < nums2[j - 1]) {
                iMin = i + 1;
            }
            //i太大了
            else if (i > iMin && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                double max = 0;
                if (i == 0) {
                    max = nums2[j - 1];
                } else if (j == 0) {
                    max = nums1[i - 1];
                } else {
                    max = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                //个数为奇数直接返回中间数
                if ((l1 + l2) % 2 == 1) {
                    return max;
                }

                double min = 0;
                if (i == l1) {
                    min = nums2[j];
                } else if (j == l2) {
                    min = nums1[i];
                } else {
                    min = Math.min(nums1[i], nums2[j]);
                }

                return (min + max) / 2;
            }
        }
        return 0.0;
    }


//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int l1 = nums1.length;
//        int l2 = nums2.length;
//        int l3 = l1 + l2;
//        //将两个数组合起来排序
//        double[] arr = new double[l3];
//        int ia = 0;
//        int i1 = 0;
//        int i2 = 0;
//        while (i1 < l1 && i2 < l2) {
//            if (nums1[i1] <= nums2[i2]) {
//                arr[ia++] = nums1[i1];
//                i1++;
//            } else {
//                arr[ia++] = nums2[i2];
//                i2++;
//            }
//        }
//        while (i1 < l1) {
//            arr[ia++] = nums1[i1++];
//        }
//        while (i2 < l2) {
//            arr[ia++] = nums2[i2++];
//        }
//        int mid = l3 / 2;
//        return l3 % 2 == 0 ? (arr[mid - 1] + arr[mid]) / 2 : arr[mid];
//    }


}
