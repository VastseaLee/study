package leetcode.zero;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 */
public class Eleven {

    public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            if (height[left] > height[right]) {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            } else {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            }
        }
        return 0;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int length = height.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }
}
