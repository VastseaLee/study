package leetcode.one;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 */
public class TwentyOne {

    public int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxDif = 0;
        for (int i = 0; i < prices.length; i++) {
            int num = prices[i];
            if (prices[i] < min) {
                min = num;
                continue;
            }
            if (num - min > maxDif) {
                maxDif = num - min;
            }
        }
        return maxDif;
    }


    public int maxProfit(int[] prices) {
        int length = prices.length;
        int max = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int dif = prices[j] - prices[i];
                if (dif > max) {
                    max = dif;
                }
            }
        }
        return max;
    }
}
